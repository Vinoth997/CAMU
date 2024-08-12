package CAMU.PageObject.Enterprise.DegreePage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CAMU.PageObject.Enterprise.ProgramPage.ProgramPagePo;
import Driver.DriverManager;
import Utilities.ActionsUtils;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;
import freemarker.core.ReturnInstruction.Return;


public class DegreePagePo {
	private static DegreePagePo DegreePageInstance;
	String randomdegreeID;
	String randomdegreeName;
	private DegreePagePo() {
		

	}

	public static DegreePagePo getInstance() {
		if (DegreePageInstance == null) {
			DegreePageInstance = new DegreePagePo();
		}
		return DegreePageInstance;
	}
	
	
	@FindBy(css = "div.header_back p.text-primary")
	private WebElement DegreePageReading;
	
	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;
	
	@FindBy(css = "div.header_back p.text-secondary")
	private WebElement createNewDegreePage;
	
	@FindBy(xpath = "//label[text()='Institution']/following::input[@id='InId']")
	private WebElement institutionTextField;
	
	@FindBy(xpath="//input[@name=\"PrID\"]")
	private WebElement degreeID;
	
	@FindBy(xpath="//input[@name=\"Name\"]")
	private WebElement degreeName;
	
	@FindBy(xpath="//input[@name=\"Desc\"]")
	private WebElement degreeDes;
	
	@FindBy(xpath="//input[@name=\"MinYr\"]")
	private WebElement minYr;
	
	@FindBy(xpath="//input[@name=\"MinMnth\"]")
	private WebElement minMnth;
	
	@FindBy(xpath="//input[@name=\"MaxYr\"]")
	private WebElement maxYr;
	
	@FindBy(xpath="//input[@name=\"MaxMnth\"]")
	private WebElement maxMnth;
	
	@FindBy(xpath="//input[@name=\"RelxYr\"]")
	private WebElement relxYr;
	
	@FindBy(xpath="//input[@name=\"RelxMnth\"]")
	private WebElement relxMnth;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement savebutton;
	
	@FindBy(xpath="//button[@type=\"reset\"]")
	private WebElement resetbutton;
	
	@FindBy(xpath="//button[@type=\"button\"]")
	private WebElement cancelbutton;
	
	@FindBy(css = "table.table-data_list td.text-primary:first-of-type")
	private WebElement degreeIdTable;
	
	@FindBy(css = "div.search input.search-input")
	private WebElement searchDegreeTextField;
	
	@FindBy(xpath = "//a[@text='Edit']")
	private WebElement editButton;
	
	
	
	public String getDegreePageHeading() {
		Waiters.waitForElementToBeVisible(DegreePageReading);
		return DegreePageReading.getText();
	}
	
