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

public class BaseResponseOfobject   {
  
  @Schema(description = "")
  private Object data = null;
  
  @Schema(description = "")
  private String devMessage = null;
  
  @Schema(description = "")
  private String message = null;
  
  @Schema(description = "")
  private Integer status = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public BaseResponseOfobject data(Object data) {
    this.data = data;
    return this;
  }

 /**
   * Get devMessage
   * @return devMessage
  **/
  @JsonProperty("devMessage")
  public String getDevMessage() {
    return devMessage;
  }

  public void setDevMessage(String devMessage) {
    this.devMessage = devMessage;
  }

  public BaseResponseOfobject devMessage(String devMessage) {
    this.devMessage = devMessage;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BaseResponseOfobject message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public BaseResponseOfobject status(Integer status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResponseOfobject {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    devMessage: ").append(toIndentedString(devMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
