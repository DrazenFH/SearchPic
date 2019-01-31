package at.fhv.cicd.application.handlers;

import org.junit.Assert;
import org.junit.Test;



/**
 * Unit tests for {@link PictureHandler}
 * @author Michael Sieber - edited by Drazen Lukic
 *
 */
public class AnalysisHandlerTest {

	@Test
	public void testSingleton() {
		Assert.assertNotNull(PictureHandler.getInstance());
	}
}
