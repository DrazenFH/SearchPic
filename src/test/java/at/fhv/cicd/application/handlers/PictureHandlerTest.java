package at.fhv.cicd.application.handlers;

import org.junit.Assert;
import org.junit.Test;



/**
 * Unit tests for {@link PictureHandler}
 *
 *
 */
public class PictureHandlerTest {

	@Test
	public void testSingleton() {
		Assert.assertNotNull(PictureHandler.getInstance());
	}
}
