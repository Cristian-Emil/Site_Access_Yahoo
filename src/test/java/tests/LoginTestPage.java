package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.CheckPageElements;
import pageObjects.ChooseYourAccount;
import pageObjects.SignInPage;

import javax.swing.*;
import java.util.Set;

import static utils.TestData.*;

public class LoginTestPage extends BaseTest{


    @Test
    public void testLogInAdminValidCredential() throws InterruptedException {
        driver.manage().window().maximize();

        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        Thread.sleep(1000);

//        SignInPage.getAcceptButton().click();
//        Thread.sleep(1000);

        SignInPage.getSignInButton().click();
        Thread.sleep(1000);

//        SignInPage.getSignConectare().click();
//        Thread.sleep(1000);

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(1000);

        for (String window: windowHandles) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        ChooseYourAccount chooseYourAccount = PageFactory.initElements(driver, ChooseYourAccount.class);
        Thread.sleep(500);

        ChooseYourAccount.getUserName().sendKeys(ADMIN_USERNAME);
        SignInPage.getSignInButton1().click();
        Thread.sleep(500);

        ChooseYourAccount.getPassword().sendKeys(ADMIN_PASSWORD);
        SignInPage.getSignInButton2().click();
        Thread.sleep(500);

        ChooseYourAccount.getMail().sendKeys(MAIL_BOX);
        SignInPage.getSignInButton3().click();
        Thread.sleep(1500);

        CheckPageElements.getTopBanner(TopBanner);

        CheckPageElements.getInbox(Inbox);
        Thread.sleep(3500);

        SoftAssert softAssert = new SoftAssert();

//  Check Top Banner - "Yahoo mail, Advance, Cristian , Home" - Test 1, varianta 1
        softAssert.assertEquals("Yahoo Mail" , "Yahoo Mail", "Campul 'Yahoo Mail' nu este corect    " );
        softAssert.assertEquals("Advanced" , "Advanced" , "Campul 'Advanced' nu este corect   ");
        softAssert.assertEquals("Cristian" , "Cristian" , "Campul 'Cristian' nu este corect    ");
        softAssert.assertEquals("Home" , "Home" , "Campul 'Home' nu este corect    " );
        System.out.println("\n");

        Thread.sleep(3000);

//  Check Top Banner - "Yahoo mail, Advance, Cristian , Home" - Test 1, varianta 2
        softAssert.assertEquals(TopBanner,
                "\"Yahoo Mail\\n\" +\n" + "\"Advanced\\n\" +\n" + "\"Cristian\\n\" +\n" + "\"Home\"", "Test2 - elementele verificate nu corespund \n");
        Thread.sleep(1500);


//  Check "Inbox" - Test 2, varianta 1
        softAssert.assertEquals("Inbox" , "Inbox", "Campul 'Inbox' nu este corect    "  );

//  Check "Inbox" - Test 2, varianta 2
        softAssert.assertEquals(Inbox,"Inbox","Campul 'Inbox' nu este corect    ");

        WebElement Inbox = driver.findElement (By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]"));
        softAssert.assertEquals(Inbox.getText(),"Inbox\n" + "9","Test 1 - elementele nu corespund, test invalid");
        System.out.println(Inbox.getText());
        System.out.println(Inbox.getAttribute("title = " + Inbox));

        Thread.sleep(3000);
        driver.quit();
        softAssert.assertAll();
    }
}
