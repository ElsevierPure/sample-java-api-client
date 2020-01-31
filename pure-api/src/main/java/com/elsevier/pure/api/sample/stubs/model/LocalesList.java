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
import java.util.ArrayList;
import java.util.List;

/**
 * List of available locales
 */
@ApiModel(description = "List of available locales")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-31T14:49:57.094851+01:00[Europe/Copenhagen]")
public class LocalesList {
  public static final String SERIALIZED_NAME_LOCALES = "locales";
  @SerializedName(SERIALIZED_NAME_LOCALES)
  private List<String> locales = null;


  public LocalesList locales(List<String> locales) {
    
    this.locales = locales;
    return this;
  }

  public LocalesList addLocalesItem(String localesItem) {
    if (this.locales == null) {
      this.locales = new ArrayList<String>();
    }
    this.locales.add(localesItem);
    return this;
  }

   /**
   * Allowed locale values for use in localized string entities. The locale format consists of lower-case ISO 639 alpha-2 language code and upper-cased ISO 3166 alpha-2 country code.
   * @return locales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allowed locale values for use in localized string entities. The locale format consists of lower-case ISO 639 alpha-2 language code and upper-cased ISO 3166 alpha-2 country code.")

  public List<String> getLocales() {
    return locales;
  }


  public void setLocales(List<String> locales) {
    this.locales = locales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalesList localesList = (LocalesList) o;
    return Objects.equals(this.locales, localesList.locales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalesList {\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
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

