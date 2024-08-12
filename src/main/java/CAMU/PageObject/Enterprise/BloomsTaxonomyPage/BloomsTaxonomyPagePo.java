package CAMU.PageObject.Enterprise.BloomsTaxonomyPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class BloomsTaxonomyPagePo {

	private static BloomsTaxonomyPagePo BloomsTaxonomyPageInstance;
	String taxonomyNameRandom;
	String taxonomyCodeRandom;
	String taxonomyNameValue;
	String taxonomyCodeValue;

	private BloomsTaxonomyPagePo() {

	}

	public static BloomsTaxonomyPagePo getInstance() {
		if (BloomsTaxonomyPageInstance == null) {
			BloomsTaxonomyPageInstance = new BloomsTaxonomyPagePo();
		}
		return BloomsTaxonomyPageInstance;
	}

	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;

	@FindBy(css = "div.offcanvas-title")
	private WebElement createPanelTitle;

	@FindBy(css = "input[id=TypeId]")
	private WebElement learningDomainTextField;

	@FindBy(css = "input[name=BlmTxnmy]")
	private WebElement taxonomyNameTextField;

	@FindBy(css = "input[name=blmTxCd]")
	private WebElement taxonomyCodeTextField;

	@FindBy(css = "div.search input.search-input")
	private WebElement searchTextField;

	@FindBy(xpath = "(//td[contains(@class,'text-primary') and contains(@class,'table-cont_middle')])[2]")
	private WebElement searchList;

	@FindBy(xpath = "(//div[@title]//div[contains(@class,'indicatorContainer')])[1]")
	private WebElement removeSelectedLearningDomain;

	@FindBy(xpath = "//label[text()='Learning Domain']/following-sibling::div/div[@title]")
	private WebElement selectedLearningDomain;

	@FindBy(xpath = "//label[text()='Learning Domain']/following-sibling::div[@class='invalid-feedback']")
	private WebElement learningDomainErrorMessage;

	@FindBy(xpath = "//button[@type='reset' and text()='Reset']")
	private WebElement resetButton;

	public void clickAdd() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public String getTaxonomyPageTitle() {
		Waiters.waitForElementToBeVisible(createPanelTitle);
		return createPanelTitle.getText();
	}

	public void selectLearningDomain(String learningDomain) {
		Waiters.waitForElementToBeVisible(learningDomainTextField);
		ElementUtils.clearInputFieldWithJs(learningDomainTextField);
		ElementUtils.forceClickWithJs(learningDomainTextField);
		learningDomainTextField.sendKeys(learningDomain);
		CommonUtils.selectDropDownOption(learningDomain);
	}

	public void enterTaxonomyName(String taxonomyName) {
		Waiters.waitForElementToBeVisible(taxonomyNameTextField);
		ElementUtils.clearInputFieldWithJs(taxonomyNameTextField);
		taxonomyNameRandom = taxonomyName + StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		taxonomyNameTextField.sendKeys(taxonomyNameRandom);
	}

	public void enterTaxonomyCode(String taxonomyCode) {
		Waiters.waitForElementToBeVisible(taxonomyCodeTextField);
		ElementUtils.clearInputFieldWithJs(taxonomyCodeTextField);
		taxonomyCodeRandom = taxonomyCode + StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		taxonomyCodeTextField.sendKeys(taxonomyCodeRandom);
	}

	public void passTaxonomyName(String taxonomyName) {
		Waiters.waitForElementToBeVisible(taxonomyNameTextField);
		taxonomyNameTextField.clear();
		taxonomyNameValue = taxonomyName;
		taxonomyNameTextField.sendKeys(taxonomyName);
	}

	public void passTaxonomyCode(String taxonomyCode) {
		Waiters.waitForElementToBeVisible(taxonomyCodeTextField);
		taxonomyCodeTextField.clear();
		taxonomyCodeValue = taxonomyCode;
		taxonomyCodeTextField.sendKeys(taxonomyCode);
	}

	public String searchAndVerifyNewlyCreatedRecord() {
		Waiters.waitForElementToBeVisible(searchTextField);
		searchTextField.clear();
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchTextField, taxonomyNameRandom, 80);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(searchList);
		return searchList.getText();
	}

	public String getCreatedTaxonomyName() {
		return taxonomyNameRandom;
	}

	public void removeSelectedLearningDomain() {
		Waiters.waitForElementToBeClickable(removeSelectedLearningDomain);
		removeSelectedLearningDomain.click();
	}

	public boolean verifyLearningDomainCleared() {
		Waiters.waitForTimeout(1000);
		return ElementUtils.isDisappeared(selectedLearningDomain);
	}

	public String verifyLearningDomainErrorMessage() {
		return learningDomainErrorMessage.getText();
	}

	public void verifyAllFieldsCleared() {
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedLearningDomain), "Learning domain not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(taxonomyNameTextField).isEmpty(), "Taxonomy name not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(taxonomyCodeTextField).isEmpty(), "Taxonomy code not cleared");
	}

	public String returnTaxonomyName() {
		return taxonomyNameValue;
	}

	public String returnTaxonomyCode() {
		return taxonomyCodeValue;
	}

	public String getTaxonomyNameValue() {
		return ElementUtils.getInputValue(taxonomyNameTextField);
	}

	public String getTaxonomyCodeValue() {
		return ElementUtils.getInputValue(taxonomyCodeTextField);
	}

	public void verifyEditedChangesReverted() {
		Asserts.assertNotEqualsText(getTaxonomyNameValue(), taxonomyNameValue);
		Asserts.assertNotEqualsText(getTaxonomyCodeValue(), taxonomyCodeValue);
	}

	public void verifyTaxonomyNameField() {
		Waiters.waitForElementToBeVisible(taxonomyNameTextField);
		taxonomyNameTextField.clear();
		taxonomyNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(taxonomyNameTextField).isEmpty(),
				"Taxonomy name field didnt accept alphabets");
		taxonomyNameTextField.clear();
		taxonomyNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(taxonomyNameTextField).isEmpty(),
				"Taxonomy name field didnt accept numerical values");
		taxonomyNameTextField.clear();
		taxonomyNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(taxonomyNameTextField).isEmpty(),
				"Taxonomy name field didnt accept special characters");
	}

	public void verifyTaxonomyCodeField() {
		Waiters.waitForElementToBeVisible(taxonomyCodeTextField);
		taxonomyCodeTextField.clear();
		taxonomyCodeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(taxonomyCodeTextField).isEmpty(),
				"Taxonomy code field didnt accept alphabets");
		taxonomyCodeTextField.clear();
		taxonomyCodeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(taxonomyCodeTextField).isEmpty(),
				"Taxonomy code field didnt accept numerical values");
		taxonomyCodeTextField.clear();
		taxonomyCodeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(taxonomyCodeTextField).isEmpty(),
				"Taxonomy code field didnt accept special characters");
	}

}
