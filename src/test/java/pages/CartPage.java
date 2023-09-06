package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    @FindBy(css = "input[name=\"removefromcart\"]")
    private WebElement checkBox;

    @FindBy(css = "input[name=\"updatecart\"]")
    private WebElement updateCart;

    @FindBy(xpath = "//div[contains(text(),\"Your Shopping Cart is empty!\")]    ")
    private WebElement cartText;

    public void removeProductFromCart() {
	checkBox.click();
    }

    public void updateCartList() {
	updateCart.click();
    }

    public boolean getEmptyCartText() {
	return cartText.isDisplayed();
    }
}
