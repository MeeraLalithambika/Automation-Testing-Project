package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[4]/a/span")
	WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"checkout_btn\"]")
	WebElement confirm;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement cont;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a/div")
	WebElement welcome;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/ul/li[10]/a")
	WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement contin;
	
	
	public Checkout(WebDriver driver) {
		
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	}

	public void checkoutt()
	{
		checkout.click();
		confirm.click();
		cont.click();
		
		Actions act = new Actions(driver);
		act.moveToElement(welcome).perform();
		logout.click();
		contin.click();
		
		driver.close();

	}
	
}
