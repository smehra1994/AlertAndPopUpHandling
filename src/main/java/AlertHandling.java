import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users/sanka/Documents/ChromeDriverEXE/new/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit' and @name='proceed']")).click();
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		String text=alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct Alert Message");
		}
		else
		{
			System.out.println("Incorrect Alert");
		}
		alert.accept();
		//alert.dismiss();
		//alert.sendKeys("");
		
		driver.quit();
		

	}

}
