package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("username"));
		
		if(ele.isDisplayed()) {
			System.out.println("Pass:The element is diplayed");
			ele.sendKeys("gfgfhghghg");
		}
		else
		{
			System.out.println("Fail:The element is not displayed");
		}
		
		driver.close();

	}

}
