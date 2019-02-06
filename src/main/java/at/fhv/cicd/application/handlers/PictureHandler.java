package at.fhv.cicd.application.handlers;

// Start of user code (user defined imports)

// End of user code

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.photos.Photo;
import com.flickr4java.flickr.photos.PhotoList;
import com.flickr4java.flickr.photos.PhotosInterface;
import com.flickr4java.flickr.photos.SearchParameters;

public class PictureHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static PictureHandler INSTANCE;
	
	private PictureHandler(){
	    // singleton
	}
	
	public static PictureHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new PictureHandler();
	    }
	
	    return INSTANCE;
	}
	
	public at.fhv.cicd.application.models.PictureResult search(String text, String token) throws Exception {

		at.fhv.cicd.application.models.PictureResult pictureResult = new at.fhv.cicd.application.models.PictureResult();
		java.util.Set<String> urlList = new java.util.HashSet<String>();
		// Start of user code search
		if (text == null || "".equals(text)) {
			//Wenn Input-Feld leer ist, soll diese Url geladen werden
			String defaultUrl = "https://farm8.staticflickr.com/7908/46888308852_cc302c9992.jpg";
			urlList.add(defaultUrl);

			pictureResult.setPictureURL(urlList);
			return pictureResult;
		} else {

			String apiKey = "ab1f7cb6e627e6683eaf1b19e60bed55";
			String sharedSecret = "800b5d8deabf33a7";
			Flickr f = new Flickr(apiKey, sharedSecret, new REST());
			PhotosInterface photosInterface = f.getPhotosInterface();

			PhotoList<Photo> photos = new PhotoList();
			SearchParameters params = new SearchParameters();
			params.setText(text);

			try {
				photos = photosInterface.search(params, 9, 9);
			} catch (Exception e) {
				System.out.println("The get photos didn't workes!");
			}

			for (int i = 0; i < photos.size(); i++) {
				//here we build the url from the information from the photos
				//http://farm{farm-id}.staticflickr.com/{server-id}/{id}_{secret}.jpg
				String farmID = photos.get(i).getFarm();
				String serverID = photos.get(i).getServer();
				String id = photos.get(i).getId();
				String secret = photos.get(i).getSecret();
				String url = "http://farm" + farmID + ".staticflickr.com/" + serverID + "/" + id + "_" + secret + ".jpg";

				urlList.add(url);
			}

			pictureResult.setPictureURL(urlList);

			HistoryHandler.getInstance().addHistory(token, text, pictureResult);
			return pictureResult;
			// End of user code
		}
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
