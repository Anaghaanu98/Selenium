package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListErrorMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
	
		WebElement submit =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submit.click();
		List<WebElement> errorMessage =driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		//int total =errorMessage.size();
		
		for(int i=0;i<errorMessage.size();i++)
		{
			System.out.println(errorMessage.get(i).getText());
		}

	}

}
