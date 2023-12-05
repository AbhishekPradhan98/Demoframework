package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
		
		features = {
//				".//Featurefiles//",
				".//Featurefiles/Login.feature",
//				".//Featurefiles/Register.feature"
						
		         },
	    glue={"stepdefinitions","hooks"},
	    publish = true,
		dryRun = false,
		monochrome = true,
	
		plugin = {"pretty",
				
				"html:target/HTML-Reports.html",
				"json:target/JSON_Reports.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",	
				 "rerun:target/rerun.txt", //Mandatory to capture failures
		})
public class TestNgRunner extends AbstractTestNGCucumberTests
{
	 @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	
	 
	
}
