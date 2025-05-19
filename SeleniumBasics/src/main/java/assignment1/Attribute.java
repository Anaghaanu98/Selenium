package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		
		WebElement logo =driver.findElement(By.xpath("//a[@href='index.php']//img"));
		String attribute =logo.getAttribute("src");
		System.out.println(attribute);

	}

}
