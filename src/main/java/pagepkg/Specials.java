package pagepkg;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Specials {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[1]/a/span")
	WebElement special;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[1]/div[2]/a/img")
	WebElement product;
	
	@FindBy(xpath = "//*[@id=\"product\"]/fieldset/div[4]/ul/li/a")
	WebElement add;
	
	@FindBy(xpath = "//*[@id=\"cart_checkout1\"]")
	WebElement checkout;

	@FindBy(xpath = "/html/body/div/header/div[1]/div/div[1]/a/img")
	WebElement home;
	
	@FindBy(xpath = "//*[@id=\"checkout_btn\"]")
	WebElement confirm;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement continuee;
	
	public Specials(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void special()
	{
		special.click();	
	}
	
	public void productAdd()
	{
		product.click();
		add.click();
		checkout.click();
		
	}
	
	public void confirmProduct()
	{
		confirm.click();
		continuee.click();
	}



	public void allLinks()
	{
	List<WebElement>all_Links = driver.findElements(By.xpath("//a[@class='prdocutname']")); 
	System.out.println("Product Names...................\n");
	for(WebElement Links : all_Links)
	{
		System.out.println(Links.getText());
	}
	}
	
	public void close()
	{
		driver.close();
	}
}
