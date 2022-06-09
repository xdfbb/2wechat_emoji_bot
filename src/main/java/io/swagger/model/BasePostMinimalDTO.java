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

public class BasePostMinimalDTO   {
  
  @Schema(description = "")
  private Date createTime = null;
  
  @Schema(description = "")
  private Date editTime = null;
  public enum EditorTypeEnum {
    MARKDOWN("MARKDOWN"),
    RICHTEXT("RICHTEXT");

    private String value;

    EditorTypeEnum(String value) {
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
    public static EditorTypeEnum fromValue(String text) {
      for (EditorTypeEnum b : EditorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private EditorTypeEnum editorType = null;
  
  @Schema(description = "")
  private String fullPath = null;
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private String metaDescription = null;
  
  @Schema(description = "")
  private String metaKeywords = null;
  
  @Schema(description = "")
  private String slug = null;
  public enum StatusEnum {
    DRAFT("DRAFT"),
    INTIMATE("INTIMATE"),
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
  private String title = null;
  
  @Schema(description = "")
  private Date updateTime = null;
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

  public BasePostMinimalDTO createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }

 /**
   * Get editTime
   * @return editTime
  **/
  @JsonProperty("editTime")
  public Date getEditTime() {
    return editTime;
  }

  public void setEditTime(Date editTime) {
    this.editTime = editTime;
  }

  public BasePostMinimalDTO editTime(Date editTime) {
    this.editTime = editTime;
    return this;
  }

 /**
   * Get editorType
   * @return editorType
  **/
  @JsonProperty("editorType")
  public String getEditorType() {
    if (editorType == null) {
      return null;
    }
    return editorType.getValue();
  }

  public void setEditorType(EditorTypeEnum editorType) {
    this.editorType = editorType;
  }

  public BasePostMinimalDTO editorType(EditorTypeEnum editorType) {
    this.editorType = editorType;
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

  public BasePostMinimalDTO fullPath(String fullPath) {
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

  public BasePostMinimalDTO id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get metaDescription
   * @return metaDescription
  **/
  @JsonProperty("metaDescription")
  public String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public BasePostMinimalDTO metaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

 /**
   * Get metaKeywords
   * @return metaKeywords
  **/
  @JsonProperty("metaKeywords")
  public String getMetaKeywords() {
    return metaKeywords;
  }

  public void setMetaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
  }

  public BasePostMinimalDTO metaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
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

  public BasePostMinimalDTO slug(String slug) {
    this.slug = slug;
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

  public BasePostMinimalDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BasePostMinimalDTO title(String title) {
    this.title = title;
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

  public BasePostMinimalDTO updateTime(Date updateTime) {
    this.updateTime = updateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasePostMinimalDTO {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    editTime: ").append(toIndentedString(editTime)).append("\n");
    sb.append("    editorType: ").append(toIndentedString(editorType)).append("\n");
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metaDescription: ").append(toIndentedString(metaDescription)).append("\n");
    sb.append("    metaKeywords: ").append(toIndentedString(metaKeywords)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
