import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/jasmynmedina/chromedriver_mac64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Monica Geller");
		driver.findElement(By.name("email")).sendKeys("MonicaGeller@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password123");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(dropdown);
		gender.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("02/14/2000");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector("div.alert-dismissible")).getText());
		driver.close(); 
	}

}
