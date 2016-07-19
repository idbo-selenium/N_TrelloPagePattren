package boardCreation;

import org.openqa.selenium.By;

import trello.browser.Browser;
import utility.Utility;

public class NewBoardCreation {

	public static BoardCreation CreatBoard(String boardTitle) {
		// TODO Auto-generated method stub
		BoardCreation newBoard = new BoardCreation(boardTitle);
		return newBoard;
	}

	public static void Click() {
		// TODO Auto-generated method stub
		Browser.driver.navigate().back();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[3]/ul/li[1]/a/span[2]/span"), 5000).click();
	}
}
