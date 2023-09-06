package stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class AddToCartStep {
    @Given("Search valid product {string}")
    public void search_valid_product(String string) {
	HomePage hP = PageFactory.initElements(Constants.driver, HomePage.class);
	ProductPage pP = PageFactory.initElements(Constants.driver, ProductPage.class);
	hP.searchProduct("SMartPhone");
	hP.hitEnterToSearcxhProduct();

	
	pP.clickOnProduct();

    }

    @Then("Product should display on Cart List")
    public void product_should_display_on_cart_list() {
	ProductPage pP = PageFactory.initElements(Constants.driver, ProductPage.class);
	pP.goToAddToCartPage();

    }

    @Given("clicks on add to cart button")
    public void clicks_on_add_to_cart_button() {
	ProductPage pP = PageFactory.initElements(Constants.driver, ProductPage.class);
	pP.productAddToCart();
    }

    @When("Click the remove checkBox")
    public void click_the_remove_check_box() {
	CartPage cP = PageFactory.initElements(Constants.driver, CartPage.class);
	cP.removeProductFromCart();

    }

    @When("Clicks of update Shopping cart button")
    public void clicks_of_update_shopping_cart_button() {
	CartPage cP = PageFactory.initElements(Constants.driver, CartPage.class);
	cP.updateCartList();
    }

    @Then("Product should remove from Cart List")
    public void product_should_remove_from_cart_list() {
	CartPage cP = PageFactory.initElements(Constants.driver, CartPage.class);

	assertTrue(cP.getEmptyCartText());
    }

}