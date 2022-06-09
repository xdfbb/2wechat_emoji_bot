package io.swagger.model;

import io.swagger.model.CategoryVO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

public class CategoryVO   {
  
  @Schema(description = "")
  private List<CategoryVO> children = null;
  
  @Schema(description = "")
  private Date createTime = null;
  
  @Schema(description = "")
  private String description = null;
  
  @Schema(description = "")
  private String fullPath = null;
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private Integer parentId = null;
  
  @Schema(description = "")
  private String password = null;
  
  @Schema(description = "")
  private Integer priority = null;
  
  @Schema(description = "")
  private String slug = null;
  
  @Schema(description = "")
  private String thumbnail = null;
 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<CategoryVO> getChildren() {
    return children;
  }

  public void setChildren(List<CategoryVO> children) {
    this.children = children;
  }

  public CategoryVO children(List<CategoryVO> children) {
    this.children = children;
    return this;
  }

  public CategoryVO addChildrenItem(CategoryVO childrenItem) {
    this.children.add(childrenItem);
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

  public CategoryVO createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CategoryVO description(String description) {
    this.description = description;
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

  public CategoryVO fullPath(String fullPath) {
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

  public CategoryVO id(Integer id) {
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

  public CategoryVO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get parentId
   * @return parentId
  **/
  @JsonProperty("parentId")
  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public CategoryVO parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Get password
   * @return password
  **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CategoryVO password(String password) {
    this.password = password;
    return this;
  }

 /**
   * Get priority
   * @return priority
  **/
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public CategoryVO priority(Integer priority) {
    this.priority = priority;
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

  public CategoryVO slug(String slug) {
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

  public CategoryVO thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryVO {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
