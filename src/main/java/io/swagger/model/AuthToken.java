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

public class AuthToken   {
  
  @Schema(description = "")
  private String accessToken = null;
  
  @Schema(description = "")
  private Integer expiredIn = null;
  
  @Schema(description = "")
  private String refreshToken = null;
 /**
   * Get accessToken
   * @return accessToken
  **/
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AuthToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

 /**
   * Get expiredIn
   * @return expiredIn
  **/
  @JsonProperty("expired_in")
  public Integer getExpiredIn() {
    return expiredIn;
  }

  public void setExpiredIn(Integer expiredIn) {
    this.expiredIn = expiredIn;
  }

  public AuthToken expiredIn(Integer expiredIn) {
    this.expiredIn = expiredIn;
    return this;
  }

 /**
   * Get refreshToken
   * @return refreshToken
  **/
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public AuthToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthToken {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiredIn: ").append(toIndentedString(expiredIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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
