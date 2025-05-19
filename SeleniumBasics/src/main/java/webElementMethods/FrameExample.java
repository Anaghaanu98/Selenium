package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//cannot access i frame directly
		
		//driver.switchTo().frame(1);//declaring i frame based on index--search 'iframe' in find button
		//driver.switchTo().frame("a077aa5e");//declaring based on id/name attribute
		
		//for webelement ,declare it and pass it below
		WebElement iframe =driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(iframe);
		
		WebElement jmeter =driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		//jmeter.click();
		driver.switchTo().defaultContent();//to switch back to default content

	}

}
