package com.automationPractice.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FullRegPage {

    public WebDriver driver;

    public FullRegPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'account-creation_form')]")
    private WebElement accountCreationForm;

    @FindBy(xpath = "//*[contains(@id, 'customer_firstname')]")
    private WebElement FirstName;

    public void setFirstName(String firstName) {
        this.FirstName.sendKeys(firstName);
    }

    @FindBy(xpath = "//*[contains(@id, 'customer_lastname')]")
    private WebElement LastName;

    public void setLastName(String lastName) {
        this.LastName.sendKeys(lastName);
    }

    @FindBy(xpath = "//*[contains(@id, 'passwd')]")
    private WebElement password;

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    @FindBy(xpath = "//*[contains(@id, 'address1')]")
    private WebElement address;

    public void setAddress(String  address) {
        this.address.sendKeys(address);
    }

    @FindBy(xpath = "//*[contains(@id, 'city')]")
    private WebElement city;

    public void setCite(String city) {
        this.city.sendKeys(city);
    }

    @FindBy(xpath = "//*[contains(@id, 'id_state')]")
    private WebElement idState;

    public void setIdState(String idState) {
        this.idState.sendKeys(idState);
    }

    @FindBy(xpath = "//*[contains(@id, 'id_state')]")
    private WebElement postcode;

    public void setPostcode(String postcode) {
        this.postcode.sendKeys(postcode);
    }

    @FindBy(xpath = "//*[contains(@id, 'id_country')]")
    private WebElement country;

    public void setCountry(String country) {
        this.country.sendKeys(country);
    }

    @FindBy(xpath = "//*[contains(@id, 'phone_mobile')]")
    private WebElement phone;

    public void setPhone(String phone) {
        this.phone.sendKeys(phone);
    }

    @FindBy(xpath = "//*[contains(@id, 'submitAccount')]")
    private WebElement Register;

    public void clickRegister() {
        this.Register.click();
    }
}
