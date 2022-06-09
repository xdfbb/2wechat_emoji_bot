package io.swagger.model;

import io.swagger.model.BaseMetaDTO;
import io.swagger.model.CategoryDTO;
import io.swagger.model.TagDTO;

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

public class PostDetailVO extends ResponseWrapper<PostDetailVO> {

    @Schema(description = "")
    private List<CategoryDTO> categories = null;

    @Schema(description = "")
    private List<Integer> categoryIds = null;

    @Schema(description = "")
    private Long commentCount = null;

    @Schema(description = "")
    private String content = null;

    @Schema(description = "")
    private Date createTime = null;

    @Schema(description = "")
    private Boolean disallowComment = null;

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
    private String formatContent = null;

    @Schema(description = "")
    private String fullPath = null;

    @Schema(description = "")
    private Integer id = null;

    @Schema(description = "")
    private Boolean inProgress = null;

    @Schema(description = "")
    private Long likes = null;

    @Schema(description = "")
    private String metaDescription = null;

    @Schema(description = "")
    private List<Long> metaIds = null;

    @Schema(description = "")
    private String metaKeywords = null;

    @Schema(description = "")
    private List<BaseMetaDTO> metas = null;

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
    private List<TagDTO> tags = null;

    @Schema(description = "")
    private String template = null;

    @Schema(description = "")
    private String thumbnail = null;

    @Schema(description = "")
    private String title = null;

    @Schema(description = "")
    private Integer topPriority = null;

    @Schema(description = "")
    private Boolean topped = null;

    @Schema(description = "")
    private Date updateTime = null;

    @Schema(description = "")
    private Long visits = null;

    @Schema(description = "")
    private Long wordCount = null;

