package io.swagger.model;

import java.util.Date;

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

public class UserDTO   {
  
  @Schema(description = "")
  private String avatar = null;
  
  @Schema(description = "")
  private Date createTime = null;
  
  @Schema(description = "")
  private String description = null;
  
  @Schema(description = "")
  private String email = null;
  
  @Schema(description = "")
  private Integer id = null;
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
  
  @Schema(description = "")
  private String nickname = null;
  
  @Schema(description = "")
  private Date updateTime = null;
  
  @Schema(description = "")
  private String username = null;
 /**
   * Get avatar
   * @return avatar
  **/
  @JsonProperty("avatar")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public UserDTO avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

 /**
   * Get createTime
   * @return createTime
  **/
  @JsonProperty("createTime")
  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public UserDTO createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserDTO description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get email
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDTO email(String email) {
    this.email = email;
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

  public UserDTO id(Integer id) {
    this.id = id;
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

  public UserDTO mfaType(MfaTypeEnum mfaType) {
    this.mfaType = mfaType;
    return this;
  }

 /**
   * Get nickname
   * @return nickname
  **/
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public UserDTO nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

 /**
   * Get updateTime
   * @return updateTime
  **/
  @JsonProperty("updateTime")
  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public UserDTO updateTime(Date updateTime) {
    this.updateTime = updateTime;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserDTO username(String username) {
    this.username = username;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mfaType: ").append(toIndentedString(mfaType)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
