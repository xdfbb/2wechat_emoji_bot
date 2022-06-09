package io.swagger.model;

import io.swagger.model.MenuVO;
import java.util.ArrayList;
import java.util.List;

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

public class MenuVO   {
  
  @Schema(description = "")
  private List<MenuVO> children = null;
  
  @Schema(description = "")
  private String icon = null;
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private Integer parentId = null;
  
  @Schema(description = "")
  private Integer priority = null;
  
  @Schema(description = "")
  private String target = null;
  
  @Schema(description = "")
  private String team = null;
  
  @Schema(description = "")
  private String url = null;
 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<MenuVO> getChildren() {
    return children;
  }

  public void setChildren(List<MenuVO> children) {
    this.children = children;
  }

  public MenuVO children(List<MenuVO> children) {
    this.children = children;
    return this;
  }

  public MenuVO addChildrenItem(MenuVO childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public MenuVO icon(String icon) {
    this.icon = icon;
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

  public MenuVO id(Integer id) {
    this.id = id;
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

  public MenuVO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get parentId
   * @return parentId
  **/
  @JsonProperty("parentId")
  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public MenuVO parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Get priority
   * @return priority
  **/
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public MenuVO priority(Integer priority) {
    this.priority = priority;
    return this;
  }

 /**
   * Get target
   * @return target
  **/
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public MenuVO target(String target) {
    this.target = target;
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

  public MenuVO team(String team) {
    this.team = team;
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

  public MenuVO url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuVO {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
