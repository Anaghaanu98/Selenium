package keyboardAndMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement search =driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		//search.sendKeys("Shoes"+Keys.ENTER);//performs the enter function of keyboard
		search.sendKeys("Shoes");
		search.sendKeys(Keys.BACK_SPACE);
		search.sendKeys(Keys.chord(Keys.CONTROL,"A"));//to select the entered input
		search.sendKeys(Keys.BACK_SPACE);
		

	}

}
