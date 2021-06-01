import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadWindowPopUp {

	
	/*
	 * Button : ChooseFile it will open a desktop window but selenium cant handle
	 * this one so use sendkeys instead of click as while click it will lost For
	 * upload or choose file button , type=file is mandatory when u inspect it
	 */
	  
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/sanka/Documents/ChromeDriverEXE/new/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\sanka\\Documents\\selenium notes\\Linux\\sank.txt");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
		
		
		

	}

}
