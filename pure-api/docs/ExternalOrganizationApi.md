# ExternalOrganizationApi

All URIs are relative to *http://localhost/ws/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExternalOrganisation**](ExternalOrganizationApi.md#getExternalOrganisation) | **GET** /external-organizations/{id} | Get external organization
[**getExternalOrganisationOrderings**](ExternalOrganizationApi.md#getExternalOrganisationOrderings) | **GET** /external-organizations/orderings | Lists available orderings
[**listExternalOrganizations**](ExternalOrganizationApi.md#listExternalOrganizations) | **GET** /external-organizations | Lists all external organizations
[**listExternalOrganizationsUsingQuery**](ExternalOrganizationApi.md#listExternalOrganizationsUsingQuery) | **POST** /external-organizations | Complex operation for external organizations


<a name="getExternalOrganisation"></a>
# **getExternalOrganisation**
> ExternalOrganization getExternalOrganisation(id)

Get external organization

Get external organization with specific ID (path parameter).

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    String id = "id_example"; // String | ID of the desired external organization
    try {
      ExternalOrganization result = apiInstance.getExternalOrganisation(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getExternalOrganisation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the desired external organization |

### Return type

[**ExternalOrganization**](ExternalOrganization.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**404** | Resource not found |  -  |

<a name="getExternalOrganisationOrderings"></a>
# **getExternalOrganisationOrderings**
> OrderingsList getExternalOrganisationOrderings()

Lists available orderings

Lists all orderings available to the external organization endpoint. These values can be used by the order parameter.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    try {
      OrderingsList result = apiInstance.getExternalOrganisationOrderings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getExternalOrganisationOrderings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrderingsList**](OrderingsList.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="listExternalOrganizations"></a>
# **listExternalOrganizations**
> ExternalOrganisationListResult listExternalOrganizations()

Lists all external organizations

Lists all external organizations in the Pure instance. If you need to filter the external organizations returned, see the POST version which supports additional filtering.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    try {
      ExternalOrganisationListResult result = apiInstance.listExternalOrganizations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#listExternalOrganizations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExternalOrganisationListResult**](ExternalOrganisationListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="listExternalOrganizationsUsingQuery"></a>
# **listExternalOrganizationsUsingQuery**
> ExternalOrganisationListResult listExternalOrganizationsUsingQuery(externalOrganizationsQuery)

Complex operation for external organizations

Lists external organizations in the Pure instance, similar to the GET version, instead of using parameters to alter the response, an XML document is posted with the request. The XML document contains fields for all the parameters available for the GET version, but also additional filtering options. For documentation of the XML format see &lt;a href&#x3D;\&quot;documentation/Content/Topics/WebService/CT_ExternalOrganisation.htm#post_xml\&quot;&gt;External Organization documentation&lt;/a&gt;.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    ExternalOrganizationsQuery externalOrganizationsQuery = new ExternalOrganizationsQuery(); // ExternalOrganizationsQuery | 
    try {
      ExternalOrganisationListResult result = apiInstance.listExternalOrganizationsUsingQuery(externalOrganizationsQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#listExternalOrganizationsUsingQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalOrganizationsQuery** | [**ExternalOrganizationsQuery**](ExternalOrganizationsQuery.md)|  | [optional]

### Return type

[**ExternalOrganisationListResult**](ExternalOrganisationListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
