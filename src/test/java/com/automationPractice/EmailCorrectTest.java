package com.automationPractice;

import com.automationPractice.config.WebDriverSettings;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class EmailCorrectTest extends WebDriverSettings {

    @Test
    @Parameters({
            "Inalune@mail.ru",
            "324423432@mail.ru",
            "Ina.lune@mail.ru",
    })
    public void CorrectTest(String email) {
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("Login - My Store"));
        regPage.setEmailAddress(email);
        regPage.clickCreateAnAccount();
    }

    @Test
    public void VoidEmailTest() {
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("Login - My Store"));
        regPage.clickCreateAnAccount();
    }
}
