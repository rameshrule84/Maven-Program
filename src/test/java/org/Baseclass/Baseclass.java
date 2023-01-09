package org.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Baseclass {
	public static WebDriver d;
	public static void browserlanuch() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
	}
	public static void lanuchurl(String url) {
		d.get(url);
	}
	public static void passtxt(WebElement text, String txt) {
		text.sendKeys(txt);
	}
	public static void clicktxt(WebElement press) {
		press.click();
	}
	public static void closebroswer() {
d.quit();
	}
}
