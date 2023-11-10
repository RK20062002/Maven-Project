package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;			// ---------------------------->> Browser methods
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String pageUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}
	
	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}
	
	public static void closeTab() {
		driver.close();
	}
	
	public static void closeEntireBrowser() {
		driver.quit();
	}
	
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
	
	public static void screenShot(String imgName) throws IOException{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location + imgName.png");
		FileUtils.copyFile(image, f);
	}
	
	public static Actions a;				// -------------------------->>  	Actions methods
	
	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}
	
	public static void dragDrop(WebElement dragWebElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}
	
	public static void doubleClick(WebElement webEle) {
		a = new Actions(driver);
		a.doubleClick(webEle).perform();
	}
	
	public static void rightclick(WebElement targetWebElement) {
		a = new Actions(driver);
		a.contextClick(targetWebElement).perform();
	}
	
	public static JavascriptExecutor js;	// -------------------------->>     JavaScript methods
	
	public static void setAttribute(WebElement target) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','...')", target);
	}
	
	public static void getAttribute(WebElement tar) {
		js = (JavascriptExecutor)driver;
		js.executeScript("return arguments[0].getAttribute('value')", tar);
	}
	
	public static void scrollUpPage(WebElement tarWebEle) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);
	}
	
	public static void scrollDownPage(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
											// --------------------------->>	Windows Handing method
	
	public static void windowHanding() {
		String parentWindowId = driver.getWindowHandle();
	//	System.out.println("Parent Id : "+parentWindowId);
		
		Set<String> newWindowsId = driver.getWindowHandles();
	//	System.out.println("All Window Id : "+allWindowsId);
		
		for (String winId : newWindowsId) {
			if (winId != parentWindowId) {
				driver.switchTo().window(winId);
			}
		}
	}
	
										   // ---------------------------->>	Excel Read method
	
	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Data");
		Row r = sheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();
		
		String value = " ";
		
		if (cellType == 1) {
			String cellValue = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat(value);
			String ChangedValue = sdf.format(dd);
		}
		else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String convertedValue = String.valueOf(l);
		}
	}
	
										  // ----------------------------->>	Create New Excel File method
	
	public static void createNewExcelFile(String location) throws IOException{
		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\"+location); // --> remove location use full path with .xlsx 
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Data");
//		Row newRow = createSheet.createRow(rowNum);
//		Cell newCell = newRow.createCell(cellNum);
//		newCell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}
	
	  									  // ----------------------------->>	Create New Cell method
	
	public static void createCell(String location, int getRow, int creCell, String newData) throws IOException {
		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\"+location);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Data");
		Row r = s.getRow(getRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
										  // ----------------------------->>	Create New Row method
	
	public static void createRow(String location, int creRow, int creCell, String newData) throws IOException {
		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\"+location);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Data");
		Row r = s.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	  									  // ----------------------------->>	Update Particular Cell
	
	public static void updateDataToParticularCell(String location, int getTheRow, int getTheCell, String existingData, String writeNewData) throws IOException {
		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\"+location);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Data");
		Row r = s.getRow(getTheRow);
		Cell c = r.getCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(existingData)) {
			c.setCellValue(writeNewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
}
