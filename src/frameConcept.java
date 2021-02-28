import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		
		System.out.println("Text" + source.getText());
		
		WebElement target=driver.findElement(By.id("droppable"));
		
		System.out.println("Text" + target.getText());
		
		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent().findElement(By.xpath("//div[@class='demo-list']//ul//li[2]//a")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.xpath("div[class='ui-widget-header ui-droppable']")).getText());
		
	}

}
