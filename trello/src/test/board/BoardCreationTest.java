package test.board;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import boardCreation.JavaBoard;
import boardCreation.NewBoardCreation;
import main.java.HomePage;
import main.java.MyAccountPage;
import main.java.SignInPage;
import trello.browser.Browser;

public class BoardCreationTest {

	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		//Browser.Close();
	}
	
	@Test
	public void Create_Board_Test(){
		HomePage.GoTo();
		SignInPage.LoginAs("knskumari").WithPassword("pass@word1").Login();
		NewBoardCreation.CreatBoard("java").ClickCreate();
		Assert.assertEquals("java",MyAccountPage.IsItMyNewBoard());		
		NewBoardCreation.Click();			
		JavaBoard.Click();
		//Board1 creation
		JavaBoard.AddList("java1").ClickAddList();
		JavaBoard.AddCard1("java11").ClickAddCard1();		
		JavaBoard.AddCard2("java12").ClickAddCard2();
		//Board2 creation
		JavaBoard.AddList2("java2").ClickAddList();
		JavaBoard.AddCard3("java21").ClickAddCard3();
		JavaBoard.AddCard4("java22").ClickAddCard2();		
		//Drag and Drop
		JavaBoard.Board().Card().DragAndDrop();		
		//closing board
		JavaBoard.CloseBoard().Click();		
		//logout
		MyAccountPage.Signout();
	}
}

