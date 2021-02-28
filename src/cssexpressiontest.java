import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssexpressiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
		driver.findElement(By.cssSelector(" input[id*='login']")).sendKeys("Sudarsan");
		driver.findElement(By.xpath("//input[@type='password' and @id='password']")).sendKeys("9600704490");
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
		System.out.println(driver.findElement(By.xpath("//b[text()='Temporary error occured[#5001], please try again.']")).getText());
	}

}
