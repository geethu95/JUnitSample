package JUnitSample.JUnitSample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver; // declared globally as driver is used globally
@Before
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeth\\eclipse-workspace\\JUnitSample\\src\\main\\java\\Resourses\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize(); // maximize the driver
	}
@After
	public void browserQuit() {
		driver.quit();
	}

	public void browserClose() {
		driver.close(); // to close the browser
	}
}

//here browser initialization and loading is done, this can be called in other classes