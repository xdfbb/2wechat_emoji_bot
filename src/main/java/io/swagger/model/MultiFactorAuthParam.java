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

public class MultiFactorAuthParam   {
  
  @Schema(required = true, description = "")
  private String authcode = null;
  
  @Schema(description = "")
  private String mfaKey = null;
  public enum MfaTypeEnum {
    NONE("NONE"),
    TFA_TOTP("TFA_TOTP");

    private String value;

    MfaTypeEnum(String value) {
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
    public static MfaTypeEnum fromValue(String text) {
      for (MfaTypeEnum b : MfaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private MfaTypeEnum mfaType = null;
 /**
   * Get authcode
   * @return authcode
  **/
  @JsonProperty("authcode")
  public String getAuthcode() {
    return authcode;
  }

  public void setAuthcode(String authcode) {
    this.authcode = authcode;
  }

  public MultiFactorAuthParam authcode(String authcode) {
    this.authcode = authcode;
    return this;
  }

 /**
   * Get mfaKey
   * @return mfaKey
  **/
  @JsonProperty("mfaKey")
  public String getMfaKey() {
    return mfaKey;
  }

  public void setMfaKey(String mfaKey) {
    this.mfaKey = mfaKey;
  }

  public MultiFactorAuthParam mfaKey(String mfaKey) {
    this.mfaKey = mfaKey;
    return this;
  }

 /**
   * Get mfaType
   * @return mfaType
  **/
  @JsonProperty("mfaType")
  public String getMfaType() {
    if (mfaType == null) {
      return null;
    }
    return mfaType.getValue();
  }

  public void setMfaType(MfaTypeEnum mfaType) {
    this.mfaType = mfaType;
  }

  public MultiFactorAuthParam mfaType(MfaTypeEnum mfaType) {
    this.mfaType = mfaType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiFactorAuthParam {\n");
    
    sb.append("    authcode: ").append(toIndentedString(authcode)).append("\n");
    sb.append("    mfaKey: ").append(toIndentedString(mfaKey)).append("\n");
    sb.append("    mfaType: ").append(toIndentedString(mfaType)).append("\n");
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
