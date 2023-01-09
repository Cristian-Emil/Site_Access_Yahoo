package tests;

import org.openqa.selenium.By;
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
    public void testLogInAdminVailidCredential() throws InterruptedException {
        driver.manage().window().maximize();

        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        Thread.sleep(1000);
        SignInPage.getSignInButton().click();
        Thread.sleep(1000);

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
        Thread.sleep(500);

        CheckPageElements.getTopBanner(TopBanner);

        CheckPageElements.getInbox(Inbox);


        SoftAssert softAssert = new SoftAssert();

//  Check Top Banner - "Yahoo mail, Advance, Cristian , Home" - Test 1, varianta 1
        softAssert.assertEquals("Yahoo Mail" , "Yahoo Mail", "Campul 'Yahoo Mail' nu este corect    " );
        softAssert.assertEquals("Advanced - - " , "Advanced" , "Campul 'Advanced' nu este corect   ");
        softAssert.assertEquals("Cristian" , "Cristian" , "Campul 'Cristian' nu este corect    ");
        softAssert.assertEquals("Home" , "Home" , "Campul 'Home' nu este corect    " );
        System.out.println("\n");

//  Check Top Banner - "Yahoo mail, Advance, Cristian , Home" - Test 1, varianta 2
        softAssert.assertEquals(TopBanner,
                "Yahoo Mail\n" +
                        "Advanced\n" +
                        "Cristian\n" +
                        "Home", "Test2 - elementele verificate nu corespund \n");

        Thread.sleep(500);


//  Check "Inbox" - Test 2, varianta 1
        softAssert.assertEquals("Inbox" , "Inbox ---", "Campul 'Inbox' nu este corect    "  );

//  Check "Inbox" - Test 2, varianta 2
        softAssert.assertEquals(Inbox,"Inbox","Campul 'Inbox' nu este corect    ");


//        System.out.println(Inbox.getText());
//        System.out.println(Inbox.getAttribute("title"));


        Thread.sleep(500);

        driver.close();
        driver.quit();

        softAssert.assertAll();
    }




}
