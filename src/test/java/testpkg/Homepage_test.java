package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Homepage;

public class Homepage_test extends Baseclass {

	@Test
	
	public void test() throws InterruptedException
	{
	     Homepage ob = new Homepage(driver);
	     ob.logoCheck();
	     ob.title();
	     ob.social_medias();
	     ob.brands();
	     ob.bottom("Leela", "leela@gmail.com", "Hiii");
	     ob.close();
	    
	}
	
}
