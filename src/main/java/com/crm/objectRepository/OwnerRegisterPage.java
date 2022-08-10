package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnerRegisterPage {
	
	//declaration
	
	@FindBy(id = "fullname") private WebElement fullnameEdt;
	@FindBy(id = "username") private WebElement usernameEdt;
	@FindBy(id = "mobile") private WebElement mobileEdt;
	@FindBy(id = "email") private WebElement emailEdt;
	@FindBy(id = "password") private WebElement passwordEdt;
	@FindBy(id = "c_password") private WebElement confirmPwdEdt;
	@FindBy(xpath = "//a[.='Submit']") private WebElement submitBtn;
	
	//initilization
	
	public OwnerRegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//utilization

	public WebElement getFullnameEdt() {
		return fullnameEdt;
	}

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getMobileEdt() {
		return mobileEdt;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getConfirmPwdEdt() {
		return confirmPwdEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
	public void fullName(String F_name) {
		fullnameEdt.sendKeys(F_name);
		
	}
	
	public void mobileNum(String mob_num) {
		mobileEdt.sendKeys(mob_num);
		
	}
	
	public void password(String password) {
		passwordEdt.sendKeys(password);
		
	}
	
	public void confirmPassword(String C_password) {
		confirmPwdEdt.sendKeys(C_password);
		
	}
	
	public void submitButton() {
		submitBtn.click();
		
	}

}
