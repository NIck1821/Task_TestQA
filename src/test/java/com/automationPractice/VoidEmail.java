package com.automationPractice;

import com.automationPractice.config.WebDriverSettings;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class VoidEmail extends WebDriverSettings {

    @Test
    public void VoidEmailTest() {
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("Login - My Store"));
        regPage.clickCreateAnAccount();
    }
}
