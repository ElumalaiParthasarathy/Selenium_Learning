import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseForCreatingFacebookAccount {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\eluma\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();
		//calling the website 
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);

		WebElement fname =  driver.findElement(By.name("firstname"));
		fname.sendKeys("Selenium");	
		Thread.sleep(1000);

		WebElement sname =  driver.findElement(By.name("lastname"));
		sname.sendKeys("java");
		Thread.sleep(1000);

		WebElement rMail =  driver.findElement(By.name("reg_email__"));
		rMail.sendKeys("elumalai.career@gmail.com");
		Thread.sleep(1000);

		WebElement rcMail = driver.findElement(By.name("reg_email_confirmation__"));
		rcMail.sendKeys("elumalai.career@gmail.com");

		WebElement passWord =  driver.findElement(By.name("reg_passwd__")); 
		passWord.sendKeys("Password@1");
		Thread.sleep(1000);

		WebElement bDay =  driver.findElement(By.id("day"));
		bDay.sendKeys("23");
		Thread.sleep(1000);

		WebElement bMonth =  driver.findElement(By.id("month"));
		bMonth.sendKeys("Apr");
		Thread.sleep(1000);

		WebElement bYear =  driver.findElement(By.id("year"));
		bYear.sendKeys("1999");
		Thread.sleep(1000);

		List<WebElement> findElements = driver.findElements(By.name("sex"));

		for (WebElement e : findElements) {				//accessing radio button
			if(e.getAttribute("value").equalsIgnoreCase("2")) {
				e.click();
			}
		}

		driver.findElement(By.name("websubmit")).click();

		driver.navigate().to("https://www.facebook.com/");

		WebElement fbloginid  = driver.findElement(By.id("email"));
		fbloginid.sendKeys("elumalai.career@gmail.com");

		Thread.sleep(2000);

		WebElement fbpaasswd = driver.findElement(By.id("pass"));
		fbpaasswd.sendKeys("Password@1");

		WebElement login = driver.findElement(By.name("login"));
		login.click();
		driver.manage().window().fullscreen();
		Thread.sleep(3000);

		driver.close();

	}

}
