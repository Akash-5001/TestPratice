package com.testng;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.findElement(By.name("q")).sendKeys("Rose");
		
		driver.get("            ");
		WebElement element = driver.findElement(By.xpath(""));
		element.click();
	}
//	    Robot r1 = new Robot();
//	    r1.delay(2000);
//	    StringSelection ss = new StringSelection("");
//	    Toolkit.getDefaultToolkit().getSystemclipboard().setContents(ss,null);
//	    r1.keyPress(KeyEvent.VK_CONTROL);
//	    r1.keyPress(KeyEvent.VK_V);
//	    r1.keyRelease(KeyEvent.VK_CONTROL);
//	    r1.keyRelease(KeyEvent.VK_V);
//	    r1.keyPress(KeyEvent.VK_ENTER);
//	    r1.keyRelease(KeyEvent.VK_ENTER);
}
