package testngproject.Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Deletingaccount {
	
@Test
	void eraseaccount()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		
	
				String data = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();
				System.out.println(data);
				
				driver.findElement(By.name("email")).sendKeys("liabernard210812134@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Dayana123");
				
				driver.findElement(By.className("btn-default")).submit();
				
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
		
}
}
