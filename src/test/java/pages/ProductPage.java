package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
    @FindBy(css = "img[alt=\"Picture of Smartphone\"]")
    private WebElement product;

    @FindBy(css = "li#topcartlink")
    private WebElement addTocartButton;

    @FindBy(css = "input[id=\"add-to-cart-button-43\"]")
    private WebElement add;

    public void clickOnProduct() {
	product.click();
    }

    public void goToAddToCartPage() {
	addTocartButton.click();
    }

    public void productAddToCart() {
	add.click();
    }

}
