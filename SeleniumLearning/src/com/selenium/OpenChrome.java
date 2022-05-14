package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eluma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		//calling the website 
		driver.get("https://www.google.com/");
		//Finding the element and interacting with it
		driver.findElement(By.name("q")).sendKeys("gokul"+Keys.ENTER);
		driver.findElement(By.partialLinkText(" Wikipedia")).click();;
		driver.close();
	}

}
