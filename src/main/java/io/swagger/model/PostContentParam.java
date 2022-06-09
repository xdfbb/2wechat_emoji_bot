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

public class PostContentParam   {
  
  @Schema(description = "")
  private String content = null;
  
  @Schema(description = "")
  private Boolean keepRaw = null;
  
  @Schema(description = "")
  private String originalContent = null;
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

  public PostContentParam content(String content) {
    this.content = content;
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

  public PostContentParam keepRaw(Boolean keepRaw) {
    this.keepRaw = keepRaw;
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

  public PostContentParam originalContent(String originalContent) {
    this.originalContent = originalContent;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContentParam {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    keepRaw: ").append(toIndentedString(keepRaw)).append("\n");
    sb.append("    originalContent: ").append(toIndentedString(originalContent)).append("\n");
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
