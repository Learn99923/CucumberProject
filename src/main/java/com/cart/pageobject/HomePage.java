package com.cart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement dropDown;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	public void clickOnMyAccountDropDownMenu() {
		dropDown.click();
	}

	public RegisterPage clickOnRegisterOption() {
		register.click();
		return new RegisterPage(driver);
	}

	public LoginPage clickOnLoginOption() {
		login.click();
		return new LoginPage(driver);


	}
}