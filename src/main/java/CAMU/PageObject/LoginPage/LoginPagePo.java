package CAMU.PageObject.LoginPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.Waiters;

public class LoginPagePo {
	
	private static LoginPagePo loginPageInstance;

	private LoginPagePo() {

	}

	public static LoginPagePo getInstance() {
		if (loginPageInstance == null) {
			loginPageInstance = new LoginPagePo();
		}
		return loginPageInstance;
	}
	
	@FindBy(xpath = "//label[text()='Institution']/following::input")
	private WebElement searchInstituteTextField;

	@FindBy(css = "div.css1nmdiq5-menu + li")
	private List<WebElement> searchInstituteTextOptionList;

	@FindBy(css = "div.institution-details_cont p.institution-name_label")
	private WebElement verifyInstitution;

	@FindBy(css = "input[name='name']")
	private WebElement userName;

	@FindBy(css = "input[name='pwd']")
	private WebElement passWord;

	@FindBy(css = "button[type=submit].login-btn")
	private WebElement loginBtn;

	@FindBy(css = ".institute-name")
	private WebElement dashboardTitle;
	
	@FindBy(css = "div.side-nav-dropdown label")
	private WebElement camuDashBoardInstituteTitle;
	
	@FindBy(css = "div.camu-main_container")
	private WebElement camuDashBoardInstituteMainPage;
	
	@FindBy(xpath = "//ul[@class='nav flex-column']/li")
	private List<WebElement> moduleList;
	
	@FindBy(xpath = "//ul[@class='submenu-nav_list']//li//a")
	private List<WebElement> subModuleList;
	
	public void enterInstitutionName(String institution) {
		Waiters.waitForElementToBeVisible(searchInstituteTextField);
		Waiters.waitForElementToBeClickable(searchInstituteTextField);
		searchInstituteTextField.click();
		searchInstituteTextField.clear();
		searchInstituteTextField.sendKeys(institution);
		CommonUtils.selectDropDownOption(institution);
	}

	public String verifyLoginToCamuIsDisplayed() {
		Waiters.waitForElementToBeVisible(verifyInstitution);
		return verifyInstitution.getText();
	}

	public void enterUserName(String username) {
		Waiters.waitForElementToBeVisible(userName);
		userName.clear();
		userName.sendKeys(username);
	}

	public void enterPassword(String password) {
		Waiters.waitForElementToBeVisible(passWord);
		passWord.clear();
		passWord.sendKeys(password);
	}

	public void clickOnLogin() {
		Waiters.waitForElementToBeVisible(loginBtn);
		loginBtn.click();
	}

	public boolean verifyDashboard() throws InterruptedException {
		Waiters.waitForElementToBeVisible(dashboardTitle);
		return dashboardTitle.isDisplayed();
	}
	
	public String verifyInstitution() {
		Waiters.waitForElementToBeVisible(camuDashBoardInstituteTitle);
		return camuDashBoardInstituteTitle.getText();
	}
	
	public boolean verifyDashBoardPage() {
		Waiters.waitForElementToBeVisible(camuDashBoardInstituteMainPage);
		return camuDashBoardInstituteMainPage.isDisplayed();
	}
	
	public void toClickTheMainModule(String module) {
		Waiters.waitForListOfElementsToBeVisible(moduleList);
		ElementUtils.selectFromList(moduleList, module);
		
	}
	
	public void toClickSubModule(String subModule) {
		Waiters.waitForListOfElementsToBeVisible(subModuleList);
		ElementUtils.clickOnOptionContainsFromList(subModuleList, subModule);
	}

}
