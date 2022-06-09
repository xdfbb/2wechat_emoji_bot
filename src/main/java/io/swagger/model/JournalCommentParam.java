package io.swagger.model;


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

public class JournalCommentParam   {
  
  @Schema(description = "")
  private Boolean allowNotification = null;
  
  @Schema(required = true, description = "")
  private String author = null;
  
  @Schema(description = "")
  private String authorUrl = null;
  
  @Schema(required = true, description = "")
  private String content = null;
  
  @Schema(description = "")
  private String email = null;
  
  @Schema(description = "")
  private Long parentId = null;
  
  @Schema(description = "")
  private Integer postId = null;
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

  public JournalCommentParam allowNotification(Boolean allowNotification) {
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

  public JournalCommentParam author(String author) {
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

  public JournalCommentParam authorUrl(String authorUrl) {
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

  public JournalCommentParam content(String content) {
    this.content = content;
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

  public JournalCommentParam email(String email) {
    this.email = email;
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

  public JournalCommentParam parentId(Long parentId) {
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

  public JournalCommentParam postId(Integer postId) {
    this.postId = postId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalCommentParam {\n");
    
    sb.append("    allowNotification: ").append(toIndentedString(allowNotification)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorUrl: ").append(toIndentedString(authorUrl)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
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
