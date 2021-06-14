package waitingStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("actiTIME -  Enter Time-Track")) {
			System.out.println("Pass:Home page is displayed");
		}
		
		else
		{
			System.out.println("Fail:Home page is not displayed");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();

	}


	}


