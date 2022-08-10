package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
/**
 * 
 * @author Sumanth H A
 *
 */
public class HomePage extends WebDriverUtility{
	//WebDriver driver;
	//declaration

	@FindBy(xpath  = "//a[.='Logout']")
	private WebElement logoutLnk;

	@FindBy(xpath = "//a[@href='../app/users.php']")
	private WebElement registeredUserLnk;

	@FindBy(xpath = "//a[@href='../app/users.php']/../..//a[@href='../app/list.php']")
	private WebElement roomsForRentLnk;

	@FindBy(xpath = "//a[.='Home']")
	private WebElement homeLnk;

	@FindBy(xpath = "//a[.='Register']")
	private WebElement registerLink;

	@FindBy(xpath = "//a[.='Details/Update']")
	private WebElement detailsupdatelnk;

	@FindBy(xpath = "//a[.='Send SMS']")
	private WebElement sendSMSLnk;

	@FindBy(xpath = "//a[.='Complaint List']")
	private WebElement complaintListLnk;

	//initialization
	public HomePage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//utilization

	public WebElement getLogoutLnk() {
		return logoutLnk;
	}


	public WebElement getRegisteredUserLnk() {
		return registeredUserLnk;
	}


	public WebElement getRoomsForRentLnk() {
		return roomsForRentLnk;
	}


	public WebElement getHomeLnk() {
		return homeLnk;
	}


	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getDetailsupdatelnk() {
		return detailsupdatelnk;
	}


	public WebElement getSendSMSLnk() {
		return sendSMSLnk;
	}


	public WebElement getComplaintListLnk() {
		return complaintListLnk;
	}

	public void Logout() {
		logoutLnk.click();

	}

	public void registerLnk() {
		registerLink.click();

	}

}
