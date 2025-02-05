package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/Stock.feature",
                  glue="stepdefinitions",
                  dryRun=false
                  )

public class Main_StockTest 
{

}
