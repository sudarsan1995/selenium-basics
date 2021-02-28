import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click(); //click on the indian armed forces checkbox
		
		
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());// validating checkbox selected or nto 
		
		//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size()); // validating how many checkboxes available in page
		
		
	}

}
