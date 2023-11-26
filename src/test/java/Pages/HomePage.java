package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List <WebElement> menus;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/div/div/div/div/section/div/div/div/div/div/a/div/div[2]/h4")
	List <WebElement> submenus;
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	public void mouseHoverMenuName (String menuName) {
		try {
		for(WebElement menu:menus) {
			if(menu.getText().contains(menuName)) {
				Config.action = new Actions(Config.driver);
				Config.action.moveToElement(menu).perform();
		}
		}
		
	} catch(Exception e ) {
		
	}
		
	}
	 public void clickSubmenu (String submenuName) {
	try {
	    	
	    	for(WebElement Submenu:submenus) {
	    		if(Submenu.getText().contains(submenuName)) {
	    			Submenu.click();
	    		}
	    	}


	} catch (Exception e ) {
		
	}
	 }
	 }
