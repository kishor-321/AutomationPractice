package FormFillPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import Utilities.SeleniumUtility;
public class Form extends SeleniumUtility {
	
	
	@BeforeTest
	public void OpenBrowser() {
		driver=setUp( "chrome", "https://formy-project.herokuapp.com/form");
	}
	@Test
	public void Firstname () throws IOException {

		// 1. File location
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData\\Test Cases for Vtiger.xlsx");
		// 2. Create an instance of required workbook
		XSSFWorkbook x = new XSSFWorkbook(fis);
		// 3. get sheet
		XSSFSheet sheet = x.getSheet("Sheet1");
		// 4. get row
		XSSFRow row = sheet.getRow(1);
		// 5. cell operation
		String cell =row.getCell(2).getStringCellValue();
		System.out.println(cell);
		WebElement firstName= driver.findElement(By.cssSelector("input#first-name"));
		firstName.click();
		driver.switchTo().activeElement().sendKeys(cell);
		System.out.println("InputField is dispalyed :"+firstName.isDisplayed());
		System.out.println("InputField is enable :"+firstName.isEnabled());
		System.out.println("InputField is selected :"+firstName.isSelected());
	}
	@Test 
	public void LastName() throws IOException  {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData\\Test Cases for Vtiger.xlsx");
		XSSFWorkbook x = new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		String cell =row.getCell(4).getStringCellValue();
		System.out.println(cell);
		WebElement firstName= driver.findElement(By.cssSelector("input#last-name"));
		firstName.click();
		driver.switchTo().activeElement().sendKeys(cell);
		System.out.println("LastName is dispalyed :"+firstName.isDisplayed());
		System.out.println("LastName is enable :"+firstName.isEnabled());
		System.out.println("LastName is selected :"+firstName.isSelected());
	}
	@Test 
	public void JobTitle () throws IOException {
		String JobData=".\\src\\test\\resources\\testData\\testAppData.properties";
		FileInputStream path =new FileInputStream(JobData);
		Properties prop =new Properties();
		prop.load(path);
		WebElement enterdata=
 		driver.findElement(By.cssSelector("input#job-title"));
 		driver.findElement(By.cssSelector("input#job-title")).click();
 		enterdata.sendKeys(prop.getProperty("jobTitle"));
 		System.out.println("JobTitle is dispalyed :"+enterdata.isDisplayed());
		System.out.println("JobTitle is enable :"+enterdata.isEnabled());
		System.out.println("JobTitle is selected :"+enterdata.isSelected());
	}
	@Test 
	public void LevelOfSchool () {
		WebElement selectOne = driver.findElement(By.cssSelector("div[class='input-group']>:nth-of-type(2)>#radio-button-1"));
		selectOne.click();
		System.out.println("JobTitle is selectale :"+selectOne.isSelected());
	}
	@Test
	public void Sex () {
		WebElement Sexy = driver.findElement(By.cssSelector("div[class='input-group']>:nth-of-type(3)>#checkbox-2"));
		Sexy.click();
		System.out.println("JobTitle is selectale :"+Sexy.isSelected());
	}
	@Test 
	public void YearOfExperience() {
		WebElement YearOfExperience = driver.findElement(By.cssSelector("select[class='form-control']>:nth-of-type(3)"));
		YearOfExperience.click();
		Select s1=new Select(YearOfExperience);
//		System.out.println("YearOfExperience is Multiselect :"+s1.isMultiple());
//		System.out.println("YearOfExperience is Multiselect :"+YearOfExperience.getSize());
//		System.out.println("YearOfExperience is Multiselect :"+s1.selectByVisibleText());
//		System.out.println("YearOfExperience is Multiselect :"+s1.getFirstSelectedOption());
		
		System.out.println("YearOfExperience is Selectale :"+YearOfExperience.isSelected());
		System.out.println("YearOfExperience is Dispalyed :"+YearOfExperience.isDisplayed());
		System.out.println("YearOfExperience is Editable :"+YearOfExperience.isEnabled());
	}
	@Test 
	public void Date () {
		WebElement Date =driver.findElement(By.cssSelector("input#datepicker"));
		Date.click();
		WebElement Dateclick =driver.findElement(By.cssSelector("div.datepicker-days>table.table-condensed>thead>tr>th.next"));
		Dateclick.click();
		WebElement Datefix =driver.findElement(By.cssSelector("div.datepicker-days>table.table-condensed>tbody>tr>td[data-date='1655337600000']"));
		Datefix.click();

	}
	@Test
	public void submitbtn() {
		WebElement SubmitBtn =driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary"));
		
		String Color=SubmitBtn.getCssValue("color");
		String background=SubmitBtn.getCssValue("background-color");
		String padding=SubmitBtn.getCssValue("padding");
		if (!Color.equals(Color)) {
			System.out.println("Color Validation Is Not Passed");
		}else {
			System.out.println("Color Validation Is Passed");
		}
		
		if (!background.equals(background)) {
			System.out.println("background Validation Is Not Passed");
		}else {
			System.out.println("background Validation Is Passed");
		}
		
		if (!padding.equals(padding)) {
			System.out.println("background Validation Is Not Passed");
		}else {
			System.out.println("background Validation Is Passed");
		}
		Point locationOfSubmit =SubmitBtn.getLocation();
		System.out.println("Location Of Submit Button in x axis "+locationOfSubmit.getX());
		System.out.println("Location Of Submit Button in x axis "+locationOfSubmit.getY());
		SubmitBtn.click();
	}
}
