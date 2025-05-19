package keyboardAndMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		Actions action = new Actions(driver);
		action.sendKeys(search,"bag").build().perform();//entering the field using action class
		action.keyDown(Keys.ENTER).build().perform();//for clicking enter using action class
		//search.sendKeys(Keys.ENTER);
		

	}

}
