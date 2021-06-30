package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	public WebDriver driver;
	@Parameters({"browsername"})
	@Test
	public void demo(String browser) {
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("jhgjgs");
	driver.findElement(By.id("pass")).sendKeys("jhghjh");
	driver.findElement(By.name("login")).click();
	String t = driver.getTitle();
	Reporter.log(t,true);
	}

}
