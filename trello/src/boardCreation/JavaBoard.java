package boardCreation;

import org.openqa.selenium.By;
import main.draganddrop.Board;
import utility.Utility;
//import menuFiles.ChangeBackgroundColor;
import menuFiles.ProfileClick;
import main.java.Profile;
public class JavaBoard {

	public static void Click() {
		// TODO Auto-generated method stub
		System.out.println("JavaBoard click");
		Utility.waitForPageUntilElementIsVisible(By.cssSelector("html body.firefox.firefox-44.windows.body-no-webkit-scrollbars.tabbed-page div#surface div#content div.member-boards-view div.boards-page-board-section ul.board-list.js-board-list li a.js-open-board.unknown span.details"), 5000).click();
	}

	public static AddList AddList(String listName) {
		// TODO Auto-generated method stub
		System.out.println("JavaBoard "+listName);
		AddList list = new AddList(listName);
		return list;
	}

	public static AddCard AddCard1(String cardName1) {
		// TODO Auto-generated method stub
		AddCard card = new AddCard(cardName1);
		return card;
	}

	public static AddCard2 AddCard2(String cardName2) {
		// TODO Auto-generated method stub
		System.out.println("JavaBoard "+cardName2);
		AddCard2 card = new AddCard2(cardName2);
		return card;
	}

	public static AddCard3 AddCard3(String cardName3) {
		// TODO Auto-generated method stub
		System.out.println("JavaBoard "+cardName3);
		AddCard3 card = new AddCard3(cardName3);		
		return card;
	}

	public static AddList2 AddList2(String listName2) {
		// TODO Auto-generated method stub
		System.out.println("JavaBoard "+listName2);
		AddList2 list2 = new AddList2(listName2);
		return list2;
	}

	public static AddCard4 AddCard4(String cardName4) {
		// TODO Auto-generated method stub
		AddCard4 card = new AddCard4(cardName4);
		return card;
	}

	public static Board Board() {
		// TODO Auto-generated method stub
		return new Board();
	}

	public static CloseBoard CloseBoard() {
		// TODO Auto-generated method stub
		return new CloseBoard();
	}

//	public static ChangeBackgroundColor ChangeBackgroundColor() {
//		// TODO Auto-generated method stub
//		return new ChangeBackgroundColor();
//	}

	public static ProfileClick ProfileClick() {
		// TODO Auto-generated method stub
		return new ProfileClick();
	}

	public static Profile Profile() {
		// TODO Auto-generated method stub
		return new Profile();
	}

}
