package at.fhv.cicd.application.models;

// Start of user code (user defined imports)

// End of user code

public class HistoryItem {
	/**
	 * Description of the property searchedPictureName.
	 */
	public String searchedPictureName = null;
	
	/**
	 * Description of the property requested.
	 */
	public long requested = 0;
	
	/**
	 * Description of the property result.
	 */
	public at.fhv.cicd.application.models.PictureResult result = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getSearchedPictureName(){
		   return this.searchedPictureName;
		}
		
		public void setSearchedPictureName(String searchedPictureName){
		   this.searchedPictureName = searchedPictureName;
		}
		
		public long getRequested(){
		   return this.requested;
		}
		
		public void setRequested(long requested){
		   this.requested = requested;
		}
		
		public at.fhv.cicd.application.models.PictureResult getResult(){
		   return this.result;
		}
		
		public void setResult(at.fhv.cicd.application.models.PictureResult result){
		   this.result = result;
		}
		
	
}
