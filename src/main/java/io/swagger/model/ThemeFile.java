package io.swagger.model;

import io.swagger.model.ThemeFile;
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

public class ThemeFile   {
  
  @Schema(description = "")
  private Boolean editable = null;
  
  @Schema(description = "")
  private Boolean isFile = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private List<ThemeFile> node = null;
  
  @Schema(description = "")
  private String path = null;
 /**
   * Get editable
   * @return editable
  **/
  @JsonProperty("editable")
  public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public ThemeFile editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

 /**
   * Get isFile
   * @return isFile
  **/
  @JsonProperty("isFile")
  public Boolean isIsFile() {
    return isFile;
  }

  public void setIsFile(Boolean isFile) {
    this.isFile = isFile;
  }

  public ThemeFile isFile(Boolean isFile) {
    this.isFile = isFile;
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

  public ThemeFile name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get node
   * @return node
  **/
  @JsonProperty("node")
  public List<ThemeFile> getNode() {
    return node;
  }

  public void setNode(List<ThemeFile> node) {
    this.node = node;
  }

  public ThemeFile node(List<ThemeFile> node) {
    this.node = node;
    return this;
  }

  public ThemeFile addNodeItem(ThemeFile nodeItem) {
    this.node.add(nodeItem);
    return this;
  }

 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ThemeFile path(String path) {
    this.path = path;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThemeFile {\n");
    
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    isFile: ").append(toIndentedString(isFile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
