package com.automationPractice;

import com.automationPractice.config.ConfigProperties;
import com.automationPractice.config.WebDriverSettings;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


@RunWith(JUnitParamsRunner.class)
public class EmailCorrectTest extends WebDriverSettings {

    @Test
    @Parameters({
            "Inalune@mail.ru",
            "324423432@mail.ru",
            "Ina.lune@mail.ru",
            "         ",
    })
    public void CorrectTest(String email) {
        chromeDriver.get(ConfigProperties.getProperty("registrationPage"));

        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("Login - My Store"));
        regPage.setEmailAddress(email);
        regPage.clickCreateAnAccount();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account-creation_form")));
    }

}
