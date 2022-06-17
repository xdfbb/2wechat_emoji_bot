package com.smt.persistence;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CiLiuTiArticel")
public class CiLiuTiArticel extends BaseEntity {

    private long data_id;
    private String project_name;
    private String title;
    private String url;
    private Date publish_time;
    private String author_name;
    private String platform_name;
    @Lob
    private String content;
    private Date add_time;
    private String RelateWord;

    public void setData_id(long data_id) {
        this.data_id = data_id;
    }

    public long getData_id() {
        return data_id;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setPlatform_name(String platform_name) {
        this.platform_name = platform_name;
    }

    public String getPlatform_name() {
        return platform_name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setRelateWord(String RelateWord) {
        this.RelateWord = RelateWord;
    }

    public String getRelateWord() {
        return RelateWord;
    }
}
