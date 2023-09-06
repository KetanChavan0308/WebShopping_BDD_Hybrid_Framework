package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPassword {

    @FindBy(xpath = "//h1[contains(text(),\"Password recovery\")]")
    private WebElement passwordRecovery;

    public Boolean PasswordRecoveryPage() {
	return passwordRecovery.isDisplayed();
    }
}
