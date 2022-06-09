package io.swagger.model;

import io.swagger.model.SheetCommentWithSheetVO;
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

public class CustomizedPageOfSheetCommentWithSheetVO   {
  
  @Schema(description = "")
  private List<SheetCommentWithSheetVO> content = null;
  
  @Schema(description = "")
  private Boolean hasContent = null;
  
  @Schema(description = "")
  private Boolean hasNext = null;
  
  @Schema(description = "")
  private Boolean hasPrevious = null;
  
  @Schema(description = "")
  private Boolean isEmpty = null;
  
  @Schema(description = "")
  private Boolean isFirst = null;
  
  @Schema(description = "")
  private Integer page = null;
  
  @Schema(description = "")
  private Integer pages = null;
  
  @Schema(description = "")
  private Integer rpp = null;
  
  @Schema(description = "")
  private Long total = null;
 /**
   * Get content
   * @return content
  **/
  @JsonProperty("content")
  public List<SheetCommentWithSheetVO> getContent() {
    return content;
  }

  public void setContent(List<SheetCommentWithSheetVO> content) {
    this.content = content;
  }

  public CustomizedPageOfSheetCommentWithSheetVO content(List<SheetCommentWithSheetVO> content) {
    this.content = content;
    return this;
  }

  public CustomizedPageOfSheetCommentWithSheetVO addContentItem(SheetCommentWithSheetVO contentItem) {
    this.content.add(contentItem);
    return this;
  }

 /**
   * Get hasContent
   * @return hasContent
  **/
  @JsonProperty("hasContent")
  public Boolean isHasContent() {
    return hasContent;
  }

  public void setHasContent(Boolean hasContent) {
    this.hasContent = hasContent;
  }

  public CustomizedPageOfSheetCommentWithSheetVO hasContent(Boolean hasContent) {
    this.hasContent = hasContent;
    return this;
  }

 /**
   * Get hasNext
   * @return hasNext
  **/
  @JsonProperty("hasNext")
  public Boolean isHasNext() {
    return hasNext;
  }

  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }

  public CustomizedPageOfSheetCommentWithSheetVO hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

 /**
   * Get hasPrevious
   * @return hasPrevious
  **/
  @JsonProperty("hasPrevious")
  public Boolean isHasPrevious() {
    return hasPrevious;
  }

  public void setHasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }

  public CustomizedPageOfSheetCommentWithSheetVO hasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
    return this;
  }

 /**
   * Get isEmpty
   * @return isEmpty
  **/
  @JsonProperty("isEmpty")
  public Boolean isIsEmpty() {
    return isEmpty;
  }

  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  public CustomizedPageOfSheetCommentWithSheetVO isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }

 /**
   * Get isFirst
   * @return isFirst
  **/
  @JsonProperty("isFirst")
  public Boolean isIsFirst() {
    return isFirst;
  }

  public void setIsFirst(Boolean isFirst) {
    this.isFirst = isFirst;
  }

  public CustomizedPageOfSheetCommentWithSheetVO isFirst(Boolean isFirst) {
    this.isFirst = isFirst;
    return this;
  }

 /**
   * Get page
   * @return page
  **/
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public CustomizedPageOfSheetCommentWithSheetVO page(Integer page) {
    this.page = page;
    return this;
  }

 /**
   * Get pages
   * @return pages
  **/
  @JsonProperty("pages")
  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public CustomizedPageOfSheetCommentWithSheetVO pages(Integer pages) {
    this.pages = pages;
    return this;
  }

 /**
   * Get rpp
   * @return rpp
  **/
  @JsonProperty("rpp")
  public Integer getRpp() {
    return rpp;
  }

  public void setRpp(Integer rpp) {
    this.rpp = rpp;
  }

  public CustomizedPageOfSheetCommentWithSheetVO rpp(Integer rpp) {
    this.rpp = rpp;
    return this;
  }

 /**
   * Get total
   * @return total
  **/
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public CustomizedPageOfSheetCommentWithSheetVO total(Long total) {
    this.total = total;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizedPageOfSheetCommentWithSheetVO {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    hasContent: ").append(toIndentedString(hasContent)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
    sb.append("    isEmpty: ").append(toIndentedString(isEmpty)).append("\n");
    sb.append("    isFirst: ").append(toIndentedString(isFirst)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    rpp: ").append(toIndentedString(rpp)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
