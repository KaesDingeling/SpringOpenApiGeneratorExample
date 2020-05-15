# RestApiExampleApi

All URIs are relative to *http://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTest**](RestApiExampleApi.md#getTest) | **GET** /example/get-test | 
[**ping**](RestApiExampleApi.md#ping) | **GET** /example | 
[**postTest**](RestApiExampleApi.md#postTest) | **POST** /example/post-test | 



## getTest

> String getTest()



### Example

```java
// Import classes:
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.ApiClient;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.ApiException;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.Configuration;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.models.*;
import de.kaesdingeling.spring.openapi.generator.example.generated.api.RestApiExampleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        RestApiExampleApi apiInstance = new RestApiExampleApi(defaultClient);
        try {
            String result = apiInstance.getTest();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApiExampleApi#getTest");
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

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |


## ping

> String ping()



### Example

```java
// Import classes:
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.ApiClient;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.ApiException;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.Configuration;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.models.*;
import de.kaesdingeling.spring.openapi.generator.example.generated.api.RestApiExampleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        RestApiExampleApi apiInstance = new RestApiExampleApi(defaultClient);
        try {
            String result = apiInstance.ping();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApiExampleApi#ping");
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

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postTest

> String postTest(body)



### Example

```java
// Import classes:
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.ApiClient;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.ApiException;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.Configuration;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.models.*;
import de.kaesdingeling.spring.openapi.generator.example.generated.api.RestApiExampleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        RestApiExampleApi apiInstance = new RestApiExampleApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            String result = apiInstance.postTest(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApiExampleApi#postTest");
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
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

