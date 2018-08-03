package Script;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://elivein.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/button")).click(); // Absolute xpath
		
		driver.findElement(By.xpath("//*[@href='/account/Login']")).click();
	
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("eliveindemo.member1@elivein.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Elivein@37");
		
		driver.findElement(By.xpath("//button[@class='vendorLoginBtn']")).click();
		
		
	WebElement	w= driver.findElement(By.xpath("//li[@class='visitor']"));
	Select s=new Select(w);
	//List <WebElement> f= s.getOptions();
	//System.out.println(f.get);
	s.selectByIndex(0 );
	System.out.println(s.getOptions());
	
		//System.out.println(w.get(2).getText());
		//driver.findElement(By.xpath("//a[@href='GateKeeper/GateKeeper/AddVisitor']")).click();
		
	}

}
