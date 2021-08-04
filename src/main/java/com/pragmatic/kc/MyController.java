package com.pragmatic.kc;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(value = "/")
	public SenderResponse homeEndpoint() {
		return new SenderResponse("First client Home open");
	}

	@RolesAllowed("ROLE_ADMIN")
	@GetMapping(value = "admin-second-app-page")
	public SenderResponse adminEndpoint() {
		return new SenderResponse("If you see this you're an administrator !");
	}

	@RolesAllowed("ROLE_MANAGER")
	@GetMapping(value = "user-second-app-page")
	public SenderResponse managerEndpoint() {
		return new SenderResponse("you're a user !");
	}
}
