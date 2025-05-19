package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		
		List<WebElement> checkbox =driver.findElements(By.xpath("//input[@class='check-box-list']"));
		int size = checkbox.size();
		for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
			boolean value =checkbox.get(i).isSelected();
			System.out.println(value);
		}
		

	}

}
