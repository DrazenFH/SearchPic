package at.fhv.cicd.application.endpoints;

// Start of user code (user defined imports)

// End of user code

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@org.springframework.web.bind.annotation.RestController
public class AuthEndpoint {
	// Start of user code (user defined attributes)
	//Test-Mapping
	@RequestMapping("/")
	public String index(){
		return "Greetings from Spring Boot!";
	}
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/logout")
	public void logout(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code logout
		
		// End of user code
	}
	
	@org.springframework.web.bind.annotation.PostMapping("/login")
	public String login(@org.springframework.web.bind.annotation.RequestParam("email") String email) throws Exception {
		// Start of user code login
		return null;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
