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

public class JournalParam   {
  
  @Schema(description = "")
  private String content = null;
  
  @Schema(description = "")
  private Boolean keepRaw = null;
  
  @Schema(required = true, description = "")
  private String sourceContent = null;
  public enum TypeEnum {
    INTIMATE("INTIMATE"),
    PUBLIC("PUBLIC");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private TypeEnum type = null;
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

  public JournalParam content(String content) {
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

  public JournalParam keepRaw(Boolean keepRaw) {
    this.keepRaw = keepRaw;
    return this;
  }

 /**
   * Get sourceContent
   * @return sourceContent
  **/
  @JsonProperty("sourceContent")
  public String getSourceContent() {
    return sourceContent;
  }

  public void setSourceContent(String sourceContent) {
    this.sourceContent = sourceContent;
  }

  public JournalParam sourceContent(String sourceContent) {
    this.sourceContent = sourceContent;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.getValue();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public JournalParam type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalParam {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    keepRaw: ").append(toIndentedString(keepRaw)).append("\n");
    sb.append("    sourceContent: ").append(toIndentedString(sourceContent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
