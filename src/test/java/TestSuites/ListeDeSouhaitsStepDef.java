package TestSuites;

import java.io.IOException;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListeDeSouhaitsStepDef {
	@Given("admin is on product page")
	public void admin_is_on_product_page() throws IOException {
		Config.initializedriver();
	    Config.navigate(Utils.getProperty("Web_Productpage_Link"));
	    Config.maximisewindow();
		}
	

	@When("admin click on add To Wish List")
	public void  admin_click_on_add_to_wish_list() {
	   ProductPage produitsouhaite = new ProductPage();
	   produitsouhaite.clickOnWishList();
	}

	@Then("admin is directed to the wish list page and verificat the add of product to the list")
	public void admin_is_directed_to_the_wish_list_page_and_verificat_the_add_of_product_to_the_list() throws InterruptedException {
		ProductPage produitajoute = new ProductPage();
		produitajoute.wishListProduct();
		
		String ExceptedproductName = produitajoute.verifNameProduct();
		Assert.assertEquals("Mi Compact Bluetooth Speaker 2",ExceptedproductName);
		
	}


}
