package at.fhv.cicd.application.endpoints;

// Start of user code (user defined imports)

// End of user code

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@org.springframework.web.bind.annotation.RestController
public class AuthEndpoint {
	// Start of user code (user defined attributes)
	//Here we can define the Starting Page, default is index.html
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/logout")
	public void logout(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code logout
		at.fhv.cicd.application.handlers.AuthHandler.getInstance().logout(token);
		// End of user code
	}
	
	@org.springframework.web.bind.annotation.PostMapping("/login")
	public String login(@org.springframework.web.bind.annotation.RequestParam("email") String email) throws Exception {
		// Start of user code login
		return at.fhv.cicd.application.handlers.AuthHandler.getInstance().login(email);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
