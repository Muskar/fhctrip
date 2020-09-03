package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FhctripHomePagePage;

import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class FhctripHomePageStepDefinitions {

    FhctripHomePagePage fhctripHomePagePage= new FhctripHomePagePage();

    @Given("user on the homepage")
    public void user_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhctrip_homepage_url"));
    }

    @Then("verify Welcome to fhc trip text is visible")
    public void verify_Welcome_to_fhc_trip_text_is_visible() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Assert.assertFalse(fhctripHomePagePage.homepageText.isDisplayed());
    }

    @Given("user click on contact button")
    public void user_click_on_contact_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    fhctripHomePagePage.contactButton.click();
    }

    @Given("user click on Name Surname box")
    public void user_click_on_Name_Surname_box() {
    fhctripHomePagePage.nameBox.sendKeys(ConfigurationReader.getProperty("name_surname"));
    }

    @Given("user click on Email address box")
    public void user_click_on_Email_address_box() {
fhctripHomePagePage.emailBox.sendKeys(ConfigurationReader.getProperty("email"));
    }

    @Given("user click on phone number box")
    public void user_click_on_phone_number_box() {
fhctripHomePagePage.phoneBox.sendKeys(ConfigurationReader.getProperty("phone"));
    }

    @Given("user click on subject box")
    public void user_click_on_subject_box() {
fhctripHomePagePage.subjectBox.sendKeys(ConfigurationReader.getProperty("subject"));
    }

    @Given("user click on message box")
    public void user_click_on_message_box() {
        fhctripHomePagePage.messageBox.sendKeys(ConfigurationReader.getProperty("message"));
    }

        @Given("user click on send message button")
    public void user_click_on_send_message_button() {

        fhctripHomePagePage.sendMessage.click();
    }

    @Then("verify you are able to send message and get no warning as {string}")
    public void verify_you_are_able_to_send_message_and_get_no_warning_as(String string) {
    Assert.assertFalse(fhctripHomePagePage.errorMessage.isDisplayed());

    }



    @Given("user on the homepage and contact page")
    public void user_on_the_homepage_and_contact_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("fhctrip_homepage_contact_url"));

    }

    @Given("all necessary boxes are filled")
    public void all_necessary_boxes_are_filled() {
        fhctripHomePagePage.nameBox.sendKeys(ConfigurationReader.getProperty("name_surname"));
        fhctripHomePagePage.emailBox.sendKeys(ConfigurationReader.getProperty("email"));
        fhctripHomePagePage.phoneBox.sendKeys(ConfigurationReader.getProperty("phone"));
        fhctripHomePagePage.subjectBox.sendKeys(ConfigurationReader.getProperty("subject"));
        fhctripHomePagePage.messageBox.sendKeys(ConfigurationReader.getProperty("message"));

    }



    @Given("click on send message button")
    public void click_on_send_message_button() {
fhctripHomePagePage.sendMessage.click();
    }

    @Then("verify whether {string} is visible")
    public void verify_whether_is_visible(String string) {
        Assert.assertFalse(fhctripHomePagePage.successMessage.equals("your message has been sent successfully"));

    }




}
