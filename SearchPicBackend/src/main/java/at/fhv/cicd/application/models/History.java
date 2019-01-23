package at.fhv.cicd.application.models;

// Start of user code (user defined imports)

// End of user code

public class History {
	/**
	 * Description of the property items.
	 */
	public java.util.Set<at.fhv.cicd.application.models.HistoryItem> items = new java.util.LinkedHashSet<at.fhv.cicd.application.models.HistoryItem>();
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public java.util.Set<at.fhv.cicd.application.models.HistoryItem> getItems(){
		   return this.items;
		}
		
		public void setItems(java.util.Set<at.fhv.cicd.application.models.HistoryItem> items){
		   this.items = items;
		}
		
	
}
