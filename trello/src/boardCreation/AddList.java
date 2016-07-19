package boardCreation;

import org.openqa.selenium.By;

import utility.Utility;

public class AddList {

	public String listName;
	public AddList(String listName) {
		// TODO Auto-generated constructor stub
		this.listName = listName;
	}

	public void ClickAddList() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div/form/span"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div/form/input"), 5000).sendKeys(listName);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div/form/div/input"), 5000).click();
	}

}
