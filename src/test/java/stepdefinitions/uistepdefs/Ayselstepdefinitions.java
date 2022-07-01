package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AyselPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Ayselstepdefinitions {

    AyselPage ay;

    @Given("user\\(patient) navigates to {string} homepage")
    public void userPatientNavigatesToMedunnaHomepage(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }


    @Then("user\\(patient) verifies the text written {string}")
    public void user_patient_verifies_the_text_written(String text) {
        ay = new AyselPage();
        Assert.assertTrue(ay.makeanAppointmentWebelement.isDisplayed());

    }

    @Then("user\\(patient) will click {string} button")
    public void user_patient_will_click_button(String string) {
        ay.makeanAppointmentWebelement.click();


    }

    @Then("user\\(patient) verifies that box is empty")
    public void user_patient_verifies_that_box_is_empty() {

        ReusableMethods.waitFor(10);
        //JSUtils.scrollIntoViewByJS(ay.firstnameBox);
        Assert.assertTrue(ay.firstnameBox.getText().isEmpty());

    }

    @Then("user \\(patient) text their {string}")
    public void userPatientTextTheir(String firstname) {
        ay.firstnameBox.sendKeys(firstname);

    }

    @Then("user \\(patient) text their {string}")
    public void userPatientTextsTheir(String lastname) {
        ay.lastnameBox.sendKeys(lastname);
    }

    @Then("user \\(patient) write their {string}")
    public void userPatientWritesTheir(String ssn) {
        ay.ssnBox.sendKeys(ssn);
    }
}

