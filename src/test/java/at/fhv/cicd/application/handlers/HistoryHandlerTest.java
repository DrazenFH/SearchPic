package at.fhv.cicd.application.handlers;

import org.junit.Assert;
import org.junit.Test;

import at.fhv.cicd.application.handlers.HistoryHandler;

/**
 * Unit tests for {@link HistoryHandler}
 * @author Michael Sieber
 *
 */
public class HistoryHandlerTest {

	@Test
	public void testSingleton() {
		Assert.assertNotNull(HistoryHandler.getInstance());
	}
}
