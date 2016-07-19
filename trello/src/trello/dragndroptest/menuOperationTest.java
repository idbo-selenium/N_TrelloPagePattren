package trello.dragndroptest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import boardCreation.JavaBoard;
import main.java.HomePage;
import main.java.SignInPage;
import trello.browser.Browser;
//import menuFiles.ChangePassword;
//import menuFiles.ProfileClick;
import menuFiles.ChangeBackgroundColor;

public class menuOperationTest {
	
	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void Cleanup(){
		//Browser.Close();
	}
	
	@Test
	public void menu_button_click_test(){
		HomePage.GoTo();
		SignInPage.LoginAs("knskumari").WithPassword("pass@word1").Login();
		JavaBoard.Click();
		//JavaBoard.ChangeBackgroundColor().Select();
		//TopNavigationBar.Women.Heels.Select();
		ChangeBackgroundColor.Purple.Select();
		ChangeBackgroundColor.Orange.Select();
		ChangeBackgroundColor.Green.Select();
		ChangeBackgroundColor.Red.Select();
		ChangeBackgroundColor.Blue.Select();
		ChangeBackgroundColor.Pink.Select();
		ChangeBackgroundColor.Gray.Select();
		ChangeBackgroundColor.Light_Green.Select();
		ChangeBackgroundColor.Sky_Blue.Select();		
		JavaBoard.Profile().Click();
		//ProfileClick.ChangePassword().Click();
		//ProfileClick.ChangePassword();
		//ChangePassword.OldPassword("pass@word1").WithNewPassword("pass@word2").WithAgainNewPassword("pass@word2").Save();		
	}	
}
