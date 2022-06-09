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

public class PostMarkdownParam   {
  
  @Schema(description = "")
  private Boolean needFrontMatter = null;
 /**
   * Get needFrontMatter
   * @return needFrontMatter
  **/
  @JsonProperty("needFrontMatter")
  public Boolean isNeedFrontMatter() {
    return needFrontMatter;
  }

  public void setNeedFrontMatter(Boolean needFrontMatter) {
    this.needFrontMatter = needFrontMatter;
  }

  public PostMarkdownParam needFrontMatter(Boolean needFrontMatter) {
    this.needFrontMatter = needFrontMatter;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMarkdownParam {\n");
    
    sb.append("    needFrontMatter: ").append(toIndentedString(needFrontMatter)).append("\n");
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
