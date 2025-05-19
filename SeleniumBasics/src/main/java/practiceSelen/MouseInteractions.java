package practiceSelen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement tab =driver.findElement(By.xpath("//div[@class='nav-div']//a[contains(@class,'nav-a nav-a-2   nav-progressive-attribute')]"));
		Actions action = new Actions(driver);
		//To automate the mouse movement
		action.moveToElement(tab).build().perform();
		
		//to enter something in capital letter in serach bar
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//TO right click
		action.moveToElement(search).contextClick().build().perform();

	}

}
