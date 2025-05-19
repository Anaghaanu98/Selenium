package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//identifying web element for login button
		
//		WebElement login = driver.findElement(By.name("login"));//identified using name locator
//		login.click();//for clicking the button
//		
//		//driver.quit();//close all windows
//		//driver.close();//close cuurrent window
//		
//		//locating using id locator
//		WebElement email =driver.findElement(By.id("email"));
//		email.sendKeys("anaghass998@gmail.com");
		
		//locating using linktext
		WebElement forgotLink = driver.findElement(By.linkText("Forgotten password?"));
		forgotLink.click();
		
		//locating using partiallink
		driver.get("https://www.instagram.com/");
		WebElement insta = driver.findElement(By.partialLinkText("Sign"));
		insta.click();
		

	}

}
