package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigLoader;

public class DriverFactory {

	
	public static WebDriver intializedriver()
	{
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//		
		
		//driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(ConfigLoader.getInstance().getProperty("baseurl"));;
		return driver;
	}
	
	
	

}
