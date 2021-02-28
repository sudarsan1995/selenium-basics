import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().to("https://in.yahoo.com/?p=us");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		//driver.navigate().back();
		
		//Below code is to sendkeys to the textbox
		
		driver.findElement(By.id("email")).sendKeys("Sudarsan"); 
		driver.findElement(By.name("pass")).sendKeys("9600704490");
		driver.findElement(By.linkText("Forgotten account?")).click();
	
		driver.close();
		
	}

}
