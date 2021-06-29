package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
	public void forgotpassword() {
		driver.findElement(By.xpath("//a[text()='ಪಾಸ್‌ವರ್ಡ್ ಮರೆತಿರುವಿರಾ?']")).click();
		driver.findElement(By.id("identify_email")).sendKeys("grfghg");
		driver.findElement(By.id("did_submit")).click();
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
	}
	
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
	
	

}
