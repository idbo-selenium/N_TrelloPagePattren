package boardCreation;

import org.openqa.selenium.By;

import utility.Utility;

public class AddList2 {
		
	public String listName2;
	public AddList2(String listName2) {
		// TODO Auto-generated constructor stub
		this.listName2 = listName2;
	}
	public void ClickAddList() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/form/span"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/form/input"), 5000).sendKeys(listName2);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/form/div/input"), 5000).click();
	}

}
