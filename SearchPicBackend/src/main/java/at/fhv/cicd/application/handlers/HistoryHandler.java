package at.fhv.cicd.application.handlers;

// Start of user code (user defined imports)

// End of user code

import java.time.Instant;

public class HistoryHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static HistoryHandler INSTANCE;
	
	private HistoryHandler(){
	    // singleton
	}
	
	public static HistoryHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new HistoryHandler();
	    }
	
	    return INSTANCE;
	}
	
	public void addHistory(String token, String text, at.fhv.cicd.application.models.PictureResult result) throws Exception {
		// Start of user code addHistory
		//TODO: write the addLogic
		at.fhv.cicd.application.models.User user = AuthHandler.getInstance().getUser(token);
		at.fhv.cicd.application.models.HistoryItem item = new at.fhv.cicd.application.models.HistoryItem();
		item.setRequested(Instant.now().toEpochMilli());
		item.setSearchedPictureName(text);
		item.setResult(result);
		user.getHistory().getItems().add(item);
		// End of user code
	}
	
	public at.fhv.cicd.application.models.History getHistory(String token) throws Exception {
		// Start of user code getHistory
		//TODO: Here we also need to add code
		if (token == null || "".equals(token)) {
			throw new Exception("Token must not be empty");
		}

		at.fhv.cicd.application.models.User user = AuthHandler.getInstance().getUser(token);
		return user.getHistory();
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
