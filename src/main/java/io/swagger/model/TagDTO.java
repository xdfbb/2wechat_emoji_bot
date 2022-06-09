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

public class TagDTO   {
  
  @Schema(description = "")
  private String color = null;
  
  @Schema(description = "")
  private Date createTime = null;
  
  @Schema(description = "")
  private String fullPath = null;
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private String slug = null;
  
  @Schema(description = "")
  private String thumbnail = null;
 /**
   * Get color
   * @return color
  **/
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public TagDTO color(String color) {
    this.color = color;
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

  public TagDTO createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }

 /**
   * Get fullPath
   * @return fullPath
  **/
  @JsonProperty("fullPath")
  public String getFullPath() {
    return fullPath;
  }

  public void setFullPath(String fullPath) {
    this.fullPath = fullPath;
  }

  public TagDTO fullPath(String fullPath) {
    this.fullPath = fullPath;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TagDTO id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TagDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get slug
   * @return slug
  **/
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public TagDTO slug(String slug) {
    this.slug = slug;
    return this;
  }

 /**
   * Get thumbnail
   * @return thumbnail
  **/
  @JsonProperty("thumbnail")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public TagDTO thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagDTO {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
