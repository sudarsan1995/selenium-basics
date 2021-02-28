import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click(); //click on the indian armed forces checkbox
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());// validating checkbox selected or nto 
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size()); // validating how many checkboxes available in page
		System.out.println(driver.findElement(By.xpath("//label[text()=' Indian Armed Forces']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//label[text()=' Indian Armed Forces']")).getText(),"Indian Armed Forces");
	}

}
