package de.kaesdingeling.spring.openapi.generator.example.rest.server.apis;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class RESTApiExample {
	
	@PostMapping("post-test")
	public String postTest(@RequestBody String content) {
		return "body-test:" + content;
	}
	
	@GetMapping("get-test")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public String getTest() {
		return UUID.randomUUID().toString();
	}
	
	@GetMapping("ping")
	public String ping() {
		return "pong";
	}
}