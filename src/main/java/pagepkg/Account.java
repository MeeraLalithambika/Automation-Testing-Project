package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[2]/a/span")
	WebElement account;
	
	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[2]/ul/li[1]/a/span")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"loginFrm_loginname\"]")
	WebElement loginname;
	
	@FindBy(xpath = "//*[@id=\"loginFrm_password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"loginFrm\"]/fieldset/button")
	WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[2]/a")
	WebElement wish;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[3]/a")
	WebElement edit;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_lastname\"]")
	WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm\"]/div[2]/div/button")
	WebElement con;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[4]/a")
	WebElement passw;
	
	@FindBy(xpath = "//*[@id=\"PasswordFrm_current_password\"]")
	WebElement currentpass;
	
	@FindBy(xpath = "//*[@id=\"PasswordFrm_password\"]")
	WebElement newpass;
	
	@FindBy(xpath = "//*[@id=\"PasswordFrm_confirm\"]")
	WebElement confirmnewpass;
	
	@FindBy(xpath = "//*[@id=\"PasswordFrm\"]/div[2]/div/button")
	WebElement sub;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[5]/a")
	WebElement manage;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/div/div[2]/a[1]")
	WebElement back;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[6]/a")
	WebElement order;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[7]/a")
	WebElement transaction;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[8]/a")
	WebElement downloads;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[9]/a")
	WebElement notifications;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[10]/a")
	WebElement logoff;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement home;
	
	@FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[2]/a")
	WebElement apparels;
	
	@FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[2]/div/ul[1]/li[2]/a")
	WebElement tshirts;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/div[3]/div[4]/div[2]/a/img")
	WebElement tshirtblue;
	
	@FindBy(xpath = "//*[@id=\"product\"]/fieldset/div[6]/ul/li/a")
	WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"cart_checkout1\"]")
	WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"checkout_btn\"]")    
	WebElement confirm;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement continuee;
	
	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[2]/ul/li[1]/a")
	WebElement checkOrder;
	
	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[2]/ul/li[2]/a")
	WebElement logout;

	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement cont;
	
	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[2]/ul/li[2]/a")
	WebElement checkOrder1;
	
	@FindBy(xpath = "//*[@id=\"CheckOrderFrm_order_id\"]")
	WebElement orderid;
	
	@FindBy(xpath = "//*[@id=\"CheckOrderFrm_email\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"CheckOrderFrm\"]/div/fieldset/div[3]/div/button")
	WebElement button;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/div[4]/div/a[1]")
	WebElement contin;
	
	
	public Account(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void accountHover(String lname, String pass, String lastnamee,String cpass,String newpassw, String cnp)
	{
		Actions act = new Actions(driver);
		act.moveToElement(account).perform();
		login.click();
		
		loginname.sendKeys(lname);
		password.sendKeys(pass);
		submit.click();
		wish.click();
		edit.click();
		lastname.clear();
		lastname.sendKeys(lastnamee);
		con.click();
		passw.click();
		currentpass.sendKeys(cpass);
		newpass.sendKeys(newpassw);
		confirmnewpass.sendKeys(cnp);
		sub.click();
		manage.click();
		back.click();
		order.click();
		transaction.click();
		downloads.click();
		notifications.click();
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(apparels).perform();
		tshirts.click();
		tshirtblue.click();
		cart.click();
		checkout.click();
		confirm.click();
		continuee.click();
		
		Actions act2 = new Actions(driver);
		act2.moveToElement(account).perform();
		checkOrder.click();
		
		act2.moveToElement(account).perform();
		logout.click();
		cont.click();
	}
	
	public void checkYourOrder(String ordid, String emaill)
	{
		Actions act2 = new Actions(driver);
		act2.moveToElement(account).perform();
		checkOrder1.click();
		orderid.sendKeys(ordid);
		email.sendKeys(emaill);
		button.click();
		contin.click();
		driver.close();
	}
}
