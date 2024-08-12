package CAMU.PageObject.Enterprise.CampusPage;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Asserts;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class CampusPagePo {
	
	private static CampusPagePo CampusPageInstance;
	String campusIdRandom;
	String campusNameRandom;
	int paginationNumber;
	int paginationInputNumber;

	private CampusPagePo() {

	}

	public static CampusPagePo getInstance() {
		if (CampusPageInstance == null) {
			CampusPageInstance = new CampusPagePo();
		}
		return CampusPageInstance;
	}
	
	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addCampusButton;
	
	@FindBy(css = ".main-container_block div.header_back p.text-secondary")
	private WebElement createNewCampusPageHeading;
	
	@FindBy(css = "input[name=CampID]")
	private WebElement campusIdTextField;
	
	@FindBy(css = "input[name=CampNa]")
	private WebElement campusNameTextField;
	
	@FindBy(css = "input[name=Desc]")
	private WebElement campusDescTextField;
	
	@FindBy(css = "input[name=AdL1]")
	private WebElement campusAddressLineOneTextField;
	
	@FindBy(css = "input[name=AdL2]")
	private WebElement campusAddressLineTwoTextField;
	
	@FindBy(css = "input[name=AdL3]")
	private WebElement campusAddressLineThreeTextField;
	
	@FindBy(css = "input[name=Cty]")
	private WebElement campusAddressLineFourTextField;
	
	@FindBy(css = "input[name=Mob]")
	private WebElement campusMobileNoTextField;
	
	@FindBy(css = "input[name=Tel]")
	private WebElement campusPhoneNumberTextField;
	
	@FindBy(css = "input[name=Email]")
	private WebElement campusEmailTextField;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Save']")
	private WebElement saveButton;
	
	@FindBy(css = "div.search input.search-input")
	private WebElement searchCampusTextField;
	
	@FindBy(css = "table.table-data_list td.text-primary:first-of-type")
	private WebElement campusIdTable;
	
	@FindBy(xpath = "//button[@type='reset' and text()='Reset']")
	private WebElement resetButton;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Update']")
	private WebElement updateButton;
	
	@FindBy(css = "input[name=Mob] + .invalid-feedback")
	private WebElement mobileNoErrorMessage;
	
	@FindBy(css = "input[name=Tel] + .invalid-feedback")
	private WebElement phoneNoErrorMessage;
	
	@FindBy(css = "input[name=Email] + .invalid-feedback")
	private WebElement emailIdErrorMessage;
	
	@FindBy(css = ".table-pagination_view .text-secondary")
	private WebElement paginationText;
	
	@FindBy(css = ".table-pagination_view .table-count_input")
	private WebElement paginationInputTextField;
	
	@FindBy(xpath = "//span[text()='first_page']/parent::button")
	private WebElement firstPageButton;
	
	@FindBy(xpath = "//span[text()='last_page']/parent::button")
	private WebElement lastPageButton;
	
	@FindBy(xpath = "//button[@type='button' and text()='Prev']")
	private WebElement previousPageButton;
	
	@FindBy(xpath = "//button[@type='button' and text()='Next']")
	private WebElement nextPageButton;
	
	@FindBy(css = ".table-pagination_view .table-filter_option")
	private WebElement pageFilterDropDown;
	
	@FindBy(css = "table.table-data_list tbody tr")
	private List<WebElement> pageContentList;

	public void clickAddCampusButton() {
		Waiters.waitForElementToBeVisible(addCampusButton);
		Waiters.waitForElementToBeClickable(addCampusButton);
		addCampusButton.click();
	}

	public String verifyNavigateCreateNewCampus() {
		Waiters.waitForTimeout(1000);
		return createNewCampusPageHeading.getText();
	}

	public void passCampusId(String campusId) {
		Waiters.waitForElementToBeVisible(campusIdTextField);
		campusIdRandom =  campusId+StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		campusIdTextField.sendKeys(campusIdRandom);
	}

	public void passCampusName(String campusName) {
		Waiters.waitForElementToBeVisible(campusNameTextField);
		ElementUtils.clearInputFieldWithJs(campusNameTextField);
		campusNameRandom =  campusName+StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		campusNameTextField.sendKeys(campusNameRandom);
	}

	public void passCampusDescription(String campusDescription) {
		Waiters.waitForElementToBeVisible(campusDescTextField);
		ElementUtils.clearInputFieldWithJs(campusDescTextField);
		campusDescTextField.sendKeys(campusDescription);
	}

	public void passCampusAddressLineOne(String address) {
		Waiters.waitForElementToBeVisible(campusAddressLineOneTextField);
		ElementUtils.clearInputFieldWithJs(campusAddressLineOneTextField);
		campusAddressLineOneTextField.sendKeys(address);
	}

	public void passCampusAddressLineTwo(String address) {
		Waiters.waitForElementToBeVisible(campusAddressLineTwoTextField);
		ElementUtils.clearInputFieldWithJs(campusAddressLineTwoTextField);
		campusAddressLineTwoTextField.sendKeys(address);
	}

	public void passCampusAddressLineThree(String address) {
		Waiters.waitForElementToBeVisible(campusAddressLineThreeTextField);
		ElementUtils.clearInputFieldWithJs(campusAddressLineThreeTextField);
		campusAddressLineThreeTextField.sendKeys(address);
	}

	public void passCampusAddressLineFour(String address) {
		Waiters.waitForElementToBeVisible(campusAddressLineFourTextField);
		ElementUtils.clearInputFieldWithJs(campusAddressLineFourTextField);
		campusAddressLineFourTextField.sendKeys(address);
	}

	public void enterCampusMobileNo(String mobileNo) {
		Waiters.waitForElementToBeVisible(campusMobileNoTextField);
		ElementUtils.clearInputFieldWithJs(campusMobileNoTextField);
		campusMobileNoTextField.sendKeys(mobileNo);
	}

	public void enterCampusPhoneNo(String phoneNo) {
		Waiters.waitForElementToBeVisible(campusPhoneNumberTextField);
		ElementUtils.clearInputFieldWithJs(campusPhoneNumberTextField);
		campusPhoneNumberTextField.sendKeys(phoneNo);
	}

	public void enterEmailAddress(String emailAddress) {
		Waiters.waitForElementToBeVisible(campusEmailTextField);
		ElementUtils.clearInputFieldWithJs(campusEmailTextField);
		campusEmailTextField.sendKeys(emailAddress);
	}

	public void clickSaveButton() {
		Waiters.waitForElementToBeVisible(saveButton);
		Waiters.waitForElementToBeClickable(saveButton);
		saveButton.click();
	}

	public String searchCreatedNewCampusAndVerify() {
		Waiters.waitForElementToBeVisible(searchCampusTextField);
		searchCampusTextField.clear();
//		ActionsUtils.typeTextWithInterval(searchCampusTextField, campusIdRandom);
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchCampusTextField, campusIdRandom, 80);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(campusIdTable);
		return campusIdTable.getText();
	}

	public String getCampusId() {
		return campusIdRandom;
	}

	public void clickResetButton() {
		Waiters.waitForElementToBeVisible(resetButton);
		Waiters.waitForElementToBeClickable(resetButton);
		resetButton.click();
	}

	public void verifyAllFieldsCleared() {
		Asserts.assertTrue(ElementUtils.getInputValue(campusIdTextField).isEmpty(), "Campus id field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(campusNameTextField).isEmpty(), "Campus name field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(campusDescTextField).isEmpty(), "Campus description field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(campusAddressLineOneTextField).isEmpty(), "Address line 1 field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(campusAddressLineTwoTextField).isEmpty(), "Address line 2 field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(campusAddressLineThreeTextField).isEmpty(), "Address line 3 field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(campusAddressLineFourTextField).isEmpty(), "Address line 4 field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(campusMobileNoTextField).isEmpty(), "Mobile No. field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(campusPhoneNumberTextField).isEmpty(), "Phone No. field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(campusEmailTextField).isEmpty(), "Email address field is not cleared");
		
	}

	public boolean verifySaveButtonDisabled() {
		return !saveButton.isEnabled();
	}

	public boolean verifySaveButtonEnabled() {
		return saveButton.isEnabled();
	}

	public void searchCampusList(String campusId) {
		Waiters.waitForElementToBeVisible(searchCampusTextField);
		searchCampusTextField.clear();
//		ActionsUtils.typeTextWithInterval(searchCampusTextField, campusId);
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchCampusTextField, campusId, 80);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(campusIdTable);
	}

	public boolean verifyCampusIdNotEditable() {
		return !campusIdTextField.isEnabled();
	}

	public void clickUpdateButton() {
		Waiters.waitForElementToBeVisible(updateButton);
		Waiters.waitForElementToBeClickable(updateButton);
		updateButton.click();
	}

	public boolean verifyMobileNoErrorMessage() {
		return mobileNoErrorMessage.isDisplayed();
	}

	public boolean verifyPhoneNoErrorMessage() {
		return phoneNoErrorMessage.isDisplayed();
	}

	public boolean verifyEmailIdErrorMessage() {
		return emailIdErrorMessage.isDisplayed();
	}

	public void enterCampusId(String campusId) {
		Waiters.waitForElementToBeVisible(campusIdTextField);
		ElementUtils.clearInputFieldWithJs(campusIdTextField);
		campusIdTextField.sendKeys(campusId);
	}

	public void enterCampusName(String campusName) {
		Waiters.waitForElementToBeVisible(campusNameTextField);
		ElementUtils.clearInputFieldWithJs(campusNameTextField);
		campusNameTextField.sendKeys(campusName);
	}

	public void verifyAllFieldsAcceptAlphabets() {
		Asserts.assertTrue(!ElementUtils.getInputValue(campusIdTextField).isEmpty(), "Campus id field not accept alphabets");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusNameTextField).isEmpty(), "Campus name field not accept alphabets");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusDescTextField).isEmpty(), "Campus description field not accept alphabets");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineOneTextField).isEmpty(), "Address line 1 field not accept alphabets");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineTwoTextField).isEmpty(), "Address line 2 field not accept alphabets");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineThreeTextField).isEmpty(), "Address line 3 field not accept alphabets");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineFourTextField).isEmpty(), "Address line 4 field not accept alphabets");
	}

	public void verifyAllFieldsAcceptNumbers() {
		Asserts.assertTrue(!ElementUtils.getInputValue(campusIdTextField).isEmpty(), "Campus id field not accept numbers");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusNameTextField).isEmpty(), "Campus name field not accept numbers");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusDescTextField).isEmpty(), "Campus description field not accept numbers");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineOneTextField).isEmpty(), "Address line 1 field not accept numbers");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineTwoTextField).isEmpty(), "Address line 2 field not accept numbers");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineThreeTextField).isEmpty(), "Address line 3 field not accept numbers");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineFourTextField).isEmpty(), "Address line 4 field not accept numbers");
	}

	public void verifyAllFieldsAcceptSpecialCharacters() {
		Asserts.assertTrue(!ElementUtils.getInputValue(campusIdTextField).isEmpty(), "Campus id field not accept special character");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusNameTextField).isEmpty(), "Campus name field not accept special character");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusDescTextField).isEmpty(), "Campus description field not accept special character");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineOneTextField).isEmpty(), "Address line 1 field not accept special character");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineTwoTextField).isEmpty(), "Address line 2 field not accept special character");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineThreeTextField).isEmpty(), "Address line 3 field not accept special character");
		Asserts.assertTrue(!ElementUtils.getInputValue(campusAddressLineFourTextField).isEmpty(), "Address line 4 field not accept special character");
	}

	public void verifyOnFirstPage() {
		Waiters.waitForElementToBeVisible(paginationText);
		String value[] = paginationText.getText().split(" ");
		String pageNo = paginationInputTextField.getAttribute("title");
		Waiters.waitForElementToBeVisible(paginationInputTextField);
		boolean var = false;
		if(value[1].equals(pageNo)) {
			var = true;
		}
		Asserts.assertTrue(var, "Pagination no. "+value[1]+" and Page no. "+pageNo+" are not equal");
	}

	public void verifyFirstPagePreviousPageButtonDisabled() {
		Asserts.assertTrue(!firstPageButton.isEnabled(), "First page button is enabled");
		Asserts.assertTrue(!previousPageButton.isEnabled(), "Previous page button is enabled");
	}

	public void verifyNextPageLastPageButtonEnabled() {
		Asserts.assertTrue(nextPageButton.isEnabled(), "Next page button is disabled");
		Asserts.assertTrue(lastPageButton.isEnabled(), "Last page button is disabled");
	}

	public void clickLastPageButton() {
		Waiters.waitForElementToBeVisible(lastPageButton);
		Waiters.waitForElementToBeClickable(lastPageButton);
		lastPageButton.click();
	}

	public void verifyOnLastPage() {
		Waiters.waitForElementToBeVisible(paginationText);
		String value[] = paginationText.getText().split(" ");
		String pageNo = paginationInputTextField.getAttribute("title");
		Waiters.waitForElementToBeVisible(paginationInputTextField);
		boolean var = false;
		if(value[3].equals(pageNo)) {
			var = true;
		}
		Asserts.assertTrue(var, "Pagination no. "+value[1]+" and Page no. "+pageNo+" are not equal");
	}

	public void verifyNextPageLastPageButtonDisabled() {
		Asserts.assertTrue(!nextPageButton.isEnabled(), "Next page button is enabled");
		Asserts.assertTrue(!lastPageButton.isEnabled(), "Last page button is enabled");
	}

	public void verifyFirstPagePreviousPageButtonEnabled() {
		Asserts.assertTrue(firstPageButton.isEnabled(), "First page button is disabled");
		Asserts.assertTrue(previousPageButton.isEnabled(), "Previous page button is disabled");
	}

	public void clickNextPageButton() {
		Waiters.waitForElementToBeVisible(nextPageButton);
		Waiters.waitForElementToBeClickable(nextPageButton);
		nextPageButton.click();
	}

	public void clickPreviousPageButton() {
		Waiters.waitForElementToBeVisible(previousPageButton);
		Waiters.waitForElementToBeClickable(previousPageButton);
		previousPageButton.click();
	}
	
	public void getPaginationText() {
		Waiters.waitForElementToBeVisible(paginationText);
		String value[] = paginationText.getText().split(" ");
		paginationNumber = Integer.parseInt(value[1]);
	}
	
	public void getPaginationInputText() {
		Waiters.waitForElementToBeVisible(paginationInputTextField);
		paginationInputNumber = Integer.parseInt(paginationInputTextField.getAttribute("title"));
	}

	public void verifyNavigateNextPage() {
		Waiters.waitForElementToBeVisible(paginationText);
		Waiters.waitForElementToBeVisible(paginationInputTextField);
		boolean page = false;
		String value[] = paginationText.getText().split(" ");
		int newPaginationNumber = Integer.parseInt(value[1]);
		int newPaginationInputNumber = Integer.parseInt(paginationInputTextField.getAttribute("title"));
		if(newPaginationNumber > paginationNumber && newPaginationInputNumber > paginationInputNumber) {
			page = true;
		}
		Asserts.assertTrue(page, "Not navigates to next page");
	}

	public void verifyNavigatePreviousPage() {
		Waiters.waitForElementToBeVisible(paginationText);
		Waiters.waitForElementToBeVisible(paginationInputTextField);
		boolean page = false;
		String value[] = paginationText.getText().split(" ");
		int newPaginationNumber = Integer.parseInt(value[1]);
		int newPaginationInputNumber = Integer.parseInt(paginationInputTextField.getAttribute("title"));
		if(newPaginationNumber < paginationNumber && newPaginationInputNumber < paginationInputNumber) {
			page = true;
		}
		Asserts.assertTrue(page, "Not navigates to previous page");
	}

	public void selectPageFilter(String showPerPage) {
		Waiters.waitForElementToBeVisible(pageFilterDropDown);
		ElementUtils.selectFromDropDown(pageFilterDropDown, "text", showPerPage);
	}

	public void enterPageNumber(String pageNo) {
		Waiters.waitForElementToBeVisible(paginationInputTextField);
		paginationInputTextField.click();
		paginationInputTextField.sendKeys(Keys.LEFT_CONTROL, "a");
		paginationInputTextField.sendKeys("2");
	}

	public void verifyNavigatesToPageNumber(String pageNo) {
		boolean var = false;
		String value[] = paginationText.getText().split(" ");
		int pageNumber = Integer.parseInt(pageNo);
		int newPaginationNumber = Integer.parseInt(value[1]);
		int newPaginationInputNumber = Integer.parseInt(paginationInputTextField.getAttribute("title"));
		if(newPaginationNumber==pageNumber && newPaginationInputNumber==pageNumber) {
			var = true;
		}
		Asserts.assertTrue(var, "Pagination no "+newPaginationInputNumber+" and Page No. "+newPaginationNumber+" is not equal to expected Page No. "+pageNumber+"");
	}

	public void verifyListInPage(String pageList) {
		String value[] = pageList.split(" ");
		int pageNumber = Integer.parseInt(value[1]);
		boolean var = false;
		if(pageContentList.size()<=pageNumber) {
			var = true;
		}
		Asserts.assertTrue(var, "Page list result "+pageContentList.size()+" is not equal to Page content shown "+pageNumber+"");
	}

	public void clickFirstPageButton() {
		Waiters.waitForElementToBeVisible(firstPageButton);
		Waiters.waitForElementToBeClickable(firstPageButton);
		firstPageButton.click();
	}

}
