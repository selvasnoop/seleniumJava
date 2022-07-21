package com.seleniam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "home/selvaraj/eclipse-workspace/selenium/src/lib/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com/");

	}

}
