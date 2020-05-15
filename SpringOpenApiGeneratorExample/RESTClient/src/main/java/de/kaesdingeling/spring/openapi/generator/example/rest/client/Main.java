package de.kaesdingeling.spring.openapi.generator.example.rest.client;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import de.kaesdingeling.spring.openapi.generator.example.generated.api.RestApiExampleApi;
import de.kaesdingeling.spring.openapi.generator.example.generated.api.RestApiLoginExampleApi;
import de.kaesdingeling.spring.openapi.generator.example.generated.model.LoginData;
import de.kaesdingeling.spring.openapi.generator.example.generated.model.ProfileData;
import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class Main {
	
	@Autowired
	private RestApiExampleApi restApiExampleApi;
	
	@Autowired
	private RestApiLoginExampleApi restApiLoginExampleApi;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Main.class);
		
		app.setWebApplicationType(WebApplicationType.NONE);
		
		app.run(args);
	}
	
	@Bean
	public void testExampleApi() {
		log.info("[Example-API] Start tests");
		log.info("[Example-API] Test /ping");
		
		if (!restApiExampleApi.ping().block().equals("pong")) {
			throw new IllegalStateException();
		}

		log.info("[Example-API] Test /post-test");
		
		if (!restApiExampleApi.postTest("test").block().equals("body-test:test")) {
			throw new IllegalStateException();
		}
		
		log.info("[Example-API] Test /get-test");
		
		if (UUID.fromString(restApiExampleApi.getTest().block()).toString().isEmpty()) {
			throw new IllegalStateException();
		}
		
		log.info("[Example-API] Finished tests");
	}
	
	@Bean
	public void testLoginApi() {
		log.info("[Login-API] Start tests");
		log.info("[Login-API] Test /login");
		
		ProfileData profile = restApiLoginExampleApi.login(new LoginData()
				.username("admin")
				.password("admin")).block();
		
		if (!(profile.getActive() && profile.getFirstName().equals("max") && profile.getLastName().equals("mustermann") && profile.getUsername().equals("admin"))) {
			throw new IllegalStateException();
		}
		
		log.info("[Login-API] Finished tests");
	}
}