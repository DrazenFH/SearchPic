package at.fhv.searchPicSpring.tests;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * @author - Drazen Lukic
 **/

//Cucumber Options konfiguieren

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"})

public class RunSentimenAnalysis {

}
