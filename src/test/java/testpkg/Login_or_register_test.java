package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Homepage;
import pagepkg.Login_or_register;


public class Login_or_register_test extends Baseclass {

	@Test
	
	public void test() throws Exception
	{
		Login_or_register ob = new Login_or_register(driver);
		
		/*ob.loginMenu();
		ob.registerRadiobutton();
		
		ob.personalDetails("Brian","Peter","brian@gmail.com","9856320147","1234");
		
		ob.Address("Accenture", "Brian Peter, 1234 Elm Street, Springfield, IL 62704 United States", 
				    "Brian Peter, 56 Baker Street, Newyork, NW1 6XE, United States","New York","1234","United States","Ohio");
		
		ob.loginDetails("Brian","Brian4","Brian4");
		
		ob.Subscribe();
		ob.checkBox();
		ob.continueButton();
		
		ob.links_in_profile("Brian","Peter","brian@gmail.com","9876543210","1234");
		*/
		//Returning Customer----------------------------
		
		ob.loginMenu();	
		
		ob.buttonClick("Brian","Brian44");
		
		ob.links_in_profile1("Brian","Peter","brian@gmail.com","9876543210","4444","Brian44","Brian44","Brian44");
		
		ob.pass("Brian","brian@gmail.com");
		
		ob.loginforgotlink("Peter","Brian@gmail.com");
		
		Homepage obj = new Homepage(driver);
	    obj.logoCheck();
	    
	    ob.close();
	
	}
}
