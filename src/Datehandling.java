import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Datehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
			
			//driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5");
			
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			{
				System.out.println("non editable for end users");
				//Assert.assertTrue(true);
			}
			
			else
			{
				System.out.println("editable for end users");
				//Assert.assertTrue(false);
				
			}
			
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("editable for end users");
				//Assert.assertTrue(true);
			}
			
			else
			{
				System.out.println("non editable for end users");
				//Assert.assertTrue(false);
			}
				
			
	}

}
