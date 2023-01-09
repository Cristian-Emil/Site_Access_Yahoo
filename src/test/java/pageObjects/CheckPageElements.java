package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckPageElements {

    public CheckPageElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

// ---------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"ybar-inner-wrap\"]/div[2]/div")
    private static WebElement topBanner;
    public static WebElement getTopBanner(String topBanner) { return CheckPageElements.topBanner; }

// ---------------------------------------------------------------------------

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a")

    private static WebElement Inbox;
    public static WebElement getInbox(String inbox) { return CheckPageElements.Inbox; }


}
