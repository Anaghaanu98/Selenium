package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		List<WebElement> headerElements= driver.findElements(By.xpath("//ul[@class='navbar-nav']//a"));
		int value = headerElements.size();
		System.out.println(value);
		
		for(int i=0;i<headerElements.size();i++)
		{
			System.out.println(headerElements.get(i).getText());
		}
		
		for(WebElement header:headerElements)
		{
			System.out.println(header.getText());
		}

	}

}
