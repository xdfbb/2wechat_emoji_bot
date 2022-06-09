package io.swagger.model;

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

public class SheetComment   {
  
  @Schema(description = "")
  private Boolean allowNotification = null;
  
  @Schema(description = "")
  private String author = null;
  
  @Schema(description = "")
  private String authorUrl = null;
  
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
  private Integer postId = null;
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
  private Integer topPriority = null;
  
  @Schema(description = "")
  private Date updateTime = null;
  
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

  public SheetComment allowNotification(Boolean allowNotification) {
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

  public SheetComment author(String author) {
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

  public SheetComment authorUrl(String authorUrl) {
    this.authorUrl = authorUrl;
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

  public SheetComment content(String content) {
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

  public SheetComment createTime(Date createTime) {
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

  public SheetComment email(String email) {
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

  public SheetComment gravatarMd5(String gravatarMd5) {
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

  public SheetComment id(Long id) {
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

  public SheetComment ipAddress(String ipAddress) {
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

  public SheetComment isAdmin(Boolean isAdmin) {
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

  public SheetComment parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Get postId
   * @return postId
  **/
  @JsonProperty("postId")
  public Integer getPostId() {
    return postId;
  }

  public void setPostId(Integer postId) {
    this.postId = postId;
  }

  public SheetComment postId(Integer postId) {
    this.postId = postId;
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

  public SheetComment status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get topPriority
   * @return topPriority
  **/
  @JsonProperty("topPriority")
  public Integer getTopPriority() {
    return topPriority;
  }

  public void setTopPriority(Integer topPriority) {
    this.topPriority = topPriority;
  }

  public SheetComment topPriority(Integer topPriority) {
    this.topPriority = topPriority;
    return this;
  }

 /**
   * Get updateTime
   * @return updateTime
  **/
  @JsonProperty("updateTime")
  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public SheetComment updateTime(Date updateTime) {
    this.updateTime = updateTime;
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

  public SheetComment userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SheetComment {\n");
    
    sb.append("    allowNotification: ").append(toIndentedString(allowNotification)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorUrl: ").append(toIndentedString(authorUrl)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gravatarMd5: ").append(toIndentedString(gravatarMd5)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    topPriority: ").append(toIndentedString(topPriority)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
