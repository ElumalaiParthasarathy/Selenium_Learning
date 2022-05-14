package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eluma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//Finding the textbox and entering the meassage or text
		driver.findElement(By.id("email")).sendKeys("Elumalaiparthasarthy@yahoo.com"); 
		
		//appending the text which is in textbox
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys(" "+"hi");
		
		//printing out the text which is in textbox
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		
		//checking weather the textbox is enabled or disabled
		WebElement x =	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		x.clear();
		boolean check =	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input")).isEnabled();
		if(check == true) {
			System.out.println("The text box is enabled");
		}else {
			System.out.println("The text box is disabled");
		}
		driver.close();
	}

}
