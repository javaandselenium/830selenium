package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

driver.findElement(By.id("ಪಾಸ್‌ವರ್ಡ್ ಮರೆತಿರುವಿರಾ?")).click();
driver.findElement(By.id("identify_email")).sendKeys("765786756378w76");
driver.findElement(By.id("did_submit")).click();

	}

}
