/*
 * Pure API
 * Description text
 *
 * The version of the OpenAPI document: 0.1-Alpha
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
 * A reference to an organization external to the institution
 */
@ApiModel(description = "A reference to an organization external to the institution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-08T14:48:58.242158+01:00[Europe/Copenhagen]")
public class ExternalOrganizationRef {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private NavigationLink link;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Map<String, String> name = null;


   /**
   * UUID of the referred content
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID of the referred content")

  public String getUuid() {
    return uuid;
  }




  public ExternalOrganizationRef link(NavigationLink link) {
    
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


  public ExternalOrganizationRef name(Map<String, String> name) {
    
    this.name = name;
    return this;
  }

  public ExternalOrganizationRef putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<String, String>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * Container for a set of string values each localized for a specific locale
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_UK\":\"Some text\"}", value = "Container for a set of string values each localized for a specific locale")

  public Map<String, String> getName() {
    return name;
  }


  public void setName(Map<String, String> name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalOrganizationRef externalOrganizationRef = (ExternalOrganizationRef) o;
    return Objects.equals(this.uuid, externalOrganizationRef.uuid) &&
        Objects.equals(this.link, externalOrganizationRef.link) &&
        Objects.equals(this.name, externalOrganizationRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, link, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganizationRef {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

