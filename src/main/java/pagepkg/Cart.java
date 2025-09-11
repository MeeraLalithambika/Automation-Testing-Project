package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[3]/a/span")
	WebElement cart ;
	
	@FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[6]/a")
	WebElement men;
	
	@FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[6]/div/ul[1]/li[2]/a")
	WebElement fragrance;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[6]/div[2]/div[3]/a")
	WebElement ck;
	
	@FindBy(xpath = "/html/body/div/header/div[1]/div/div[1]/a/img")
	WebElement home;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a/div")
	WebElement welcome;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/ul/li[10]/a")
	WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement continuee;
	
	public Cart(WebDriver driver) {

       this.driver = driver;
       PageFactory.initElements(driver, this);
	}

	public void addCart()
	{
		cart.click();
	
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
		fragrance.click();
		ck.click();
		
		cart.click();
		home.click();
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(welcome).perform();
		logout.click();
		continuee.click();
		
		driver.close();
	}
	
}
