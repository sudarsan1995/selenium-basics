import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.name("username")).sendKeys("Sudarsan");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("9600704490");
		driver.findElement(By.xpath("//input[@name='rememberUn']")).click();
		
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		driver.close();
	}

}
