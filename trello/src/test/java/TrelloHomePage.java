package test.java;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.java.HomePage;
import trello.browser.Browser;


public class TrelloHomePage {

	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void Cleanup(){
		//Browser.Close();
	}
	
	@Test
	public void Go_To_HomePage(){
		HomePage.GoTo();
		Assert.assertTrue(HomePage.IsAtHomePage());			
	}
	
}
