package CAMU.PageObject.Enterprise.LocationsPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CAMU.PageObject.Enterprise.FacilitiesPage.FacilitiesPagePo;
import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class LocationsPagePo {

	private static LocationsPagePo LocationsPageInstance;
	String randomLocationId;
	String randomLocationName;
	String randomCategoryName;

	private LocationsPagePo() {

	}

	public static LocationsPagePo getInstance() {
		if (LocationsPageInstance == null) {
			LocationsPageInstance = new LocationsPagePo();
		}
		return LocationsPageInstance;
	}

	@FindBy(xpath = "//label[text()='Facility']/..//input") // input#FacID
	private WebElement facilityTextField;

	@FindBy(xpath = "//button[@type='button' and text()='Bed']")
	private WebElement bedButton;

	@FindBy(css = "input[name=LocID]")
	private WebElement locationIdTextField;

	@FindBy(css = "input[name=Name]")
	private WebElement locationNameTextField;

	@FindBy(css = "input[name=LocCap]")
	private WebElement capacityTextField;

	@FindBy(css = "input[name=NoRw]")
	private WebElement noOfRowsTextField;

	@FindBy(css = "input[name=NoStRw]")
	private WebElement noOfSeatsPerRowTextField;

	@FindBy(css = "div.search input.search-input")
	private WebElement searchLocationTextField;

	@FindBy(css = "table.table-data_list td.text-primary:first-of-type")
	private WebElement locationList;

	@FindBy(css = "input[placeholder='Enter bed name']")
	private List<WebElement> bedNameTextFieldList;

	@FindBy(css = "input[placeholder='Enter bed name']")
	private WebElement bedNameTextField;

	@FindBy(xpath = "//label[text()='Gender']/..//input") // input#Gender
	private WebElement genderTextField;

	@FindBy(xpath = "//label[text()='Room Category']/..//input") // input#RmId
	private WebElement roomCategoryTextField;

	@FindBy(xpath = "//span[contains(@class,'material-symbols-rounded') and text()='add']")
	private WebElement addRoomCategoryPlusButton;

	@FindBy(css = "div.modal-title")
	private WebElement dialogBoxTitle;

	@FindBy(xpath = "//div[text()='Add a new Room category']/following::input[@name='Name']")
	private WebElement newCategoryNameTextField;

	@FindBy(xpath = "//label[text()='Billing item']/..//input")
	private WebElement billingItemTextField;

	@FindBy(xpath = "//div[text()='Add a new Room category']/following::button[@type='submit' and text()='Save']")
	private WebElement newCategorySaveButton;

	@FindBy(xpath = "//div[text()='Add a new Room category']/following::button[@type='button' and text()='Cancel']")
	private WebElement newCategoryCancelButton;

	@FindBy(xpath = "//label[text()='Room Category']/..//div[@title]")
	private WebElement selectedCategoryValue;

	@FindBy(xpath = "//label[text()='Campus']/..//div[@title]")
	private WebElement campusSelectedValue;

	@FindBy(xpath = "//label[text()='Facility']/..//div[@title]")
	private WebElement facilitySelectedValue;

	@FindBy(xpath = "//label[text()='Gender']/..//div[@title]")
	private WebElement genderSelectedValue;

	@FindBy(css = "table.table-data_list td.text-primary:first-of-type")
	private WebElement locationIdTable;

	@FindBy(xpath = "(//label[text()='Facility']/following::div[contains(@class,'indicatorContainer')])[1]")
	private WebElement removeSelectedFacilityButton;

	@FindBy(xpath = "(//label[text()='Gender']/following::div[contains(@class,'indicatorContainer')])[1]")
	private WebElement removeSelectedGenderButton;

	@FindBy(xpath = "(//label[text()='Room Category']/following::div[contains(@class,'indicatorContainer')])[1]")
	private WebElement removeSelectedRoomCategoryButton;

	@FindBy(xpath = "//input[@placeholder='Enter bed name']/following::span[contains(@class,'material-symbols-rounded')]")
	private List<WebElement> removeBedButton;

	public void searchSelectFacility(String facility) {
//		Waiters.waitForElementToBeClickable(campusIdTextField);
		Waiters.waitForTimeout(1000);
		if (removeSelectedFacilityButton.isDisplayed()) {
			removeSelectedFacilityButton.click();
		}
		ElementUtils.clearInputFieldWithJs(facilityTextField);
//		campusIdTextField.click();
		ElementUtils.forceClickWithJs(facilityTextField);
		facilityTextField.sendKeys(facility);
//		ElementUtils.typeTextWithIntervalUsingSendKeys(facilityTextField, facility, 80);
		CommonUtils.selectDropDownOption(facility);
	}

	public void enterLocationId(String locationId) {
		Waiters.waitForElementToBeVisible(locationIdTextField);
		randomLocationId = locationId + StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		ElementUtils.clearInputFieldWithJs(locationIdTextField);
		locationIdTextField.sendKeys(randomLocationId);
	}

	public void enterLocationName(String locationName) {
		Waiters.waitForElementToBeVisible(locationNameTextField);
		randomLocationName = locationName + StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		ElementUtils.clearInputFieldWithJs(locationNameTextField);
		locationNameTextField.sendKeys(randomLocationName);
	}

	public void enterCapacity(String capacity) {
		Waiters.waitForElementToBeVisible(capacityTextField);
		ElementUtils.clearInputFieldWithJs(capacityTextField);
		capacityTextField.sendKeys(capacity);
	}

	public boolean verifyBedIsEnabled() {
		return bedButton.isEnabled();
	}

	public boolean verifyBedIsDisabled() {
		return !bedButton.isEnabled();
	}

	public void enterNoOfRows(String rows) {
		Waiters.waitForElementToBeVisible(noOfRowsTextField);
		ElementUtils.clearInputFieldWithJs(noOfRowsTextField);
		noOfRowsTextField.sendKeys(rows);
	}

	public void enterSeatPerRow(String seatsPerRow) {
		Waiters.waitForElementToBeVisible(noOfSeatsPerRowTextField);
		ElementUtils.clearInputFieldWithJs(noOfSeatsPerRowTextField);
		noOfSeatsPerRowTextField.sendKeys(seatsPerRow);
	}

	public String searchAndVerifyNewlyCreatedLocation() {
		Waiters.waitForElementToBeVisible(searchLocationTextField);
		searchLocationTextField.clear();
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchLocationTextField, randomLocationId, 80);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(locationList);
		return locationList.getText();
	}

	public String getCreatedLocationId() {
		return randomLocationId;
	}

	public void clickBedButton() {
		Waiters.waitForElementToBeVisible(bedButton);
		Waiters.waitForElementToBeClickable(bedButton);
		bedButton.click();
	}

	public String getBedNameList() {
		Waiters.waitForListOfElementsToBeVisible(bedNameTextFieldList);
		String bedNameCount = Integer.toString(bedNameTextFieldList.size());
		return bedNameCount;
	}

	public String getCapacityInputValue() {
		return ElementUtils.getInputValue(capacityTextField);
	}

	public void enterBedNameForEachBeds() {
		Waiters.waitForListOfElementsToBeVisible(bedNameTextFieldList);
		for (int i = 0; i < bedNameTextFieldList.size(); i++) {
			Waiters.waitForElementToBeVisible(bedNameTextFieldList.get(i));
			bedNameTextFieldList.get(i).sendKeys("Bed-" + StringUtils.generateRandomStringNumberCharacter(3, 3, 0));
		}
	}

	public boolean verifyGenderFieldIsDisplayedEnabled() {
		return genderTextField.isDisplayed() && genderTextField.isEnabled();
	}

	public boolean verifyRoomCategoryFieldIsDisplayedEnabled() {
		return roomCategoryTextField.isDisplayed() && roomCategoryTextField.isEnabled();
	}

	public void selectGender(String gender) {
		Waiters.waitForTimeout(1000);
		if (removeSelectedGenderButton.isDisplayed()) {
			removeSelectedGenderButton.click();
		}
		ElementUtils.clearInputFieldWithJs(genderTextField);
		ElementUtils.forceClickWithJs(genderTextField);
		genderTextField.sendKeys(gender);
//		WebElement ele = DriverManager.getDriver().findElement(By.cssSelector("div.css-1nmdiq5-menu"));
//		ElementUtils.printChildElements(ele);
		CommonUtils.selectDropDownOption(gender);
	}

	public void selectRoomCategory(String roomCategory) {
		Waiters.waitForTimeout(1000);
		if (removeSelectedRoomCategoryButton.isDisplayed()) {
			removeSelectedRoomCategoryButton.click();
		}
		ElementUtils.scrollInToElement(roomCategoryTextField);
		ElementUtils.clearInputFieldWithJs(roomCategoryTextField);
		ElementUtils.forceClickWithJs(roomCategoryTextField);
		roomCategoryTextField.sendKeys(roomCategory);
		CommonUtils.selectDropDownOption(roomCategory);
	}

	public boolean verifyRowsFieldEnabled() {
		return !noOfRowsTextField.isEnabled();
	}

	public boolean verifySeatPerRowFieldEnabled() {
		return !noOfSeatsPerRowTextField.isEnabled();
	}

	public void clickAddRoomCategory() {
		Waiters.waitForElementToBeVisible(addRoomCategoryPlusButton);
		addRoomCategoryPlusButton.click();
	}

	public boolean verifyAddNewRoomCategoryDisplayed() {
		return dialogBoxTitle.isDisplayed();
	}

	public void enterCategoryName(String categoryName) {
		Waiters.waitForElementToBeVisible(newCategoryNameTextField);
		randomCategoryName = categoryName + StringUtils.generateRandomStringNumberCharacter(3, 3, 0);
		newCategoryNameTextField.sendKeys(randomCategoryName);
	}

	public void selectBillingItem(String billingItem) {
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(billingItemTextField);
//		ElementUtils.forceClickWithJs(billingItemTextField);
		billingItemTextField.click();
		billingItemTextField.sendKeys(billingItem);
		CommonUtils.selectDropDownOption(billingItem);
	}

	public void saveNewRoomCategory() {
		Waiters.waitForElementToBeVisible(newCategorySaveButton);
		Waiters.waitForElementToBeClickable(newCategorySaveButton);
		newCategorySaveButton.click();
	}

	public void selectNewlyCreatedRoomCategory() {

	}

	public String verifyNewlyCreatedCategoryIsSelected() {
		Waiters.waitForElementToBeVisible(selectedCategoryValue);
		return selectedCategoryValue.getAttribute("title");
	}

	public String getNewCategoryName() {
		return randomCategoryName;
	}

	public void cancelNewRoomCategory() {
		Waiters.waitForElementToBeVisible(newCategoryCancelButton);
		Waiters.waitForElementToBeClickable(newCategoryCancelButton);
		newCategoryCancelButton.click();
	}

	public void verifyAllFieldsCleared() {
		Asserts.assertTrue(ElementUtils.isDisappeared(campusSelectedValue), "Campus field is not cleared");
		Asserts.assertTrue(ElementUtils.isDisappeared(facilitySelectedValue), "Facility field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(locationIdTextField).isEmpty(),
				"Location Id field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(locationNameTextField).isEmpty(),
				"Location Name field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(capacityTextField).isEmpty(), "Capacity field is not cleared");
//		Asserts.assertTrue(ElementUtils.isDisappeared(genderSelectedValue), "Gender field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(noOfRowsTextField).isEmpty(), "No of rows field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(noOfSeatsPerRowTextField).isEmpty(),
				"No of seats per row field is not cleared");
	}

	public void verifyAllTheFieldsCleared() {
		Asserts.assertTrue(ElementUtils.isDisappeared(campusSelectedValue), "Campus field is not cleared");
		Asserts.assertTrue(ElementUtils.isDisappeared(facilitySelectedValue), "Facility field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(locationIdTextField).isEmpty(),
				"Location Id field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(locationNameTextField).isEmpty(),
				"Location Name field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(capacityTextField).isEmpty(), "Capacity field is not cleared");
		Asserts.assertTrue(ElementUtils.isDisappeared(genderSelectedValue), "Gender field is not cleared");
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedCategoryValue), "Room category field is not cleared");
		Asserts.assertTrue(ElementUtils.isDisappeared(bedNameTextField), "Bed name field is not cleared");
	}

	public void verifyLocationIdField() {
		Waiters.waitForElementToBeVisible(locationIdTextField);
		locationIdTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(locationIdTextField).isEmpty(),
				"Location Id field doesn't accept alphabetical values");
		locationIdTextField.clear();
		locationIdTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(locationIdTextField).isEmpty(),
				"Location Id field doesn't accept numerical values");
		locationIdTextField.clear();
		locationIdTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(locationIdTextField).isEmpty(),
				"Location Id field doesn't accept special characters");
		locationIdTextField.clear();
	}

	public void verifyLocationNameField() {
		Waiters.waitForElementToBeVisible(locationNameTextField);
		locationNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(locationNameTextField).isEmpty(),
				"Location Name field doesn't accept alphabetical values");
		locationNameTextField.clear();
		locationNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(locationNameTextField).isEmpty(),
				"Location Name field doesn't accept numerical values");
		locationNameTextField.clear();
		locationNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(locationNameTextField).isEmpty(),
				"Location Name field doesn't accept special characters");
		locationNameTextField.clear();
	}

	public void verifyCapacityField() {
		Waiters.waitForElementToBeVisible(capacityTextField);
		capacityTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(ElementUtils.getInputValue(capacityTextField).isEmpty(),
				"Capacity field accept alphabetical values");
		capacityTextField.clear();
		capacityTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(capacityTextField).isEmpty(),
				"Capacity field doesn't accept numerical values");
		capacityTextField.clear();
		capacityTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(ElementUtils.getInputValue(capacityTextField).isEmpty(),
				"Capacity field accept special characters");
		capacityTextField.clear();
	}

	public void verifyNoOfRowsField() {
		Waiters.waitForElementToBeVisible(noOfRowsTextField);
		noOfRowsTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(ElementUtils.getInputValue(noOfRowsTextField).isEmpty(),
				"No of rows field accept alphabetical values");
		noOfRowsTextField.clear();
		noOfRowsTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(noOfRowsTextField).isEmpty(),
				"No of rows field doesn't accept numerical values");
		noOfRowsTextField.clear();
		noOfRowsTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(ElementUtils.getInputValue(noOfRowsTextField).isEmpty(),
				"No of rows field accept special characters");
		noOfRowsTextField.clear();
	}

	public void verifyNoOfSeatsPerRowField() {
		Waiters.waitForElementToBeVisible(noOfSeatsPerRowTextField);
		noOfSeatsPerRowTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(ElementUtils.getInputValue(noOfSeatsPerRowTextField).isEmpty(),
				"No of seats per row field accept alphabetical values");
		noOfSeatsPerRowTextField.clear();
		noOfSeatsPerRowTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(noOfSeatsPerRowTextField).isEmpty(),
				"No of seats per row field doesn't accept numerical values");
		noOfSeatsPerRowTextField.clear();
		noOfSeatsPerRowTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(ElementUtils.getInputValue(noOfSeatsPerRowTextField).isEmpty(),
				"No of seats per row field accept special characters");
		noOfSeatsPerRowTextField.clear();
	}

	public void enterDuplicateRoomCategoryName(String roomCategory) {
		Waiters.waitForElementToBeVisible(newCategoryNameTextField);
		newCategoryNameTextField.sendKeys(roomCategory);
	}

	public void searchLocation(String locationId) {
		Waiters.waitForElementToBeVisible(searchLocationTextField);
		searchLocationTextField.clear();
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchLocationTextField, locationId, 80);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(locationIdTable);
	}

	public void editLocationId(String locationID) {
		Waiters.waitForElementToBeVisible(locationIdTextField);
		ElementUtils.clearInputFieldWithJs(locationIdTextField);
		locationIdTextField.sendKeys(locationID);
	}

	public void editLocationName(String locationName) {
		Waiters.waitForElementToBeVisible(locationNameTextField);
		ElementUtils.clearInputFieldWithJs(locationNameTextField);
		locationNameTextField.sendKeys(locationName);
	}

	public void verifyAndRemoveBed(String bedCount) {
		Waiters.waitForListOfElementsToBeVisible(bedNameTextFieldList);
		int bedCountNo = Integer.parseInt(bedCount);
		int bedRemoveCount = Integer.parseInt(ElementUtils.getInputValue(capacityTextField)) - bedCountNo;
		System.out.println(bedRemoveCount);
		if (bedCountNo <= bedNameTextFieldList.size()) {
			System.out.println("Bed count " + bedCountNo + " capacity " + bedNameTextFieldList.size() + "");
			
			for (int i = removeBedButton.size() - 1; i >= bedRemoveCount; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
				Waiters.waitForElementToBeVisible(removeBedButton.get(i));
				ElementUtils.scrollInToElement(removeBedButton.get(i));
				Waiters.waitForElementToBeClickable(removeBedButton.get(i));
				removeBedButton.get(i).click();
			}

		} else if (bedCountNo > bedNameTextFieldList.size()) {
			Asserts.assertTrue(false,
					"bed count " + bedCountNo + " is greater than bed list " + bedNameTextFieldList.size() + "");
		} else {
			Asserts.assertTrue(false,
					"bed count " + bedCountNo + " is greater than bed list " + bedNameTextFieldList.size() + "");
		}
	}

	public void verifyBedsRemovedCapacity() {
		Waiters.waitForTimeout(1000);
		String bedCount = Integer.toString(bedNameTextFieldList.size());
		boolean value = false;
		if (ElementUtils.getInputValue(capacityTextField).equals(bedCount)) {
			value = true;
		} else {
			value = false;
		}
		System.out.println("after remove Bed count " + bedCount + " capacity "
				+ ElementUtils.getInputValue(capacityTextField) + "");
		Asserts.assertTrue(value, "Bed count " + bedCount + " not equal to capacity "
				+ ElementUtils.getInputValue(capacityTextField) + "");
	}

	public void searchSelectNewFacility() {
		Waiters.waitForElementToBeClickable(facilityTextField);
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(facilityTextField);
		ElementUtils.forceClickWithJs(facilityTextField);
		ElementUtils.typeTextWithIntervalUsingSendKeys(facilityTextField,
				FacilitiesPagePo.getInstance().getFacilityName(), 80);
		CommonUtils.selectDropDownOption(FacilitiesPagePo.getInstance().getFacilityName());
	}

}
