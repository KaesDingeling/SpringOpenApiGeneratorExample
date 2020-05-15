package de.kaesdingeling.spring.openapi.generator.example.rest.server;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Main.class);
		
		Properties properties = new Properties();
		
		properties.put("server.port", 8090);
		properties.put("server.context.path", "api");
		
		application.setDefaultProperties(properties);
		
		application.run(args);
	}
}