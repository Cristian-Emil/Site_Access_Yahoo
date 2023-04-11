package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"consent-page\"]/div/div/div/form/div[2]/div[2]/button[1]")
    private static WebElement acceptButton;

    public static WebElement getAcceptButton() { return acceptButton; }

//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"ybarAccountProfile\"]/a")
    private static WebElement signInButton;
    public static WebElement getSignInButton() { return signInButton; }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[@id=\"signin-main\"]/div[1]/a")
//  id = "menu.btn"
    private static WebElement signConectare;
    public static WebElement getSignConectare() { return signConectare; }

//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"login-signin\"]")
    private static WebElement signInButton1;

    public static WebElement getSignInButton1() { return signInButton1; }

//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"login-signin\"]")
    private static WebElement signInButton2;

    public static WebElement getSignInButton2() { return signInButton2; }

//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath ="//*[@id=\"ybar-navigation-item-mail\"]/a")
    private static WebElement signInButton3;

    public static WebElement getSignInButton3() { return signInButton3; }

}
