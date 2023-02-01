package Genic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.openssl.EncryptionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BaseTest {
	public WebDriver driver ;
	@BeforeMethod
	public void base() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/#s");
		Reporter.log(driver.getTitle(),true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximized",true);
		
	}
	/*	@DataProvider
		public String[][] make() throws EncryptionException, IOException{
			FileInputStream fis = new FileInputStream(new File("./TestData/TricData.xlsx"));
			Workbook Workbook = WorkbookFactory.create(fis);
			Sheet Actul = Workbook.getSheet("Sheet1");
			int row = Actul.getPhysicalNumberOfRows()-1;
			int coul = Actul.getRow(0).getPhysicalNumberOfCells();
			String arr[][]=new String[row][coul];
			for(int i=1,h=0;i<=row;i++,h++) {
				  for(int j=0;j<coul;j++) {
				  arr[h][j]=Actul.getRow(i).getCell(j).toString();
				}
			}
			
			return arr;
			
		}*/
		
	}
