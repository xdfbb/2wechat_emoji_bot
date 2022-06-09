package com.smt.persistence;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ZhiHu")
public class ZhiHu  {

    private int answer;
    private int answer_c;
    private int answer_r;
    private int ask;
    private int ask_c;
    private int ask_r;
    private int collection;
    private int collection_c;
    private int collection_r;
    private Date dt;
    private Date dt_answer;
    private int fan;
    private int fan_c;
    private int fan_r;
    private String img;
    private int keyword_count;
    private int keyword_count_c;
    @Column(name = "like_zan")
    private int like;
    private int like_c;
    private int like_r;
    private String name;
    private int pin;
    private int pin_c;
    private int pin_r;
    private int post;
    private int post_c;
    private int post_r;
    private int praise;
    private int praise_c;
    private int praise_r;
    private String sign;
    private String url;
    private int video;
    private int video_c;
    private int video_r;
    private String topic_id;
    private String topic_weight;
    private int topic_count;
    private int zhihuMonitorState;
    private int authorMonitorState;
    private int ranking;
    @Id
    @Column(unique = true)
    private Long id;
    @Version
    private Long version;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastModified;
    @Column(nullable = false, columnDefinition = "TINYINT(1) default 0")
    private boolean disabled = false;
    @Column(nullable = false, columnDefinition = "TINYINT(1) default 0")
    private boolean deleted = false;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (id != null && id > 0)
            this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @PreUpdate
    @PrePersist
    public void updateTimeStamps() {
        lastModified = new Date();
        if (dateCreated == null) {
            dateCreated = new Date();
        }
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getAnswer_c() {
        return answer_c;
    }

    public void setAnswer_c(int answer_c) {
        this.answer_c = answer_c;
    }

    public int getAnswer_r() {
        return answer_r;
    }

    public void setAnswer_r(int answer_r) {
        this.answer_r = answer_r;
    }

    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public int getAsk_c() {
        return ask_c;
    }

    public void setAsk_c(int ask_c) {
        this.ask_c = ask_c;
    }

    public int getAsk_r() {
        return ask_r;
    }

    public void setAsk_r(int ask_r) {
        this.ask_r = ask_r;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public int getCollection_c() {
        return collection_c;
    }

    public void setCollection_c(int collection_c) {
        this.collection_c = collection_c;
    }

    public int getCollection_r() {
        return collection_r;
    }

    public void setCollection_r(int collection_r) {
        this.collection_r = collection_r;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Date getDt_answer() {
        return dt_answer;
    }

    public void setDt_answer(Date dt_answer) {
        this.dt_answer = dt_answer;
    }

    public int getFan() {
        return fan;
    }

    public void setFan(int fan) {
        this.fan = fan;
    }

    public int getFan_c() {
        return fan_c;
    }

    public void setFan_c(int fan_c) {
        this.fan_c = fan_c;
    }

    public int getFan_r() {
        return fan_r;
    }

    public void setFan_r(int fan_r) {
        this.fan_r = fan_r;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getKeyword_count() {
        return keyword_count;
    }

    public void setKeyword_count(int keyword_count) {
        this.keyword_count = keyword_count;
    }

    public int getKeyword_count_c() {
        return keyword_count_c;
    }

    public void setKeyword_count_c(int keyword_count_c) {
        this.keyword_count_c = keyword_count_c;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getLike_c() {
        return like_c;
    }

    public void setLike_c(int like_c) {
        this.like_c = like_c;
    }

    public int getLike_r() {
        return like_r;
    }

    public void setLike_r(int like_r) {
        this.like_r = like_r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin_c() {
        return pin_c;
    }

    public void setPin_c(int pin_c) {
        this.pin_c = pin_c;
    }

    public int getPin_r() {
        return pin_r;
    }

    public void setPin_r(int pin_r) {
        this.pin_r = pin_r;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public int getPost_c() {
        return post_c;
    }

    public void setPost_c(int post_c) {
        this.post_c = post_c;
    }

    public int getPost_r() {
        return post_r;
    }

    public void setPost_r(int post_r) {
        this.post_r = post_r;
    }

    public int getPraise() {
        return praise;
    }

    public void setPraise(int praise) {
        this.praise = praise;
    }

    public int getPraise_c() {
        return praise_c;
    }

    public void setPraise_c(int praise_c) {
        this.praise_c = praise_c;
    }

    public int getPraise_r() {
        return praise_r;
    }

    public void setPraise_r(int praise_r) {
        this.praise_r = praise_r;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public int getVideo_c() {
        return video_c;
    }

    public void setVideo_c(int video_c) {
        this.video_c = video_c;
    }

    public int getVideo_r() {
        return video_r;
    }

    public void setVideo_r(int video_r) {
        this.video_r = video_r;
    }

    public String getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(String topic_id) {
        this.topic_id = topic_id;
    }

    public String getTopic_weight() {
        return topic_weight;
    }

    public void setTopic_weight(String topic_weight) {
        this.topic_weight = topic_weight;
    }

    public int getTopic_count() {
        return topic_count;
    }

    public void setTopic_count(int topic_count) {
        this.topic_count = topic_count;
    }

    public int getZhihuMonitorState() {
        return zhihuMonitorState;
    }

    public void setZhihuMonitorState(int zhihuMonitorState) {
        this.zhihuMonitorState = zhihuMonitorState;
    }

    public int getAuthorMonitorState() {
        return authorMonitorState;
    }

    public void setAuthorMonitorState(int authorMonitorState) {
        this.authorMonitorState = authorMonitorState;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
