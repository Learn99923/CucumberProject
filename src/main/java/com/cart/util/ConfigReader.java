package com.cart.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import io.cucumber.java.Scenario;

public class ConfigReader {

	public static Properties readProperties() throws IOException {
		Properties prop = new Properties();
		String filePath = System.getProperty("user.dir") + "//Configuration//Config.properties";
		FileInputStream fis = new FileInputStream(new File(filePath));
		prop.load(fis);
		return prop;
	}

	public static String takeScreenshot(WebDriver driver,Scenario scenario) throws IOException {
		WebDriver drivers = driver;
		TakesScreenshot take = (TakesScreenshot) drivers;
		File src = take.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\Screenshots\\" + scenario.getName()
				+ Javautil.generateTimeStamp() + ".png";
		File des = new File(path);
		Files.copy(src, des);

		return path;
	}

}
