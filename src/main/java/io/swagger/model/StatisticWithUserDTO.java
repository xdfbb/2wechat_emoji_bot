package io.swagger.model;

import io.swagger.model.UserDTO;

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

public class StatisticWithUserDTO   {
  
  @Schema(description = "")
  private Long birthday = null;
  
  @Schema(description = "")
  private Long categoryCount = null;
  
  @Schema(description = "")
  private Long commentCount = null;
  
  @Schema(description = "")
  private Long establishDays = null;
  
  @Schema(description = "")
  private Long journalCount = null;
  
  @Schema(description = "")
  private Long likeCount = null;
  
  @Schema(description = "")
  private Long linkCount = null;
  
  @Schema(description = "")
  private Long postCount = null;
  
  @Schema(description = "")
  private Long tagCount = null;
  
  @Schema(description = "")
  private UserDTO user = null;
  
  @Schema(description = "")
  private Long visitCount = null;
 /**
   * Get birthday
   * @return birthday
  **/
  @JsonProperty("birthday")
  public Long getBirthday() {
    return birthday;
  }

  public void setBirthday(Long birthday) {
    this.birthday = birthday;
  }

  public StatisticWithUserDTO birthday(Long birthday) {
    this.birthday = birthday;
    return this;
  }

 /**
   * Get categoryCount
   * @return categoryCount
  **/
  @JsonProperty("categoryCount")
  public Long getCategoryCount() {
    return categoryCount;
  }

  public void setCategoryCount(Long categoryCount) {
    this.categoryCount = categoryCount;
  }

  public StatisticWithUserDTO categoryCount(Long categoryCount) {
    this.categoryCount = categoryCount;
    return this;
  }

 /**
   * Get commentCount
   * @return commentCount
  **/
  @JsonProperty("commentCount")
  public Long getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Long commentCount) {
    this.commentCount = commentCount;
  }

  public StatisticWithUserDTO commentCount(Long commentCount) {
    this.commentCount = commentCount;
    return this;
  }

 /**
   * Get establishDays
   * @return establishDays
  **/
  @JsonProperty("establishDays")
  public Long getEstablishDays() {
    return establishDays;
  }

  public void setEstablishDays(Long establishDays) {
    this.establishDays = establishDays;
  }

  public StatisticWithUserDTO establishDays(Long establishDays) {
    this.establishDays = establishDays;
    return this;
  }

 /**
   * Get journalCount
   * @return journalCount
  **/
  @JsonProperty("journalCount")
  public Long getJournalCount() {
    return journalCount;
  }

  public void setJournalCount(Long journalCount) {
    this.journalCount = journalCount;
  }

  public StatisticWithUserDTO journalCount(Long journalCount) {
    this.journalCount = journalCount;
    return this;
  }

 /**
   * Get likeCount
   * @return likeCount
  **/
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public StatisticWithUserDTO likeCount(Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

 /**
   * Get linkCount
   * @return linkCount
  **/
  @JsonProperty("linkCount")
  public Long getLinkCount() {
    return linkCount;
  }

  public void setLinkCount(Long linkCount) {
    this.linkCount = linkCount;
  }

  public StatisticWithUserDTO linkCount(Long linkCount) {
    this.linkCount = linkCount;
    return this;
  }

 /**
   * Get postCount
   * @return postCount
  **/
  @JsonProperty("postCount")
  public Long getPostCount() {
    return postCount;
  }

  public void setPostCount(Long postCount) {
    this.postCount = postCount;
  }

  public StatisticWithUserDTO postCount(Long postCount) {
    this.postCount = postCount;
    return this;
  }

 /**
   * Get tagCount
   * @return tagCount
  **/
  @JsonProperty("tagCount")
  public Long getTagCount() {
    return tagCount;
  }

  public void setTagCount(Long tagCount) {
    this.tagCount = tagCount;
  }

  public StatisticWithUserDTO tagCount(Long tagCount) {
    this.tagCount = tagCount;
    return this;
  }

 /**
   * Get user
   * @return user
  **/
  @JsonProperty("user")
  public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }

  public StatisticWithUserDTO user(UserDTO user) {
    this.user = user;
    return this;
  }

 /**
   * Get visitCount
   * @return visitCount
  **/
  @JsonProperty("visitCount")
  public Long getVisitCount() {
    return visitCount;
  }

  public void setVisitCount(Long visitCount) {
    this.visitCount = visitCount;
  }

  public StatisticWithUserDTO visitCount(Long visitCount) {
    this.visitCount = visitCount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticWithUserDTO {\n");
    
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    categoryCount: ").append(toIndentedString(categoryCount)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    establishDays: ").append(toIndentedString(establishDays)).append("\n");
    sb.append("    journalCount: ").append(toIndentedString(journalCount)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    linkCount: ").append(toIndentedString(linkCount)).append("\n");
    sb.append("    postCount: ").append(toIndentedString(postCount)).append("\n");
    sb.append("    tagCount: ").append(toIndentedString(tagCount)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    visitCount: ").append(toIndentedString(visitCount)).append("\n");
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
