package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ProductPage {
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/div[3]/div/div[4]/div/div[2]/div[2]/h3/a")
	WebElement productName;
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/div[2]/div/div/div/div/a/span")
	WebElement addToWishList;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[4]/div/section/div/div[1]/div/div/div/div/a/i")
	WebElement WishList;
	@FindBy(xpath="/html/body/div[1]/div[5]/section/div/div/div/form/table/tbody/tr/td[2]/a")
	WebElement Productname;
	
	public ProductPage() {
		PageFactory.initElements(Config.driver, this);
		
	}
	public String verifProductName() {
		String Nameproduct = productName.getText();
		return Nameproduct;
		}
	 public void clickOnWishList() {
		 addToWishList.click();
	}
	 public void wishListProduct() throws InterruptedException {
			
			WebDriverWait wait=new WebDriverWait(Config.driver, Duration.ofSeconds(6));
			wait.until(ExpectedConditions.elementToBeClickable(WishList));
			Thread.sleep(6000);
			WishList.click();
			
		}
	 public String  verifNameProduct() {
			String verifProduit = Productname.getText();
			return verifProduit;
			
		}

}
