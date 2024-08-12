package CAMU.PageObject.Billing.BillingItemCategory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class BillingItemCategoryPagePo {
	
	private static BillingItemCategoryPagePo BillingItemCategoryPageInstance;
	String ranCategory;
	String ranBillItemCode;
	String ranBillItemName;

	private BillingItemCategoryPagePo() {

	}

	public static BillingItemCategoryPagePo getInstance() {
		if (BillingItemCategoryPageInstance == null) {
			BillingItemCategoryPageInstance = new BillingItemCategoryPagePo();
		}
		return BillingItemCategoryPageInstance;
	}
	
	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Billing Item Category']/following-sibling::input")
	private WebElement categoryTextField;
	
	@FindBy(xpath = "//label[text()='Bank Details']/following-sibling::input")
	private WebElement bankDetailsTextField;
	
	@FindBy(xpath = "//label[text()='Bank Name']/following-sibling::input")
	private WebElement bankNameTextField;
	
	@FindBy(css = "input[id=AcYr]")
	private WebElement academicYearTextField;
	
	@FindBy(css = "input[name=BillItmCode]")
	private WebElement billItemCodeTextField;
	
	@FindBy(css = "input[name=Desc]")
	private WebElement billItemNameTextField;
	 
	@FindBy(css = "input[name=DisTxt]")
	private WebElement billItemDisplayTextField;
	
	@FindBy(css = "input[id=BillItemCtgry]")
	private WebElement selectBillItemCategoryTextField;
	
	@FindBy(css = "input[name=StdPrice]")
	private WebElement costTextField;
	
	@FindBy(xpath = "//span[text()='delete']")
	private WebElement deleteCostFieldButton;
	
	@FindBy(xpath = "//button[@type='button' and text()='Show me the results!']")
	private WebElement showMeTheResultsButton;
	
	@FindBy(css = ".dropdown-menu.show a")
	private List<WebElement> moreOptionList;
	
	@FindBy(xpath = "//div[contains(@class,'form-view_container')]//div[contains(@class,hstack)]//label[text()='Admission No:']//following-sibling::label")
	private WebElement admissionNoText;
	
	@FindBy(xpath = "(//input[@id='BillItemId'])[last()]")
	private WebElement billingBillItemTextField;
	
	@FindBy(xpath = "//button[@type='button' and text()='Save']")
	private WebElement saveButton;

	public void clickAdd() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public void enterCategory(String category) {
		Waiters.waitForElementToBeVisible(categoryTextField);
		ranCategory = category+StringUtils.generateRandomStringNumberCharacter(2, 2, 0);
		categoryTextField.sendKeys(ranCategory);
	}

	public void enterBankDetail(String bankDetail) {
		Waiters.waitForElementToBeVisible(bankDetailsTextField);
		bankDetailsTextField.sendKeys(bankDetail);
	}

	public void enterBankName(String bankName) {
		Waiters.waitForElementToBeVisible(bankNameTextField);
		bankNameTextField.sendKeys(bankName);
	}

	public void clickAddBillItem() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}
	
	public void selectAcademicYear(String academicYear) {
		Waiters.waitForTimeout(600);
		Waiters.waitForElementToBeVisible(academicYearTextField);
//		academicYearTextField.click();
		ElementUtils.forceClickWithJs(academicYearTextField);
		academicYearTextField.sendKeys(academicYear);
		CommonUtils.selectDropDownOption(academicYear);
	}

	public void enterBillingItemCode(String billingItemCode) {
		Waiters.waitForElementToBeVisible(billItemCodeTextField);
		ranBillItemCode = billingItemCode+StringUtils.generateRandomStringNumberCharacter(2, 2, 0);
		billItemCodeTextField.sendKeys(ranBillItemCode);
	}

	public void enterBillingItemName(String billingItemName) {
		Waiters.waitForElementToBeVisible(billItemNameTextField);
		ranBillItemName = billingItemName;
		billItemNameTextField.sendKeys(ranBillItemName);
	}

	public void enterDisplayText(String displayText) {
		Waiters.waitForElementToBeVisible(billItemDisplayTextField);
		billItemDisplayTextField.sendKeys(displayText);
	}

	public void selectsNewlyCreatedBillItemCategory() {
		Waiters.waitForElementToBeVisible(selectBillItemCategoryTextField);
		selectBillItemCategoryTextField.click();
		selectBillItemCategoryTextField.sendKeys(ranCategory);
		CommonUtils.selectDropDownOption(ranCategory);
	}

	public void selectBankAccount(String bankAccount) {
		
	}

	public void enterCost(String cost) {
		Waiters.waitForElementToBeVisible(costTextField);
//		costTextField.clear();
		ElementUtils.clearInputFieldWithJs(costTextField);
		costTextField.sendKeys(cost);
	}

	public void removeEmptyField() {
		Waiters.waitForElementToBeVisible(deleteCostFieldButton);
		Waiters.waitForElementToBeClickable(deleteCostFieldButton);
		deleteCostFieldButton.click();
	}

	public void clickShowMeResults() {
		Waiters.waitForElementToBeVisible(showMeTheResultsButton);
		Waiters.waitForElementToBeClickable(showMeTheResultsButton);
		showMeTheResultsButton.click();
	}

	public void clickMoreOptionUsingRollNo(String rollNo) {
		Waiters.waitForTimeout(1000);
		WebElement moreOption = DriverManager.getDriver().findElement(By.xpath("//td[text()='"+rollNo+"']/parent::tr//button"));
		Waiters.waitForElementToBeClickable(moreOption);
		moreOption.click();
	}

	public void clickOption(String option) {
		Waiters.waitForListOfElementsToBeVisible(moreOptionList);
		Waiters.waitForTimeout(500);
		for(int i=0;i<moreOptionList.size();i++) {
			if(moreOptionList.get(i).getText().equals(option)) {
				Waiters.waitForElementToBeClickable(moreOptionList.get(i));
				moreOptionList.get(i).click();
				break;
			}
		}
	}

	public String getAdmissionNo() {
		Waiters.waitForElementToBeVisible(admissionNoText);
		return admissionNoText.getText();
	}

	public void selectsNewlyCreatedBillItem() {
		Waiters.waitForElementToBeVisible(billingBillItemTextField);
		String newBillItem = ranBillItemCode+" - "+ranBillItemName;
		billingBillItemTextField.sendKeys(newBillItem);
		CommonUtils.selectDropDownOption(newBillItem);
	}

	public String getNewlyCreatedBillItemStatus() {
		Waiters.waitForTimeout(800);
		WebElement billingItemLoc = DriverManager.getDriver()
				.findElement(By.xpath("(//span[text()='"+ranCategory+"']/ancestor::tr//td[text()='"+ranBillItemName+"']/following::td[6]/span)[1]"));
		Waiters.waitForElementToBeVisible(billingItemLoc);
		return billingItemLoc.getText();
	}

	public void checkNewlyCreatedBillItem() {
		Waiters.waitForTimeout(800);
		WebElement billItemCheckBox = DriverManager.getDriver()
				.findElement(By.xpath("(//span[text()='"+ranCategory+"']/ancestor::tr//td[text()='"+ranBillItemName+"']/ancestor::tr//input[@type='checkbox'])[1]"));
		if (billItemCheckBox.isDisplayed()) {
			billItemCheckBox.click();
		} else {
			ElementUtils.scrollInToElement(billItemCheckBox);
			billItemCheckBox.click();
		}
	}

	public void clickSave() {
		Waiters.waitForElementToBeVisible(saveButton);
		Waiters.waitForElementToBeClickable(saveButton);
		saveButton.click();
	}
}
