package io.swagger.model;

import io.swagger.model.BasePostMinimalDTO;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class PostCommentWithPostVO   {
  
  @Schema(description = "")
  private Boolean allowNotification = null;
  
  @Schema(description = "")
  private String author = null;
  
  @Schema(description = "")
  private String authorUrl = null;
  
  @Schema(description = "")
  private String avatar = null;
  
  @Schema(description = "")
  private String content = null;
  
  @Schema(description = "")
  private Date createTime = null;
  
  @Schema(description = "")
  private String email = null;
  
  @Schema(description = "")
  private String gravatarMd5 = null;
  
  @Schema(description = "")
  private Long id = null;
  
  @Schema(description = "")
  private String ipAddress = null;
  
  @Schema(description = "")
  private Boolean isAdmin = null;
  
  @Schema(description = "")
  private Long parentId = null;
  
  @Schema(description = "")
  private BasePostMinimalDTO post = null;
  public enum StatusEnum {
    AUDITING("AUDITING"),
    PUBLISHED("PUBLISHED"),
    RECYCLE("RECYCLE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private StatusEnum status = null;
  
  @Schema(description = "")
  private String userAgent = null;
 /**
   * Get allowNotification
   * @return allowNotification
  **/
  @JsonProperty("allowNotification")
  public Boolean isAllowNotification() {
    return allowNotification;
  }

  public void setAllowNotification(Boolean allowNotification) {
    this.allowNotification = allowNotification;
  }

  public PostCommentWithPostVO allowNotification(Boolean allowNotification) {
    this.allowNotification = allowNotification;
    return this;
  }

 /**
   * Get author
   * @return author
  **/
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public PostCommentWithPostVO author(String author) {
    this.author = author;
    return this;
  }

 /**
   * Get authorUrl
   * @return authorUrl
  **/
  @JsonProperty("authorUrl")
  public String getAuthorUrl() {
    return authorUrl;
  }

  public void setAuthorUrl(String authorUrl) {
    this.authorUrl = authorUrl;
  }

  public PostCommentWithPostVO authorUrl(String authorUrl) {
    this.authorUrl = authorUrl;
    return this;
  }

 /**
   * Get avatar
   * @return avatar
  **/
  @JsonProperty("avatar")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public PostCommentWithPostVO avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

 /**
   * Get content
   * @return content
  **/
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public PostCommentWithPostVO content(String content) {
    this.content = content;
    return this;
  }

 /**
   * Get createTime
   * @return createTime
  **/
  @JsonProperty("createTime")
  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public PostCommentWithPostVO createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }

 /**
   * Get email
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PostCommentWithPostVO email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Get gravatarMd5
   * @return gravatarMd5
  **/
  @JsonProperty("gravatarMd5")
  public String getGravatarMd5() {
    return gravatarMd5;
  }

  public void setGravatarMd5(String gravatarMd5) {
    this.gravatarMd5 = gravatarMd5;
  }

  public PostCommentWithPostVO gravatarMd5(String gravatarMd5) {
    this.gravatarMd5 = gravatarMd5;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PostCommentWithPostVO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get ipAddress
   * @return ipAddress
  **/
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public PostCommentWithPostVO ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

 /**
   * Get isAdmin
   * @return isAdmin
  **/
  @JsonProperty("isAdmin")
  public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public PostCommentWithPostVO isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

 /**
   * Get parentId
   * @return parentId
  **/
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public PostCommentWithPostVO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Get post
   * @return post
  **/
  @JsonProperty("post")
  public BasePostMinimalDTO getPost() {
    return post;
  }

  public void setPost(BasePostMinimalDTO post) {
    this.post = post;
  }

  public PostCommentWithPostVO post(BasePostMinimalDTO post) {
    this.post = post;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.getValue();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PostCommentWithPostVO status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get userAgent
   * @return userAgent
  **/
  @JsonProperty("userAgent")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public PostCommentWithPostVO userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCommentWithPostVO {\n");
    
    sb.append("    allowNotification: ").append(toIndentedString(allowNotification)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorUrl: ").append(toIndentedString(authorUrl)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gravatarMd5: ").append(toIndentedString(gravatarMd5)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
