package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnerHomePage {
	
	public OwnerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='alert alert-warning']") private WebElement registeredRoomLnk;
	@FindBy(xpath = "//a[.='Home']") private WebElement homeLink;
	@FindBy(xpath = "//a[.='Details/Update']") private WebElement detailsLink;
	@FindBy(xpath = "//a[.='Edit']") private WebElement editButton;
	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath = "//a[.='Search']") private WebElement searchLnk;
	@FindBy(id = "keywords") private WebElement keyworkEdt;
	@FindBy(id = "location") private WebElement locationEdt;
	@FindBy(xpath = "//button[@name='search']") private WebElement searchButton;
	@FindBy(xpath = "//a[.='Logo/Home']") private WebElement logoLnk;
	
	
	public WebElement getRegisteredRoomLnk() {
		return registeredRoomLnk;
	}
	public WebElement getHomeLink() {
		return homeLink;
	}
	public WebElement getDetailsLink() {
		return detailsLink;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getEditButton() {
		return editButton;
	}
	public WebElement getSearchLnk() {
		return searchLnk;
	}
	public WebElement getKeyworkEdt() {
		return keyworkEdt;
	}
	public WebElement getLocationEdt() {
		return locationEdt;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public WebElement getLogoLnk() {
		return logoLnk;
	}
	
	
	
	
	
	
	
	

}
