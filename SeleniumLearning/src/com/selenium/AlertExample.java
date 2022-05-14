package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eluma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		WebElement confrimBoxAlert = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confrimBoxAlert.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert2.dismiss();
		
		
		WebElement promptBoxAlert = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptBoxAlert.click();
		Alert promptBoxHandle = driver.switchTo().alert();
		promptBoxHandle.sendKeys("Vicky");
		Thread.sleep(1000);
		promptBoxHandle.accept();
		
		driver.quit();
		
		
		
		
		
	}

}
