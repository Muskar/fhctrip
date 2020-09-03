package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.FHCTrippages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HotelOlusturma01StepDefinition {
    FHCTrippages fhcTrippages=new FHCTrippages();

    @Given("Log in sayfasina gidin")
    public void log_in_sayfasina_gidin() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhctrip_url"));
    }

    @When("UserName metin kutusunu tıklayın ve yazın")
    public void username_metin_kutusunu_tıklayın_ve_yazın() {
        fhcTrippages.username.sendKeys(ConfigurationReader.getProperty("fhctrip_username"));

    }

    @When("Password metin kutusunu tıklayın ve yazın")
    public void password_metin_kutusunu_tıklayın_ve_yazın() {
        fhcTrippages.password.sendKeys(ConfigurationReader.getProperty("fhctrip_password"));
    }

    @When("LOG IN düğmesine tıklayın")
    public void log_IN_düğmesine_tıklayın() {
        fhcTrippages.loginButton.click();
    }

    @When("Hotel Management butonuna tiklayin")
    public void hotel_Management_butonuna_tiklayin() {
        fhcTrippages.hotelManagementButton.click();
    }
    @When("Hotel List butonuna tiklayin")
    public void hotel_List_butonuna_tiklayin() {
        fhcTrippages.hotelListButton.click();
    }

    @When("Add Hotel butonuna tiklayin")
    public void add_Hotel_butonuna_tiklayin() {
        fhcTrippages.addHotelButton.click();

    }

    @When("Code metin kutusunu tıklayın ve geçerli kodu yazın")
    public void code_metin_kutusunu_tıklayın_ve_geçerli_kodu_yazın() {
        fhcTrippages.code.sendKeys(ConfigurationReader.getProperty("hotel_code"));
    }

    @When("Name metin kutusunu tıklayın ve geçerli bir ad yazın")
    public void name_metin_kutusunu_tıklayın_ve_geçerli_bir_ad_yazın() {
        fhcTrippages.name.sendKeys(ConfigurationReader.getProperty("hotel_name1"));
    }

    @When("Address metin kutusuna tiklayin ve adres yazin")
    public void address_metin_kutusuna_tiklayin_ve_adres_yazin() {
        fhcTrippages.address.sendKeys(ConfigurationReader.getProperty("hotel_address1"));
    }

    @When("Phone metin kutusuna tiklayin ve gecerli telefon numarasi girin")
    public void phone_metin_kutusuna_tiklayin_ve_gecerli_telefon_numarasi_girin() {
        fhcTrippages.phone.sendKeys(ConfigurationReader.getProperty("hotel_phone1"));

    }

    @When("Email metin kutusuna tiklayin ve gecerli Email girin")
    public void email_metin_kutusuna_tiklayin_ve_gecerli_Email_girin() {
        fhcTrippages.email.sendKeys(ConfigurationReader.getProperty("hotel_email"));
    }

    @When("IDGroup metin kutusunu tıklayın ve grup seçin")
    public void idgroup_metin_kutusunu_tıklayın_ve_grup_seçin() {
        Select options=new Select(fhcTrippages.idGroup);
        options.selectByVisibleText(ConfigurationReader.getProperty("hotel_type"));
    }

    @When("Save butonuna tiklayin")
    public void save_butonuna_tiklayin() throws InterruptedException {
        Thread.sleep(3000);
        fhcTrippages.saveButton.click();

        Thread.sleep(2000);
        String actualMesaj=fhcTrippages.mesaj.getText();
        System.out.println("Allert Mesaj :"+actualMesaj);
        String expectetMesaj="Hotel was inserted successfully";
        Assert.assertEquals(actualMesaj,expectetMesaj);
    }

    @When("Save butonuna tiklayin ve kayit mesajinin görüntülenmedigini dogrulayin")
    public void save_butonuna_tiklayin_ve_kayit_mesajinin_görüntülenmedigini_dogrulayin() throws InterruptedException {
        Thread.sleep(3000);
        fhcTrippages.saveButton.click();
        Thread.sleep(2000);
        String expectetMesaj="Hotel was inserted successfully";
        String actualMesaj=fhcTrippages.mesaj.getText();
        System.out.println("Allert Mesaj :"+actualMesaj);
        Assert.assertFalse(actualMesaj.isEmpty());

    }


}


