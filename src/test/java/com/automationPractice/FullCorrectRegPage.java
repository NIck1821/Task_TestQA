package com.automationPractice;

import com.automationPractice.config.ConfigProperties;
import com.automationPractice.config.WebDriverSettings;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


@RunWith(JUnitParamsRunner.class)
public class FullCorrectRegPage extends WebDriverSettings {

    @Test
    @FileParameters("src/test/java/resources/params")
    public void FullCorrectRegPage(String firstName, String lastName, String password) {

        chromeDriver.get(ConfigProperties.getProperty("registrationPage"));
        chromeDriver.findElement(By.id("email_create")).sendKeys("Inalune@mail.ru");
        chromeDriver.findElement(By.id("SubmitCreate")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("center_column")));

        fullRegPage.setFirstName(firstName);
        fullRegPage.setLastName(lastName);
        fullRegPage.setPassword(password);

        fullRegPage.clickRegister();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("center_column")));
    }
}
