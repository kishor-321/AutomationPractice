package FormFillPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class Operations extends SeleniumUtility {
	@BeforeTest
	public void BrowserOperation() {
		driver = setUp("chrome", "https://formy-project.herokuapp.com/");
	}

	@Test
	public void PickDropOperations() throws InterruptedException {
		WebElement Pick = driver.findElement(By.xpath("//div//li[5]//a"));
		Pick.click();
		Actions act = new Actions(driver);
		WebElement Fame1 = driver.findElement(By.cssSelector("div[id='image']>img"));
		Thread.sleep(5000);
		WebElement Frame2 = driver.findElement(By.cssSelector("div.ui-widget-header"));
		Thread.sleep(5000);
		act.clickAndHold(Fame1).moveToElement(Frame2).release().build().perform();
		Thread.sleep(5000);
//		act.dragAndDrop(Fame1, Frame2).build().perform();
		System.out.println("drag and drop operation done");
		driver.navigate().back();
	}
	@Test
	public void switchWindow() {
		WebElement SwitchOne = driver.findElement(By.xpath("//div[@Class='jumbotron-fluid']//li//a[text()='Switch Window']"));
		SwitchOne.click();
		WebElement SwotchoneTab = driver.findElement(By.cssSelector("#new-tab-button"));
		SwotchoneTab.click();
//		driver.getWindowHandle().
//		WebElement SwitchtabThree=driver.findElement(By.cssSelector(""));
//		SwitchtabThree.click();
//		
		
		
	}
}
