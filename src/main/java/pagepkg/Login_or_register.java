package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_or_register {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a")
	WebElement login;
	
	@FindBy(name="account")
	WebElement register;
	
	@FindBy(xpath = "//*[@id=\"accountFrm\"]/fieldset/button")
	WebElement register_button;
	
	@FindBy(name="firstname")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement lname;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="telephone")
	WebElement phone;
	
	@FindBy(name="fax")
	WebElement fax;
	
	@FindBy(name="company")
	WebElement company;
	
	@FindBy(name="address_1")
	WebElement Address1;
	
	@FindBy(name="address_2")
	WebElement Address2;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="zone_id")
	WebElement region;
	
	@FindBy(name="postcode")
	WebElement zip;
	
	@FindBy(name="country_id")
	WebElement country;
	
	@FindBy(name="loginname")
	WebElement login_name;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="confirm")
	WebElement pass1;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_newsletter1\"]")
	WebElement yes;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_newsletter0\"]")
	WebElement no;
	
	@FindBy(id="AccountFrm_agree")
	WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm\"]/div[5]/div/div/button")
	WebElement con;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[10]/a")
	WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[1]/a")
	WebElement acc_dashboard;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[2]/a")
	WebElement wishlist;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[3]/a")
	WebElement editacc;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_firstname\"]")
	WebElement editfname;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_lastname\"]")
	WebElement editlname;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_email\"]")
	WebElement editmail;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_telephone\"]")
	WebElement editph;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_fax\"]")
	WebElement editfaxx;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm\"]/div[2]/div/button")
	WebElement conbutton;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[4]/a")
	WebElement changepass;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[5]/a")
	WebElement manage;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[6]/a")
	WebElement order;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[7]/a")
	WebElement trans;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[8]/a")
	WebElement download;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[9]/a")
	WebElement notification;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[10]/a")
	WebElement logoff;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement continuebutton;
	
	//Returning Customer----------------------------
	
	@FindBy(name="loginname")
	WebElement returnlogname;
	
	@FindBy(name="password")
	WebElement returnpass;
	
	@FindBy(xpath = "//*[@id=\"loginFrm\"]/fieldset/button")
	WebElement returnlogin;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[1]/a")
	WebElement editaccdetailsicon;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_firstname\"]")
	WebElement editfnameicon;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_lastname\"]")
	WebElement editlnameicon;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_email\"]")
	WebElement editemailicon;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_telephone\"]")
	WebElement edittelephoneicon;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm_fax\"]")
	WebElement editfaxicon;
	
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[2]/a")
	WebElement editchangepassicon;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[3]/a")                  
	WebElement editmanageicon;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/div/div[2]/a[1]")
	WebElement backbutton;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[4]/a")                      
	WebElement editwishlisticon;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/div/div/div/a")
	WebElement continueshopping;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a/div")
	WebElement mousehoverhomepage;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/ul/li[1]/a")
	WebElement accountdashboard;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[5]/a")        
	WebElement editordericon;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/div/div/div/a")
	WebElement orderhistorycontinue;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[6]/a")
	WebElement edittransicon;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/div/a")
	WebElement transactioncontinue;
	           
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[7]/a")       
	WebElement editdownloadicon;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/div/div/div/a")
	WebElement downloadcontinue;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[8]/a")
	WebElement editnotificationicon;
	
	@FindBy(xpath = "//*[@id=\"imFrm\"]/div/div/div/button")
	WebElement notificationcontinue;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[9]/a")
	WebElement editlogofficon;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement logoffcontinue;
	
	@FindBy(xpath = "//*[@id=\"AccountFrm\"]/div[2]/div/button")
	WebElement editconbutton;
	
	@FindBy(xpath = "//*[@id=\"PasswordFrm_current_password\"]")
	WebElement currentpass;
	
	@FindBy(xpath = "//*[@id=\"PasswordFrm_password\"]")
	WebElement newpass;
	
	@FindBy(xpath = "//*[@id=\"PasswordFrm_confirm\"]")
	WebElement newconfirmpass;

	@FindBy(xpath = "//*[@id=\"PasswordFrm\"]/div[2]/div/button")
	WebElement editpassconbutton1;
	
	@FindBy(xpath = "//*[@id=\"loginFrm\"]/fieldset/a[1]")
	WebElement forgot;
	
	@FindBy(name="loginname")
	WebElement forgotloginname;
	
	@FindBy(name="email")
	WebElement forgotemail;
	
	@FindBy(xpath = "//*[@id=\"forgottenFrm\"]/div[2]/div/button")
	WebElement forgotbutton;
	
	@FindBy(xpath = "//*[@id=\"loginFrm\"]/fieldset/a[2]")
	WebElement forgotyourlogin;
	
	@FindBy(xpath = "//*[@id=\"forgottenFrm_lastname\"]")
	WebElement forgotloginlastname;
	
	@FindBy(xpath = "//*[@id=\"forgottenFrm_email\"]")
	WebElement forgotloginemail;
	
	@FindBy(xpath = "//*[@id=\"forgottenFrm\"]/div[2]/div/button")
	WebElement forgotloginbutton;
	
	@FindBy(xpath = "/html/body/div/header/div[1]/div/div[1]/a/img")
	 WebElement logo;
	
	@FindBy(xpath = "//*[@id=\"block_frame_latest_1770\"]/div/div[4]/div[2]/a/img")
	WebElement lancome;
	
	@FindBy(xpath = "//*[@id=\"product\"]/fieldset/div[4]/ul/li/a")
	WebElement addtocart;
	
	@FindBy(xpath = "//*[@id=\"cart_checkout1\"]")
	WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"checkout_btn\"]")
	WebElement confirm;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement continuee;
	
	@FindBy(xpath = "//*[@id=\"block_frame_latest_1770\"]/div/div[2]/div[2]/a/img")
	WebElement lancome1;
	
	@FindBy(xpath = "//*[@id=\"product\"]/fieldset/div[5]/a[2]")
	WebElement wishlist1;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a/div")
	WebElement welcome;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/ul/li[1]/a")
	WebElement clickaccdashboard;

	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/div/div/table/tbody/tr[4]/td[6]/a[2]")
	WebElement deletewishlist;
	
	public Login_or_register(WebDriver driver) {

         this.driver = driver;
         PageFactory.initElements(driver, this);
	}


	public void loginMenu()
	{
		 
		login.click();
	}
	
	public void registerRadiobutton()
	{
		if(register.isSelected())
		{
			System.out.println("radio button is clickable");
		}
		else
		{
			System.out.println("radio button is not clickable");
		}
		
		register_button.click();
	}

	public void personalDetails(String firstname, String lastname, String eemail, String phonee, String faxx)
	{
		
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		email.sendKeys(eemail);
		phone.sendKeys(phonee);
		fax.sendKeys(faxx);
	}
	
	public void Address(String comp, String add1, String add2, String cityy,  String zipp, String countryy, String regionn)
	{
		company.sendKeys(comp);
		Address1.sendKeys(add1);
		Address2.sendKeys(add2);
		city.sendKeys(cityy);
		
		 zip.sendKeys(zipp);
		
		Select count = new Select(country);
	    count.selectByVisibleText(countryy);
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(
	            By.name("zone_id"), regionn));
	    
		Select reg = new Select(region);
		reg.selectByVisibleText(regionn);
		
	}
	
	public void loginDetails(String lgname,String password1,String password2)
	{
		login_name.sendKeys(lgname);
		pass.sendKeys(password1);
		pass1.sendKeys(password2);
	}
	
	public void Subscribe()
	{
		no.click();
		
		if(no.isSelected())
		{
			System.out.println("Radio button is clickable");
		}
		else
		{
			System.out.println("Radio button is not clickable");
		}
	}
	
	public void checkBox()
	{
		checkbox.click();
		
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is clickable");
		}
		else
		{
			System.out.println("Checkbox is not clickable");
		}
	}
	
	public void continueButton()
	{
		con.click();
	}
	
	
	public void links_in_profile(String editfirstname,String editlastname,String editeemail,String editphone,String editffax)
	{
		acc_dashboard.click();
		wishlist.click();
		
		editacc.click();
		
		editfname.clear();
		editfname.sendKeys(editfirstname);
		
		editlname.clear();
		editlname.sendKeys(editlastname);
	
		editmail.clear();
		editmail.sendKeys(editeemail);
		
		editph.clear();
		editph.sendKeys(editphone);
		
		editfaxx.clear();
		editfaxx.sendKeys(editffax);
		
		conbutton.click();
		
		changepass.click();
		manage.click();
		order.click();
		trans.click();
		download.click();
		notification.click();
		logoff.click();
		continuebutton.click();
		
		
	}

	//Returning Customer----------------------------
	
	public void buttonClick(String log, String passw)
	{
		returnlogname.sendKeys(log);
		returnpass.sendKeys(passw);
		returnlogin.click();
	}
	
	public void links_in_profile1(String editfirstnameicon, String editlastnameicon,String editeemailicon, String editphoneicon, String editffaxicon,
			                      String currentpassword,String changepass,String confirmpass)
	{   
		 logo.click();
		 
		 lancome.click();
		 
		 addtocart.click();
		 
		 checkout.click();
		 
		 confirm.click();
		 
		 continuee.click();
		 
		 lancome1.click();
		 
		 wishlist1.click();
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(welcome).perform();
		 
		 clickaccdashboard.click();
		 
		 editaccdetailsicon.click();
		 
		 editfnameicon.clear();
		 editfnameicon.sendKeys(editfirstnameicon);  
			
		 editlnameicon.clear();
		 editlnameicon.sendKeys(editlastnameicon);
		
		 editemailicon.clear();
		 editemailicon.sendKeys(editeemailicon);
			
		 edittelephoneicon.clear();
		 edittelephoneicon.sendKeys(editphoneicon);
			
		 editfaxicon.clear();
		 editfaxicon.sendKeys(editffaxicon);   
		 editconbutton.click();
		 
		 
		 editchangepassicon.click();
		 currentpass.sendKeys(currentpassword);
		 newpass.sendKeys(changepass);
		 newconfirmpass.sendKeys(confirmpass);
		 editpassconbutton1.click();
		 
		 editmanageicon.click();
		 backbutton.click();
		 
		 editwishlisticon.click();
         deletewishlist.click();
         
		 continueshopping.click();
		 Actions act1 = new Actions(driver);
		 act1.moveToElement(mousehoverhomepage).perform();
		 accountdashboard.click();
		 
		 editordericon.click(); 
		 orderhistorycontinue.click();
		 
		 edittransicon.click();
		 transactioncontinue.click();
		 
		 editdownloadicon.click(); 
		 downloadcontinue.click();
		 
		 editnotificationicon.click(); 
		 notificationcontinue.click();
		 
		 editlogofficon.click();
		 logoffcontinue.click();
	}
	 
	public void pass(String forgotname , String forgoteemail)
	{
		login.click();
		
		forgot.click();
		forgotloginname.sendKeys(forgotname);
        forgotemail.sendKeys(forgoteemail);      
        forgotbutton.click();
	}
	
	public void loginforgotlink(String loginnameforgot, String loginemailforgot)
	{
		forgotyourlogin.click();
		
		forgotloginlastname.sendKeys(loginnameforgot);
		forgotloginemail.sendKeys(loginemailforgot);
		forgotloginbutton.click();
	}

    public void close()
	{
        driver.close();
	}
	
}
	
	
