package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Login_or_register;
import pagepkg.Specials;

public class Specials_test extends Baseclass{

	@Test
	public void test()
	{
		Specials ob = new Specials(driver);
		ob.special();
		ob.productAdd();
		
		
		Login_or_register obj = new Login_or_register(driver);
		obj.buttonClick("Brian","Brian44");
		ob.confirmProduct();
		ob.allLinks();
		ob.close();
		
		
		
	}
}
