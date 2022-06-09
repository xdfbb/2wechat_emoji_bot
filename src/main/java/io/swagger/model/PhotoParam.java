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

public class PhotoParam   {
  
  @Schema(description = "")
  private String description = null;
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private String location = null;
  
  @Schema(required = true, description = "")
  private String name = null;
  
  @Schema(description = "")
  private Date takeTime = null;
  
  @Schema(description = "")
  private String team = null;
  
  @Schema(required = true, description = "")
  private String thumbnail = null;
  
  @Schema(required = true, description = "")
  private String url = null;
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

  public PhotoParam description(String description) {
    this.description = description;
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

  public PhotoParam id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PhotoParam location(String location) {
    this.location = location;
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

  public PhotoParam name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get takeTime
   * @return takeTime
  **/
  @JsonProperty("takeTime")
  public Date getTakeTime() {
    return takeTime;
  }

  public void setTakeTime(Date takeTime) {
    this.takeTime = takeTime;
  }

  public PhotoParam takeTime(Date takeTime) {
    this.takeTime = takeTime;
    return this;
  }

 /**
   * Get team
   * @return team
  **/
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public PhotoParam team(String team) {
    this.team = team;
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

  public PhotoParam thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PhotoParam url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotoParam {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    takeTime: ").append(toIndentedString(takeTime)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
