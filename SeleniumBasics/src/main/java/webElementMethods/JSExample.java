package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6000)");//scrolls the page till 6000 index(x,y coordinates)
		
		WebElement button =driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _517i _517h _51sy']"));
		js.executeScript("arguments[0].scrollIntoView();", button);//scrolls the page till the element
		
		//click using js executor
		js.executeScript("arguments[0].click();",button);
		

	}

}
