package TestSuites;

import java.io.IOException;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.MaisonConnectee;
import Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnecteeStepDef {
	
	@Given("admin is on the page Maison Connectee")
	public void admin_is_on_the_page_maison_connectee() throws IOException {
	    Config.initializedriver();
	    Config.navigate(Utils.getProperty("Web_MaisonConnectee_Link"));
	    Config.maximisewindow();
		}
	
   @When("admin choosing the sorting option {string} and click on product {string}")
	public void admin_choosing_the_sorting_option_and_click_on_product(String triproductselect , String ProductName) {
	    MaisonConnectee maisonpage = new MaisonConnectee();
	    maisonpage.triProduct(triproductselect,ProductName);
	    
	}

	@Then("admin is directed to the product page {string}")
	public void admin_is_directed_to_the_product_page(String vproductpage ) {
	    ProductPage pageproduct = new ProductPage();
	    String actuelproductName = pageproduct.verifProductName();
		Assert.assertEquals(vproductpage , actuelproductName );
	}


}
