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

public class EnvironmentDTO   {
  
  @Schema(description = "")
  private String database = null;
  public enum ModeEnum {
    DEMO("DEMO"),
    DEVELOPMENT("DEVELOPMENT"),
    PRODUCTION("PRODUCTION"),
    TEST("TEST");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private ModeEnum mode = null;
  
  @Schema(description = "")
  private Long startTime = null;
  
  @Schema(description = "")
  private String version = null;
 /**
   * Get database
   * @return database
  **/
  @JsonProperty("database")
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public EnvironmentDTO database(String database) {
    this.database = database;
    return this;
  }

 /**
   * Get mode
   * @return mode
  **/
  @JsonProperty("mode")
  public String getMode() {
    if (mode == null) {
      return null;
    }
    return mode.getValue();
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public EnvironmentDTO mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

 /**
   * Get startTime
   * @return startTime
  **/
  @JsonProperty("startTime")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public EnvironmentDTO startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public EnvironmentDTO version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentDTO {\n");
    
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
