package com.opencart.stepsdefination;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cart.base.Base;
import com.cart.pageobject.AccountSuccessPage;
import com.cart.pageobject.HomePage;
import com.cart.pageobject.LoginPage;
import com.cart.pageobject.MyAccountPage;
import com.cart.pageobject.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	AccountSuccessPage accSuccPage;
	MyAccountPage myAccPage;
	RegisterPage registerPage;

	@Given("User navigates on register page")
	public void user_navigates_on_register_page() {
		driver = Base.getDriver();
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.clickOnMyAccountDropDownMenu();
		registerPage = homePage.clickOnRegisterOption();

	}

	@When("User enters valid firstname {string} into firstname field")
	public void user_enters_firstname_into_firstname_field(String string) {
		registerPage.enterFirstName(string);
	}

	@When("User enters valid lastname {string} into lastname field")
	public void user_enters_lastname_into_lastname_field(String string) {
		registerPage.enterLastName(string);
	}

	@When("User enters valid confirm password {string} into confirm password field")
	public void user_enters_confirm_password_into_confirm_password_field(String string) {
		registerPage.enterConfirmPassword(string);
	}

	@When("User selects privacy policy option")
	public void user_selects_privacy_policy_option() {
		registerPage.selectPrivacyPolicy();
	}

	@Then("User should get registerd succesfully")
	public void user_should_get_registerd_succesfully() {
		System.out.println(driver.getPageSource());
		Assert.assertEquals("Your Account Has Been Created!", accSuccPage.getTitleOfAccountSuccPage());

	}

	@Then("User should navigate on account success page")
	public void user_should_navigate_on_account_success_page() {
		Assert.assertEquals("Your Account Has Been Created!", accSuccPage.getTitleOfAccountSuccPage());

	}

	@When("User enters valid telephone {string} into telephone field")
	public void user_enters_valid_telephone_into_telephone_field(String string) {
		registerPage.enterTelephone(string);
	}

	@When("User selects newsletter option")
	public void user_selects_newsletter_option() {
		registerPage.selectNewsLetterOptionYes();
	}

	@When("clicks on register button")
	public void clicks_on_register_button_from_register_page() {
		accSuccPage = registerPage.clickOnContinueButton();
	}

	@When("User enters invalid firstname {string} into firstname field")
	public void user_enters_invalid_firstname_into_firstname_field(String string) {
		registerPage.enterFirstName(string);
	}

	@When("User enters invalid lastname {string} into lastname field")
	public void user_enters_invalid_lastname_into_lastname_field(String string) {
		registerPage.enterLastName(string);
	}

	@When("User enters valid email {string} into email field of register page")
	public void user_enters_valid_email_into_email_field(String string) {
		loginPage.enterEmailAdress(string);
	}

	@When("User enters valid password {string} into password field of register page")
	public void user_enters_valid_password_into_password_field(String string) {
		loginPage.enterPassword(string);
	}

	@When("User enters invalid telephone {string} into telephone field")
	public void user_enters_invalid_telephone_into_telephone_field(String string) {
		registerPage.enterTelephone(string);
	}

	@When("User enters invalid confirm password {string} into confirm password field")
	public void user_enters_invalid_confirm_password_into_confirm_password_field(String string) {
		registerPage.enterConfirmPassword(string);
	}

	@Then("User should not get registerd succesfully")
	public void user_should_not_get_registerd_succesfully() {
		Assert.assertEquals("Register Page", registerPage.getTitleOfRegisterPage());

	}

	@Then("User should get following warning massages")
	public void user_should_get_warning_massage(DataTable dataTable) {
		System.out.println("User should get following warning massages");
		Map<String, String> massageList = dataTable.asMap();

		Assert.assertEquals(massageList.get("PrivacyWarn"), null);
		Assert.assertEquals(massageList.get("FirsnameWarn"), null);
		Assert.assertEquals(massageList.get("LastnameWarn"), null);
		Assert.assertEquals(massageList.get("EmailWarn"), null);
		Assert.assertEquals(massageList.get("TelephoneWarn"), null);
		Assert.assertEquals(massageList.get("Passwordwarn"), null);

	}

}
