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
import com.elsevier.pure.api.sample.stubs.model.ClassificationRef;
import com.elsevier.pure.api.sample.stubs.model.Keyword;
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
 * Container for a structured keyword and/or free keywords
 */
@ApiModel(description = "Container for a structured keyword and/or free keywords")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-31T14:49:57.094851+01:00[Europe/Copenhagen]")
public class KeywordContainer {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_STRUCTURED_KEYWORD = "structuredKeyword";
  @SerializedName(SERIALIZED_NAME_STRUCTURED_KEYWORD)
  private ClassificationRef structuredKeyword;

  public static final String SERIALIZED_NAME_FREE_KEYWORDS = "freeKeywords";
  @SerializedName(SERIALIZED_NAME_FREE_KEYWORDS)
  private List<Keyword> freeKeywords = null;


   /**
   * Pure database ID of the object
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object")

  public Long getPureId() {
    return pureId;
  }




  public KeywordContainer structuredKeyword(ClassificationRef structuredKeyword) {
    
    this.structuredKeyword = structuredKeyword;
    return this;
  }

   /**
   * Get structuredKeyword
   * @return structuredKeyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getStructuredKeyword() {
    return structuredKeyword;
  }


  public void setStructuredKeyword(ClassificationRef structuredKeyword) {
    this.structuredKeyword = structuredKeyword;
  }


  public KeywordContainer freeKeywords(List<Keyword> freeKeywords) {
    
    this.freeKeywords = freeKeywords;
    return this;
  }

  public KeywordContainer addFreeKeywordsItem(Keyword freeKeywordsItem) {
    if (this.freeKeywords == null) {
      this.freeKeywords = new ArrayList<Keyword>();
    }
    this.freeKeywords.add(freeKeywordsItem);
    return this;
  }

   /**
   * Free keywords
   * @return freeKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Free keywords")

  public List<Keyword> getFreeKeywords() {
    return freeKeywords;
  }


  public void setFreeKeywords(List<Keyword> freeKeywords) {
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
    KeywordContainer keywordContainer = (KeywordContainer) o;
    return Objects.equals(this.pureId, keywordContainer.pureId) &&
        Objects.equals(this.structuredKeyword, keywordContainer.structuredKeyword) &&
        Objects.equals(this.freeKeywords, keywordContainer.freeKeywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, structuredKeyword, freeKeywords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordContainer {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    structuredKeyword: ").append(toIndentedString(structuredKeyword)).append("\n");
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

