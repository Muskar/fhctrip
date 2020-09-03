package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FHCTrippages {
    public FHCTrippages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="UserName")
    public WebElement username;
    @FindBy(id="Password")
    public WebElement password;
    @FindBy(xpath = "//button[@class='btn btn-success uppercase']")
    public WebElement loginButton;
    @FindBy(linkText ="Hotel Management")
    public WebElement hotelManagementButton;
    @FindBy(xpath = "(//a[@href='/admin/HotelAdmin'])[1]")
    public WebElement hotelListButton;
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelButton;
    @FindBy(id = "Code")
    public WebElement code;
    @FindBy(id = "Name")
    public WebElement name;
    @FindBy(id = "Address")
    public WebElement address;
    @FindBy(id="Phone")
    public WebElement phone;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "IDGroup")
    public WebElement idGroup;
    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement mesaj;






}
