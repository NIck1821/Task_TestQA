package com.automationPractice.config;

import com.automationPractice.Page.FullRegPage;
import com.automationPractice.Page.RegPage;
import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    public static ChromeDriver chromeDriver;
    public static String PATH_CHROME_DRIVER = ConfigProperties.getProperty("chromedriver");
    public static RegPage regPage;
    public static FullRegPage fullRegPage;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", PATH_CHROME_DRIVER);
        chromeDriver = new ChromeDriver();
        regPage = new RegPage(chromeDriver);
        fullRegPage = new FullRegPage(chromeDriver);

        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        chromeDriver.get(ConfigProperties.getProperty("registrationPage"));

    }

    @AfterClass
    public static void close() {
        chromeDriver.quit();
    }
}
