package io.swagger.model;

import io.swagger.model.Author;
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

public class ThemeProperty   {
  
  @Schema(description = "")
  private Boolean activated = null;
  
  @Schema(description = "")
  private Author author = null;
  
  @Schema(description = "")
  private String branch = null;
  
  @Schema(description = "")
  private String description = null;
  
  @Schema(description = "")
  private String folderName = null;
  
  @Schema(description = "")
  private Boolean hasOptions = null;
  
  @Schema(description = "")
  private String id = null;
  
  @Schema(description = "")
  private String logo = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private List<String> postMetaField = null;
  
  @Schema(description = "")
  private String repo = null;
  
  @Schema(description = "")
  private String require = null;
  
  @Schema(description = "")
  private String screenshots = null;
  
  @Schema(description = "")
  private List<String> sheetMetaField = null;
  
  @Schema(description = "")
  private String themePath = null;
  public enum UpdateStrategyEnum {
    BRANCH("BRANCH"),
    RELEASE("RELEASE");

    private String value;

    UpdateStrategyEnum(String value) {
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
    public static UpdateStrategyEnum fromValue(String text) {
      for (UpdateStrategyEnum b : UpdateStrategyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private UpdateStrategyEnum updateStrategy = null;
  
  @Schema(description = "")
  private String version = null;
  
  @Schema(description = "")
  private String website = null;
 /**
   * Get activated
   * @return activated
  **/
  @JsonProperty("activated")
  public Boolean isActivated() {
    return activated;
  }

  public void setActivated(Boolean activated) {
    this.activated = activated;
  }

  public ThemeProperty activated(Boolean activated) {
    this.activated = activated;
    return this;
  }

 /**
   * Get author
   * @return author
  **/
  @JsonProperty("author")
  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public ThemeProperty author(Author author) {
    this.author = author;
    return this;
  }

 /**
   * Get branch
   * @return branch
  **/
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public ThemeProperty branch(String branch) {
    this.branch = branch;
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

  public ThemeProperty description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get folderName
   * @return folderName
  **/
  @JsonProperty("folderName")
  public String getFolderName() {
    return folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  public ThemeProperty folderName(String folderName) {
    this.folderName = folderName;
    return this;
  }

 /**
   * Get hasOptions
   * @return hasOptions
  **/
  @JsonProperty("hasOptions")
  public Boolean isHasOptions() {
    return hasOptions;
  }

  public void setHasOptions(Boolean hasOptions) {
    this.hasOptions = hasOptions;
  }

  public ThemeProperty hasOptions(Boolean hasOptions) {
    this.hasOptions = hasOptions;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ThemeProperty id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get logo
   * @return logo
  **/
  @JsonProperty("logo")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public ThemeProperty logo(String logo) {
    this.logo = logo;
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

  public ThemeProperty name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get postMetaField
   * @return postMetaField
  **/
  @JsonProperty("postMetaField")
  public List<String> getPostMetaField() {
    return postMetaField;
  }

  public void setPostMetaField(List<String> postMetaField) {
    this.postMetaField = postMetaField;
  }

  public ThemeProperty postMetaField(List<String> postMetaField) {
    this.postMetaField = postMetaField;
    return this;
  }

  public ThemeProperty addPostMetaFieldItem(String postMetaFieldItem) {
    this.postMetaField.add(postMetaFieldItem);
    return this;
  }

 /**
   * Get repo
   * @return repo
  **/
  @JsonProperty("repo")
  public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public ThemeProperty repo(String repo) {
    this.repo = repo;
    return this;
  }

 /**
   * Get require
   * @return require
  **/
  @JsonProperty("require")
  public String getRequire() {
    return require;
  }

  public void setRequire(String require) {
    this.require = require;
  }

  public ThemeProperty require(String require) {
    this.require = require;
    return this;
  }

 /**
   * Get screenshots
   * @return screenshots
  **/
  @JsonProperty("screenshots")
  public String getScreenshots() {
    return screenshots;
  }

  public void setScreenshots(String screenshots) {
    this.screenshots = screenshots;
  }

  public ThemeProperty screenshots(String screenshots) {
    this.screenshots = screenshots;
    return this;
  }

 /**
   * Get sheetMetaField
   * @return sheetMetaField
  **/
  @JsonProperty("sheetMetaField")
  public List<String> getSheetMetaField() {
    return sheetMetaField;
  }

  public void setSheetMetaField(List<String> sheetMetaField) {
    this.sheetMetaField = sheetMetaField;
  }

  public ThemeProperty sheetMetaField(List<String> sheetMetaField) {
    this.sheetMetaField = sheetMetaField;
    return this;
  }

  public ThemeProperty addSheetMetaFieldItem(String sheetMetaFieldItem) {
    this.sheetMetaField.add(sheetMetaFieldItem);
    return this;
  }

 /**
   * Get themePath
   * @return themePath
  **/
  @JsonProperty("themePath")
  public String getThemePath() {
    return themePath;
  }

  public void setThemePath(String themePath) {
    this.themePath = themePath;
  }

  public ThemeProperty themePath(String themePath) {
    this.themePath = themePath;
    return this;
  }

 /**
   * Get updateStrategy
   * @return updateStrategy
  **/
  @JsonProperty("updateStrategy")
  public String getUpdateStrategy() {
    if (updateStrategy == null) {
      return null;
    }
    return updateStrategy.getValue();
  }

  public void setUpdateStrategy(UpdateStrategyEnum updateStrategy) {
    this.updateStrategy = updateStrategy;
  }

  public ThemeProperty updateStrategy(UpdateStrategyEnum updateStrategy) {
    this.updateStrategy = updateStrategy;
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

  public ThemeProperty version(String version) {
    this.version = version;
    return this;
  }

 /**
   * Get website
   * @return website
  **/
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public ThemeProperty website(String website) {
    this.website = website;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThemeProperty {\n");
    
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    sb.append("    hasOptions: ").append(toIndentedString(hasOptions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postMetaField: ").append(toIndentedString(postMetaField)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    require: ").append(toIndentedString(require)).append("\n");
    sb.append("    screenshots: ").append(toIndentedString(screenshots)).append("\n");
    sb.append("    sheetMetaField: ").append(toIndentedString(sheetMetaField)).append("\n");
    sb.append("    themePath: ").append(toIndentedString(themePath)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
