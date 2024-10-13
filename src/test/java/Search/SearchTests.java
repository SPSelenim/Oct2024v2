package Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POMSearch.pomSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTests {

	public WebDriver driver = null;

	@BeforeSuite
	public void setUp() {
		String path = "file:///D:/SeleniumAutomation/05DemoApps/demo.html";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(path);
	}

	@Test
	public void f() {

		driver.manage().window().maximize();
		try {
			pomSearch ss = new pomSearch(driver);
			ss.sendFName("x1");
			Thread.sleep(2000);

			ss.sendLName("Y1");

			ss.clickQA();
			Thread.sleep(2000);

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
