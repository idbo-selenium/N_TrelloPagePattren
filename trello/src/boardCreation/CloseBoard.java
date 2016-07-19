package boardCreation;

import org.openqa.selenium.By;

import trello.browser.Browser;
import utility.Utility;
public class CloseBoard {

	public void Click() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/ul/li[5]/a"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/ul[3]/li/a"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/input"), 5000).click();
		Browser.driver.navigate().back();
	}

}
