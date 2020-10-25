package com.automationPractice.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {

    public WebDriver driver;

    public RegPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'email_create')]")
    private WebElement emailAddress;

    @FindBy(xpath = "//*[contains(@id, 'SubmitCreate')]")
    private WebElement createAnAccount;

    public void setEmailAddress(String emailAddress) {
        this.emailAddress.sendKeys(emailAddress);
    }

    public void clickCreateAnAccount() {
        this.createAnAccount.click();
    }

}

