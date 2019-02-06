package at.fhv.cicd.application.endpoints;

import at.fhv.cicd.application.models.PictureResult;
import org.junit.Assert;
import org.junit.Test;


/**
 * Integration tests for {@link PictureEndpoint}
 *
 */
public class PictureEndpointIT {

	/**
	 * Test analysis with empty search
	 */

@Test
	public void testSearchPicEmptyText() throws Exception {
		AuthEndpoint authEndpoint = new AuthEndpoint();
		PictureEndpoint pictureEndpoint = new PictureEndpoint();
		String token = authEndpoint.login("user@test.com");
		PictureResult result = pictureEndpoint.search("", token);

		//asserNotNull because by default an image is loaded
		Assert.assertNotNull(result);

	}

	@Test
	public void testSearchPicWithText () throws Exception{
		AuthEndpoint authEndpoint = new AuthEndpoint();
		PictureEndpoint pictureEndpoint = new PictureEndpoint();
		String token = authEndpoint.login("user@test.com");
		PictureResult result = pictureEndpoint.search("Dog",token);

		//9-because 9 images loaded by default
		Assert.assertEquals(result.pictureURL.size(),9);


	}

}
