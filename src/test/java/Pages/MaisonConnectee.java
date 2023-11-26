package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectee {
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/header/h1")
	WebElement Titrepage;
	@FindBy(name="orderby")
	WebElement triproductselect;
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> productslist;
	
	public MaisonConnectee() {
		PageFactory.initElements(Config.driver, this);
		
	}
	public String verifMessage() {
		String actualMessage = Titrepage.getText();
		return actualMessage;
		}
	public void triProduct (String sortTri,String Product) {
   Select select = new Select(triproductselect);
   select.selectByVisibleText(sortTri);
   try {
      for(WebElement product:productslist) {
    	  if(product.getText().contains(Product)) {
    		  product.click();
    	  }
    	  
      }
}catch (Exception e ) {
	

}
	}
}
