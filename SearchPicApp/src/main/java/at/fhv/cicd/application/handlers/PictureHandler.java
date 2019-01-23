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
		// Start of user code search
		//TODO: We need to connect to our own API, that means the FLICKR API
		if(text == null || "".equals(text)) {
			//The empty photo result image should be shown
			at.fhv.cicd.application.models.PictureResult emptyPictureResult = new at.fhv.cicd.application.models.PictureResult();
			java.util.Set<String> urlListForEmptyText = new java.util.HashSet<String>();
			urlListForEmptyText.add("defaultPath"); //TODO: set the default Path later in the Frontend

			emptyPictureResult.setPictureURL(urlListForEmptyText);

			return emptyPictureResult;
		}

		at.fhv.cicd.application.models.PictureResult pictureResult = new at.fhv.cicd.application.models.PictureResult();
		java.util.Set<String> urlList = new java.util.HashSet<String>();

		String apiKey = "ab1f7cb6e627e6683eaf1b19e60bed55";
		String sharedSecret = "800b5d8deabf33a7";
		Flickr f = new Flickr(apiKey, sharedSecret, new REST());
		PhotosInterface photosInterface = f.getPhotosInterface();

		PhotoList<Photo> photos = new PhotoList();
		SearchParameters params = new SearchParameters();
		params.setText(text);
		try {
			photos = photosInterface.search(params, 10, 10);
		} catch (Exception e)
		{
			System.out.println("The get photos didn't workes!");
		}

		for (int i = 0; i < photos.size(); i++)
		{
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

		return pictureResult;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
