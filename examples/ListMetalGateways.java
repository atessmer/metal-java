import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;
import com.equinix.openapi.metal.v1.model.MetalGatewayList;
import com.equinix.openapi.metal.v1.model.MetalGatewayListMetalGatewaysInner;
import com.equinix.openapi.metal.v1.model.MetalGateway;
import com.equinix.openapi.metal.v1.model.VrfMetalGateway;

import java.util.UUID;

public class ListMetalGateways {
   public static void main(String[] args) {
      ApiClient defaultClient = Configuration.getDefaultApiClient();

      // Spec is maintaing base path hence dont have to set it explicitly
      // defaultClient.setBasePath("<Metal API base path>");

      // Configure API key authorization: x_auth_token
      ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
      x_auth_token.setApiKey(args[0]);

      MetalGatewaysApi metalGatewaysApiInst = new MetalGatewaysApi(defaultClient);
      try {
         UUID projUUID = UUID.fromString(args[1]);

         MetalGatewayList metalGatewaysList = metalGatewaysApiInst.findMetalGatewaysByProject(
            projUUID, null, null, null, null);

         if (metalGatewaysList == null || metalGatewaysList.getMetalGateways() == null) {
            System.out.println("No metal gateways found");
            return;
         }

         for (MetalGatewayListMetalGatewaysInner mgInner : metalGatewaysList.getMetalGateways()) {
            if (mgInner.getActualInstance() instanceof VrfMetalGateway) {
               VrfMetalGateway mg = mgInner.getVrfMetalGateway();
               System.out.println(String.format("VrfMetalGateway: %s", mg.toString()));
            } else if (mgInner.getActualInstance() instanceof MetalGateway) {
               MetalGateway mg = mgInner.getMetalGateway();
               System.out.println(String.format("MetalGateway: %s", mg.toString()));
            } else {
               throw new ApiException(String.format("Unhandled metal gateway type: %s", mgInner.toString()));

            }
         }
      } catch (ApiException e) {
         System.out.println(String.format("Response HTTP status code : %s", e.getCode()));
         System.out.println(String.format("Response HTTP headers : %s", e.getResponseHeaders()));
         System.out.println(String.format("Response HTTP body : %s", e.getResponseBody()));
         System.out.println(String.format("Exception message : %s", e.getMessage()));
         e.printStackTrace();
      }
   }
}
