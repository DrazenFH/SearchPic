package at.fhv.cicd.application.endpoints;

// Start of user code (user defined imports)

// End of user code

@org.springframework.web.bind.annotation.RestController
public class PictureEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/analyze")
	public at.fhv.cicd.application.models.PictureResult search(@org.springframework.web.bind.annotation.RequestParam("text") String text, @org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code search
		return at.fhv.cicd.application.handlers.PictureHandler.getInstance().search(text, token);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
