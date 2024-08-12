package CAMU.PageObject.Enterprise.Billingconfiguration;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CAMU.PageObject.Enterprise.ProgramPage.ProgramPagePo;
import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class BillingconfigurationPagePo {
	private static BillingconfigurationPagePo BillingconfigurationPageInstance;
	String PrefixRandom;
	String StartNumberRandom;
	String SufixRandom;
	String CodeRandom;
	String tBName;
	
	
	private BillingconfigurationPagePo() {

	}

	public static BillingconfigurationPagePo getInstance() {
		if (BillingconfigurationPageInstance == null) {
			BillingconfigurationPageInstance = new BillingconfigurationPagePo();
		}
		return BillingconfigurationPageInstance;
	}
	
	
	@FindBy(css = ".main-container_block div.header_back p.text-primary")
	private WebElement billingconfigurationpage;
	
	@FindBy(xpath="//label[text()='Billing Configuration']/parent::div/following-sibling::button")
	private WebElement sequeneaddbutton;
	
	@FindBy(xpath="//div[@class='transform-text modal-title h4' or text()='Create Sequence Number']")
	private WebElement sequencCreatePage;
	
	@FindBy(css = "input[id='InId']")
	private WebElement institutionTextField;
	
	@FindBy(xpath="//input[@name='prefix']")
	private WebElement prefix;
	
	@FindBy(xpath="//input[@name='initw']")
	private WebElement startNumber;
	
	@FindBy(xpath="//input[@name='suffix']")
	private WebElement sufix;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement sequenceCode;
	
	@FindBy(xpath="//input[@name='desc']")
	private WebElement sequnceDescription;
	
	@FindBy(xpath="//input[@id='BillItemCtgry']")
	private WebElement billingItemCategory;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveSequence;
	
	@FindBy(xpath="//label[text()='Transport Bill Dates']/parent::div/following-sibling::button")
	private WebElement transportbilladdbutton;
	
	@FindBy(xpath="//input[@id='InId']/ancestor::div[@title]//div[contains(@class,'indicatorContainer')][1]")
	private WebElement cancelInstitution;
	
	@FindBy(xpath="//p[text()='Transport Bill Dates']/following-sibling::label[text()='Create New']")
	private WebElement transportDateCreatePage;
	
	@FindBy(xpath="//input[@name='Name']")
	private WebElement tBillName;
	
	@FindBy(xpath="//input[@name='shwPrmpt']")
	private WebElement showPrompt;
	
	@FindBy(xpath="//input[@name='AutBil']")
	private WebElement autoBilling;
	
	@FindBy(xpath="//input[@name='FrDt']")
	private WebElement fromDate;
	
	@FindBy(xpath ="//input[@name='ToDt']")
	private WebElement toDate;
	
	@FindBy(xpath="//input[@name='Dates[0].Dt']")
	private WebElement addSingleDate;
	
	@FindBy(xpath="//button[@type='button' and text()='SUBMIT']")
	private WebElement saveTransportBill;
	
	@FindBy(xpath="//button[@type='button' and text()='Cancel']")
	private WebElement cancelTransportBill;
	
	@FindBy(xpath="//input[@id='BCncRs']")
	private WebElement bCancelReason;
	
	@FindBy(xpath="//span[contains(@class,'material-symbols-rounded text-secondary') and text()='add']")
	private WebElement clickPlusForMultipleDate;
	
	@FindBy(xpath="//label[text()='Transport Bill Dates']/parent::div/following-sibling::div//input[@placeholder='Search']")
	private WebElement iSearch;
	
	@FindBy(xpath="")
	private WebElement clickThreeDotElement;
	
	public String getBillingconfigurationpageHeading() {
		Waiters.waitForElementToBeVisible(billingconfigurationpage);
		return billingconfigurationpage.getText();
	}
	
	public void click_billingSequenceAdd() {
		Waiters.waitForElementToBeVisible(sequeneaddbutton);
		sequeneaddbutton.click();
		
	}
	
	public String verify_SequenceCreationPage() {
		Waiters.waitForElementToBeVisible(sequencCreatePage);
		return sequencCreatePage.getText();
		
	}
	
	public void select_Instituion(String institutionName ) {
		Waiters.waitForElementToBeVisible(institutionTextField);
		cancelInstitution.click();
		institutionTextField.click();
		institutionTextField.sendKeys(institutionName);
		CommonUtils.selectDropDownOption(institutionName);
	}
	
	public void enter_Prefix(String prefixValue) {
		Waiters.waitForElementToBeVisible(prefix);
		prefix.clear();
		PrefixRandom = prefixValue+StringUtils.generateRandomString(2);
		prefix.sendKeys(PrefixRandom);
	}
	
	public void enter_StartNumber(String startValue) {
		Waiters.waitForElementToBeVisible(startNumber);
		startNumber.clear();
		startNumber.sendKeys(startValue);
	}
	
	public void enter_Sufix(String sufixValue) {
		Waiters.waitForElementToBeVisible(sufix);
		sufix.clear();
		SufixRandom=sufixValue+StringUtils.generateRandomString(2);
		sufix.sendKeys(SufixRandom);
		
		} 
	
	public void enter_Code(String codeValue) {
		Waiters.waitForElementToBeVisible(sequenceCode);
		sequenceCode.clear();
		CodeRandom=codeValue+StringUtils.generateRandomString(2);
		sequenceCode.sendKeys(CodeRandom);
		}
	
	public void enter_SequenceDescription(String description) {
		Waiters.waitForElementToBeVisible(sequnceDescription);
		sequnceDescription.clear();
		sequnceDescription.sendKeys(description);
		}
	
	public void select_BillingItemCategory(String billingItemCat) {
		Waiters.waitForElementToBeVisible(billingItemCategory);
		ElementUtils.scrollInToElement(billingItemCategory);
		billingItemCategory.click();
		billingItemCategory.sendKeys(billingItemCat);
		CommonUtils.selectDropDownOption(billingItemCat);
		
	}
	
	public void click_Save() {
		Waiters.waitForElementToBeVisible(saveSequence);
		ElementUtils.scrollInToElement(saveSequence);
		saveSequence.click();
		
	}
	
	public void click_transportAdd() {
		Waiters.waitForElementToBeVisible(transportbilladdbutton);
		transportbilladdbutton.click();
		
	}	
	
	public String verify_CreateNewTransportBillDates() {
		Waiters.waitForElementToBeVisible(transportDateCreatePage);
		ElementUtils.scrollInToElement(transportDateCreatePage);
		return transportDateCreatePage.getText();
	}
	
	public void t_BillDateName(String Name) {
		Waiters.waitForElementToBeVisible(tBillName);
		tBillName.clear();
		tBName=Name+StringUtils.generateRandomString(2);
		tBillName.sendKeys(tBName);
		
	}
	
	public void showPrompt() {
		Waiters.waitForElementToBeVisible(showPrompt);
		//showPrompt.isEnabled();
		Asserts.assertTrue(showPrompt.isSelected(), "By default showprompt not selected");
		
	}
	
	public void autoBilling() {
		Waiters.waitForElementToBeVisible(autoBilling);
		//showPrompt.isEnabled();
		Asserts.assertTrue(autoBilling.isSelected(), "By default transport autobilling not selected");
		
	}
	
	public void startDate_ForTransportBill(String fDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(fromDate);
		CommonUtils.dateSelector(fromDate, fDate);
		
	}
	
	public void toDate_TransportBill(String tDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(toDate);
		CommonUtils.dateSelector(toDate, tDate);
		
	}
	
	public void addSingleDate(String singleDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(addSingleDate);
		CommonUtils.dateSelector(addSingleDate, singleDate);
		
	}
	
	public void save_TransportBill() {
		Waiters.waitForElementToBeVisible(saveTransportBill);
		saveTransportBill.click();
		
	}
	
	public void cancel_TransportBill() {
		Waiters.waitForElementToBeVisible(cancelTransportBill);
		cancelTransportBill.click();
		
	} 
	public void select_ReasonforCancel(String Reason) {
		Waiters.waitForElementToBeVisible(bCancelReason);
		bCancelReason.click();
		bCancelReason.sendKeys(Reason);
		CommonUtils.selectDropDownOption(Reason);
		}
	
	public void add_MultipleDates(String count) throws InterruptedException {
		
		String[] Date1= {"08-Aug-2024","08-Aug-2024","06-Aug-2024","06-Aug-2024"};
//		String Date2="04-Aug-2024";
//		String Date3="04-Aug-2024";"04-Aug-2024"
//		String Date4="04-Aug-2024";
		int converInt=Integer.parseInt(count);
		for(int i=0;i<=converInt;i++) {
			Waiters.waitForElementToBeVisible(clickPlusForMultipleDate);
			
			WebElement date=DriverManager.getDriver().findElement(By.xpath("//input[@name=\"Dates["+i+"].Dt\"]"));
			CommonUtils.dateSelector(date, Date1[i]);
			if(i<converInt) {
				Waiters.waitForElementToBeClickable(clickPlusForMultipleDate);
				clickPlusForMultipleDate.click();
			}
			
			
			
		}
		
		
	}
	
	

}
