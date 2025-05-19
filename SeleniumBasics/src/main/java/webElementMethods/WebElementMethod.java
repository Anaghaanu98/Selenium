package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement button =driver.findElement(By.xpath("//button[@id='button-one']"));
		button.click();
		String text =button.getText();
		System.out.println(text);
		
		WebElement text1 =driver.findElement(By.xpath("//label[text()='Enter Message']"));
		String print=text1.getText();
		System.out.println(print);
		
		//parent child
		WebElement open5 = driver.findElement(By.xpath("//div[@class='nav-search-field ']//input[@class='nav-input nav-progressive-attribute']"));
		//input[@class='nav-input nav-progressive-attribute']
		//ul[@class='navbar-nav']//li[3]//a
		//ul[@class='navbar-nav']/li[4]/a--can use single slash also if it is immediate child
		
		

	}

}
