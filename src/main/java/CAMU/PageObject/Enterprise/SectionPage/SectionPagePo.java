package CAMU.PageObject.Enterprise.SectionPage;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class SectionPagePo {

	private static SectionPagePo sectionPageInstance;
	String randamSectionId;
	String randamSectionName;
	String randomSectionDescription;

	public SectionPagePo() {

	}

	public static SectionPagePo getInstance() {
		if (sectionPageInstance == null) {
			sectionPageInstance = new SectionPagePo();
		}
		return sectionPageInstance;
	}

	@FindBy(xpath = "//p[contains(@class,'text-primary') and text()='Sections']")
	private WebElement verifySectionPage;

	@FindBy(xpath = "//p[contains(@class,'text-secondary') and contains(text(),'Create New')]")
	private WebElement verifyNewSectionPage;

	@FindBy(xpath = "//input[@name='SecID']")
	private WebElement sectionId;

	@FindBy(xpath = "//input[@name='Name']")
	private WebElement sectionName;

	@FindBy(xpath = "//input[@name='Desc']")
	private WebElement sectionDescription;

	@FindBy(xpath = "//input[@name='isArr' and @type='checkbox']")
	private WebElement arrearSection;

	@FindBy(xpath = "//button[@type='submit' and contains(@class,'btn-primary')]")
	private WebElement saveButton;

	@FindBy(xpath = "//p[@class='toaster-sub_label']")
	private WebElement savedSuccessfully;

	@FindBy(xpath = "//P[text()='This section name is already selected.']")
	private WebElement duplicateErrorMessage;

	@FindBy(xpath = "//label[text()='Institution']/following::input[@id='InId']")
	private WebElement institutionTextField;

	@FindBy(xpath = "//button[@type='reset' and contains(@class,'btn-secondary')]")
	private WebElement resetButton;
	
	@FindBy(xpath = "//input[@id='InId']//parent::div//preceding-sibling::div")
	private WebElement selectedInstitution;
	
	@FindBy(xpath = "//input[@placeholder='Search' and contains(@class,'search-input')]")
	private WebElement searchBar;
	
	@FindBy(xpath = "//div[@class='fs-3']//a[@role='button' and @text='Edit']")
	private WebElement editButton;
	
	@FindBy(xpath = "//p[text()='Updated successfully.']")
	private WebElement updatedMessage;
	
	@FindBy(xpath = "//p[contains(@class,'text-secondary') and text()='Edit Section']")
	private WebElement verifyEditScreen;

	public void toVerifySectionPage() {
		Waiters.waitForElementToBeVisible(verifySectionPage);
		Asserts.assertTrue(verifySectionPage.isDisplayed(), "The Sections title is not there");
	}

	public void toVerifySectionCreationPage() {
		Waiters.waitForElementToBeVisible(verifyNewSectionPage);
		Asserts.assertTrue(verifyNewSectionPage.isDisplayed(), "Wrong navigation");
	}

	public void toPassSectionId(String ID) {
		Waiters.waitForElementToBeVisible(sectionId);
		sectionId.clear();
		randamSectionId = ID + StringUtils.generateRandomStringNumberCharacter(1, 1, 1);
		sectionId.sendKeys(randamSectionId);
	}

	public void toPassSectionName(String name) {
		Waiters.waitForElementToBeVisible(sectionName);
		sectionName.clear();
		randamSectionName = name + StringUtils.generateRandomStringNumberCharacter(1, 1, 1);
		sectionName.sendKeys(randamSectionName);
	}

	public void toPassSectionDescription(String description) {
		Waiters.waitForElementToBeVisible(sectionDescription);
		sectionDescription.clear();
		randomSectionDescription = description + StringUtils.generateRandomStringNumberCharacter(1, 1, 1);
		sectionDescription.sendKeys(randomSectionDescription);

	}

	public void toEnableArrearSection() {
		Waiters.waitForElementToBeVisible(arrearSection);
		if (!arrearSection.isSelected()) {
			arrearSection.click();
		}
	}

	public void toClickSaveButton() {
		Waiters.waitForElementToBeVisible(saveButton);
		saveButton.click();
	}

	public void toPassNumericId(String ID) {
		Waiters.waitForElementToBeVisible(sectionId);
		sectionId.clear();
		randamSectionId = ID + StringUtils.generateRandomNumbers(2);
		sectionId.sendKeys(randamSectionId);
	}

	public void toPassNumericSectionName(String name) {
		Waiters.waitForElementToBeVisible(sectionName);
		sectionName.clear();
		randamSectionName = name + StringUtils.generateRandomNumbers(2);
		sectionName.sendKeys(randamSectionName);
	}

	public void toPassNumericSectionDescription(String description) {
		Waiters.waitForElementToBeVisible(sectionDescription);
		sectionDescription.clear();
		randomSectionDescription = description + StringUtils.generateRandomNumbers(2);
		sectionDescription.sendKeys(randomSectionDescription);

	}

	public void toPassAlphabeticalId(String ID) {
		Waiters.waitForElementToBeVisible(sectionId);
		sectionId.clear();
		randamSectionId = ID + StringUtils.generateRandomString(1);
		sectionId.sendKeys(randamSectionId);
	}

	public void toPassAlphabeticalSectionName(String name) {
		Waiters.waitForElementToBeVisible(sectionName);
		sectionName.clear();
		randamSectionName = name + StringUtils.generateRandomString(1);
		sectionName.sendKeys(randamSectionName);
	}

	public void toPassAlphabeticalSectionDescription(String description) {
		Waiters.waitForElementToBeVisible(sectionDescription);
		sectionDescription.clear();
		randomSectionDescription = description + StringUtils.generateRandomString(1);
		sectionDescription.sendKeys(randomSectionDescription);

	}

	public void toVerifySavedSyccessfullyMessage() {
		Waiters.waitForElementToBeVisible(savedSuccessfully);
		Asserts.assertTrue(savedSuccessfully.isDisplayed(), "Section is not saved...");
	}

	public void toPassDuplicateId(String ID) {
		Waiters.waitForElementToBeVisible(sectionId);
		ElementUtils.clearAndEnterText(sectionId, ID);
	}

	public void toPassDuplicateSectionName(String name) {
		Waiters.waitForElementToBeVisible(sectionName);
		ElementUtils.clearAndEnterText(sectionName, name);
	}

	public void toPassDuplicateSectionDescription(String description) {
		Waiters.waitForElementToBeVisible(sectionDescription);
		ElementUtils.clearAndEnterText(sectionDescription, description);
	}

	public boolean toVerifyDuplicateErrorMessage() {
		Waiters.waitForElementToBeVisible(duplicateErrorMessage);
		return duplicateErrorMessage.isDisplayed();
	}

	public void toVerifyTheSaveButtonIsDisabled() {
		Waiters.waitForElementToBeVisible(saveButton);
		Asserts.assertTrue(!saveButton.isEnabled(), "Save button is enabled");
	}

	public boolean toVerifyInstitutionIsRetted() {
		Waiters.waitForElementToBeVisible(selectedInstitution);
		try {
			return !institutionTextField.isDisplayed();
		} catch (NoSuchElementException | StaleElementReferenceException e) {
			return true;
		}
	}

	public void toClickResetButton() {
		Waiters.waitForElementToBeVisible(resetButton);
		resetButton.click();
	}

	public boolean toVerifySectionIdResetted() {
		Waiters.waitForElementToBeVisible(sectionId);
		String inputValue = ElementUtils.getInputValue(sectionId);
		return inputValue.isEmpty();
	}

	public boolean toVerifySectionNameResetted() {
		Waiters.waitForElementToBeVisible(sectionName);
		String inputValue = ElementUtils.getInputValue(sectionName);
		return inputValue.isEmpty();
	}

	public boolean toVerifySectionDescriptionResetted() {
		Waiters.waitForElementToBeVisible(sectionDescription);
		String inputValue = ElementUtils.getInputValue(sectionDescription);
		return inputValue.isEmpty();
	}
	
	public boolean toVerifyArrearSectionCheckboxDisabled() {
		Waiters.waitForElementToBeVisible(arrearSection);
		return arrearSection.isSelected();
	}
	
	public boolean toViewTheSelectedSection(String option) {
		WebElement element = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-ellipsis') and text()='"+option+"'][1]"));
		return element.isDisplayed();
	}
	
	public void toClickThreeDotToEdit(String option) {
		WebElement element = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-ellipsis') and text()='"+option+"']/following::td//div//div//button[@id='dropdown-basic']"));
		element.click();
	}
	
	public void toClickEditButton() {
		Waiters.waitForElementToBeVisible(editButton);
		editButton.click();
	}
	public void toSearchtheSection(String value) {
		Waiters.waitForElementToBeVisible(searchBar);
		searchBar.sendKeys(value);
		
	}
	public boolean toVerifyEditSectionScreen() {
		Waiters.waitForElementToBeVisible(verifyEditScreen);
		return verifyEditScreen.isDisplayed();
	}
	
	public void toEnableOrDisableArrearSection() {
		if(!arrearSection.isSelected()) {
			arrearSection.click();
		}else {
			arrearSection.click();
		}
	}
	
	public void toVerifySectionIdDisabled() {
		Waiters.waitForElementToBeVisible(sectionId);
		Asserts.assertTrue(!sectionId.isEnabled(),"Section Id is Enabled");
	}
	
	public void toVerifyUpdatedConfirmationMessage() {
		Waiters.waitForElementToBeVisible(updatedMessage);
		Asserts.assertTrue(updatedMessage.isDisplayed(), "Not Edited");
	}
	
	public void toVerifySectionDescriptionDisabled() {
		Waiters.waitForElementToBeVisible(sectionDescription);
		Asserts.assertTrue(!sectionDescription.isEnabled(), "Section description is Enabled");
	}
	
}
