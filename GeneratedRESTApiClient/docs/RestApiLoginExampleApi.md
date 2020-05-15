# RestApiLoginExampleApi

All URIs are relative to *http://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](RestApiLoginExampleApi.md#login) | **POST** /login/login | 



## login

> ProfileData login(loginData)



### Example

```java
// Import classes:
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.ApiClient;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.ApiException;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.Configuration;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.models.*;
import de.kaesdingeling.spring.openapi.generator.example.generated.api.RestApiLoginExampleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        RestApiLoginExampleApi apiInstance = new RestApiLoginExampleApi(defaultClient);
        LoginData loginData = new LoginData(); // LoginData | 
        try {
            ProfileData result = apiInstance.login(loginData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApiLoginExampleApi#login");
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
 **loginData** | [**LoginData**](LoginData.md)|  | [optional]

### Return type

[**ProfileData**](ProfileData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

