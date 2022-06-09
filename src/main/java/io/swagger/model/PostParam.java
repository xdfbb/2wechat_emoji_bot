package io.swagger.model;

import io.swagger.model.PostMetaParam;
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

public class PostParam   {
  
  @Schema(description = "")
  private List<Integer> categoryIds = null;
  
  @Schema(description = "")
  private String content = null;
  
  @Schema(description = "")
  private Date createTime = null;
  
  @Schema(description = "")
  private Boolean disallowComment = null;
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
  private Boolean keepRaw = null;
  
  @Schema(description = "")
  private String metaDescription = null;
  
  @Schema(description = "")
  private String metaKeywords = null;
  
  @Schema(description = "")
  private List<PostMetaParam> metas = null;
  
  @Schema(description = "")
  private String originalContent = null;
  
  @Schema(description = "")
  private String password = null;
  
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
  private String summary = null;
  
  @Schema(description = "")
  private List<Integer> tagIds = null;
  
  @Schema(description = "")
  private String template = null;
  
  @Schema(description = "")
  private String thumbnail = null;
  
  @Schema(required = true, description = "")
  private String title = null;
  
  @Schema(description = "")
  private Integer topPriority = null;
 /**
   * Get categoryIds
   * @return categoryIds
  **/
  @JsonProperty("categoryIds")
  public List<Integer> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public PostParam categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public PostParam addCategoryIdsItem(Integer categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
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

  public PostParam content(String content) {
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

  public PostParam createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }

 /**
   * Get disallowComment
   * @return disallowComment
  **/
  @JsonProperty("disallowComment")
  public Boolean isDisallowComment() {
    return disallowComment;
  }

  public void setDisallowComment(Boolean disallowComment) {
    this.disallowComment = disallowComment;
  }

  public PostParam disallowComment(Boolean disallowComment) {
    this.disallowComment = disallowComment;
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

  public PostParam editorType(EditorTypeEnum editorType) {
    this.editorType = editorType;
    return this;
  }

 /**
   * Get keepRaw
   * @return keepRaw
  **/
  @JsonProperty("keepRaw")
  public Boolean isKeepRaw() {
    return keepRaw;
  }

  public void setKeepRaw(Boolean keepRaw) {
    this.keepRaw = keepRaw;
  }

  public PostParam keepRaw(Boolean keepRaw) {
    this.keepRaw = keepRaw;
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

  public PostParam metaDescription(String metaDescription) {
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

  public PostParam metaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
    return this;
  }

 /**
   * Get metas
   * @return metas
  **/
  @JsonProperty("metas")
  public List<PostMetaParam> getMetas() {
    return metas;
  }

  public void setMetas(List<PostMetaParam> metas) {
    this.metas = metas;
  }

  public PostParam metas(List<PostMetaParam> metas) {
    this.metas = metas;
    return this;
  }

  public PostParam addMetasItem(PostMetaParam metasItem) {
    this.metas.add(metasItem);
    return this;
  }

 /**
   * Get originalContent
   * @return originalContent
  **/
  @JsonProperty("originalContent")
  public String getOriginalContent() {
    return originalContent;
  }

  public void setOriginalContent(String originalContent) {
    this.originalContent = originalContent;
  }

  public PostParam originalContent(String originalContent) {
    this.originalContent = originalContent;
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

  public PostParam password(String password) {
    this.password = password;
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

  public PostParam slug(String slug) {
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

  public PostParam status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get summary
   * @return summary
  **/
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public PostParam summary(String summary) {
    this.summary = summary;
    return this;
  }

 /**
   * Get tagIds
   * @return tagIds
  **/
  @JsonProperty("tagIds")
  public List<Integer> getTagIds() {
    return tagIds;
  }

  public void setTagIds(List<Integer> tagIds) {
    this.tagIds = tagIds;
  }

  public PostParam tagIds(List<Integer> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public PostParam addTagIdsItem(Integer tagIdsItem) {
    this.tagIds.add(tagIdsItem);
    return this;
  }

 /**
   * Get template
   * @return template
  **/
  @JsonProperty("template")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public PostParam template(String template) {
    this.template = template;
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

  public PostParam thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
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

  public PostParam title(String title) {
    this.title = title;
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

  public PostParam topPriority(Integer topPriority) {
    this.topPriority = topPriority;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostParam {\n");
    
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    disallowComment: ").append(toIndentedString(disallowComment)).append("\n");
    sb.append("    editorType: ").append(toIndentedString(editorType)).append("\n");
    sb.append("    keepRaw: ").append(toIndentedString(keepRaw)).append("\n");
    sb.append("    metaDescription: ").append(toIndentedString(metaDescription)).append("\n");
    sb.append("    metaKeywords: ").append(toIndentedString(metaKeywords)).append("\n");
    sb.append("    metas: ").append(toIndentedString(metas)).append("\n");
    sb.append("    originalContent: ").append(toIndentedString(originalContent)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    topPriority: ").append(toIndentedString(topPriority)).append("\n");
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
