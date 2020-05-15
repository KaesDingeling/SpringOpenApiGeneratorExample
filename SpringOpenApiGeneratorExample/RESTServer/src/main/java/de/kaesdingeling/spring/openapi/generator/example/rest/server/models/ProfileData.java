package de.kaesdingeling.spring.openapi.generator.example.rest.server.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileData {
	
	private String username;
	private String firstName;
	private String lastName;
	private boolean active;
}