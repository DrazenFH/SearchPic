package at.fhv.cicd.application.endpoints;

import org.junit.Test;

/**
 * Integration tests for {@link HistoryEndpoint}
 *
 */
public class HistoryEndpointIT {

	/**
	 * Test history loading with empty token
	 */

	@Test(expected = Exception.class)
	public void testGetHistoryEmptyToken() throws Exception {
		HistoryEndpoint endpoint = new HistoryEndpoint();
		endpoint.getHistory("");
	}

	/**
	 * Test history loading with null token
	 */
	@Test(expected = Exception.class)
	public void testGetHistoryNullToken() throws Exception {
		HistoryEndpoint endpoint = new HistoryEndpoint();
		endpoint.getHistory(null);
	}
}
