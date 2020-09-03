package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_116_RezervationListIndirmeYazdirma {
    public US_116_RezervationListIndirmeYazdirma() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="UserName")
    public WebElement username;

    @FindBy(id ="Password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"add-form\"]/div[3]/button")
    public WebElement loginButton;

    @FindBy(id = "itemsExportTypes")
    public WebElement excelKutusu;

    @FindBy(id = "btnExportTable")
    public WebElement indirButton;

    @FindBy(id = "itemsExportTypes")
    public WebElement csvKutusu;

    @FindBy(id = "btnExportTable")
    public WebElement indir1Button;

    @FindBy(id = "itemsExportTypes")
    public WebElement pdfKutusu;

    @FindBy(id = "btnExportTable")
    public WebElement indir2Button;

    @FindBy(id = "btnPrintTable")
    public WebElement yazdirButton;
    

}
