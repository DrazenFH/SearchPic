package at.fhv.cicd.application.endpoints;

import at.fhv.cicd.application.models.PictureResult;
import org.junit.Assert;
import org.junit.Test;


/**
 * Integration tests for {@link PictureEndpoint}
 * 
 * @author Michael Sieber - edited by Drazen Lukic
 *
 */
public class PictureEndpointIT {

	/**
	 * Test analysis with empty search
	 */

	//ToDo: Test für unser Programm anpassen
@Test
	public void testSearchPicEmptyText() throws Exception {
		AuthEndpoint authEndpoint = new AuthEndpoint();
		PictureEndpoint pictureEndpoint = new PictureEndpoint();
		String token = authEndpoint.login("user@test.com");
		PictureResult result = pictureEndpoint.search("", token);

		Assert.assertNotNull(result);

	}

}
