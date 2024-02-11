package com.opencart.hook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.cart.base.Base;
import com.cart.pageobject.AccountSuccessPage;
import com.cart.pageobject.HomePage;
import com.cart.pageobject.LoginPage;
import com.cart.pageobject.MyAccountPage;
import com.cart.pageobject.RegisterPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	AccountSuccessPage accSuccPage;
	MyAccountPage myAccPage;
	RegisterPage registerPage;

	@Before
	public void setUp() throws IOException {
		Base.setUp();
	}

	@After
	public void tearUp() {
		Base.tearDown();
	}

}
