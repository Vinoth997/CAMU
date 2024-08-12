package CAMU.PageObject.Enterprise.BatchPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class BatchPagePo {
	
	private static BatchPagePo BatchPageInstance;
	String randombatchType;
	String randombatchName;
	String updatedRandombatchType;

	private BatchPagePo() {

	}

	public static BatchPagePo getInstance() {
		if (BatchPageInstance == null) {
			BatchPageInstance = new BatchPagePo();
		}
		return BatchPageInstance;
	}
	
	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;
	
	@FindBy(css = "div.offcanvas-title")
	private WebElement newBatchPanelTitle;
	
	@FindBy(xpath = "//span[text()='add' and contains(@class,'material-symbols-rounded')]")
	private WebElement plusButton;
	
	@FindBy(css = "div.modal-title")
	private WebElement dialogTitle;
	
	@FindBy(css = "input[name=Type]")
	private WebElement newBatchTypeTextField;
	
	@FindBy(css = "div.modal-content button[type=submit]")
	private WebElement batchTypeSaveButton;
	
	@FindBy(css = "input[name=BatchName]")
	private WebElement batchNameTextField;
	
	@FindBy(css = "div.search input.search-input")
	private WebElement searchBatchTextField;
	
	@FindBy(css = "table.table-data_list td.text-primary:first-of-type")
	private WebElement batchList;
	
	@FindBy(css = "input[id=BatchType]")
	private WebElement batchTypeTextField;
	
	@FindBy(xpath = "//span[text()='edit' and contains(@class,'material-symbols-rounded')]")
	private WebElement editBatchTypeButton;
	
	@FindBy(xpath = "//div[contains(@class,'modal-title') and text()='Edit batch type']")
	private WebElement editBatchDialogTitle;
	
	@FindBy(css = "div.select div[title]")
	private WebElement selectedBacthType;
	
	@FindBy(xpath = "//div[@class='modal-content']//button[@type='reset' and text()='Reset']")
	private WebElement editBatchTypeResetButton;
	
	@FindBy(xpath = "//div[@class='modal-content']//button[@type='button' and text()='Cancel']")
	private WebElement editBatchTypeCancelButton;
	
	@FindBy(xpath = "//div[@class='modal-content']//button[@type='submit' and text()='Update']")
	private WebElement editBatchTypeUpdateButton;
	
	@FindBy(xpath = "(//label[text()='Batch Type']//following::div[contains(@class,'indicatorContainer')])[1]")
	private WebElement batchTypeClearButton;
	
	@FindBy(css = ".modal-content .btn-close")
	private WebElement createNewBatchTypeCloseButton;
	
	@FindBy(xpath = "//div[text()='Create new Batch']/following::button[@class='btn-close']")
	private WebElement createNewBatchCloseButton;

	public void clickAdd() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public String getBatchPageTitle() {
		Waiters.waitForElementToBeVisible(newBatchPanelTitle);
		return newBatchPanelTitle.getText();
	}

	public void clickPlus() {
		Waiters.waitForElementToBeVisible(plusButton);
		Waiters.waitForElementToBeClickable(plusButton);
		plusButton.click();
	}

	public String isCreateNewBatch() {
		Waiters.waitForElementToBeVisible(dialogTitle);
		return dialogTitle.getText();
	}

	public void enterNewBatchType(String batchType) {
		Waiters.waitForElementToBeVisible(newBatchTypeTextField);
		randombatchType = batchType+StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		newBatchTypeTextField.sendKeys(randombatchType);
	}

	public void clickSave() {
		Waiters.waitForElementToBeVisible(batchTypeSaveButton);
		Waiters.waitForElementToBeClickable(batchTypeSaveButton);
		batchTypeSaveButton.click();
	}

	public void enterBatchName(String batchName) {
		Waiters.waitForElementToBeVisible(batchNameTextField);
		randombatchName = batchName+StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		batchNameTextField.sendKeys(randombatchName);
	}

	public String searchAndVerifyNewlyCreatedBatch() {
		Waiters.waitForElementToBeVisible(searchBatchTextField);
		searchBatchTextField.clear();
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchBatchTextField, randombatchName, 80);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(batchList);
		return batchList.getText();
	}

	public String getCreatedBatchName() {
		return randombatchName;
	}

	public void selectBatchType(String batchType) {
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(batchTypeTextField);
		ElementUtils.forceClickWithJs(batchTypeTextField);
		batchTypeTextField.sendKeys(batchType);
		CommonUtils.selectDropDownOption(batchType);
	}
	
	public void clickEditBatchType() {
		Waiters.waitForElementToBeVisible(editBatchTypeButton);
		Waiters.waitForElementToBeClickable(editBatchTypeButton);
		editBatchTypeButton.click();
	}

	public boolean isEditBatchDisplayed() {
		Waiters.waitForTimeout(1000);
		return editBatchDialogTitle.isDisplayed();
	}

	public void editBatchType(String batchType) {
		Waiters.waitForElementToBeVisible(newBatchTypeTextField);
		ElementUtils.clearInputFieldWithJs(newBatchTypeTextField);
		updatedRandombatchType = batchType+StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		newBatchTypeTextField.sendKeys(updatedRandombatchType);
	}

	public String verifyBatchTypeUpdated() {
		Waiters.waitForElementToBeVisible(selectedBacthType);
		return selectedBacthType.getAttribute("title");
	}
	
	public String getCreatedBatchType() {
		return updatedRandombatchType;
	}

	public void clickResetOnEditBatchType() {
		Waiters.waitForElementToBeVisible(editBatchTypeResetButton);
		Waiters.waitForElementToBeClickable(editBatchTypeResetButton);
		editBatchTypeResetButton.click();
	}
	
	public String getEditBatchTypeInputValue() {
		return ElementUtils.getInputValue(newBatchTypeTextField);
	}

	public void clickCancelBatchType() {
		Waiters.waitForElementToBeVisible(editBatchTypeCancelButton);
		Waiters.waitForElementToBeClickable(editBatchTypeCancelButton);
		editBatchTypeCancelButton.click();
	}

	public boolean isEditBatchIsDisappeared() {
		Waiters.waitForTimeout(1000);
		return ElementUtils.isDisappeared(editBatchDialogTitle);
	}

	public void verifyBatchTypeBatchNameFieldsCleared() {
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedBacthType), "Batch type field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(batchNameTextField).isEmpty(), "Batch type field is not cleared");
	}

	public void clearSelectedBatchType() {
		Waiters.waitForElementToBeVisible(batchTypeClearButton);
		Waiters.waitForElementToBeClickable(batchTypeClearButton);
		batchTypeClearButton.click();
	}

	public boolean verifyBatchTypeFieldCleared() {
		return ElementUtils.isDisappeared(selectedBacthType);
	}

	public void editNewBatchType(String batchType) {
		Waiters.waitForElementToBeVisible(newBatchTypeTextField);
		ElementUtils.clearInputFieldWithJs(newBatchTypeTextField);
		newBatchTypeTextField.sendKeys(batchType);
	}

	public void clickUpdateBatchType() {
		Waiters.waitForElementToBeVisible(editBatchTypeUpdateButton);
		Waiters.waitForElementToBeClickable(editBatchTypeUpdateButton);
		editBatchTypeUpdateButton.click();
	}

	public void editBatchName(String batchName) {
		Waiters.waitForElementToBeVisible(batchNameTextField);
		ElementUtils.clearInputFieldWithJs(batchNameTextField);
		batchNameTextField.sendKeys(batchName);
	}

	public void enterBatchType(String batchType) {
		Waiters.waitForElementToBeVisible(newBatchTypeTextField);
		ElementUtils.clearInputFieldWithJs(newBatchTypeTextField);
		newBatchTypeTextField.sendKeys(batchType);
	}

	public void enterBatchNewName(String batchName) {
		Waiters.waitForElementToBeVisible(batchNameTextField);
		ElementUtils.clearInputFieldWithJs(batchNameTextField);
		batchNameTextField.sendKeys(batchName);
	}

	public void verifyBatchTypeAcceptAlphabets() {
		Asserts.assertTrue(!ElementUtils.getInputValue(newBatchTypeTextField).isEmpty(), "Batch type text fields not accept alphabets");
	}

	public void verifyBatchTypeAcceptNumbers() {
		Asserts.assertTrue(!ElementUtils.getInputValue(newBatchTypeTextField).isEmpty(), "Batch type text fields not accept numbers");
	}

	public void verifyBatchTypeAcceptSpecialCharacters() {
		Asserts.assertTrue(!ElementUtils.getInputValue(newBatchTypeTextField).isEmpty(), "Batch type text fields not accept special characters");
	}

	public void clickCloseCreateNewBatchType() {
		Waiters.waitForElementToBeVisible(createNewBatchTypeCloseButton);
		Waiters.waitForElementToBeClickable(createNewBatchTypeCloseButton);
		createNewBatchTypeCloseButton.click();
	}

	public void verifyBatchNameAcceptAlphabets() {
		Asserts.assertTrue(!ElementUtils.getInputValue(batchNameTextField).isEmpty(), "Batch name text fields not accept alphabets");
	}

	public void verifyBatchNameAcceptNumbers() {
		Asserts.assertTrue(!ElementUtils.getInputValue(batchNameTextField).isEmpty(), "Batch name text fields not accept numbers");
	}

	public void verifyBatchNameAcceptSpecialCharacters() {
		Asserts.assertTrue(!ElementUtils.getInputValue(batchNameTextField).isEmpty(), "Batch name text fields not accept special chracters");
	}

	public void clickCloseCreateNewBatchPanel() {
		Waiters.waitForElementToBeVisible(createNewBatchCloseButton);
		Waiters.waitForElementToBeClickable(createNewBatchCloseButton);
		createNewBatchCloseButton.click();
	}

}
