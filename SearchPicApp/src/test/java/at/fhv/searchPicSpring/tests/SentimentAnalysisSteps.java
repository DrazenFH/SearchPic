package at.fhv.searchPicSpring.tests;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * @author - Drazen Lukic
 **/
public class SentimentAnalysisSteps {

    private WebDriver driver;


    //Die Capabilities müssen noch an unser Projekt angepasst werden, sowie der richtige Driver
    @Before
    public void before(Scenario scenario) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "WIN10");
        capabilities.setCapability("version", "64");
        capabilities.setCapability("browserName", "firefox");
        capabilities.setCapability("name", scenario.getName());

        if (!scenario.getName().endsWith("(video)")) {
            capabilities.setCapability("headless", true);
        }

        driver = new RemoteWebDriver(
                new URL("http://" + System.getenv("TESTINGBOT_CREDENTIALS") + "@hub.testingbot.com/wd/hub"),
                capabilities);

        // prevent errors if we start from a sleeping heroku instance
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        driver.quit();
    }

    //Test für das Login, hierbei handelt es sich um ein Muster, die
    //jeweiligen ID' müssen dem Frontend entsprechend angepasst werden

    @Given("^Login with user '(.?)'$")
    public void login(String email){
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);
        driver.findElement(By.id("loginBtn")).click();
    }



}
