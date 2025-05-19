package keyboardAndMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement login =driver.findElement(By.xpath("//span[text()='Login']"));
		//class for mouse interaction
		Actions actions = new Actions(driver);
		actions.moveToElement(login).build().perform();//to move mouse
		actions.click().build().perform();//to click on the place wherever the mouse cursor is present currently--without parameter
		
		actions.click().build().perform();//need to pass webelement and it will click on that---with parameter
		

	}

}