	public void clickAdd() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
		
	}
	
	public String createDegreePageLanding() {
		Waiters.waitForElementToBeVisible(createNewDegreePage);
		return createNewDegreePage.getText();
		
	}
	
	public void selectInstitution(String institutionName) {
		Waiters.waitForElementToBeVisible(institutionTextField);
		// Waiters.waitForElementToBeVisible(insituteClearButton);
		// insituteClearButton.click();
		institutionTextField.sendKeys(institutionName);
		CommonUtils.selectDropDownOption(institutionName);
	}
	
	public void enterDegreeId(String degreeId) {
		Waiters.waitForElementToBeVisible(degreeID);
		Waiters.waitForElementToBeVisible(degreeID);
		degreeID.clear();
		randomdegreeID = degreeId+" "+StringUtils.generateRandomString(5);
		degreeID.sendKeys(randomdegreeID);
	}
	
	public void enterDegreeName(String Name) {
		Waiters.waitForElementToBeVisible(degreeName);
		//Waiters.waitForElementToBeVisible(degreeName);
		degreeName.clear();
		randomdegreeName = Name+" "+StringUtils.generateRandomString(5);
		degreeName.sendKeys(randomdegreeName);
	}
	
	public void enterDegreeDesc(String Desc) {
		Waiters.waitForElementToBeVisible(degreeDes);
		//Waiters.waitForElementToBeVisible(degreeName);
		degreeDes.clear();
		//randomdegreeName = Desc+" "+StringUtils.generateRandomString(5);
		degreeDes.sendKeys(Desc);
	}
	
	public void minYear(String minYear) {
		Waiters.waitForElementToBeVisible(minYr);
		minYr.clear();
		minYr.sendKeys(minYear);
	}
	
	public void minMonth(String minMonth) {
		Waiters.waitForElementToBeVisible(minMnth);
		minMnth.clear();
		minMnth.sendKeys(minMonth);
	}
	
	public void maxYear(String maxYear) {
		Waiters.waitForElementToBeVisible(maxYr);
		maxYr.clear();
		maxYr.sendKeys(maxYear);
	}
	
	public void maxMonth(String maxMonth) {
		Waiters.waitForElementToBeVisible(maxMnth);
		maxMnth.clear();
		maxMnth.sendKeys(maxMonth);
	}
	
	public void relaxYear(String relaxYr) {
		Waiters.waitForElementToBeVisible(relxYr);
		relxYr.clear();
		relxYr.sendKeys(relaxYr);
		
	}
	
	public void relaxMonth(String relaxMn) {
		Waiters.waitForElementToBeVisible(relxMnth);
		relxMnth.clear();
		relxMnth.sendKeys(relaxMn);
		
	}
	
	public void saveDegree() {
		Waiters.waitForElementToBeVisible(savebutton);
		savebutton.click();
	}
	
	public String getDegreeId() {
		return randomdegreeID;
	}
	
	
	public String searchCreatedNewDegreeAndVerify() {
		Waiters.waitForElementToBeVisible(searchDegreeTextField);
		searchDegreeTextField.clear();
		ActionsUtils.typeTextWithInterval(searchDegreeTextField, randomdegreeID);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(degreeIdTable);
		return degreeIdTable.getText();
	}
	
	public void enterDuplicateDegreeId(String degreeId) {
		Waiters.waitForElementToBeVisible(degreeID);
		//Waiters.waitForElementToBeVisible(degreeID);
		degreeID.clear();
		//randomdegreeID = degreeId+" "+StringUtils.generateRandomString(5);
		degreeID.sendKeys(degreeId);
	}
	
	public void enterDuplicateDegreeName(String Name) {
		Waiters.waitForElementToBeVisible(degreeName);
		//Waiters.waitForElementToBeVisible(degreeName);
		degreeName.clear();
		//randomdegreeName = Name+" "+StringUtils.generateRandomString(5);
		degreeName.sendKeys(Name);
	}
	
	public void clickOnDegreeEdit(String degree) {
		WebElement degreeList = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-primary') and text()='"+degree+"']/following::button[@id='dropdown-basic']"));
		Waiters.waitForElementToBeVisible(degreeList);
		Waiters.waitForElementToBeClickable(degreeList);
		degreeList.click();
		Waiters.waitForElementToBeVisible(editButton);
		Waiters.waitForElementToBeClickable(editButton);
		editButton.click();
		Waiters.waitForTimeout(1000);
	}
	
	public String editDegreePageLanding() {
		Waiters.waitForElementToBeVisible(createNewDegreePage);
		return createNewDegreePage.getText();
		
	}
	
	public void verify_InstitutionDisabled() {
		//Waiters.waitForElementToBeVisible(institutionTextField);
		//return institutionTextField.isEnabled();
		Asserts.assertTrue(!institutionTextField.isEnabled(), "The field is enabled");
		
	}
	
	public void verify_DegreeIdDisabled() {
		Asserts.assertTrue(!degreeID.isEnabled(), "The field is enabled");
		
	}
	public void verify_DegreeNameDisabled() {
		Asserts.assertTrue(!degreeName.isEnabled(), "The field is enabled");
		
	}
	
	public void verify_saveDisabled() {
		Asserts.assertTrue(!savebutton.isEnabled(), "The field is enabled");
		
	}
	
	public void click_CancelButton() {
		Waiters.waitForElementToBeVisible(cancelbutton);
		cancelbutton.click();
	}
	public void alertConfirmation_forcancel() {
		
		Alert alert= DriverManager.getDriver().switchTo().alert();
		
		alert.accept();
		
		}
	
	public boolean verify_ResetButton() {
		
		boolean allFieldVerified=ElementUtils.getInputValue(institutionTextField).isEmpty()&&
								 ElementUtils.getInputValue(degreeID).isEmpty()&&
								 ElementUtils.getInputValue(degreeName).isEmpty()&&
				                 ElementUtils.getInputValue(degreeDes).isEmpty()&&
				                 ElementUtils.getInputValue(maxYr).isEmpty()&&
				                 ElementUtils.getInputValue(maxMnth).isEmpty()&&
				                 ElementUtils.getInputValue(minYr).isEmpty()&&
				                 ElementUtils.getInputValue(minMnth).isEmpty()&&
				                 ElementUtils.getInputValue(relxMnth).isEmpty()&&
				                 ElementUtils.getInputValue(relxYr).isEmpty();
				
		return allFieldVerified;
	}
	
	public void click_Reset() {
		Waiters.waitForElementToBeVisible(resetbutton);
		resetbutton.click();
	}

	
}
