package drivers;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

//-----Liniile de mai jos sunt pt ver.109-110 si pt ca am trecut la varianta ver.111 este necesar sa le comentam -------

//    public static ChromeDriver getDriver() {
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//
//        ChromeDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }

//----------------------------------------------------------------------------------------------------------------------

//------------------- Aici incep liniile de comanda pentru apelare chromedriver ver.111 --------------------------------

    public static ChromeDriver getDriver()  {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/crist/IdeaProjects/- driver_Selenium-Maven/ChromeDriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }


}
