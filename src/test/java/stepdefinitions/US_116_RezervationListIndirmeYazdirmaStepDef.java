package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.US_116_RezervationListIndirmeYazdirma;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_116_RezervationListIndirmeYazdirmaStepDef<allOptions> {

    US_116_RezervationListIndirmeYazdirma us_116_rezervationListPage = new US_116_RezervationListIndirmeYazdirma();

    @Given("kullanici fhctriplogin sayfasinda")
    public void kullanici_fhctriplogin_sayfasinda() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_rezervasyon_url"));
    }

    @Given("kullanici gecerli username girer")
    public void kullanici_gecerli_username_girer() {
        us_116_rezervationListPage.username.sendKeys(ConfigurationReader.getProperty("gecerli_username"));
    }

    @Given("kullanici gecerli password girer")
    public void kullanici_gecerli_password_girer() {
        us_116_rezervationListPage.password.sendKeys(ConfigurationReader.getProperty("gecerli_password"));
    }

    @Given("kullanici login butonuna basar")
    public void kullanici_login_butonuna_basar() throws InterruptedException {
            Thread.sleep(3000);
            us_116_rezervationListPage.loginButton.click();
    }

    @Given("kullanici Excel formatina basar")
    public void kullanici_Excel_formatina_basar() {
        Select select = new Select(us_116_rezervationListPage.excelKutusu);
        select.selectByValue("2");

    }

    @Then("kullanici indir butonuna basar")
    public void kullanici_indir_butonuna_basar() throws InterruptedException {
        Thread.sleep(3000);
        us_116_rezervationListPage.indirButton.click();
    }

    @Given("kullanici Csv formatina basar")
    public void kullanici_Csv_formatina_basar() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(us_116_rezervationListPage.csvKutusu);
        select.selectByValue("1");

    }

    @Then("kullanici indir1 butonuna basar")
    public void kullanici_indir1_butonuna_basar() throws InterruptedException {
        Thread.sleep(3000);
        us_116_rezervationListPage.indir1Button.click();
    }

    @Given("kullanici Pdf formatina basar")
    public void kullanici_Pdf_formatina_basar() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(us_116_rezervationListPage.pdfKutusu);
        select.selectByValue("3");

    }

    @Then("kullanici indir2 butonuna basar")
    public void kullanici_indir2_butonuna_basar() throws InterruptedException {
        Thread.sleep(3000);
        us_116_rezervationListPage.indir2Button.click();
    }

    @Then("kullanici yazdir butonuna basar")
    public void kullanici_yazdir_butonuna_basar() throws InterruptedException {
        Thread.sleep(3000);
        us_116_rezervationListPage.yazdirButton.click();
    }

}
