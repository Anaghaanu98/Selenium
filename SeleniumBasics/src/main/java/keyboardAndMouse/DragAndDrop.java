package keyboardAndMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement bank =driver.findElement(By.xpath("//li[@id='credit2']//a"));
		WebElement space = driver.findElement(By.xpath("//ol[@id='bank']//li"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(bank, space).build().perform();//performs drag and drop function

	}

}
