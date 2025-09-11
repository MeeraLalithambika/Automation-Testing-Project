package testpkg;


import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Account;

public class Account_test extends Baseclass {
	
	@Test
	public void test()
	{
		Account ob = new Account(driver);
		ob.accountHover("Brian","Brian44","Peter","Brian44","Brian44","Brian44");
		ob.checkYourOrder("62493", "brian@gmail.com");
	}

}
