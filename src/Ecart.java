import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Ecart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		
		List <WebElement> p=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<p.size();i++)
		{
			String q=p.get(i).getText();
			
			if(q.contains("Cucumber"));
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
				
			}
			
		}
		
	}

}
