package boardCreation;

import org.openqa.selenium.By;

import utility.Utility;

public class AddCard3 {
	
	public String cardName3;
	public AddCard3(String cardName3) {
		// TODO Auto-generated constructor stub
		this.cardName3 = cardName3;
	}
	public void ClickAddCard3() {
		// TODO Auto-generated method stub
		System.out.println("AddCard3 "+cardName3);
//		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/a"), 5000).click();
//		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div[1]/div/textarea"), 5000).sendKeys(cardName1);
//		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/input"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/div/a"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/textarea"), 5000).sendKeys(cardName3);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/input"), 5000).click();
	}

}
