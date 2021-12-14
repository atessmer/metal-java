# HardwareReservationsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findHardwareReservationById**](HardwareReservationsApi.md#findHardwareReservationById) | **GET** /hardware-reservations/{id} | Retrieve a hardware reservation
[**findProjectHardwareReservations**](HardwareReservationsApi.md#findProjectHardwareReservations) | **GET** /projects/{id}/hardware-reservations | Retrieve all hardware reservations for a given project
[**moveHardwareReservation**](HardwareReservationsApi.md#moveHardwareReservation) | **POST** /hardware-reservations/{id}/move | Move a hardware reservation


<a name="findHardwareReservationById"></a>
# **findHardwareReservationById**
> Device findHardwareReservationById(id, include, exclude)

Retrieve a hardware reservation

Returns a single hardware reservation

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.HardwareReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

HardwareReservationsApi apiInstance = new HardwareReservationsApi();
UUID id = new UUID(); // UUID | HardwareReservation UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    Device result = apiInstance.findHardwareReservationById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareReservationsApi#findHardwareReservationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| HardwareReservation UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**Device**](Device.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProjectHardwareReservations"></a>
# **findProjectHardwareReservations**
> HardwareReservationList findProjectHardwareReservations(id, include, exclude, page, perPage)

Retrieve all hardware reservations for a given project

Provides a collection of hardware reservations for a given project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.HardwareReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

HardwareReservationsApi apiInstance = new HardwareReservationsApi();
UUID id = new UUID(); // UUID | Project UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    HardwareReservationList result = apiInstance.findProjectHardwareReservations(id, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareReservationsApi#findProjectHardwareReservations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**HardwareReservationList**](HardwareReservationList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveHardwareReservation"></a>
# **moveHardwareReservation**
> HardwareReservation moveHardwareReservation(id, projectId)

Move a hardware reservation

Move a hardware reservation to another project

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.HardwareReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

HardwareReservationsApi apiInstance = new HardwareReservationsApi();
UUID id = new UUID(); // UUID | Hardware Reservation UUID
UUID projectId = new UUID(); // UUID | Project UUID
try {
    HardwareReservation result = apiInstance.moveHardwareReservation(id, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareReservationsApi#moveHardwareReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Hardware Reservation UUID |
 **projectId** | [**UUID**](UUID.md)| Project UUID |

### Return type

[**HardwareReservation**](HardwareReservation.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
