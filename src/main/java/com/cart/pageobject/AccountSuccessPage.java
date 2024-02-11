package com.cart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {

	WebDriver driver;

	public AccountSuccessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTitleOfAccountSuccPage() {
		String title = driver.getTitle();
		return title;
	}

}
