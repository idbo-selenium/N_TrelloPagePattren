package boardCreation;

import org.openqa.selenium.By;

import utility.Utility;

public class AddCard4 {

	public String cardName4;
	public AddCard4(String cardName4) {
		// TODO Auto-generated constructor stub
		this.cardName4 = cardName4;
	}
	public void ClickAddCard2() {
		// TODO Auto-generated method stub
		System.out.println("AddCard4 "+cardName4);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/textarea"), 5000).sendKeys(cardName4);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/input"), 5000).click();
	}

}
