package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eluma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");


		WebElement selectFromDropDown = driver.findElement(By.id("dropdown1"));

		Select select = new Select(selectFromDropDown);
		select.selectByIndex(1);			//selecting from dropdown list using index
		Thread.sleep(1000);
		
		select.selectByVisibleText("Appium");	//selecting from dropdown list using visibletext
		Thread.sleep(1000);
		
		select.selectByValue("1");			//selecting from dropdown list using by value
		List<WebElement> list = select.getOptions();
		int optionsCountInDropDown = list.size();
		System.out.println("There are "+optionsCountInDropDown+" in the drop down box.");

		WebElement multipleOptions = 
				driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multi = new Select(multipleOptions);
		multi.selectByIndex(1);
		Thread.sleep(1000);
		multi.selectByIndex(2);
		Thread.sleep(1000);
		multi.selectByIndex(3);



	}

}
