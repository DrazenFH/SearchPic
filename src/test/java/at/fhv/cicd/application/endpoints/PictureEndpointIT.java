package at.fhv.cicd.application.endpoints;

import org.junit.Assert;
import org.junit.Test;


/**
 * Integration tests for {@link PictureEndpoint}
 * 
 * @author Michael Sieber
 *
 */
public class PictureEndpointIT {

	/**
	 * Test analysis with empty text
	 */

	//ToDo: Test für unser Programm anpassen
//	@Test
//	public void testAnalyzeEmptyText() throws Exception {
//		AuthEndpoint authEndpoint = new AuthEndpoint();
//		AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
//		String token = authEndpoint.login("user@test.com");
//		SentimentResult result = analysisEndpoint.analyze("", token);
//
//		Assert.assertNotNull(result);
//		Assert.assertEquals("Neutral", result.getSentiment());
//		Assert.assertEquals(50.0f, result.getConfidence(), 0);
//	}
//
//	/**
//	 * Test analysis with null text
//	 */
//	@Test
//	public void testAnalyzeNullText() throws Exception {
//		AuthEndpoint authEndpoint = new AuthEndpoint();
//		AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
//		String token = authEndpoint.login("user@test.com");
//		SentimentResult result = analysisEndpoint.analyze("", token);
//
//		Assert.assertNotNull(result);
//		Assert.assertEquals("Neutral", result.getSentiment());
//		Assert.assertEquals(50.0f, result.getConfidence(), 0);
//	}
//
//	/**
//	 * Test analysis with empty token
//	 */
//	@Test(expected = Exception.class)
//	public void testAnalyzeEmptyToken() throws Exception {
//		AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
//		analysisEndpoint.analyze("i hate people", "");
//	}
//
//	/**
//	 * Test analysis with null token
//	 */
//	@Test(expected = Exception.class)
//	public void testAnalyzeNullToken() throws Exception {
//		AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
//		analysisEndpoint.analyze("i hate people", null);
//	}
}
