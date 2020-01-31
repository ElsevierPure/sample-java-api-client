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
 * List of free keywords
 */
@ApiModel(description = "List of free keywords")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-31T14:49:57.094851+01:00[Europe/Copenhagen]")
public class Keyword {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_FREE_KEYWORDS = "freeKeywords";
  @SerializedName(SERIALIZED_NAME_FREE_KEYWORDS)
  private List<String> freeKeywords = null;


   /**
   * Pure database ID of the object
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object")

  public Long getPureId() {
    return pureId;
  }




  public Keyword locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Locale that user defined keywords are in
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Locale that user defined keywords are in")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public Keyword freeKeywords(List<String> freeKeywords) {
    
    this.freeKeywords = freeKeywords;
    return this;
  }

  public Keyword addFreeKeywordsItem(String freeKeywordsItem) {
    if (this.freeKeywords == null) {
      this.freeKeywords = new ArrayList<String>();
    }
    this.freeKeywords.add(freeKeywordsItem);
    return this;
  }

   /**
   * User defined keywords in a specific locale
   * @return freeKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User defined keywords in a specific locale")

  public List<String> getFreeKeywords() {
    return freeKeywords;
  }


  public void setFreeKeywords(List<String> freeKeywords) {
    this.freeKeywords = freeKeywords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Keyword keyword = (Keyword) o;
    return Objects.equals(this.pureId, keyword.pureId) &&
        Objects.equals(this.locale, keyword.locale) &&
        Objects.equals(this.freeKeywords, keyword.freeKeywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, locale, freeKeywords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Keyword {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    freeKeywords: ").append(toIndentedString(freeKeywords)).append("\n");
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

