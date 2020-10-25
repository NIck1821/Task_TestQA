package com.automationPractice;

import com.automationPractice.config.ConfigProperties;
import com.automationPractice.config.WebDriverSettings;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


@RunWith(JUnitParamsRunner.class)
public class VoidEmail extends WebDriverSettings {

    @Test
    public void VoidEmailTest() {
        chromeDriver.get(ConfigProperties.getProperty("registrationPage"));

        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("Login - My Store"));
        regPage.clickCreateAnAccount();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create_account_error")));
    }
}
