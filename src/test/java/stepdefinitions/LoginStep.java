package stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commons.Commons;
import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForgetPassword;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginStep {
    @Given("User is Open Application Url")
    public void user_is_open_application_url() {
	System.out.println("Applicationj has open");
    }

    @Given("User Navigate to Login Page")
    public void user_navigate_to_login_page() {

	HomePage hp = PageFactory.initElements(Constants.driver, HomePage.class);
	hp.clickOnLoginButton();
    }

    @When("User Enter  valid Email (.+)$")
    public void user_enter_valid_email(String email) {
	LoginPage login = PageFactory.initElements(Constants.driver, LoginPage.class);
	login.enterEmail(email);
    }

    @When("User Enter valid Password (.+)$")
    public void user_enter_valid_password(String password) {
	LoginPage login = PageFactory.initElements(Constants.driver, LoginPage.class);
	login.enterPass(password);
    }

    @When("Clicks on {string} button")
    public void clicks_on_button(String string) {
	LoginPage login = PageFactory.initElements(Constants.driver, LoginPage.class);
	login.procidToLogin();
    }

    @Then("User Should be able to login Successfully")
    public void user_should_be_apble_to_login_successfully() {
	HomePage hp = PageFactory.initElements(Constants.driver, HomePage.class);
	assertTrue(hp.dispText());
    }

    @When("User Enter  Invalid Email")
    public void user_enter_invalid_email() {
	LoginPage login = PageFactory.initElements(Constants.driver, LoginPage.class);
	login.enterEmail(Commons.timeStamp());
    }

    @When("User Enter  Invalid Password")
    public void user_enter_invalid_password() {
	LoginPage login = PageFactory.initElements(Constants.driver, LoginPage.class);
	login.enterPass(Commons.timeStamp());
    }

    @Then("User Should Not able to login Successfully")
    public void user_should_not_able_to_login_successfully() {

    }

    @Then("User should get Warrning massage")
    public void user_should_get_warrning_massage() {

    }

    @When("User Not Enter Email")
    public void user_not_enter_email() {
	LoginPage login = PageFactory.initElements(Constants.driver, LoginPage.class);
	login.enterEmail("");
    }

    @When("user Not Enter Password")
    public void user_not_enter_password() {
	LoginPage login = PageFactory.initElements(Constants.driver, LoginPage.class);
	login.enterPass("");
    }

    @When("user is click on {string} link")
    public void user_is_click_on_link(String string) {
	LoginPage login = PageFactory.initElements(Constants.driver, LoginPage.class);
	login.clickOnForgetPassLink();
    }

    @Then("user is navigate to Forget password link")
    public void user_is_navigate_to_forget_password_link() {
	ForgetPassword fP = PageFactory.initElements(Constants.driver, ForgetPassword.class);
	assertTrue(fP.PasswordRecoveryPage());
    }

}
