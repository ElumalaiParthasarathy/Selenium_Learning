package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTabExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eluma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String homepage =	driver.getWindowHandle();   //returns the current window
		
		WebElement openHomePage = driver.findElement(By.id("home"));
		openHomePage.click();
		
		 Set<String> handles	= driver.getWindowHandles();
		 
		 for (String newwindow : handles) {;
			driver.switchTo().window(newwindow);
		 }
		 
		 WebElement editButton = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		 editButton.click();
		 driver.close();
		 
		 driver.switchTo().window(homepage);
		 
		 WebElement openMultiWindows = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		 openMultiWindows.click();
		 
		 int numberOfTabs	= driver.getWindowHandles().size();
		 System.out.println(numberOfTabs);
		 
		 
		 WebElement dontCloseMe = driver.findElement(By.id("color"));
		 dontCloseMe.click();
		 
		 Set <String> newWindowHandles  = driver.getWindowHandles();
		 for (String allWnidows : newWindowHandles) {
			 
			 if(!allWnidows.equals(homepage)) {
				 driver.switchTo().window(allWnidows);
				 driver.close();
			 }
			
		}
		driver.quit();
		 
	}

}
