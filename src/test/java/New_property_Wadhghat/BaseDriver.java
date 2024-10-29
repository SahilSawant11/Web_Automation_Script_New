package New_property_Wadhghat;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utility.TakeScreenshoot;

public class BaseDriver {

	static public String url;

	static public WebDriver driver;
	static public ExtentSparkReporter spark;
	static public ExtentReports extent;
	static public ExtentTest test;
	
	static public String userid;
	static public String password;
	static public String node;
	static public String sector;
	static public String PropertyNo;
	
	static public String node1;
	static public String sector1;
	static public String PropertyNo1;
	
	static public String node2;
	static public String sector2;
	static public String PropertyNo2;
	
	static public String node3;
	static public String sector3;
	static public String PropertyNo3;
	
	static public String node4;
	static public String sector4;
	static public String PropertyNo4;
	
	static public String node5;				// for baramati cheque fail scenario
	static public String sector5;			// properties from node5 onwards are of BARAMATI
	static public String PropertyNo5;
	
	static public String node6;				
	static public String sector6;			// properties from node5 onwards are of BARAMATI
	static public String PropertyNo6;		//BARAMATI
	
	static public String node7;				
	static public String sector7;			// properties from node5 onwards are of BARAMATI
	static public String PropertyNo7;		//BARAMATI
	
	static public String akshep_no;
	public TakeScreenshoot takescreenshot=new TakeScreenshoot(driver, null);
	static public int financeYear;
	
	static public String cms_aakshep_prakar ="नविन/वाढीव नोंद";
	static public String date = "20/04/2023";
	static public String mobile = "1111111111";
	static public String cms_remark = "test";
	static public String zone_no = "1";
	static public String khula_bhukhand = "No";
	static public String property_type = "निवासी";
	static public String csn = "123";
	static public String plot_no = "10";
	static public String plot_area_sqft = "500";
	static public String shreni = "INDIVIDUAL";
	static public String shreni_prakar = "R";
	static public String new_property = "No ";
	static public String shirshak_kardharak = "श्री";
	static public String kardharak = "करधारक";
	static public String ptta = "पत्ता";
	static public String dukan_imarat_nav = "इमारत";
	static public String dukan_flat_no = "20";
	static public String title = "Mr";
	static public String taxpayer_name = "Taxpayer";
	static public String address = "Address";
	static public String shop_building_name = "Building";
	static public String shop_flat_no = "20";
	static public String shirshak_bhogvatdar = "श्री";
	static public String bhogvatdar = "भोगवटदार";
	static public String occupier_name = "Occupier";
	
	static public String floor = "तळमजला";
	static public String construnction_year = "2000";
	static public String construction_type = "सिमेंट कॉक्रिट संरचना";
	static public String construction_typeForbaramati = "A1-सिमेंट कॉक्रिट संरचना-उच्च दर्जाचे";
	static public String type_of_use = "निवासी";
	static public String karpatr_chatai_area_sqft_floor = "400";
	static public String nondani = "Yes";
	static public String Enter_no_of_room = "4";
	static public String renter_available = "Yes";
	static public String renter_name_marathi = "भाडेकरू1";
	static public String renter_name_eng = "Renter";
	static public String calculated_rent = "5000";
	static public String agreement = "No";
	static public String r_toilet = "2";
	static public String c_toilet = "2";
	static public String oldWardNo = "A127";
	static public String oldPropertyNo = "1908";
	static public String oldPartitionNo = "5";
	static public String oldCityServey = "12321";
	static public String oldRV = "50000";
	static public String oldPropertyTax = "9000";
	static public String oldTaxTotal = "40000";
	static public String propTax = "100";
	static public String EduTax = "111";
	static public String spEduTax = "210";
	static public String EmpTax = "40";
	static public String treeCess = "301";
	static public String fireCess = "402";
	static public String lightCess = "521";
	static public String drainCess = "50";
	static public String roadCess = "20";
	static public String sanitation = "10";
	static public String waterCess = "30";
	static public String waterBenifit = "94";
	static public String waterBill = "53";
	static public String Mbuilding = "53";
	static public String sewage = "53";
	static public String Tax1 = "94";
	static public String Tax2 = "94";
	static public String Tax3 = "53";
	static public String interest = "10";
	static public String oldRemark = "test";
	static public String approvalRemark = "test";
	
	
	static public String ferfar_aakshep_prakar = "फेरफार";
	static public String ferfar_kardharak = "करधारक2";
	static public String ferfar_taxpayer = "xyz";
	static public String ferfar_bhogvatdar = "भोगवटादार";
	static public String ferfar_occupier = "Occupier";
	static public String ferfar_bhadekaru = "भाडेकरू4";
	static public String ferfar_Renter = "Renter3";
	static public String ferfar_oldPurchaseDate = "01/03/2022";
	static public String ferfar_newPurchaseDate = "01/04/2023";
	static public String ferfar_orderNo = "123456";
	static public String ferfar_trnsferDate = "20/04/2023";
	static public String ferfar_remark = "test";
	
	static public String change_oldWardNo = "oldwdtest";
	static public String change_oldPartitionNo = "3test";
	static public String change_oldPropertyNo = "A123";
	static public String change_SocietyNameMarathi = "abc";
	static public String change_SocietyNameEng = "abc1";
	static public String change_newCityservey = "321";
	static public String change_dhukan = "Amt";
	static public String change_shop = "Amt1";
	static public String change_rToilet = "2";
	static public String change_patta = "Amaravati";
	static public String change_address = "amravati1";
	static public String change_cToilet = "2";
	static public String change_wingNo = "A-test";
	static public String change_flatNo = "102";
	static public String change_plotNo = "10";
	static public String change_MobileNo = "1234567890";
	static public String change_email = "abc@gmail.com";
	static public String change_remark = "test";
	
