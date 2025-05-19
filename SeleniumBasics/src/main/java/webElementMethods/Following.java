package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//url("https://selenium.qabible.in/simple-form-demo.php")
		
		//following:to navigate the following element-//a[@href='index.php']//img//following::button[@id='button-one']
		//preceeding: to navigate the preceeding element-//button[@id='button-one']//preceding::a[@href='index.php']//img
		
		//use case--check box url
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		String checkBoxName ="Check Box One";
		//WebElement checkbox =driver.findElement(By.xpath("//label[contains(text(),'Check Box Three')]//preceding-sibling::input"));
		//by using concatination below
		WebElement checkBox =driver.findElement(By.xpath("//label[contains(text(),'"+checkBoxName+"')]//preceding-sibling::input"));
		checkBox.click();
		String value =checkBox.getTagName();
		System.out.println(value);
		
		int x =checkBox.getLocation().getX();//to get the x and y cordinates of the element
		int y =checkBox.getLocation().getY();
		System.out.println(x);
		

	}

}
