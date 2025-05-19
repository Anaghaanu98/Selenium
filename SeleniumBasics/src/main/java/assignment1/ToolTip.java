package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		
		WebElement tab =driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook')]"));
		String attribute = tab.getAttribute("title");
		System.out.println(attribute);
		
		WebElement tab1 =driver.findElement(By.id("windowMulti"));
		String attribute1 = tab1.getAttribute("title");
		System.out.println(attribute1);

	}

}
