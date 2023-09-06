package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
    @FindBy(css = "input#FirstName")
    private WebElement fName;
    @FindBy(css = "input#LastName")
    private WebElement lName;
    @FindBy(css = "input#Email")
    private WebElement uEmail;
    @FindBy(css = "input#Password")
    private WebElement uPass;
    @FindBy(css = "input#ConfirmPassword")
    private WebElement uPassConf;
    @FindBy(css = "input#gender-male")
    private WebElement redioButton;

    @FindBy(css = "input#register-button")
    private WebElement register;

    @FindBy(xpath = "//li[contains(text(),\"The specified email already exists\")]")
    private WebElement unsuccText;

    @FindBy(css = "div.result")
    private WebElement sucText;

    @FindBy(xpath = "//span[contains(text(),\"First name is required.\")]")
    private WebElement warningFirstName;

    @FindBy(css = "span[for=\"LastName\"]")
    private WebElement warningLastName;

    @FindBy(css = "span[for=\"Email\"]")
    private WebElement warningEmail;

    @FindBy(css = "span[for=\"Password\"]")
    private WebElement warningPassword;

    @FindBy(css = "span[for=\"ConfirmPassword\"]")
    private WebElement warningConfirmPassWord;

    public boolean firstNameText() {
	boolean text = warningFirstName.isDisplayed();
	return text;
    }

    public boolean lastNameText() {
	boolean text = warningLastName.isDisplayed();
	return text;
    }

    public boolean emailText() {
	boolean text = warningEmail.isDisplayed();
	return text;
    }

    public boolean passwordText() {
	boolean text = warningPassword.isDisplayed();
	return text;
    }

    public boolean passwordConfText() {
	boolean text = warningConfirmPassWord.isDisplayed();
	return text;
    }

    public void enterFirstName(String userFName) {
	fName.sendKeys(userFName);
    }

    public void enterLastName(String userLastName) {
	lName.sendKeys(userLastName);
    }

    public void enterEmailId(String userEmail) {
	uEmail.sendKeys(userEmail);
    }

    public void clearEmailId() {
	uEmail.clear();
    }

    public void enterPassword(String userPassword) {
	uPass.sendKeys(userPassword);
    }

    public void enterConfirmPassword(String userConfPass) {
	uPassConf.sendKeys(userConfPass);
    }

    public void selectGender() {
	redioButton.click();
    }

    public void clickOnRegiter() {
	register.click();
    }

    public boolean getSuccessText() {
	boolean text = sucText.isDisplayed();
	return text;
    }

    public boolean getUnsucessfullText() {
	Boolean text = unsuccText.isDisplayed();
	return text;
    }

}
