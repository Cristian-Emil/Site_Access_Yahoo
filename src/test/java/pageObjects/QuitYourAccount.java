package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuitYourAccount {
    public QuitYourAccount(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//----------------------------------------------------------------------------------------------

    @FindBy(xpath="//*[@id=\"ybarAccountMenuOpener\"]/span")

    //*[@id="ybarAccountMenuOpener"]/div/img
    private static WebElement logoOutButton;
    public static WebElement getLogoOutButton() { return logoOutButton;  }

//----------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[@id=\"profile-signout-link\"]/span[2]")
    //*[@id="profile-signout-link"]/span[2]
//  <span class="_yb_ymjg5 _yb_mn376 _yb_sq2hs">Sign out</span>
    private static WebElement signOutButton;
    public static WebElement getSignOutButton() { return signOutButton;  }







}
