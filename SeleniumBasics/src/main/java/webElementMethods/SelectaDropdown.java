package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectaDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//to get the webelements having select tag
		WebElement selectTag = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(selectTag);
		select.selectByIndex(2);
		
		select.selectByValue("search-alias=beauty");
		select.selectByVisibleText("Amazon Pharmacy");
	    
		//to get all the list of options available
		List<WebElement> options=select.getOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		//select the options without a select tag
		//https://selenium.qabible.in/jquery-select.php

	}

}
