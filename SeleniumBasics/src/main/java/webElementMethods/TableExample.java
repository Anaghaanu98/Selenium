package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		//For tabel elements;tr is row;th is header
		WebElement officeHead =driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[3]"));
		String text = officeHead.getText();
		System.out.println(text);
		
		WebElement nameHead =driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[1]"));
		String text1 = nameHead.getText();
		System.out.println(text1);
		
		List<WebElement> totalHead = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
		for(int i=0;i<totalHead.size();i++)//prints full heading
		{
			System.out.println(totalHead.get(i).getText());
		}
		System.out.println("**************************************");
		WebElement nameHerrod = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]//td[3]"));
		System.out.println(nameHerrod.getText());
		System.out.println("*************************************");
		List<WebElement> firstColumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(int i=0;i<firstColumn.size();i++)//prints first column
		{
			System.out.println(firstColumn.get(i).getText());
		}
		
		System.out.println("**********************************");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		for(int i=0;i<row.size();i++)//prints first row
		{
			System.out.println(row.get(i).getText());
		}
	
	}

}
