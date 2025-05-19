package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		//to get the value of any attribute in the tag
		WebElement message = driver.findElement(By.id("button-one"));
		String attributeValue1 = message.getAttribute("id");
		String attributeValue2 = message.getAttribute("class");
		System.out.println(attributeValue1);
		System.out.println(attributeValue2);
		
		//to get the backgroundcolour of the tab- result will be in code
		String backgroundColour =message.getCssValue("background-color");
		System.out.println(backgroundColour);
		
		//colour of the text
		String Colour = message.getCssValue("color");
		System.out.println(Colour);
		
		//
		String fontSize = message.getCssValue("font-size");
		System.out.println(fontSize);
		
		String fontStyle = message.getCssValue("font-style");
		System.out.println(fontStyle);
		
		//to get the value of tooltip
		/*driver.get("https://www.amazon.in/");
		WebElement toolTip = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		String attributeValue3 =toolTip.getAttribute("title");
		System.out.println(attributeValue3);
		
		driver.get("https://demo.guru99.com/test/social-icon.html");
		WebElement toolTip1 = driver.findElement(By.xpath("//a[@class='you-tube']"));
		String attributeValue4 = toolTip1.getAttribute("title");
		System.out.println(attributeValue4);*/

	}

}
