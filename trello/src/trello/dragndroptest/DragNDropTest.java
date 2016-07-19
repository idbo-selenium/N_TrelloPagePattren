package trello.dragndroptest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import boardCreation.JavaBoard;
import main.java.HomePage;
import main.java.MyAccountPage;
import main.java.SignInPage;
import trello.browser.Browser;

public class DragNDropTest {

	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void Cleanup(){
		//Browser.Close();
	}
	
	@Test
	public void DrapNDrop_Card_Test(){
		HomePage.GoTo();
		SignInPage.LoginAs("knskumari").WithPassword("pass@word1").Login();
		JavaBoard.Click();
		JavaBoard.Board().Card().DragAndDrop();
		//MyAccountPage.Signout();
		
		//closing board
		JavaBoard.CloseBoard().Click();
	}
}