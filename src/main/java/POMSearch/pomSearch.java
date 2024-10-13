package POMSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomSearch {

	WebDriver driver = null;
	String f = "fname";
	String l = "lname";
	String q = "//a[@name='QA']";

	public pomSearch(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement FName() {
		WebElement f1;
		f1 = driver.findElement(By.id(f));
		return f1;
	}

	public WebElement LName() {
		WebElement l1;
		l1 = driver.findElement(By.id(l));
		return l1;
	}

	public WebElement qa() {
		WebElement q1;
		q1 = driver.findElement(By.xpath(q));
		return q1;
	}

	public void sendFName(String FN) {
		FName().sendKeys(FN);
	}

	public void sendLName(String LN) {
		LName().sendKeys(LN);
	}

	public void clickQA() {
		qa().click();
	}

}
