package waitingStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.name("username")).sendKeys("rjhgfsggg");
	driver.findElement(By.name("password")).sendKeys("rhgjhgjgg");
	driver.findElement(By.xpath("//div[contains(@class,'Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3')]")).click();
	

	}

}
