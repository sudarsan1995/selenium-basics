import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExerciseFromLecturer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset//label/input")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset//label/input")).isSelected());
		driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset//label/input")).click();
		
		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset//label/input")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}

}
