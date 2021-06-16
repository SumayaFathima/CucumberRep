package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername ) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Drivers\\chromedriver.exe"));
				driver = new ChromeDriver();
			}else if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + ("\\Driver\\edgedriver.exe"));
				driver = new EdgeDriver();
			}else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	driver.manage().window().maximize();
	return driver;
	}	
	
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public static void click(WebElement element) {
		element.click();

	}
	public static void InputElement(WebElement element, String Input) {
		element.sendKeys(Input);
	}		
	
	public static void mousehover(WebElement element) {
		
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	
	public static void selection(WebElement element, String Option, String value) {
		Select sc = new Select(element);

		try {
			if (Option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				sc.selectByValue(value);
			} else if (Option.equalsIgnoreCase("byVisibleText")) {
				sc.selectByVisibleText(value);
			} else {
				System.out.println("Invalid option");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}