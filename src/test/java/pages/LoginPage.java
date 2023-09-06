package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(css = "input#Email")
    private WebElement email;

    @FindBy(css = "input#Password")
    private WebElement pass;

    @FindBy(xpath = "//input[@value=\"Log in\"]")
    private WebElement Login;

    @FindBy(xpath = "//a[contains(text(),\"Forgot password?\")]")
    private WebElement clickForgetPass;

    public void clickOnForgetPassLink() {
	clickForgetPass.click();
    }

    public void enterEmail(String userEmail) {
	email.sendKeys(userEmail);
    }

    public void enterPass(String userPass) {
	pass.sendKeys(userPass);
    }

    public void procidToLogin() {
	Login.click();
    }

    public void userLogin(String userEmail, String userPass) {
	enterEmail(userEmail);
	enterPass(userPass);
	procidToLogin();
    }

    public void grtWarningMsg() {

    }

}
