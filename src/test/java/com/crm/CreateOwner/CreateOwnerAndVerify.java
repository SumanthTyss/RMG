package com.crm.CreateOwner;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.genericUtilities.ExcelUtility;
import com.crm.genericUtilities.WebDriverUtility;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.OwnerHomePage;
import com.crm.objectRepository.RegisterPage;

@Listeners(com.crm.genericUtilities.ListnerImpIn.class)
public class CreateOwnerAndVerify extends BaseClass{

	@Test(retryAnalyzer = com.crm.genericUtilities.RetryAnalyserImptn.class)
	public  void VerifyTheOwnerCreatedRoomDetailsinTheRegisterdRoomList() throws Throwable {

		//Fetch the data from excel sheet
		ExcelUtility eLib=new ExcelUtility();
		String fullname = eLib.readDataFromExcel("owner", 1, 0);
		String mobNum = eLib.readDataFromExcel("owner", 1, 1);
		String Altnum = eLib.readDataFromExcel("owner", 1, 2);
		String email = eLib.readDataFromExcel("owner", 1, 3);
		String plotNum = eLib.readDataFromExcel("owner", 1, 4);
		String AvailRooms = eLib.readDataFromExcel("owner", 1, 5);
		String country = eLib.readDataFromExcel("owner", 1, 6);
		String state = eLib.readDataFromExcel("owner", 1, 7);
		String city = eLib.readDataFromExcel("owner", 1, 8);
		String rent = eLib.readDataFromExcel("owner", 1, 9);
		String sale = eLib.readDataFromExcel("owner", 1, 10);
		String deposit = eLib.readDataFromExcel("owner", 1, 11);
		String facilities = eLib.readDataFromExcel("owner", 1, 12);
		String description = eLib.readDataFromExcel("owner", 1, 13);
		String landmark = eLib.readDataFromExcel("owner", 1, 14);
		String address = eLib.readDataFromExcel("owner", 1, 15);
		String dropdown = eLib.readDataFromExcel("owner", 1, 16);
		String UpdatedDetail = eLib.readDataFromExcel("owner", 1, 17);



		//Click on Register Link
		LoginPage loginpage=new LoginPage(driver);
		loginpage.registerLink();

		//Enter all the details
		RegisterPage registerpage=new RegisterPage(driver);
		registerpage.fullName(fullname);
		registerpage.mobNum(mobNum);
		registerpage.altmobNum(Altnum);
		registerpage.emailId(email);
		registerpage.plotNumber(plotNum);
		registerpage.roomType(AvailRooms);
		registerpage.Country(country);
		registerpage.State(state);
		registerpage.City(city);
		registerpage.Rent(rent);
		registerpage.Sale(sale);
		registerpage.Deposit(deposit);
		registerpage.Accomodation(facilities);
		registerpage.Description(description);
		registerpage.LandMark(landmark);
		registerpage.Address(address);

		//WebElement ele = driver.findElement(By.id("vacant"));
		//WebDriverUtility wLib=new WebDriverUtility();
		//wLib.selectDropDown(ele, dropdown);

		WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		element.sendKeys("C:\\Users\\Harisha M V\\git\\RMG\\src\\test\\resources\\Screenshot (2).png");

		//click on register button
		registerpage.submitBtn();
		
		
	
		
		//navigate to home page
		OwnerHomePage ownerHomePage=new OwnerHomePage(driver);
		ownerHomePage.getHomeLink().click();
		
		//click on registred room
		ownerHomePage.getRegisteredRoomLnk().click();
		
		//click on update link
		ownerHomePage.getDetailsLink().click();
		
		//click on edit button
		ownerHomePage.getEditButton().click();
		
		//Enter the updated value
		registerpage.emailId(UpdatedDetail);
		
		//click on submit button
		registerpage.submitBtn();
		
		//navigate to home page 
		ownerHomePage.getHomeLink().click();
		
		//click on registered 
		ownerHomePage.getRegisteredRoomLnk().click();
		
		//click on home logo
		ownerHomePage.getLogoLnk().click();
		
		//Click on search Link
		ownerHomePage.getSearchLnk().click();
		
		Thread.sleep(2000);
		//enter keyword
		ownerHomePage.getKeyworkEdt().sendKeys(fullname);
		
		Thread.sleep(2000);
		//enter location
		ownerHomePage.getLocationEdt().sendKeys(city);
		
		Thread.sleep(2000);
		//click on search button
		ownerHomePage.getSearchButton().click();
		
		Thread.sleep(2000);
		//verification
		String text = driver.findElement(By.xpath("//p[text()='9632587412']")).getText();
		System.out.println(text);
		if (text.contains(mobNum)) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
		
		//click on home link
		ownerHomePage.getHomeLink().click();
		
		





	}

}
