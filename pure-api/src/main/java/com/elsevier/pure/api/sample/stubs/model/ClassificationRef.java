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
import com.elsevier.pure.api.sample.stubs.model.NavigationLink;
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
 * A reference to a classification value
 */
@ApiModel(description = "A reference to a classification value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-31T14:49:57.094851+01:00[Europe/Copenhagen]")
public class ClassificationRef {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private NavigationLink link;

  public static final String SERIALIZED_NAME_TERM = "term";
  @SerializedName(SERIALIZED_NAME_TERM)
  private Map<String, String> term = null;


  public ClassificationRef uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Classification URI of the referred classification
   * @return uri
  **/
  @ApiModelProperty(required = true, value = "Classification URI of the referred classification")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public ClassificationRef link(NavigationLink link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NavigationLink getLink() {
    return link;
  }


  public void setLink(NavigationLink link) {
    this.link = link;
  }


   /**
   * A set of localized string values each for a specific UI locale.
   * @return term
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_UK\":\"Some text\"}", value = "A set of localized string values each for a specific UI locale.")

  public Map<String, String> getTerm() {
    return term;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationRef classificationRef = (ClassificationRef) o;
    return Objects.equals(this.uri, classificationRef.uri) &&
        Objects.equals(this.link, classificationRef.link) &&
        Objects.equals(this.term, classificationRef.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, link, term);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationRef {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

