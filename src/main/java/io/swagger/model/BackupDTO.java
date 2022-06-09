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

public class BackupDTO   {
  
  @Schema(description = "")
  private String downloadLink = null;
  
  @Schema(description = "")
  private Long fileSize = null;
  
  @Schema(description = "")
  private String filename = null;
  
  @Schema(description = "")
  private Long updateTime = null;
 /**
   * Get downloadLink
   * @return downloadLink
  **/
  @JsonProperty("downloadLink")
  public String getDownloadLink() {
    return downloadLink;
  }

  public void setDownloadLink(String downloadLink) {
    this.downloadLink = downloadLink;
  }

  public BackupDTO downloadLink(String downloadLink) {
    this.downloadLink = downloadLink;
    return this;
  }

 /**
   * Get fileSize
   * @return fileSize
  **/
  @JsonProperty("fileSize")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public BackupDTO fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

 /**
   * Get filename
   * @return filename
  **/
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public BackupDTO filename(String filename) {
    this.filename = filename;
    return this;
  }

 /**
   * Get updateTime
   * @return updateTime
  **/
  @JsonProperty("updateTime")
  public Long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }

  public BackupDTO updateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupDTO {\n");
    
    sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
