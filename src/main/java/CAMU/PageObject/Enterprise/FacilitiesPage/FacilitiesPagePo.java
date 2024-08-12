package CAMU.PageObject.Enterprise.FacilitiesPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CAMU.PageObject.Enterprise.CampusPage.CampusPagePo;
import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class FacilitiesPagePo {

	private static FacilitiesPagePo FacilitiesPageInstance;
	String facilityIdRandom;
	String facilityNameRandom;

	private FacilitiesPagePo() {

	}

	public static FacilitiesPagePo getInstance() {
		if (FacilitiesPageInstance == null) {
			FacilitiesPageInstance = new FacilitiesPagePo();
		}
		return FacilitiesPageInstance;
	}

	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;

	@FindBy(css = ".main-container_block div.header_back p.text-secondary")
	private WebElement createNewFacilityPageHeading;

	@FindBy(xpath = "//label[text()='Campus']/..//input") // input#CampID
	private WebElement campusIdTextField;

	@FindBy(css = "input[name=FacID]")
	private WebElement facilityIdTextField;

	@FindBy(css = "input[name=Name]")
	private WebElement facilityNameTextField;

	@FindBy(css = "input[name=desc]")
	private WebElement descriptionTextField;

	@FindBy(css = "input[id=StaffId]")
	private WebElement staffNameTextField;

	@FindBy(css = "input[name=HosFac]")
	private WebElement hostelFacilityCheckBox;

	@FindBy(css = "input[name=AdL1]")
	private WebElement addressLineOneTextField;

	@FindBy(css = "input[name=AdL2]")
	private WebElement addressLineTwoTextField;

	@FindBy(css = "input[name=AdL3]")
	private WebElement addressLineThreeTextField;

	@FindBy(css = "input[name=Cty]")
	private WebElement addressLineFourTextField;

	@FindBy(css = "input[name=Mob]")
	private WebElement mobileNoTextField;

	@FindBy(css = "input[name=Tel]")
	private WebElement phoneNoTextField;

	@FindBy(css = "input[name=Email]")
	private WebElement emailTextField;

	@FindBy(xpath = "//label[text()='Campus']/..//input/parent::div/preceding-sibling::div[contains(@class,'singleValue')]")
	private WebElement campusSelectedValue;

	@FindBy(xpath = "//label[text()='Staff name']/..//input/parent::div/preceding-sibling::div[contains(@class,'multiValue')]")
	private WebElement selectedStaff;

	@FindBy(xpath = "//div[@role='button' and contains(@aria-label,'Remove')]")
	private List<WebElement> staffRemoveButton;

	@FindBy(css = "div.search input.search-input")
	private WebElement searchFacilityTextField;

	@FindBy(css = "table.table-data_list td.text-primary:first-of-type")
	private WebElement facilityList;

	public void clickAddButton() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public String getCreateNewFacilityPageTitle() {
		return createNewFacilityPageHeading.getText();
	}

	public void searchAndSelectCampusId(String campusId) {
//		Waiters.waitForElementToBeClickable(campusIdTextField);
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(campusIdTextField);
//		campusIdTextField.click();
		ElementUtils.forceClickWithJs(campusIdTextField);
		campusIdTextField.sendKeys(campusId);
		CommonUtils.selectDropDownOption(campusId);
	}

	public void enterFacilityId(String facilityId) {
		Waiters.waitForElementToBeVisible(facilityIdTextField);
		ElementUtils.clearInputFieldWithJs(facilityIdTextField);
		facilityIdRandom = facilityId + StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		facilityIdTextField.sendKeys(facilityIdRandom);
	}

	public void enterFacilityName(String facilityName) {
		Waiters.waitForElementToBeVisible(facilityNameTextField);
		ElementUtils.clearInputFieldWithJs(facilityNameTextField);
		facilityNameRandom = facilityName + StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		facilityNameTextField.sendKeys(facilityNameRandom);
	}

	public void enterDescription(String description) {
		Waiters.waitForElementToBeVisible(descriptionTextField);
		ElementUtils.clearInputFieldWithJs(descriptionTextField);
		descriptionTextField.sendKeys(description);
	}

	public void enterStaffName(String staffName) {
		Waiters.waitForElementToBeClickable(staffNameTextField);
		ElementUtils.clearInputFieldWithJs(staffNameTextField);
		staffNameTextField.click();
		staffNameTextField.sendKeys(staffName);
		CommonUtils.selectDropDownOptionWithContains(staffName);
	}

	public void checkHostelFacility() {
		Waiters.waitForElementToBeVisible(hostelFacilityCheckBox);
		if (!hostelFacilityCheckBox.isSelected()) {
			hostelFacilityCheckBox.click();
		}
	}

	public void uncheckHostelFacility() {
		Waiters.waitForElementToBeVisible(hostelFacilityCheckBox);
		if (hostelFacilityCheckBox.isSelected()) {
			hostelFacilityCheckBox.click();
		}
	}

	public void enterAddressLineOne(String address) {
		Waiters.waitForElementToBeVisible(addressLineOneTextField);
		ElementUtils.clearInputFieldWithJs(addressLineOneTextField);
		addressLineOneTextField.sendKeys(address);
	}

	public void enterAddressLineTwo(String address) {
		Waiters.waitForElementToBeVisible(addressLineTwoTextField);
		ElementUtils.clearInputFieldWithJs(addressLineTwoTextField);
		addressLineTwoTextField.sendKeys(address);
	}

	public void enterAddressLineThree(String address) {
		Waiters.waitForElementToBeVisible(addressLineThreeTextField);
		ElementUtils.clearInputFieldWithJs(addressLineThreeTextField);
		addressLineThreeTextField.sendKeys(address);
	}

	public void enterAddressLineFour(String address) {
		Waiters.waitForElementToBeVisible(addressLineFourTextField);
		ElementUtils.clearInputFieldWithJs(addressLineFourTextField);
		addressLineFourTextField.sendKeys(address);
	}

	public void verifyAllFieldsAreCleared() {
		Asserts.assertTrue(ElementUtils.isDisappeared(campusSelectedValue), "Campus field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(facilityIdTextField).isEmpty(),
				"Facility id field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(facilityNameTextField).isEmpty(),
				"Facility name field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(descriptionTextField).isEmpty(),
				"Description field is not cleared");
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedStaff), "Staff name field is not cleared");
		Asserts.assertTrue(!hostelFacilityCheckBox.isSelected(), "Hostel facility checkbox is not unchecked");
		Asserts.assertTrue(ElementUtils.getInputValue(addressLineOneTextField).isEmpty(),
				"Address line 1 field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(addressLineTwoTextField).isEmpty(),
				"Address line 2 field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(addressLineThreeTextField).isEmpty(),
				"Address line 3 field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(addressLineFourTextField).isEmpty(),
				"Address line 4 field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(mobileNoTextField).isEmpty(), "Mobile no. field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(phoneNoTextField).isEmpty(), "Phone no. field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(emailTextField).isEmpty(), "Email field is not cleared");
	}

	public void printLocator() {
		WebElement ele = DriverManager.getDriver().findElement(By.cssSelector(".css-19bb58m"));
		ElementUtils.printChildElements(ele);
	}

	public void selectMultipleStaffName(String staffName) {
		String[] split = staffName.split(",");
		for (int i = 0; i < split.length; i++) {
			Waiters.waitForTimeout(1000);
			ElementUtils.typeTextWithIntervalUsingSendKeys(staffNameTextField, split[i].trim(), 0);
			CommonUtils.selectDropDownOptionWithContains(split[i].trim());
		}
	}

	public void removeMultipleStaffName() {
		Waiters.waitForListOfElementsToBeVisible(staffRemoveButton);
		for (int i = staffRemoveButton.size() - 1; i >= 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Waiters.waitForElementToBeClickable(staffRemoveButton.get(i));
			staffRemoveButton.get(i).click();
		}
	}

	public String getCreatedFacilityId() {
		return facilityIdRandom;
	}

	public String searchNewlyCreatedFacility() {
		Waiters.waitForElementToBeVisible(searchFacilityTextField);
		searchFacilityTextField.clear();
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchFacilityTextField, facilityIdRandom, 80);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(facilityList);
		return facilityList.getText();
	}

	public void searchFacility(String facilityId) {
		Waiters.waitForElementToBeVisible(searchFacilityTextField);
		searchFacilityTextField.clear();
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchFacilityTextField, facilityId, 80);
		Waiters.waitForTimeout(1000);
	}

	public boolean verifyCampusFieldDisabled() {
		return !campusIdTextField.isEnabled();
	}

	public boolean verifyFacilityIdFieldDisabled() {
		return !facilityIdTextField.isEnabled();
	}

	public void entersFacilityId(String facilityId) {
		Waiters.waitForElementToBeVisible(facilityIdTextField);
		ElementUtils.clearInputFieldWithJs(facilityIdTextField);
		facilityIdTextField.sendKeys(facilityId);
	}

	public void entersFacilityName(String facilityName) {
		Waiters.waitForElementToBeVisible(facilityNameTextField);
		ElementUtils.clearInputFieldWithJs(facilityNameTextField);
		facilityNameTextField.sendKeys(facilityName);
	}

	public void verifyFields() {
		Asserts.assertTrue(!ElementUtils.getInputValue(facilityIdTextField).isEmpty(), "Facility id field is empty");
		Asserts.assertTrue(!ElementUtils.getInputValue(facilityNameTextField).isEmpty(),
				"Facility name field is empty");
		Asserts.assertTrue(!ElementUtils.getInputValue(descriptionTextField).isEmpty(), "Description field is empty");
		Asserts.assertTrue(!ElementUtils.getInputValue(addressLineOneTextField).isEmpty(),
				"Address line 1 field is empty");
		Asserts.assertTrue(!ElementUtils.getInputValue(addressLineTwoTextField).isEmpty(),
				"Address line 2 field is empty");
		Asserts.assertTrue(!ElementUtils.getInputValue(addressLineThreeTextField).isEmpty(),
				"Address line 3 field is empty");
		Asserts.assertTrue(!ElementUtils.getInputValue(addressLineFourTextField).isEmpty(),
				"Address line 4 field is empty");

	}

	public void searchSelectNewCampus() {
		Waiters.waitForElementToBeClickable(campusIdTextField);
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(campusIdTextField);
//		campusIdTextField.click();
		ElementUtils.forceClickWithJs(campusIdTextField);
		ElementUtils.typeTextWithIntervalUsingSendKeys(campusIdTextField, CampusPagePo.getInstance().getCampusId(), 80);
//		campusIdTextField.sendKeys(CampusPagePo.getInstance().getCampusId());
		CommonUtils.selectDropDownOption(CampusPagePo.getInstance().getCampusId());
	}
	
	public String getFacilityName() {
		return facilityNameRandom;
	}

}
