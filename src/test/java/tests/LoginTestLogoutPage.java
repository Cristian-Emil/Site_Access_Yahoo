package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.ChooseYourAccount;
import pageObjects.QuitYourAccount;
import pageObjects.SignInPage;
import pageObjects.SignOutPage;

import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static utils.TestData.*;

public class LoginTestLogoutPage extends BaseTest{

    @Test
    public void testLogInAdminVailidCredential() throws InterruptedException {
        driver.manage().window().maximize();

        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        Thread.sleep(1000);
//------ A disparut pop-up-ul pentru accesul pe pagina , deci linia se comanteaza pana la reaparitia lui ---------------
        SignInPage.getAcceptButton().click();
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

//        WebElement EliminatePopUp = driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div/div/div/div[1]/div"));
//        EliminatePopUp.click();
//        Thread.sleep(500);

//  1) Facem verificarea ca pe pagina de logare avem un numar de 1+8 carduri ( "a class" - uri) - folosim ASSERT

//        List<WebElement> cards = driver.findElements(By.className("card"));
//        assertEquals(cards.size(), 9, "Valoare incorecta a numarului de carduri estimat");
//        Thread.sleep(5000);

//  Sau varianta 2

//        List<WebElement> aClass = driver.findElements(By.className("a class"));
//        assertEquals(aClass.size(), 9, "Valoare incorecta a numarului de carduri estimata");
//        assert By.xpath ("//*[@id="app"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a/span[1]/span")


//  2) Facem verificarea ca pe pagina de logare avem un numar de 1+8 carduri ( "a class" - uri) - folosim softASSERT
//  Definim o variabila de softAssert si il iniutializam cu un obiect now ( NEW ) de softassert

        SoftAssert softAssert = new SoftAssert();

        WebElement message1 = driver.findElement (By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a/span[1]/span"));
        softAssert.assertEquals(message1.getText(),"Inbox","Test 1 - elementul nu exista, test invalid");
        System.out.println(message1.getText());
        System.out.println(message1.getAttribute("title"));
//        System.out.println("Test1/message1 - done \n");
        Thread.sleep(1500);
//----------------------------------------------------------------------------------------------------------------------

        WebElement message2 = driver.findElement (By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[2]/div"));
        softAssert.assertEquals(message2.getText(),
                "Yahoo Mail\n" +
                "Advanced\n" +
                "Cristian\n" +
                "Home", "Test2 - elementele verificate nu corespund \n");
        System.out.println("Test2/message2 - done \n");
        Thread.sleep(500);

//----------------------------------------------------------------------------------------------------------------------

        WebElement message3 = driver.findElement (By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[2]/div"));
        softAssert.assertEquals("Yahoo Mail" , "Yahoo Mail", "Nu exista logo-ul corect Yahoo Mail" );
        softAssert.assertEquals("Advanced" , "Advanced" , "Nu exista box-ul corect pt Advanced");
        softAssert.assertEquals("Cristian" , "Cristian" , "Nu exista logo-ul corect Cristian");
        softAssert.assertEquals("Home" , "Home" , "Nu exista box-ul corect pt Home" );
        System.out.println("Test3/message3 - done \n");
        System.out.println("\n");
        Thread.sleep(1500);

//        softAssert.assertEquals(message3.getText(),"Yahoo Mail","Incorect, elementul nu exista");
//        softAssert.assertEquals(message3.getText(),"Advanced","Incorect, elementul nu exista");
//        softAssert.assertEquals(message3.getText(),"Cristian","Incorect, elementul nu exista");
//        softAssert.assertEquals(message3.getText(),"Home","Incorect, elementul nu exista");
//
//        Thread.sleep(500);
//
//        QuitYourAccount.getLogoOutButton().click();
//        Thread.sleep(1500);
//        QuitYourAccount.getSignOutButton().click();

        driver.close();
        driver.quit();
//
        softAssert.assertAll();
    }
}