    /**
     * Get categories
     *
     * @return categories
     **/
    @JsonProperty("categories")
    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }

    public PostDetailVO categories(List<CategoryDTO> categories) {
        this.categories = categories;
        return this;
    }

    public PostDetailVO addCategoriesItem(CategoryDTO categoriesItem) {
        this.categories.add(categoriesItem);
        return this;
    }

    /**
     * Get categoryIds
     *
     * @return categoryIds
     **/
    @JsonProperty("categoryIds")
    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public PostDetailVO categoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }

    public PostDetailVO addCategoryIdsItem(Integer categoryIdsItem) {
        this.categoryIds.add(categoryIdsItem);
        return this;
    }

    /**
     * Get commentCount
     *
     * @return commentCount
     **/
    @JsonProperty("commentCount")
    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public PostDetailVO commentCount(Long commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    /**
     * Get content
     *
     * @return content
     **/
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PostDetailVO content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get createTime
     *
     * @return createTime
     **/
    @JsonProperty("createTime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PostDetailVO createTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get disallowComment
     *
     * @return disallowComment
     **/
    @JsonProperty("disallowComment")
    public Boolean isDisallowComment() {
        return disallowComment;
    }

    public void setDisallowComment(Boolean disallowComment) {
        this.disallowComment = disallowComment;
    }

    public PostDetailVO disallowComment(Boolean disallowComment) {
        this.disallowComment = disallowComment;
        return this;
    }

    /**
     * Get editTime
     *
     * @return editTime
     **/
    @JsonProperty("editTime")
    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public PostDetailVO editTime(Date editTime) {
        this.editTime = editTime;
        return this;
    }

    /**
     * Get editorType
     *
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

    public PostDetailVO editorType(EditorTypeEnum editorType) {
        this.editorType = editorType;
        return this;
    }

    /**
     * Get formatContent
     *
     * @return formatContent
     **/
    @JsonProperty("formatContent")
    public String getFormatContent() {
        return formatContent;
    }

    public void setFormatContent(String formatContent) {
        this.formatContent = formatContent;
    }

    public PostDetailVO formatContent(String formatContent) {
        this.formatContent = formatContent;
        return this;
    }

    /**
     * Get fullPath
     *
     * @return fullPath
     **/
    @JsonProperty("fullPath")
    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public PostDetailVO fullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PostDetailVO id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get inProgress
     *
     * @return inProgress
     **/
    @JsonProperty("inProgress")
    public Boolean isInProgress() {
        return inProgress;
    }

    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }

    public PostDetailVO inProgress(Boolean inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    /**
     * Get likes
     *
     * @return likes
     **/
    @JsonProperty("likes")
    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public PostDetailVO likes(Long likes) {
        this.likes = likes;
        return this;
    }

    /**
     * Get metaDescription
     *
     * @return metaDescription
     **/
    @JsonProperty("metaDescription")
    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public PostDetailVO metaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     * Get metaIds
     *
     * @return metaIds
     **/
    @JsonProperty("metaIds")
    public List<Long> getMetaIds() {
        return metaIds;
    }

    public void setMetaIds(List<Long> metaIds) {
        this.metaIds = metaIds;
    }

    public PostDetailVO metaIds(List<Long> metaIds) {
        this.metaIds = metaIds;
        return this;
    }

    public PostDetailVO addMetaIdsItem(Long metaIdsItem) {
        this.metaIds.add(metaIdsItem);
        return this;
    }

    /**
     * Get metaKeywords
     *
     * @return metaKeywords
     **/
    @JsonProperty("metaKeywords")
    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public PostDetailVO metaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     * Get metas
     *
     * @return metas
     **/
    @JsonProperty("metas")
    public List<BaseMetaDTO> getMetas() {
        return metas;
    }

    public void setMetas(List<BaseMetaDTO> metas) {
        this.metas = metas;
    }

    public PostDetailVO metas(List<BaseMetaDTO> metas) {
        this.metas = metas;
        return this;
    }

    public PostDetailVO addMetasItem(BaseMetaDTO metasItem) {
        this.metas.add(metasItem);
        return this;
    }

    /**
     * Get originalContent
     *
     * @return originalContent
     **/
    @JsonProperty("originalContent")
    public String getOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    public PostDetailVO originalContent(String originalContent) {
        this.originalContent = originalContent;
        return this;
    }

    /**
     * Get password
     *
     * @return password
     **/
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PostDetailVO password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get slug
     *
     * @return slug
     **/
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public PostDetailVO slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get status
     *
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

    public PostDetailVO status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get summary
     *
     * @return summary
     **/
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public PostDetailVO summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get tagIds
     *
     * @return tagIds
     **/
    @JsonProperty("tagIds")
    public List<Integer> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public PostDetailVO tagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    public PostDetailVO addTagIdsItem(Integer tagIdsItem) {
        this.tagIds.add(tagIdsItem);
        return this;
    }

    /**
     * Get tags
     *
     * @return tags
     **/
    @JsonProperty("tags")
    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }

    public PostDetailVO tags(List<TagDTO> tags) {
        this.tags = tags;
        return this;
    }

    public PostDetailVO addTagsItem(TagDTO tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get template
     *
     * @return template
     **/
    @JsonProperty("template")
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public PostDetailVO template(String template) {
        this.template = template;
        return this;
    }

    /**
     * Get thumbnail
     *
     * @return thumbnail
     **/
    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public PostDetailVO thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PostDetailVO title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get topPriority
     *
     * @return topPriority
     **/
    @JsonProperty("topPriority")
    public Integer getTopPriority() {
        return topPriority;
    }

    public void setTopPriority(Integer topPriority) {
        this.topPriority = topPriority;
    }

    public PostDetailVO topPriority(Integer topPriority) {
        this.topPriority = topPriority;
        return this;
    }

    /**
     * Get topped
     *
     * @return topped
     **/
    @JsonProperty("topped")
    public Boolean isTopped() {
        return topped;
    }

    public void setTopped(Boolean topped) {
        this.topped = topped;
    }

    public PostDetailVO topped(Boolean topped) {
        this.topped = topped;
        return this;
    }

    /**
     * Get updateTime
     *
     * @return updateTime
     **/
    @JsonProperty("updateTime")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public PostDetailVO updateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get visits
     *
     * @return visits
     **/
    @JsonProperty("visits")
    public Long getVisits() {
        return visits;
    }

    public void setVisits(Long visits) {
        this.visits = visits;
    }

    public PostDetailVO visits(Long visits) {
        this.visits = visits;
        return this;
    }

    /**
     * Get wordCount
     *
     * @return wordCount
     **/
    @JsonProperty("wordCount")
    public Long getWordCount() {
        return wordCount;
    }

    public void setWordCount(Long wordCount) {
        this.wordCount = wordCount;
    }

    public PostDetailVO wordCount(Long wordCount) {
        this.wordCount = wordCount;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostDetailVO {\n");

        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
        sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    disallowComment: ").append(toIndentedString(disallowComment)).append("\n");
        sb.append("    editTime: ").append(toIndentedString(editTime)).append("\n");
        sb.append("    editorType: ").append(toIndentedString(editorType)).append("\n");
        sb.append("    formatContent: ").append(toIndentedString(formatContent)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
        sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
        sb.append("    metaDescription: ").append(toIndentedString(metaDescription)).append("\n");
        sb.append("    metaIds: ").append(toIndentedString(metaIds)).append("\n");
        sb.append("    metaKeywords: ").append(toIndentedString(metaKeywords)).append("\n");
        sb.append("    metas: ").append(toIndentedString(metas)).append("\n");
        sb.append("    originalContent: ").append(toIndentedString(originalContent)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    topPriority: ").append(toIndentedString(topPriority)).append("\n");
        sb.append("    topped: ").append(toIndentedString(topped)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    visits: ").append(toIndentedString(visits)).append("\n");
        sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
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
