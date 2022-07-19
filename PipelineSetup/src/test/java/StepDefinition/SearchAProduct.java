package StepDefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchAProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dra Nallely Corona\\Downloads\\NewChromeDriver\\chromedriver.exe");
		Thread.sleep(2000);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.mx/");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		System.out.println("As Expected");
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		action.moveToElement(prime);
		File file = new File("C:\\Users\\Dra Nallely Corona\\Desktop\\Selenium\\sample.png");
		Thread.sleep(2000);
		driver.quit();
	}
}