	static public String change_oldWardNo2 = "oldwdtest_B";
	static public String change_oldPartitionNo2 = "3test_B";
	static public String change_oldPropertyNo2 = "B123";
	static public String change_SocietyNameMarathi2 = "def";
	static public String change_SocietyNameEng2 = "def1";
	static public String change_newCityservey2 = "123";
	static public String change_dhukan2 = "Pnv";
	static public String change_shop2 = "PNV1";
	static public String change_rToilet2 = "4";
	static public String change_patta2 = "Panvel";
	static public String change_address2 = "panvel1";
	static public String change_cToilet2 = "6";
	static public String change_wingNo2 = "B-test";
	static public String change_flatNo2 = "21";
	static public String change_plotNo2 = "5";
	static public String change_MobileNo2 = "1111111111";
	static public String change_email2 = "xyz@gmail.com";
	static public String change_remark2 = "automation_test";

	
	@SuppressWarnings("resource")
	public static void GetData() throws IOException
	{
		XSSFWorkbook workbook;
		XSSFSheet s;
		XSSFCell c;
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\InputData\\CMS Data.xlsx");
		workbook = new XSSFWorkbook(file);
		s = workbook.getSheet("Sheet1");
		
		c = s.getRow(1).getCell(0);
		c.setCellType(CellType.STRING);
		userid = c.getStringCellValue();
		
		c = s.getRow(1).getCell(1);
		c.setCellType(CellType.STRING);
		password = c.getStringCellValue();
		
		c = s.getRow(1).getCell(2);
		c.setCellType(CellType.STRING);
		url = c.getStringCellValue();
		
		c = s.getRow(1).getCell(3);
		c.setCellType(CellType.STRING);
		node = c.getStringCellValue();
		
		c = s.getRow(1).getCell(4);
		c.setCellType(CellType.STRING);
		sector = c.getStringCellValue();
		
//		testing properties for payment 
		c = s.getRow(9).getCell(0);
		c.setCellType(CellType.STRING);
		node1 = c.getStringCellValue();
		
		c = s.getRow(9).getCell(1);
		c.setCellType(CellType.STRING);
		sector1 = c.getStringCellValue();
		
		c = s.getRow(9).getCell(2);
		c.setCellType(CellType.STRING);
		PropertyNo1 = c.getStringCellValue();
		
		c = s.getRow(10).getCell(0);
		c.setCellType(CellType.STRING);
		node2 = c.getStringCellValue();
		
		c = s.getRow(10).getCell(1);
		c.setCellType(CellType.STRING);
		sector2 = c.getStringCellValue();
		
		c = s.getRow(10).getCell(2);
		c.setCellType(CellType.STRING);
		PropertyNo2 = c.getStringCellValue();
		
		c = s.getRow(11).getCell(0);
		c.setCellType(CellType.STRING);
		node3 = c.getStringCellValue();
		
		c = s.getRow(11).getCell(1);
		c.setCellType(CellType.STRING);
		sector3 = c.getStringCellValue();
		
		c = s.getRow(11).getCell(2);
		c.setCellType(CellType.STRING);
		PropertyNo3 = c.getStringCellValue();
		
		
		c = s.getRow(12).getCell(0);
		c.setCellType(CellType.STRING);
		node4 = c.getStringCellValue();
		
		c = s.getRow(12).getCell(1);
		c.setCellType(CellType.STRING);
		sector4 = c.getStringCellValue();
		
		c = s.getRow(12).getCell(2);
		c.setCellType(CellType.STRING);
		PropertyNo4 = c.getStringCellValue();
		
		c = s.getRow(15).getCell(0);
		c.setCellType(CellType.STRING);
		node5 = c.getStringCellValue();
		
		c = s.getRow(15).getCell(1);
		c.setCellType(CellType.STRING);
		sector5 = c.getStringCellValue();
		
		c = s.getRow(15).getCell(2);
		c.setCellType(CellType.STRING);
		PropertyNo5 = c.getStringCellValue();
		
		c = s.getRow(16).getCell(0);
		c.setCellType(CellType.STRING);
		node6 = c.getStringCellValue();
		
		c = s.getRow(16).getCell(1);
		c.setCellType(CellType.STRING);
		sector6 = c.getStringCellValue();
		
		c = s.getRow(16).getCell(2);
		c.setCellType(CellType.STRING);
		PropertyNo6 = c.getStringCellValue();
		
		c = s.getRow(17).getCell(0);
		c.setCellType(CellType.STRING);
		node7 = c.getStringCellValue();
		
		c = s.getRow(17).getCell(1);
		c.setCellType(CellType.STRING);
		sector7 = c.getStringCellValue();
		
		c = s.getRow(17).getCell(2);
		c.setCellType(CellType.STRING);
		PropertyNo7 = c.getStringCellValue();
		
		
		c = s.getRow(1).getCell(5);
		c.setCellType(CellType.NUMERIC);
		financeYear = (int) c.getNumericCellValue();	
	}
	
	
	public void getDiscountData()
	{
		
	}
}
