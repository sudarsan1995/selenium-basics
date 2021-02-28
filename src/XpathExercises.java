import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Sudarsan");
		driver.findElement((By.xpath("//*[@id=\'pass\']"))).sendKeys("9600704490");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
	}

}
