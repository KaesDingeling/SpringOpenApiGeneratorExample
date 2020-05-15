package de.kaesdingeling.spring.openapi.generator.example.rest.client.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.kaesdingeling.spring.openapi.generator.example.generated.api.RestApiExampleApi;
import de.kaesdingeling.spring.openapi.generator.example.generated.api.RestApiLoginExampleApi;
import de.kaesdingeling.spring.openapi.generator.example.generated.invoker.ApiClient;

@Configuration
public class ConfigApis {
	
	@Bean
	public ApiClient apiClient() {
		return new ApiClient();
	}
	
	@Bean
	public RestApiExampleApi restApiExampleApi(ApiClient apiClient) {
		return new RestApiExampleApi(apiClient);
	}
	
	@Bean
	public RestApiLoginExampleApi restApiLoginExampleApi(ApiClient apiClient) {
		return new RestApiLoginExampleApi(apiClient);
	}
}