package CAMU.PageObject.Enterprise.FeedbackPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class FeedbackPagePo {

	private static FeedbackPagePo FeedbackPageInstance;
	String randomNewFeedbackType;
	int beforeRemoveFeedbackCount, afterRemoveFeedbackCount;

	private FeedbackPagePo() {

	}

	public static FeedbackPagePo getInstance() {
		if (FeedbackPageInstance == null) {
			FeedbackPageInstance = new FeedbackPagePo();
		}
		return FeedbackPageInstance;
	}

	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;

	@FindBy(css = ".main-container_block div.header_back p.text-secondary")
	private WebElement createNewFeedbackPageHeading;

	@FindBy(xpath = "//label[text()='Feedback type']/following-sibling::input")
	private WebElement enterNewFeedbackTypeTextField;

	@FindBy(xpath = "//span[text()='check']/parent::button")
	private WebElement checkButton;

	@FindBy(xpath = "//label[text()='Feedback type']/following-sibling::div/div[@title]")
	private WebElement selectedFeedbackType;

	@FindBy(css = "input[id=FdbkTy]")
	private WebElement selectFeedbackTypeTextField;

	@FindBy(css = "input[name=Nm]")
	private WebElement feedbackNameTextField;

	@FindBy(css = "input[name=StrRate]")
	private WebElement maximumNoOfStarTextField;

	@FindBy(xpath = "//button[@name='add']")
	private WebElement addFeedbackButton;

	@FindBy(xpath = "//span[contains(@class,'material-symbols-rounded') and text()='do_not_disturb_on']/parent::div")
	private List<WebElement> removeFeedbackButton;

	@FindBy(xpath = "//label[text()='Feedback attribute']")
	private List<WebElement> feedbackAttributeFieldList;

	@FindBy(css = "button[name=add]")
	private WebElement addAttributeFeedbackButton;

	@FindBy(css = "input#GrdSys")
	private WebElement gradeSystemDropDown;

	@FindBy(xpath = "(//input[@id='GrdSys']/ancestor::div[contains(@class,'select')]//div[contains(@class,'indicatorContainer')])[1]")
	private WebElement clearSelectedGradeButton;

	@FindBy(css = "input[name=hdStudNm]")
	private WebElement hideStudentNameCheckbox;

	@FindBy(xpath = "//input[@name='FdbkAttr[0].Attr']")
	private WebElement feedbackAttributeTextField;

	@FindBy(xpath = "//label[text()='Grade System']/following-sibling::div/div[@title]")
	private WebElement selectedGradeSystem;

	public void clickAdd() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public String getNewFeedBackTitle() {
		Waiters.waitForTimeout(500);
		return createNewFeedbackPageHeading.getText();
	}

	public void enterNewFeedbackType(String feedbackType) {
		Waiters.waitForElementToBeVisible(enterNewFeedbackTypeTextField);
		ElementUtils.clearInputFieldWithJs(enterNewFeedbackTypeTextField);
		randomNewFeedbackType = feedbackType + StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		enterNewFeedbackTypeTextField.sendKeys(randomNewFeedbackType);
	}

	public void clickCheck() {
		Waiters.waitForElementToBeVisible(checkButton);
		Waiters.waitForElementToBeClickable(checkButton);
		checkButton.click();
	}

	public String getSelectedFeedbackValue() {
		Waiters.waitForTimeout(1000);
		return selectedFeedbackType.getAttribute("title");
	}

	public String getCreatedFeedbackValue() {
		return randomNewFeedbackType;
	}

	public void selectCreatedFeedbackType() {
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(selectFeedbackTypeTextField);
		ElementUtils.forceClickWithJs(selectFeedbackTypeTextField);
		selectFeedbackTypeTextField.sendKeys(randomNewFeedbackType);
		CommonUtils.selectDropDownOption(randomNewFeedbackType);
	}

	public void enterFeedbackName(String feedbackName) {
		Waiters.waitForElementToBeVisible(feedbackNameTextField);
		ElementUtils.clearInputFieldWithJs(feedbackNameTextField);
		feedbackNameTextField.sendKeys(feedbackName);
	}

	public void noOfStarsAllowed(String starsAllowed) {
		Waiters.waitForElementToBeVisible(maximumNoOfStarTextField);
		ElementUtils.clearInputFieldWithJs(maximumNoOfStarTextField);
		maximumNoOfStarTextField.sendKeys(starsAllowed);
	}

	public void selectFeedbackType(String feedbackType) {
		Waiters.waitForTimeout(1000);
//		selectFeedbackTypeTextField.click();
		ElementUtils.clearInputFieldWithJs(selectFeedbackTypeTextField);
		ElementUtils.forceClickWithJs(selectFeedbackTypeTextField);
		selectFeedbackTypeTextField.sendKeys(feedbackType);
		CommonUtils.selectDropDownOption(feedbackType);
	}

	public void enterFeedbackAttribute(Integer value, String attribute) {
		value = value - 1;
		WebElement element = DriverManager.getDriver()
				.findElement(By.xpath("//input[@name='FdbkAttr[" + value + "].Attr']"));
		element.clear();
		element.sendKeys(attribute);
	}

	public String verifyMaximumNoOfStar(int value) {
		int count = 0;
		List<WebElement> element = DriverManager.getDriver()
				.findElements(By.xpath("((//div[@class='mb-4'])[" + value + "]//input[@name='Name'])"));
		for (int i = 0; i < element.size(); i++) {
			ElementUtils.scrollInToElement(element.get(i));
			if (element.get(i).isEnabled()) {
				count++;
			}
		}
//		System.out.println(element.size());
//		System.out.println(count);
		return Integer.toString(count);
	}

	public String getMaximumStarFieldValue() {
		return ElementUtils.getInputValue(maximumNoOfStarTextField);
	}

	public void enterStarRating(Integer feebackField, Integer star, String starRatingValue) {
		WebElement element = DriverManager.getDriver().findElement(
				By.xpath("((//div[@class='mb-4'])[" + feebackField + "]//input[@name='Name'])[" + star + "]"));
		element.clear();
		element.sendKeys(starRatingValue);
	}

	public void clickAddFeedBack() {
		Waiters.waitForElementToBeVisible(addFeedbackButton);
		Waiters.waitForElementToBeClickable(addFeedbackButton);
		ElementUtils.scrollInToElement(addFeedbackButton);
		addFeedbackButton.click();
	}

	public int beforeRemoveFeedbackCount() {
		beforeRemoveFeedbackCount = feedbackAttributeFieldList.size();
		return beforeRemoveFeedbackCount;
	}

	public int afterRemoveFeedbackCount() {
		afterRemoveFeedbackCount = feedbackAttributeFieldList.size();
		return afterRemoveFeedbackCount;
	}

	public void removeFeedBackAttribute() {
		Waiters.waitForTimeout(1000);
		if (ElementUtils.isPresentAndDisplayed(removeFeedbackButton.get(0))) {
			for (int i = removeFeedbackButton.size() - 1; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ElementUtils.scrollInToElement(removeFeedbackButton.get(i));
				Waiters.waitForElementToBeClickable(removeFeedbackButton.get(i));
				removeFeedbackButton.get(i).click();
			}
		} else {
			System.err.println("There is no further feedback attribute to remove");
		}
	}

	public boolean verifyFeedbackAttribute() {
		boolean value = true;
		if (beforeRemoveFeedbackCount > afterRemoveFeedbackCount) {
			value = true;
		} else if (beforeRemoveFeedbackCount <= afterRemoveFeedbackCount) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}

	public void addNewFeedbackAttribute(String feedbackCount) {
		for (int i = 0; i < Integer.parseInt(feedbackCount); i++) {
			Waiters.waitForElementToBeVisible(addAttributeFeedbackButton);
			ElementUtils.scrollInToElement(addAttributeFeedbackButton);
			Waiters.waitForElementToBeClickable(addAttributeFeedbackButton);
			addAttributeFeedbackButton.click();
		}
	}

	public void selectGradeSystem(String gradeSystem) {
		Waiters.waitForElementToBeVisible(gradeSystemDropDown);
		ElementUtils.scrollInToElement(gradeSystemDropDown);
		if (clearSelectedGradeButton.isDisplayed()) {
			clearSelectedGradeButton.click();
		}
		Waiters.waitForElementToBeVisible(gradeSystemDropDown);
		Waiters.waitForElementToBeClickable(gradeSystemDropDown);
		gradeSystemDropDown.click();
		CommonUtils.selectDropDownOption(gradeSystem);
	}

	public void editFeedback(String feedback) {
		WebElement element = DriverManager.getDriver().findElement(By.xpath(
				"//label[text()='" + feedback + "']/parent::div[@class='feedback-list_cont']//span[text()='edit']"));
		Waiters.waitForElementToBeVisible(element);
		Waiters.waitForElementToBeClickable(element);
		element.click();
	}

	public boolean feedbackTypeDisabled() {
		Waiters.waitForTimeout(1000);
		return !selectFeedbackTypeTextField.isEnabled();
	}

	public void checkHideStudentName() {
		Waiters.waitForElementToBeVisible(hideStudentNameCheckbox);
		if (!hideStudentNameCheckbox.isSelected()) {
			hideStudentNameCheckbox.click();
		}
	}

	public void uncheckHideStudentName() {
		Waiters.waitForElementToBeVisible(hideStudentNameCheckbox);
		if (hideStudentNameCheckbox.isSelected()) {
			hideStudentNameCheckbox.click();
		}
	}

	public void feedbackNameField() {
		Waiters.waitForElementToBeVisible(feedbackNameTextField);
		feedbackNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(feedbackNameTextField).isEmpty(),
				"Feedback name field not accept alphabets");
		feedbackNameTextField.clear();
		Waiters.waitForElementToBeVisible(feedbackNameTextField);
		feedbackNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(feedbackNameTextField).isEmpty(),
				"Feedback name field not accept numbers");
		feedbackNameTextField.clear();
		Waiters.waitForElementToBeVisible(feedbackNameTextField);
		feedbackNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(feedbackNameTextField).isEmpty(),
				"Feedback name field not accept special characters");
	}

	public void maximumNoStarField() {
		Waiters.waitForElementToBeVisible(maximumNoOfStarTextField);
		maximumNoOfStarTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(ElementUtils.getInputValue(maximumNoOfStarTextField).isEmpty(),
				"Maximum no.of star field accept alphabets");
		maximumNoOfStarTextField.clear();
		Waiters.waitForElementToBeVisible(maximumNoOfStarTextField);
		maximumNoOfStarTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(maximumNoOfStarTextField).isEmpty(),
				"Maximum no.of star not accept numbers");
		maximumNoOfStarTextField.clear();
		Waiters.waitForElementToBeVisible(maximumNoOfStarTextField);
		maximumNoOfStarTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(ElementUtils.getInputValue(maximumNoOfStarTextField).isEmpty(),
				"Maximum no.of star accept special characters");
	}

	public void feedbackAttributeField() {
		Waiters.waitForElementToBeVisible(feedbackAttributeTextField);
		feedbackAttributeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(feedbackAttributeTextField).isEmpty(),
				"Feedback atribute field not accept alphabets");
		feedbackAttributeTextField.clear();
		Waiters.waitForElementToBeVisible(feedbackAttributeTextField);
		feedbackAttributeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(feedbackAttributeTextField).isEmpty(),
				"Feedback atribute field not accept numbers");
		feedbackAttributeTextField.clear();
		Waiters.waitForElementToBeVisible(feedbackAttributeTextField);
		feedbackAttributeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(feedbackAttributeTextField).isEmpty(),
				"Feedback atribute field not accept special characters");
	}

	public void verifyAllFieldsCleared() {
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedFeedbackType), "Feedback type field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(feedbackNameTextField).isEmpty(),
				"Feedback name field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(maximumNoOfStarTextField).isEmpty(),
				"Maximum no. of star field is not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(feedbackAttributeTextField).isEmpty(),
				"Feedback attribute field is not cleared");

		for (int i = 1; i <= feedbackAttributeFieldList.size(); i++) {
			List<WebElement> ratingTextFieldList = DriverManager.getDriver()
					.findElements(By.xpath("(//div[@class='mb-4'])[" + i + "]//input[@name='Name']"));
			for (int j = 0; j < ratingTextFieldList.size(); j++) {
//				System.out.println("Feedback attribute " + i + " rating field " + j + "");
				Asserts.assertTrue(!ratingTextFieldList.get(j).isEnabled(),
						"Feedback attribute " + i + " rating field " + j + " is enabled");
			}
		}

		Asserts.assertTrue(ElementUtils.isDisappeared(selectedGradeSystem), "Grade system field is not cleared");
		Asserts.assertTrue(!hideStudentNameCheckbox.isSelected(), "Hide student name field is not unchecked");
	}

	public void passNewFeedbackType(String feedbackType) {
		Waiters.waitForElementToBeVisible(enterNewFeedbackTypeTextField);
		enterNewFeedbackTypeTextField.sendKeys(feedbackType);
	}
}
