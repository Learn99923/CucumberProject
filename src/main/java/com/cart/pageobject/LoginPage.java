package com.cart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement login;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warnMassage;

	public void enterEmailAdress(String e_mail) {
		email.sendKeys(e_mail);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public MyAccountPage clickOnLoginButton() {
		login.click();
		return new MyAccountPage(driver);
	}

	public String getWarnMassage() {
		String text = warnMassage.getText();
		return text;
	}

	public String getTitleOfLoginPage() {
		String title = driver.getTitle();
		return title;
	}
}