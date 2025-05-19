package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//to choose file the tag must be input
		WebElement file = driver.findElement(By.id("file-upload"));
		String path = "C:\\Users\\anakh\\OneDrive\\Documents\\sign.jpg";
		file.sendKeys(path);

	}

}
