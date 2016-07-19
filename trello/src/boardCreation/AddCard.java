package boardCreation;

import org.openqa.selenium.By;

import utility.Utility;

public class AddCard {
		
	public String cardName1;
	
	public AddCard(String cardName1) {
		// TODO Auto-generated constructor stub
		this.cardName1 = cardName1;
	}
	public void ClickAddCard1() {
		// TODO Auto-generated method stub
		System.out.println("AddCard1 "+cardName1);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/a"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div[1]/div/textarea"), 5000).sendKeys(cardName1);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/input"), 5000).click();
		//Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[4]/div[2]/a[1]"), 5000).click();
	}

}