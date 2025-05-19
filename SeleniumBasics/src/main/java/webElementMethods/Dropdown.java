package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		
		WebElement dropdown =driver.findElement(By.xpath("//span[@role='combobox']//span[1]"));
		dropdown.click();
	    WebElement list =driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		list.sendKeys("Georgia");
		
		WebElement country =driver.findElement(By.xpath("//ul[@role='listbox']//li"));
		country.click();

	}

}
