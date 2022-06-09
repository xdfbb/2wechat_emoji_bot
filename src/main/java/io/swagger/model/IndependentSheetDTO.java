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

public class IndependentSheetDTO   {
  
  @Schema(description = "")
  private Boolean available = null;
  
  @Schema(description = "")
  private String fullPath = null;
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private String routeName = null;
  
  @Schema(description = "")
  private String title = null;
 /**
   * Get available
   * @return available
  **/
  @JsonProperty("available")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public IndependentSheetDTO available(Boolean available) {
    this.available = available;
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

  public IndependentSheetDTO fullPath(String fullPath) {
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

  public IndependentSheetDTO id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get routeName
   * @return routeName
  **/
  @JsonProperty("routeName")
  public String getRouteName() {
    return routeName;
  }

  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }

  public IndependentSheetDTO routeName(String routeName) {
    this.routeName = routeName;
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

  public IndependentSheetDTO title(String title) {
    this.title = title;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndependentSheetDTO {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
