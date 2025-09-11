package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	WebDriver driver;

	@FindBy(xpath = "/html/body/div/header/div[1]/div/div[1]/a/img")
	 WebElement logo;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/footer/section[2]/div/div[1]/div/ul/li[1]/div/a")
	WebElement about;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/a")
	WebElement continuee;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/footer/section[2]/div/div[1]/div/ul/li[2]/div/a")
	WebElement privacy;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/footer/section[2]/div/div[1]/div/ul/li[3]/div/a")
	WebElement returnn;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/a")
	WebElement cont;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/footer/section[2]/div/div[1]/div/ul/li[4]/div/a")
	WebElement shipping;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/a")
	WebElement con;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/footer/section[2]/div/div[1]/div/ul/li[5]/a")
	WebElement contactus;
	
	@FindBy(xpath = "//*[@id=\"ContactUsFrm_first_name\"]")
	WebElement fname;
	
	@FindBy(xpath = "//*[@id=\"ContactUsFrm_email\"]")
	WebElement email;

	@FindBy(xpath = "//*[@id=\"ContactUsFrm_enquiry\"]")
	WebElement enquiry;
	
	@FindBy(xpath = "//*[@id=\"ContactUsFrm\"]/div[2]/div[2]/button")
	WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/section/a")
	WebElement contin;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/footer/section[2]/div/div[1]/div/ul/li[6]/a")
	WebElement site;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/footer/section[2]/div/div[1]/div/ul/li[7]/a")
	WebElement login;
	
	@FindBy(xpath = "/html/body/div/header/div[2]/div/div[4]/div/div/a[1]")
	WebElement fb;
	
	@FindBy(xpath = "/html/body/div/header/div[2]/div/div[4]/div/div/a[2]")
	WebElement twitter;
	
	@FindBy(xpath = "//*[@id=\"brandcarousal\"]/li[1]/div[1]/a/img")
	WebElement benefit;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/section/ul/li[1]/a")
	WebElement home;
	
	@FindBy(xpath = "//*[@id=\"brandcarousal\"]/li[2]/div[1]/a/img")
	WebElement pantene;
	
	@FindBy(xpath = "//*[@id=\"brandcarousal\"]/li[3]/div[1]/a/img")
	WebElement mac;
	
	@FindBy(xpath = "//*[@id=\"brandcarousal\"]/li[4]/div[1]/a/img")
	WebElement lancome;
	
	@FindBy(xpath = "//*[@id=\"brandcarousal\"]/li[5]/div[1]/a/img")
	WebElement gucci;
	
	@FindBy(xpath = "//*[@id=\"brandcarousal\"]/li[6]/div[1]/a/img")
	WebElement armani;
	
	@FindBy(xpath = "//*[@id=\"brandcarousal\"]/li[7]/div[1]/a/img")
	WebElement dove;
	
	@FindBy(xpath = "//*[@id=\"brandcarousal\"]/li[8]/div[1]/a/img")
	WebElement ck;
	
	@FindBy(xpath = "//img[@alt='Bvlgari']")
	WebElement bvlgari;
	
	@FindBy(xpath = "//img[@alt='Sephora']")
	WebElement sephora;
	
	
	public Homepage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}

	public void logoCheck()
	{
	    logo.click();
	
		if(logo.isDisplayed() && logo.isEnabled())
		{
			System.out.println("logo is clickable");
		}
		else
		{
			System.out.println("logo is not clickable");
		}
		
	}
	
	public void title()
	{
		String act = "A place to practice your automation skills!";
		String exp =  driver.getTitle();
		
		if(act.equals(exp))
		{
			System.out.println("Title Pass");
		}
		else
		{
			System.out.println("Title Failed");
		}
	}

	public void social_medias()
	{
	
		String page1 =driver.getWindowHandle();
		
		fb.click();
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	        // Example: Wait until element is clickable
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
		
		for(String handle : driver.getWindowHandles())
			if (!handle.equals(page1)) 
			{	
		        driver.switchTo().window(handle);
		        break;
			}
		
        driver.close();
		driver.switchTo().window(page1);
		
		twitter.click();
		
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));

	        // Example: Wait until element is clickable
	        WebElement elementt = wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Twitter")));

		for(String handle : driver.getWindowHandles())
			if (!handle.equals(page1)) 
			{	
		        driver.switchTo().window(handle);
		        break;
			}
        driver.close();
		driver.switchTo().window(page1);
	}
	
	public void brands() throws InterruptedException
	{ 
		benefit.click();
		home.click();
		
		pantene.click();
		home.click();
		
		mac.click();
		home.click();
		
		lancome.click();
		home.click();
		
		gucci.click();
		home.click();
		
		armani.click();
		home.click();
		
		dove.click();
		home.click();
		
		ck.click();
		home.click();
		
		bvlgari.click();
		home.click();
		
		sephora.click();
		home.click();
	}
	
	public void bottom(String first, String emaill, String enquiryy)
	{
		about.click();
		continuee.click();
		privacy.click();
		returnn.click();
		cont.click();
		shipping.click();
		con.click();
		contactus.click();
		fname.sendKeys(first);
		email.sendKeys(emaill);
		enquiry.sendKeys(enquiryy);
		submit.click();
		contin.click();
		site.click();
		login.click();
		logo.click();
	}
	
	public void close()
	{
		driver.close();
	}
}
