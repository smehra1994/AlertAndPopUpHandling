import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/sanka/Documents/ChromeDriverEXE/new/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");   //this wont work
		
		//pass uname and pwd here in url
		driver.get("http//:admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String pagemsg=driver.findElement(By.xpath("//input[@id='tru']")).getText();
		System.out.println(pagemsg);
		
		//Apply assertion if u want
	}

}
