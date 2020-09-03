package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FhctripHomePagePage {

    public FhctripHomePagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//*[@class='mb-3']")
public WebElement homepageText;


    @FindBy(xpath = "//*[@id='navContact']")
    public WebElement contactButton;

    @FindBy(xpath ="//*[@id='NameSurname']")
    public WebElement nameBox;

    @FindBy(xpath = "//*[@id='Email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='Subject']")
    public WebElement subjectBox;

    @FindBy(xpath = "//*[@id='PhoneNo']")
    public WebElement phoneBox;

    @FindBy(xpath = "//*[@id='Message']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@value='Send Message']")
public WebElement sendMessage;

    @FindBy(xpath = "//*[@value='Send Message']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[@id=\"divMessageResult\"]")
    public WebElement errorMessage;


}
