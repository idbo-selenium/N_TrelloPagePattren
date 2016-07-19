package boardCreation;

import org.openqa.selenium.By;

import utility.Utility;

public class BoardCreation {

	public String boardTitle;
	
	public BoardCreation(String boardTitle) {
		// TODO Auto-generated constructor stub
		this.boardTitle = boardTitle;
	}

	public void ClickCreate() {
		// TODO Auto-generated method stub
		//Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[3]/ul/li[4]/a"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.cssSelector("html body.firefox.firefox-43.windows.body-no-webkit-scrollbars.tabbed-page div#surface div#content div.member-boards-view div.boards-page-board-section ul.board-list.js-board-list li a.board-list-item--add-board.js-add-board"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.id("boardNewTitle"), 5000).sendKeys(boardTitle);
		Utility.waitForPageUntilElementIsVisible(By.xpath("html/body/div[5]/div/div[2]/div/div/div/form/input[3]"), 5000).click();		
	}
///html/body/div[5]/div/div[2]/div/div/div/form/input[3]
}