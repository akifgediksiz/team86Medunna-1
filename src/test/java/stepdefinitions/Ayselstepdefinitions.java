package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class Ayselstepdefinitions {

  // @Given("user navigates to {string} homepage")
  // public void user_navigates_to_homepage(String url) {
  //     Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

  // }

    @Given("user navigates to {string} homepage")
    public void user_navigates_to_homepage(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

}
