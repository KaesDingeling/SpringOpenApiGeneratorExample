package de.kaesdingeling.spring.openapi.generator.example.rest.server.apis;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.kaesdingeling.spring.openapi.generator.example.rest.server.models.LoginData;
import de.kaesdingeling.spring.openapi.generator.example.rest.server.models.ProfileData;

@RestController
@RequestMapping("login")
public class RESTApiLoginExample {
	
	@PostMapping("login")
	public ResponseEntity<ProfileData> login(@RequestBody LoginData loginData) {
		if (loginData != null) {
			if (loginData.getUsername().contentEquals("admin") && loginData.getPassword().contentEquals("admin")) {
				return new ResponseEntity<ProfileData>(ProfileData.builder()
						.username("admin")
						.firstName("max")
						.lastName("mustermann")
						.active(true)
						.build(), HttpStatus.OK);
			} else {
				return new ResponseEntity<ProfileData>(HttpStatus.FORBIDDEN);
			}
		} else {
			return new ResponseEntity<ProfileData>(HttpStatus.BAD_REQUEST);
		}
	}
}