package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaretion

	@FindBy(xpath = "//a[.='Search']")	
	private WebElement searchLnk;

	@FindBy(xpath = "//a[.='Login']")
	private WebElement loginLnk;

	@FindBy(xpath = "//a[.='Register']")
	private WebElement registerLnk;
	
	@FindBy(id = "exampleInputEmail1")
	private WebElement usernameEdt;
	
	@FindBy(id = "exampleInputPassword1")
	private WebElement passworEdt;
	
	@FindBy(name = "login")
	private WebElement loginBtn;
	
	

	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Utilization
	
	public WebElement getSearchLnk() {
		return searchLnk;
	}


	public WebElement getLoginLnk() {
		return loginLnk;
	}


	public WebElement getRegisterLnk() {
		return registerLnk;
	}


	public WebElement getUsernameEdt() {
		return usernameEdt;
	}


	public WebElement getPassworEdt() {
		return passworEdt;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	

	/**
	 * 
	 * @param username
	 * @param password
	 * click on submit button
	 */

	public void loginToAppli(String username,String password)
	{
		usernameEdt.sendKeys(username);
		passworEdt.sendKeys(password);
		loginBtn.click();
	}
	
	/**
	 * Click on register link
	 */
	
	public void registerLink() {
		registerLnk.click();
	}

	/**
	 * Click on search Link
	 */
	
	public void SearchLink() {
		searchLnk.click();
	}
	
	/**
	 * Click on login link
	 */
	
	public void loginLink() {
		loginLnk.click();
	}


}
