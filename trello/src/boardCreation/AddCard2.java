package boardCreation;

import org.openqa.selenium.By;
import utility.Utility;

public class AddCard2 {

	public String cardName2;
	public AddCard2(String cardName2) {
		this.cardName2=cardName2;
	}

	public void ClickAddCard2() {
		System.out.println("AddCard2 "+cardName2);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/textarea"), 5000).sendKeys(cardName2);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/input"), 5000).click();	
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[3]/div[2]/a[1]"), 5000).click();
	}

}
