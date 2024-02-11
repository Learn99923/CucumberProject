package com.opencart.stepsdefination;

import org.openqa.selenium.WebDriver;

import com.cart.base.Base;
import com.cart.pageobject.AccountSuccessPage;
import com.cart.pageobject.HomePage;
import com.cart.pageobject.LoginPage;
import com.cart.pageobject.MyAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login {

	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	AccountSuccessPage accSuccPage;
	MyAccountPage myAccPage;

	@Given("User navigates on login page")
	public void user_navigates_on_login_page() {
		driver = Base.getDriver();
		homePage = new HomePage(driver);
		homePage.clickOnMyAccountDropDownMenu();
		loginPage = homePage.clickOnLoginOption();

	}

	@When("User enters valid email {string} into email field")
	public void user_enters_valid_email_into_email_field(String string) {
		loginPage.enterEmailAdress(string);
	}

	@When("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String string) {
		loginPage.enterPassword(string);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		myAccPage = loginPage.clickOnLoginButton();
	}

	@Then("User should get logged in succefully")
	public void user_should_get_logged_in_succefully() {
		Assert.assertEquals(myAccPage.getTitleOfMyAccountPage(), "My Account");
	}

	@Then("User should navigate on my account page")
	public void user_should_navigate_on_my_account_page() {
		Assert.assertEquals(myAccPage.getTitleOfMyAccountPage(), "My Account");

	}

	@When("User enters invalid email {string} into email field")
	public void user_enters_invalid_email_into_email_field(String string) {
		loginPage.enterEmailAdress(string);

	}

	@When("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String string) {
		loginPage.enterPassword(string);
	}

	@Then("User should not get logged in succefully")
	public void user_should_not_get_logged_in_succefully() {
		Assert.assertEquals("Account Login", loginPage.getTitleOfLoginPage());

	}

	@Then("User should display warning massage {string}")
	public void user_should_display_warning_massage(String string) {
		Assert.assertEquals(loginPage.getWarnMassage(), string);

	}
}