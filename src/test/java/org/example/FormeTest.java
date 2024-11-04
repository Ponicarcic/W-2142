package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.FormaPage;

public class FormeTest {

    public static WebDriver driver;

    @BeforeClass
    public void BeforeClass()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ponic\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void FormTest()
    {
        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage page = new FormaPage(driver);
        page.setFirstNameEl("Ponicarcic");
        page.setLastNameEl("Victor");
        page.setUserEmailEl("ponicarcicv@gmail.com");
        page.setUserNumber("068980102");
        page.setDateOfBirthInputEl("13 may 2005");
    }


    @AfterClass
    public void close(){
        driver.quit();
    }
}
