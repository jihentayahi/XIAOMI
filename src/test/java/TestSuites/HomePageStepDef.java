package TestSuites;

import java.io.IOException;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import Pages.MaisonConnectee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	@Given("admin is on HomePage")
	public void admin_is_on_home_page() throws IOException {
    Config.initializedriver();
    Config.navigate(Utils.getProperty("Web_Portal_Link"));
    Config.maximisewindow();
	}

	@When("admin mouseHover on menu {string}")
	public void admin_mouse_hover_on_menu(String menu) {
	    HomePage home = new HomePage();
	    home.mouseHoverMenuName(menu);
	    
	}

	@When("admin click on submenu {string}")
	public void admin_click_on_submenu(String subName) {
		HomePage home = new HomePage();
	    home.clickSubmenu(subName);
	    
	}

	@Then("admin is directed to the page {string}")
	public void admin_is_directed_to_the_page(String vhomepage) {
		MaisonConnectee page = new MaisonConnectee();
		String actuelMessage = page.verifMessage();
		Assert.assertEquals(vhomepage, actuelMessage);
	    
	}

}
