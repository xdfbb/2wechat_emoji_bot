package io.swagger.model;

import io.swagger.model.Option;
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

public class Item   {
  public enum DataTypeEnum {
    BOOL("BOOL"),
    DOUBLE("DOUBLE"),
    LONG("LONG"),
    STRING("STRING");

    private String value;

    DataTypeEnum(String value) {
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
    public static DataTypeEnum fromValue(String text) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private DataTypeEnum dataType = null;
  
  @Schema(description = "")
  private Object defaultValue = null;
  
  @Schema(description = "")
  private String description = null;
  
  @Schema(description = "")
  private String label = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private List<Option> options = null;
  
  @Schema(description = "")
  private String placeholder = null;
  public enum TypeEnum {
    ATTACHMENT("ATTACHMENT"),
    COLOR("COLOR"),
    NUMBER("NUMBER"),
    RADIO("RADIO"),
    SELECT("SELECT"),
    SWITCH("SWITCH"),
    TEXT("TEXT"),
    TEXTAREA("TEXTAREA");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private TypeEnum type = null;
 /**
   * Get dataType
   * @return dataType
  **/
  @JsonProperty("dataType")
  public String getDataType() {
    if (dataType == null) {
      return null;
    }
    return dataType.getValue();
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public Item dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

 /**
   * Get defaultValue
   * @return defaultValue
  **/
  @JsonProperty("defaultValue")
  public Object getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
  }

  public Item defaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
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

  public Item description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get label
   * @return label
  **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Item label(String label) {
    this.label = label;
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

  public Item name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get options
   * @return options
  **/
  @JsonProperty("options")
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }

  public Item options(List<Option> options) {
    this.options = options;
    return this;
  }

  public Item addOptionsItem(Option optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

 /**
   * Get placeholder
   * @return placeholder
  **/
  @JsonProperty("placeholder")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public Item placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.getValue();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Item type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
