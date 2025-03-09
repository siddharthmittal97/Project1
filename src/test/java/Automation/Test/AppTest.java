package Automation.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	
	@Test
	public void Test()
	{
		ChromeOptions obj = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(obj);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
}