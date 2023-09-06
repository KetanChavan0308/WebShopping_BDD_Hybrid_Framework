package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(css = "a.ico-login")
    private WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),\"Register\")]")
    private WebElement regButton;

    @FindBy(xpath = "//h2[contains(text(),\"Welcome to our store\")]")
    private WebElement succsessText;

    @FindBy(css = "input[name=\"q\"]")
    private WebElement searchBar;

    public void searchProduct(String productName) {
	searchBar.sendKeys(productName);

    }

    public void hitEnterToSearcxhProduct() {
	searchBar.sendKeys(Keys.ENTER);
    }

    public void clickOnLoginButton() {
	loginButton.click();
    }

    public void ClickOnRegisterButton() {
	regButton.click();
    }

    public boolean dispText() {
	boolean text = succsessText.isDisplayed();
	return text;
    }

}
