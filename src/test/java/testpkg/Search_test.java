package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Login_or_register;
import pagepkg.Search;

public class Search_test extends Baseclass {

	@Test
	
	public void test()
	{
		Login_or_register ob = new Login_or_register(driver);
		ob.loginMenu();
		ob.buttonClick("Brian","Brian44");
		
	    Search obj = new Search(driver);
	    obj.searchProduct("Fragrance");
	
    }
	
}
