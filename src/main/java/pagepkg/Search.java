package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"filter_keyword\"]")
	WebElement searchh;
	
	@FindBy(xpath = "//*[@id=\"search_form\"]/div/div")
	WebElement lens;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/div[3]/div[6]/div[2]/a/img")
	WebElement ck;
	
	@FindBy(xpath = "//*[@id=\"product\"]/fieldset/div[4]/ul/li/a")
	WebElement ckaddtocart;
	
	@FindBy(xpath = "//*[@id=\"cart_checkout1\"]")
	WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"checkout_btn\"]")
	WebElement confirm;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement continuee;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a/div")
	WebElement welcome;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/ul/li[10]/a")
	WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement contin;
	
	
	public Search(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void searchProduct(String frag)
	{
		searchh.click();
		searchh.sendKeys(frag);
		lens.click();
		ck.click();
		ckaddtocart.click();
		checkout.click();
		confirm.click();
		continuee.click();
		
		Actions act = new Actions(driver);
		act.moveToElement(welcome).perform();
		
		logout.click();
		contin.click();
		
		driver.close();
		
	}
	
}
