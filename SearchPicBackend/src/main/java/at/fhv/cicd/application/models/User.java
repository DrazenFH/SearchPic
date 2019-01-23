package at.fhv.cicd.application.models;

// Start of user code (user defined imports)

// End of user code

public class User {
	/**
	 * Description of the property email.
	 */
	public String email = null;
	
	/**
	 * Description of the property history.
	 */
	public at.fhv.cicd.application.models.History history = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getEmail(){
		   return this.email;
		}
		
		public void setEmail(String email){
		   this.email = email;
		}
		
		public at.fhv.cicd.application.models.History getHistory(){
		   return this.history;
		}
		
		public void setHistory(at.fhv.cicd.application.models.History history){
		   this.history = history;
		}
		
	
}
