package starter;

import apiDTO.ApiDefinitionDTO;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class FrameworkApis {

    public static List<ApiDefinitionDTO> getApiList(){
        List<ApiDefinitionDTO> apiDefinitionDTOList = new ArrayList<>();
        apiDefinitionDTOList.add(new ApiDefinitionDTO("https://catfact.ninja", "fact", "CatFacts"));
        apiDefinitionDTOList.add(new ApiDefinitionDTO("https://api.publicapis.org", "entries", "PublicAPIs"));
        return apiDefinitionDTOList;
    }

    public static Response executeGetCall(ApiDefinitionDTO apiDefinitionDTO){
        RequestSpecification spec = given().baseUri(apiDefinitionDTO.getBaseURL())
                .basePath(apiDefinitionDTO.getBasePath());
        return spec.get();
    }

}
