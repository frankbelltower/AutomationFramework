package apiDTO;

public class ApiDefinitionDTO {

    public ApiDefinitionDTO(String baseURL, String basePath, String apiName) {
        this.baseURL = baseURL;
        this.basePath = basePath;
        this.apiName = apiName;
    }

    private final String baseURL;
    private final String basePath;
    private final String apiName;

    public String getApiName() { return apiName; }

    public String getBaseURL() { return baseURL; }

    public String getBasePath() { return basePath; }
}
