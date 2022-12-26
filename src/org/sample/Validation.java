package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Validation {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudharsan p\\Desktop\\trello\\Trello\\drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.get("https://trello.com/");
		
		
		WebElement login = driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI')]//a[text()='Log in']"));
		login.click();
		
		WebElement email = driver.findElement(By.xpath("//div[@class='email-password']//div[@class='hide-when-two-factor']//input[contains(@name,'user')]"));
		email.sendKeys("jagadeeshnr1996@gmail.com");
		
		WebElement con = driver.findElement(By.xpath("//input[@value='Continue']"));
		con.click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9566957787");
		
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
//		WebElement signUp = driver.findElement(By.xpath("//span[text()='Sign up']"));
		
		
		
		driver.findElement(By.xpath("//p[text()='Create']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Create board']")).click();
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New Board");
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		
		WebElement list = driver.findElement(By.xpath("//input[@class='list-name-input']"));
		list.sendKeys("List A");
		
		driver.findElement(By.xpath("//input[@value='Add list']")).click();
		
		
		driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("List B");
		
		driver.findElement(By.xpath("//input[@value='Add list']")).click();
		
		driver.findElement(By.xpath("//span[text()='Add a card']")).click();
		
		driver.findElement(By.xpath("//textarea[contains(@placeholder,'Enter a title for ')]")).sendKeys(" Added some statment in the card");
		
		driver.findElement(By.xpath("//span[text()='Workspaces']")).click();
		
		driver.findElement(By.xpath("//span[text()='Workspaces']")).click();
		
		
		
		Actions a = new Actions(driver);
		
		
		WebElement source = driver.findElement(By.xpath("//span[@dir='auto']"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='list-card-details js-card-details']"));
		
		a.dragAndDrop(source, dest).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
