package com.automationPractice;

import com.automationPractice.config.ConfigProperties;
import com.automationPractice.config.WebDriverSettings;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class FullCorrectRegPage extends WebDriverSettings {

    @Test
    @FileParameters("src/test/java/resources/params")
    public void FullCorrectRegPage(String firstName, String lastName, String password) {

        chromeDriver.get(ConfigProperties.getProperty("registrationPage"));
        chromeDriver.findElement(By.id("email_create")).sendKeys("Inalune@mail.ru");
        chromeDriver.findElement(By.id("SubmitCreate")).click();

        fullRegPage.setFirstName(firstName);
        fullRegPage.setLastName(lastName);
        fullRegPage.setPassword(password);

        fullRegPage.clickRegister();

        String a = chromeDriver.findElement(By.id("account-creation_form")).;
        System.out.println(a);

    }
}
