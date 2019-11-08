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


package com.elsevier.pure.api.sample.stubs.api;

import com.elsevier.pure.api.sample.stubs.invoker.ApiCallback;
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.ApiResponse;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.Pair;
import com.elsevier.pure.api.sample.stubs.invoker.ProgressRequestBody;
import com.elsevier.pure.api.sample.stubs.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.elsevier.pure.api.sample.stubs.model.ExternalOrganization;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationListResult;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationsQuery;
import com.elsevier.pure.api.sample.stubs.model.OrderingsList;
import com.elsevier.pure.api.sample.stubs.model.ProblemDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExternalOrganizationApi {
    private ApiClient localVarApiClient;

    public ExternalOrganizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExternalOrganizationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for externalOrganizationGet
     * @param id ID of the desired external organization (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationGetCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/external-organizations/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call externalOrganizationGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling externalOrganizationGet(Async)");
        }
        

        okhttp3.Call localVarCall = externalOrganizationGetCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get external organization
     * Get external organization with specific ID (path parameter).
     * @param id ID of the desired external organization (required)
     * @return ExternalOrganization
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ExternalOrganization externalOrganizationGet(String id) throws ApiException {
        ApiResponse<ExternalOrganization> localVarResp = externalOrganizationGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get external organization
     * Get external organization with specific ID (path parameter).
     * @param id ID of the desired external organization (required)
     * @return ApiResponse&lt;ExternalOrganization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExternalOrganization> externalOrganizationGetWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = externalOrganizationGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ExternalOrganization>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get external organization (asynchronously)
     * Get external organization with specific ID (path parameter).
     * @param id ID of the desired external organization (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationGetAsync(String id, final ApiCallback<ExternalOrganization> _callback) throws ApiException {

        okhttp3.Call localVarCall = externalOrganizationGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ExternalOrganization>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for externalOrganizationGetOrderings
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationGetOrderingsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/external-organizations/orderings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call externalOrganizationGetOrderingsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = externalOrganizationGetOrderingsCall(_callback);
        return localVarCall;

    }

    /**
     * Lists available orderings
     * Lists all orderings available to the external organization endpoint. These values can be used by the order parameter.
     * @return OrderingsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public OrderingsList externalOrganizationGetOrderings() throws ApiException {
        ApiResponse<OrderingsList> localVarResp = externalOrganizationGetOrderingsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Lists available orderings
     * Lists all orderings available to the external organization endpoint. These values can be used by the order parameter.
     * @return ApiResponse&lt;OrderingsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderingsList> externalOrganizationGetOrderingsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = externalOrganizationGetOrderingsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<OrderingsList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists available orderings (asynchronously)
     * Lists all orderings available to the external organization endpoint. These values can be used by the order parameter.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationGetOrderingsAsync(final ApiCallback<OrderingsList> _callback) throws ApiException {

        okhttp3.Call localVarCall = externalOrganizationGetOrderingsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<OrderingsList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for externalOrganizationList
     * @param size Number of returned external organizations per request. (optional, default to 10)
     * @param offset The offset for the returned list. 0 or null value is from the start (optional, default to 0)
     * @param order The order of the list, must be a value from getExternalOrganizationOrderings (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationListCall(Integer size, Integer offset, String order, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/external-organizations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call externalOrganizationListValidateBeforeCall(Integer size, Integer offset, String order, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = externalOrganizationListCall(size, offset, order, _callback);
        return localVarCall;

    }

    /**
     * Lists all external organizations
     * Lists all external organizations in the Pure instance. If you need to filter the external organizations returned, see the POST version which supports additional filtering.
     * @param size Number of returned external organizations per request. (optional, default to 10)
     * @param offset The offset for the returned list. 0 or null value is from the start (optional, default to 0)
     * @param order The order of the list, must be a value from getExternalOrganizationOrderings (optional)
     * @return ExternalOrganizationListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ExternalOrganizationListResult externalOrganizationList(Integer size, Integer offset, String order) throws ApiException {
        ApiResponse<ExternalOrganizationListResult> localVarResp = externalOrganizationListWithHttpInfo(size, offset, order);
        return localVarResp.getData();
    }

    /**
     * Lists all external organizations
     * Lists all external organizations in the Pure instance. If you need to filter the external organizations returned, see the POST version which supports additional filtering.
     * @param size Number of returned external organizations per request. (optional, default to 10)
     * @param offset The offset for the returned list. 0 or null value is from the start (optional, default to 0)
     * @param order The order of the list, must be a value from getExternalOrganizationOrderings (optional)
     * @return ApiResponse&lt;ExternalOrganizationListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExternalOrganizationListResult> externalOrganizationListWithHttpInfo(Integer size, Integer offset, String order) throws ApiException {
        okhttp3.Call localVarCall = externalOrganizationListValidateBeforeCall(size, offset, order, null);
        Type localVarReturnType = new TypeToken<ExternalOrganizationListResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists all external organizations (asynchronously)
     * Lists all external organizations in the Pure instance. If you need to filter the external organizations returned, see the POST version which supports additional filtering.
     * @param size Number of returned external organizations per request. (optional, default to 10)
     * @param offset The offset for the returned list. 0 or null value is from the start (optional, default to 0)
     * @param order The order of the list, must be a value from getExternalOrganizationOrderings (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationListAsync(Integer size, Integer offset, String order, final ApiCallback<ExternalOrganizationListResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = externalOrganizationListValidateBeforeCall(size, offset, order, _callback);
        Type localVarReturnType = new TypeToken<ExternalOrganizationListResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for externalOrganizationQuery
     * @param externalOrganizationsQuery  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationQueryCall(ExternalOrganizationsQuery externalOrganizationsQuery, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = externalOrganizationsQuery;

        // create path and map variables
        String localVarPath = "/external-organizations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call externalOrganizationQueryValidateBeforeCall(ExternalOrganizationsQuery externalOrganizationsQuery, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = externalOrganizationQueryCall(externalOrganizationsQuery, _callback);
        return localVarCall;

    }

    /**
     * Complex operation for external organizations
     * Lists external organizations in the Pure instance, similar to the GET version, instead of using parameters to alter the response, an XML document is posted with the request. The XML document contains fields for all the parameters available for the GET version, but also additional filtering options. For documentation of the XML format see &lt;a href&#x3D;\&quot;documentation/Content/Topics/WebService/CT_ExternalOrganisation.htm#post_xml\&quot;&gt;External Organization documentation&lt;/a&gt;.
     * @param externalOrganizationsQuery  (optional)
     * @return ExternalOrganizationListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ExternalOrganizationListResult externalOrganizationQuery(ExternalOrganizationsQuery externalOrganizationsQuery) throws ApiException {
        ApiResponse<ExternalOrganizationListResult> localVarResp = externalOrganizationQueryWithHttpInfo(externalOrganizationsQuery);
        return localVarResp.getData();
    }

    /**
     * Complex operation for external organizations
     * Lists external organizations in the Pure instance, similar to the GET version, instead of using parameters to alter the response, an XML document is posted with the request. The XML document contains fields for all the parameters available for the GET version, but also additional filtering options. For documentation of the XML format see &lt;a href&#x3D;\&quot;documentation/Content/Topics/WebService/CT_ExternalOrganisation.htm#post_xml\&quot;&gt;External Organization documentation&lt;/a&gt;.
     * @param externalOrganizationsQuery  (optional)
     * @return ApiResponse&lt;ExternalOrganizationListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExternalOrganizationListResult> externalOrganizationQueryWithHttpInfo(ExternalOrganizationsQuery externalOrganizationsQuery) throws ApiException {
        okhttp3.Call localVarCall = externalOrganizationQueryValidateBeforeCall(externalOrganizationsQuery, null);
        Type localVarReturnType = new TypeToken<ExternalOrganizationListResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Complex operation for external organizations (asynchronously)
     * Lists external organizations in the Pure instance, similar to the GET version, instead of using parameters to alter the response, an XML document is posted with the request. The XML document contains fields for all the parameters available for the GET version, but also additional filtering options. For documentation of the XML format see &lt;a href&#x3D;\&quot;documentation/Content/Topics/WebService/CT_ExternalOrganisation.htm#post_xml\&quot;&gt;External Organization documentation&lt;/a&gt;.
     * @param externalOrganizationsQuery  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationQueryAsync(ExternalOrganizationsQuery externalOrganizationsQuery, final ApiCallback<ExternalOrganizationListResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = externalOrganizationQueryValidateBeforeCall(externalOrganizationsQuery, _callback);
        Type localVarReturnType = new TypeToken<ExternalOrganizationListResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for externalOrganizationUpdate
     * @param id ID of the desired external organization (required)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationUpdateCall(String id, Object body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/external-organizations/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call externalOrganizationUpdateValidateBeforeCall(String id, Object body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling externalOrganizationUpdate(Async)");
        }
        

        okhttp3.Call localVarCall = externalOrganizationUpdateCall(id, body, _callback);
        return localVarCall;

    }

    /**
     * Put external organization
     * Put external organization with specific ID (path parameter).
     * @param id ID of the desired external organization (required)
     * @param body  (optional)
     * @return ExternalOrganization
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ExternalOrganization externalOrganizationUpdate(String id, Object body) throws ApiException {
        ApiResponse<ExternalOrganization> localVarResp = externalOrganizationUpdateWithHttpInfo(id, body);
        return localVarResp.getData();
    }

    /**
     * Put external organization
     * Put external organization with specific ID (path parameter).
     * @param id ID of the desired external organization (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ExternalOrganization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExternalOrganization> externalOrganizationUpdateWithHttpInfo(String id, Object body) throws ApiException {
        okhttp3.Call localVarCall = externalOrganizationUpdateValidateBeforeCall(id, body, null);
        Type localVarReturnType = new TypeToken<ExternalOrganization>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Put external organization (asynchronously)
     * Put external organization with specific ID (path parameter).
     * @param id ID of the desired external organization (required)
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call externalOrganizationUpdateAsync(String id, Object body, final ApiCallback<ExternalOrganization> _callback) throws ApiException {

        okhttp3.Call localVarCall = externalOrganizationUpdateValidateBeforeCall(id, body, _callback);
        Type localVarReturnType = new TypeToken<ExternalOrganization>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
