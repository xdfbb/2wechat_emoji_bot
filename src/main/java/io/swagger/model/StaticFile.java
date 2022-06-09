package io.swagger.model;

import io.swagger.model.StaticFile;
import java.util.ArrayList;
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

public class StaticFile   {
  
  @Schema(description = "")
  private List<StaticFile> children = null;
  
  @Schema(description = "")
  private Long createTime = null;
  
  @Schema(description = "")
  private String id = null;
  
  @Schema(description = "")
  private Boolean isFile = null;
  
  @Schema(description = "")
  private String mimeType = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private String path = null;
  
  @Schema(description = "")
  private String relativePath = null;
 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<StaticFile> getChildren() {
    return children;
  }

  public void setChildren(List<StaticFile> children) {
    this.children = children;
  }

  public StaticFile children(List<StaticFile> children) {
    this.children = children;
    return this;
  }

  public StaticFile addChildrenItem(StaticFile childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

 /**
   * Get createTime
   * @return createTime
  **/
  @JsonProperty("createTime")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public StaticFile createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StaticFile id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get isFile
   * @return isFile
  **/
  @JsonProperty("isFile")
  public Boolean isIsFile() {
    return isFile;
  }

  public void setIsFile(Boolean isFile) {
    this.isFile = isFile;
  }

  public StaticFile isFile(Boolean isFile) {
    this.isFile = isFile;
    return this;
  }

 /**
   * Get mimeType
   * @return mimeType
  **/
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public StaticFile mimeType(String mimeType) {
    this.mimeType = mimeType;
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

  public StaticFile name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public StaticFile path(String path) {
    this.path = path;
    return this;
  }

 /**
   * Get relativePath
   * @return relativePath
  **/
  @JsonProperty("relativePath")
  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public StaticFile relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticFile {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFile: ").append(toIndentedString(isFile)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
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
