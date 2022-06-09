package com.smt.wechatemojibot;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.updateshandlers.DownloadFileCallback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class WechatEmojiBot extends AbilityBot {
    private static final Logger logger = LoggerFactory.getLogger(WechatEmojiBot.class);

    WechatEmojiBot(@Value("${WechatEmojiBot.token}") String token,
                   @Value("${WechatEmojiBot.username}") String username,
                   @Autowired BotOptions option) {
        super(token, username, option);
        logger.info("username: {}, token: {}", username, token);
    }

    @Override
    public long creatorId() {
        return 0;
    }

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage();
        message.setChatId(update.getMessage().getChatId().toString());

        if (update.hasMessage() && update.getMessage().hasAnimation()) {
            GetFile getFile = new GetFile();
            getFile.setFileId(update.getMessage().getAnimation().getFileId());
            try {
                File fileToDownload = execute(getFile);
                downloadFileAsync(fileToDownload, new DownloadFileCallback<File>() {
                    @Override
                    public void onResult(File file, java.io.File output) {
                        message.setText("动图文件下载成功，正在进行转码，请稍后......");
                        sendMsg(message);
                        try {
                            String filePath = "/home/batch/bot_workspace/img/" + file.getFileUniqueId() + ".gif";
                            transformMp4(0, null, output.getAbsolutePath(), filePath);
                            message.setText("动图文件转码成功，打开 https://images.priceonglass.net/" + file.getFileUniqueId() + ".gif 访问文件。(由于服务器资源限制，我们仅保留图片文件5分钟，请您尽快下载到本地保存。)");
                            sendMsg(message);
                        } catch (Exception exception) {
                            message.setText("动图文件转码失败，请稍后重试.....");
                            sendMsg(message);
                            logger.error("FILE TRANSFORM　ERROR -- ", exception);
                        }
                    }

                    @Override
                    public void onException(File file, Exception exception) {
                        message.setText("文件下载失败，请稍后重试...");
                        sendMsg(message);
                        logger.error("FILE DOWNLOAD　ERROR -- ", exception);
                    }
                });
            } catch (TelegramApiException e) {
                logger.error("BOT　API　ERROR -- ", e);
            }
            message.setText("已经收到您发送的动图文件，正在尝试将文件下载到我们的服务器......");
            sendMsg(message);
        } else if (update.hasMessage() && update.getMessage().hasSticker()) {
            GetFile getFile = new GetFile();
            getFile.setFileId(update.getMessage().getSticker().getFileId());
            try {
                File fileToDownload = execute(getFile);
                downloadFileAsync(fileToDownload, new DownloadFileCallback<File>() {
                    @Override
                    public void onResult(File file, java.io.File output) {
                        message.setText("动图文件下载成功，正在进行转码，请稍后......");
                        sendMsg(message);
                        try {
                            String fileNameForUrl = file.getFileUniqueId() + file.getFilePath().replace("stickers/", "");
                            String filePath = "/home/batch/bot_workspace/img/" + fileNameForUrl;
                            if (filePath.endsWith(".tgs")) {
                                message.setText("检测到.tgs文件，转码需时较长，请耐心等待并注意输出信息......");
                                sendMsg(message);
                                filePath = filePath.replace(".tgs", ".gif");
                                fileNameForUrl = fileNameForUrl.replace(".tgs", ".gif");
                                String tgs = output.getAbsolutePath().replace(".tmp", ".tgs");
                                FileUtils.moveFile(output, new java.io.File(tgs));
                                transformWebpOrTgs(tgs, filePath);
                            } else if (filePath.endsWith(".webp")) {
                                message.setText("检测到.webp，转码需时较长，请耐心等待并注意输出信息......");
                                sendMsg(message);
                                filePath = filePath.replace(".webp", ".gif");
                                fileNameForUrl = fileNameForUrl.replace(".webp", ".gif");
                                String webp = output.getAbsolutePath().replace(".tmp", ".webp");
                                FileUtils.moveFile(output, new java.io.File(webp));
                                transformWebpOrTgs(webp, filePath);
                            } else {
                                filePath = filePath.replace(".", "") + ".gif";
                                fileNameForUrl = fileNameForUrl.replace(".", "") + ".gif";
                                message.setText("检测到未知格式的文件，正在尝试转码，转码需时较长并有可能失败，请耐心等待并注意输出信息......");
                                sendMsg(message);
                                String unkonwFile = output.getAbsolutePath().replace(".tmp", fileNameForUrl);
                                FileUtils.moveFile(output, new java.io.File(unkonwFile));
                                transformWebpOrTgs(unkonwFile, filePath);
                            }
                            message.setText("动图文件转码成功，打开 https://images.priceonglass.net/" + fileNameForUrl + " 访问文件。(由于服务器资源限制，我们仅保留图片文件5分钟，请您尽快下载到本地保存。)");
                            sendMsg(message);
                        } catch (Exception exception) {
                            message.setText("动图文件转码失败，请稍后重试.....");
                            sendMsg(message);
                            logger.error("FILE TRANSFORM　ERROR -- ", exception);
                        }
                    }

                    @Override
                    public void onException(File file, Exception exception) {
                        message.setText("文件下载失败，请稍后重试...");
                        sendMsg(message);
                        logger.error("FILE DOWNLOAD　ERROR -- ", exception);
                    }
                });
            } catch (TelegramApiException e) {
                logger.error("BOT　API　ERROR -- ", e);
            }
            message.setText("您发送是文件属于贴纸表情包，我们正尝试将您发送的单个表情下载的文件供您使用,请稍后.....");
            sendMsg(message);
        } else {
            message.setText("您发送的消息不包含动图，无需转换也可直接保存。");
            sendMsg(message);
        }

    }

    private void sendMsg(SendMessage message) {
        try {
            execute(message);
        } catch (TelegramApiException e) {
            logger.error("BOT　API　ERROR -- ", e);
        }
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {
        super.onUpdatesReceived(updates);
    }

    @Override
    public void onClosing() {
        super.onClosing();
    }

    public void transformMp4(int time, String start, String inputPath, String outPath) throws Exception {
        List<String> command = new ArrayList<String>();
        command.add("/usr/bin/ffmpeg");
        if (0 != time) {
            command.add("-t");
            command.add(String.valueOf(time));
        }
        if (start != null && !"00:00:00".equals(start)) {
            command.add("-ss");
            command.add(start);
        }
        command.add("-i");
        command.add(inputPath);
        command.add("-vf");
        command.add("fps=10,scale=320:-1:flags=lanczos,split[s0][s1];[s0]palettegen[p];[s1][p]paletteuse");
        command.add("-loop");
        command.add("0");
        command.add(outPath);
        ProcessBuilder builder = new ProcessBuilder(command);
        builder.redirectErrorStream(true);

        executeNativeCommand(builder);
    }

    public void transformWebpOrTgs(String inputPath, String outPath) throws Exception {
        List<String> command = new ArrayList<String>();
        command.add("python3");
        command.add("/usr/local/bin/lottie_convert.py");
        command.add(inputPath);
        command.add(outPath);
        ProcessBuilder builder = new ProcessBuilder(command);
        builder.redirectErrorStream(true);
        executeNativeCommand(builder);
    }


    private void executeNativeCommand(ProcessBuilder builder) throws InterruptedException {
        Process process = null;
        try {
            process = builder.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "gbk"));
            String line = null;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                System.out.println(line);
            }
            // 等待命令执行完成
            int code = process.waitFor();

            if (code == 0) {
                //通常情况0 表示命令或者脚本正常退出，但是如果脚本自己有返回状态这里需要根据自己状态判断
                System.out.println("success");
            } else {
                System.out.println("fail");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}