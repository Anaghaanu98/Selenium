package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabledisabled1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/enabled");
		
		WebElement display =driver.findElement(By.id("disabledInput"));
		boolean value =display.isDisplayed();
		System.out.println(value);//inorder to print the result(true/false)
		
		boolean value1 =display.isEnabled();
		System.out.println(value1);
		
		WebElement display1 = driver.findElement(By.id("input"));
		boolean value2 = display1.isDisplayed();
		System.out.println(value2);
		
		boolean value3 = display1.isEnabled();
		System.out.println(value3);

	}

}
