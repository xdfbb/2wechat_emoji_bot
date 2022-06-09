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

public class TagParam   {
  
  @Schema(example = "#e23d66", description = "标签颜色，支持多种颜色模式，例如 Hex: #cfd3d7，颜色名称：LightGrey，RGB: rgb(207, 211, 215)，RGBA: rgb(207, 211, 215, 0.5)等")
 /**
   * 标签颜色，支持多种颜色模式，例如 Hex: #cfd3d7，颜色名称：LightGrey，RGB: rgb(207, 211, 215)，RGBA: rgb(207, 211, 215, 0.5)等  
  **/
  private String color = null;
  
  @Schema(required = true, description = "")
  private String name = null;
  
  @Schema(description = "")
  private String slug = null;
  
  @Schema(description = "")
  private String thumbnail = null;
 /**
   * 标签颜色，支持多种颜色模式，例如 Hex: #cfd3d7，颜色名称：LightGrey，RGB: rgb(207, 211, 215)，RGBA: rgb(207, 211, 215, 0.5)等
   * @return color
  **/
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public TagParam color(String color) {
    this.color = color;
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

  public TagParam name(String name) {
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

  public TagParam slug(String slug) {
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

  public TagParam thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagParam {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
