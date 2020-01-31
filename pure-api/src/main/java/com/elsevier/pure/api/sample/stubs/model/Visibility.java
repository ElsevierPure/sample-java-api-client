/*
 * Pure API
 * This is an early access version of the new Pure write API.
 *
 * The version of the OpenAPI document: 0.1 Early Access
 * Contact: b.plauborg@elsevier.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.elsevier.pure.api.sample.stubs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Visibility of an object
 */
@ApiModel(description = "Visibility of an object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-31T14:49:57.094851+01:00[Europe/Copenhagen]")
public class Visibility {
  /**
   * Visibility value
   */
  @JsonAdapter(KeyEnum.Adapter.class)
  public enum KeyEnum {
    FREE("FREE"),
    
    CAMPUS("CAMPUS"),
    
    BACKEND("BACKEND");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyEnum fromValue(String value) {
      for (KeyEnum b : KeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KeyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private KeyEnum key;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Map<String, String> description = null;


  public Visibility key(KeyEnum key) {
    
    this.key = key;
    return this;
  }

   /**
   * Visibility value
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Visibility value")

  public KeyEnum getKey() {
    return key;
  }


  public void setKey(KeyEnum key) {
    this.key = key;
  }


   /**
   * A set of localized string values each for a specific UI locale.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_UK\":\"Some text\"}", value = "A set of localized string values each for a specific UI locale.")

  public Map<String, String> getDescription() {
    return description;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Visibility visibility = (Visibility) o;
    return Objects.equals(this.key, visibility.key) &&
        Objects.equals(this.description, visibility.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Visibility {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

