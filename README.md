# SpringOpenApiGeneratorExample

## Step 1 - Setup
Clone this example or add to your Project the following dependencies:
```
<dependency>
	<groupId>org.springdoc</groupId>
	<artifactId>springdoc-openapi-webflux-core</artifactId>
	<version>${openapi.version}</version>
</dependency>
<dependency>
	<groupId>org.springdoc</groupId>
	<artifactId>springdoc-openapi-webflux-ui</artifactId>
	<version>${openapi.version}</version>
</dependency>
```

Run your application.

## Step 2 - Get OpenApi-Generator-CLI
Download `openapi-generator-cli` from https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/4.3.1/openapi-generator-cli-4.3.1.jar or get a newer Version then `4.3.1`.
Move this file to `~/Downlaods/openapi-generator-cli.jar` or rename the path on the script `generate-client-lib.sh`.

## Step 3 - Generate the Client
Now run the script `./generate-client-lib.sh` or `sh generate-client-lib.sh`.
After then exsists an new folder on the execution dir was contains the generated rest client.

## Step 4 - Client Project
Add your generated maven project to your client and get an use example like this:
```
@Configuration
public class ConfigApis {
	
	@Bean
	public ApiClient apiClient() {
		return new ApiClient();
	}
  
  // Register your api then you can use everything on spring
	@Bean
	public RestApiExampleApi restApiExampleApi(ApiClient apiClient) {
		return new RestApiExampleApi(apiClient);
	}
}
```

## Step 5 - Use the generated api
```
@Autowired
private RestApiExampleApi restApiExampleApi;

restApiExampleApi.ping();
```

Referenzes:
- https://openapi-generator.tech/docs/installation
- https://www.baeldung.com/spring-boot-rest-client-swagger-codegen
- https://github.com/OpenAPITools/openapi-generator/releases
