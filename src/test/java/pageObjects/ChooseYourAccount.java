package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseYourAccount {

    public ChooseYourAccount(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // ---------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"login-username\"]")
    private static WebElement userName;
    public static WebElement getUserName() { return userName; }

    // ---------------------------------------------------------------------------
    @FindBy(id = "login-passwd")
    private static WebElement password;
    public static WebElement getPassword() { return password; }

// ---------------------------------------------------------------------------

    @FindBy (id="next")
    private static WebElement signInButton;
    public static WebElement getSignInButton() { return signInButton;  }

// ---------------------------------------------------------------------------

    @FindBy(xpath = "//*[@id=\"root_1\"]")
    private static WebElement gotoMail;
    public static WebElement getMail() { return gotoMail; }

}
