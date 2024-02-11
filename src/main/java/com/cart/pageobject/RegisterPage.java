package com.cart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "firstname")
	private WebElement firstname;

	@FindBy(name = "lastname")
	private WebElement lastname;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "telephone")
	private WebElement telephone;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "confirm")
	private WebElement confirmPassword;

	@FindBy(name = "//input[@name='newsletter' and @value='1']")
	private WebElement newsletterYes;

	@FindBy(xpath = "//input[@name='newsletter' and @value='0']")
	private WebElement newsletterNo;

	@FindBy(name = "agree")
	private WebElement agreeOption;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(name = "//div[text()='Warning: You must agree to the Privacy Policy!']")
	private WebElement privacyWarnMass;

	@FindBy(name = "//div[text()='First Name must be between 1 and 32 characters!']")
	private WebElement firstnameWarnMass;

	@FindBy(name = "//div[text()='Last Name must be between 1 and 32 characters!']")
	private WebElement lastnameWarnMass;

	@FindBy(name = "//div[text()='E-Mail Address does not appear to be valid!']")
	private WebElement emailWarnMass;

	@FindBy(name = "//div[text()='Telephone must be between 3 and 32 characters!']")
	private WebElement telephoneWarnMass;

	@FindBy(name = "//div[text()='Password must be between 4 and 20 characters!']")
	private WebElement passwordWarnMass;

	public void enterFirstName(String fname) {
		firstname.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		lastname.sendKeys(lname);
	}

	public void enterEmail(String e_mail) {
		email.sendKeys(e_mail);
	}

	public void enterTelephone(String phone) {
		telephone.sendKeys(phone);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void enterConfirmPassword(String confirmPass) {
		confirmPassword.sendKeys(confirmPass);
	}

	public void selectNewsLetterOptionYes() {
		boolean yes = newsletterYes.isSelected();
		if (!yes)
			newsletterYes.click();
	}

	public void selectNewsLetterOptionNo() {
		boolean yes = newsletterNo.isSelected();
		if (!yes)
			newsletterNo.click();
	}

	public void selectPrivacyPolicy() {
		agreeOption.click();
	}

	public AccountSuccessPage clickOnContinueButton() {
		continueButton.click();
		return new AccountSuccessPage(driver);
	}

	public String getTitleOfRegisterPage() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getFirstnameWarnMassage() {
		String text = firstnameWarnMass.getText();
		return text;
	}
	
	public String getLastnameWarnMassage() {
		String text = lastnameWarnMass.getText();
		return text;
	}
	public String getEmailWarnMassage() {
		String text = emailWarnMass.getText();
		return text;
	}
	public String getTelephoneWarnMassage() {
		String text = telephoneWarnMass.getText();
		return text;
	}
	public String getPasswordWarnMassage() {
		String text = passwordWarnMass.getText();
		return text;
	}
	
	public String getPrivacyWarnMassage() {
		String text = privacyWarnMass.getText();
		return text;
	}
	


}