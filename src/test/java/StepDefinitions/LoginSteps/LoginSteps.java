package StepDefinitions.LoginSteps;

import java.io.IOException;

import CAMU.PageObject.LoginPage.LoginPagePo;
import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("the user navigates to camu app")
	public void the_user_navigates_camu_app() throws IOException {
		DriverManager.getDriver().get(CommonUtils.excelGetdata("URL", 5, 1));
	}
	
	@Given("the user navigates to {string}")
	public void the_user_navigates_to(String applicationUrl) {
		DriverManager.getDriver().get(applicationUrl);
	}

	@When("the user selects the institution as {string} from the dropdown")
	public void the_user_selects_the_institution_as_from_the_dropdown(String searchInstitution) throws IOException {
		LoginPagePo.getInstance().enterInstitutionName(searchInstitution);
	}

	@Then("the user verify navigated to the selected institution {string}")
	public void the_user_verify_navigated_to_the_selected_institution(String string) {
		Asserts.assertEqualsText(LoginPagePo.getInstance().verifyLoginToCamuIsDisplayed(), string);
	}

	@When("the user enters the camu username as {string}")
	public void the_user_enters_the_camu_username_as(String userName) {
		LoginPagePo.getInstance().enterUserName(userName);
	}

	@When("the user enters the camu password as {string}")
	public void the_user_enters_the_camu_password_as(String password) {
		LoginPagePo.getInstance().enterPassword(password);
	}

	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
		LoginPagePo.getInstance().clickOnLogin();
	}

	@Then("the user lands on {string} institution dashboard")
	public void the_user_lands_on_institution_dashboard(String institutionDashBoardName) {
		Asserts.assertEqualsText(LoginPagePo.getInstance().verifyInstitution(), institutionDashBoardName);
	}
	
	@Then("the user lands on institution dashboard")
	public void the_user_lands_on_institution_dashboard() {
	    Asserts.assertTrue(LoginPagePo.getInstance().verifyDashBoardPage());
	}
	
	@When("the user click on {string} Module from the list of modules")
	public void the_user_click_on_module_from_the_list_of_modules(String option) {
	    LoginPagePo.getInstance().toClickTheMainModule(option);
	}
	
	@When("the user clicks on {string} submodule under Enterprise module")
	public void the_user_clicks_on_submodule_under_enterprise_module(String option) {
	    LoginPagePo.getInstance().toClickSubModule(option);
	}

}
