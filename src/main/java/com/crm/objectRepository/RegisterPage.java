package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class RegisterPage extends WebDriverUtility {

	//initilization 

	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//declaration

	@FindBy(id = "fullname") private WebElement fullnameEdt;
	@FindBy(id = "mobile") private WebElement mobileEdt;
	@FindBy(id = "alternat_mobile") private WebElement altmobEdt;
	@FindBy(id = "email") private WebElement emailEdt;
	@FindBy(id = "plot_number") private WebElement pltnumEdt;
	@FindBy(id = "rooms") private WebElement roomEdt;
	@FindBy(id = "country") private WebElement countryEdt;
	@FindBy(id = "state") private WebElement stateEdt;
	@FindBy(id = "city") private WebElement cityEdt;
	@FindBy(id = "rent") private WebElement rentEdt;
	@FindBy(id = "sale") private WebElement saleEdt;
	@FindBy(id = "deposit") private WebElement depositEdt;
	@FindBy(id = "accommodation") private WebElement accommodationEdt;
	@FindBy(id = "description") private WebElement descriptionEdt;
	@FindBy(id = "landmark") private WebElement landmarkEdt;
	@FindBy(id = "address") private WebElement addressEdt;
	@FindBy(id = "vacant") private WebElement vacantEdt;
	@FindBy(id = "image") private WebElement imageEdt;
	@FindBy(name = "register_individuals") private WebElement registerButton;

	//utilization

	public WebElement getFullnameEdt() {
		return fullnameEdt;
	}
	public WebElement getMobileEdt() {
		return mobileEdt;
	}
	public WebElement getAltmobEdt() {
		return altmobEdt;
	}
	public WebElement getEmailEdt() {
		return emailEdt;
	}
	public WebElement getPltnumEdt() {
		return pltnumEdt;
	}
	public WebElement getRoomEdt() {
		return roomEdt;
	}
	public WebElement getCountryEdt() {
		return countryEdt;
	}
	public WebElement getStateEdt() {
		return stateEdt;
	}
	public WebElement getCityEdt() {
		return cityEdt;
	}
	public WebElement getRentEdt() {
		return rentEdt;
	}
	public WebElement getSaleEdt() {
		return saleEdt;
	}
	public WebElement getDepositEdt() {
		return depositEdt;
	}
	public WebElement getAccommodationEdt() {
		return accommodationEdt;
	}
	public WebElement getDescriptionEdt() {
		return descriptionEdt;
	}
	public WebElement getLandmarkEdt() {
		return landmarkEdt;
	}
	public WebElement getAddressEdt() {
		return addressEdt;
	}
	public WebElement getVacantEdt() {
		return vacantEdt;
	}
	public WebElement getImageEdt() {
		return imageEdt;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void fullName(String name) {
		getFullnameEdt().sendKeys(name);
	}

	public void mobNum(CharSequence[] num) {
		getMobileEdt().sendKeys(num);
	}

	public void altmobNum(CharSequence[] altNum) {
		getAltmobEdt().sendKeys(altNum);
	}

	public void emailId(String email) {
		getEmailEdt().sendKeys(email);
	}

	public void plotNumber(CharSequence[] num) {
		getPltnumEdt().sendKeys(num);
	}

	public void roomType(String room) {
		getRoomEdt().sendKeys(room);
	}

	public void State(String state) {
		getStateEdt().sendKeys(state);
	}

	public void Country(String country) {
		getCountryEdt().sendKeys(country);
	}

	public void City(String city) {
		getCityEdt().sendKeys(city);
	}

	public void Rent(CharSequence[] rent) {
		getRentEdt().sendKeys(rent);
	}

	public void Sale(CharSequence[] sale) {
		getSaleEdt().sendKeys(sale);
	}

	public void Deposit(CharSequence[] deposit) {
		getDepositEdt().sendKeys(deposit);
	}

	public void Accomodation(String accomodation) {
		getAccommodationEdt().sendKeys(accomodation);
	}

	public void Description(String description) {
		getDescriptionEdt().sendKeys(description);
	}

	public void LandMark(String landmark) {
		getLandmarkEdt().sendKeys(landmark);
	}

	public void Address(String address) {
		getAddressEdt().sendKeys(address);
	}

	public void vacantDrpDwn(String value) {
		selectDropDown(vacantEdt, value);		
	}

	public void UploadFile(String path) {
		getImageEdt().sendKeys(path);
	}

	public void RegisterBtn() {
		getRegisterButton().click();
	}




}
