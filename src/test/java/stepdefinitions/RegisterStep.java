package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import commons.Commons;
import constants.Constants;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterStep {
    @And("User Navigate to Register Page")
    public void UserNavigatetoRegisterPage() {

	HomePage hP = PageFactory.initElements(Constants.driver, HomePage.class);
	hP.ClickOnRegisterButton();
    }

    @When("User Enter Details into Below Fields")
    public void user_enter_details_into_below_fields(DataTable dataTable) {
	Map<String, String> Map = dataTable.asMap(String.class, String.class);
	RegisterPage rP = PageFactory.initElements(Constants.driver, RegisterPage.class);
	rP.enterFirstName(Map.get("FirstName"));
	rP.enterLastName(Map.get("LastName"));
	rP.enterEmailId(Commons.timeStamp());
	rP.enterPassword(Map.get("Password"));
	rP.enterConfirmPassword(Map.get("ConfirmPassword"));

    }

    @When("Clicks On {string} button")
    public void clicks_on_button(String string) {
	RegisterPage rP = PageFactory.initElements(Constants.driver, RegisterPage.class);
	rP.clickOnRegiter();
    }

    @And("Enter duplicate Email {}")
    public void EnterduplicateEmail(String Email) {
	RegisterPage rP = PageFactory.initElements(Constants.driver, RegisterPage.class);
	//rP.clearEmailId();
	rP.enterEmailId(Email);

    }

    @Then("User Should able  to successfully Register")
    public void user_should_able_to_successfully_register() {

    }

    @Then("Get Successfull Register massage")
    public void get_successfull_register_massage() {

	RegisterPage rP = PageFactory.initElements(Constants.driver, RegisterPage.class);
	assertTrue(rP.getSuccessText());
    }

    @Given("Clicks on gender button")
    public void clicks_on_gender_button() {
	RegisterPage rP = PageFactory.initElements(Constants.driver, RegisterPage.class);
	rP.selectGender();
    }

    @Then("User Should Not able  to Register")
    public void user_should_not_able_to_register() {

    }

    @And("User should get Warrning massage for duplicate Email")
    public void UsershouldgetWarrningmassageforduplicateEmail() {
	RegisterPage rP = PageFactory.initElements(Constants.driver, RegisterPage.class);

	assertTrue(rP.getUnsucessfullText());

    }

    @And("User should get Warrning massage for each mandatory Field")
    public void UsershouldgetWarrningmassageforeachmandatoryField() {
	RegisterPage rP = PageFactory.initElements(Constants.driver, RegisterPage.class);
	assertTrue(rP.firstNameText());
	assertTrue(rP.lastNameText());
	assertTrue(rP.emailText());
	assertTrue(rP.passwordText());
	assertTrue(rP.passwordConfText());
    }
}
