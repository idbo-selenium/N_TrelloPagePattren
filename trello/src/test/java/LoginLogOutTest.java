package test.java;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import trello.browser.Browser;
import main.java.HomePage;
import main.java.MyAccountPage;
import main.java.SignInPage;

public class LoginLogOutTest {

	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void Cleanup(){
		//Browser.Close();
	}
	
	@Test
	public void Login_And_Logout(){
		HomePage.GoTo();
		SignInPage.LoginAs("knskumari").WithPassword("pass@word1").Login();
		Assert.assertEquals("knskumari", MyAccountPage.IsAbleToLoginAs());
		MyAccountPage.Signout();
		Assert.assertTrue(SignInPage.IsAtSignInPage());
	}	
}