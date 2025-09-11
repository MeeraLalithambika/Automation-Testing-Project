package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Checkout;
import pagepkg.Login_or_register;

public class Checkout_test extends Baseclass{

	@Test
	public void test()
	{
		Login_or_register ob = new Login_or_register(driver);
		ob.loginMenu();
		ob.buttonClick("Brian","Brian44");
		
		Checkout obj = new Checkout(driver);
		obj.checkoutt();
	}
	
}
