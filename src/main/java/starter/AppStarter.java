package starter;

import apiDTO.ApiDefinitionDTO;

import java.util.List;

public class AppStarter {

    public static void main(String[] args){
        List<ApiDefinitionDTO> listApi = FrameworkApis.getApiList();
        System.out.println(FrameworkApis.executeGetCall(listApi.get(0)).getBody().asPrettyString());
    }
}
