package nactet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wapp {

	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com/");
		
		
	}

	@Test
	public void test()
	{
		
	WebElement resourcesDropdown= driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span"));	
	resourcesDropdown.click();
		
	WebElement technologies = driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[2]"));
    technologies.click();

		
    WebElement shopify = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span"));
    shopify.click();

    
    WebElement createLeadist = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span"));
    createLeadist.click();


    WebElement technologiesss = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div[1]/div/div[1]/button/span"));
    technologiesss.click();


















	}
















}
