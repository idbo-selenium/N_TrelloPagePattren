package boardCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import trello.browser.Browser;
import utility.Utility;

public class ColorSelector {	
	
	public static void Select(Colors selectColor)
	{
		//Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/ul/li[1]/a"), 5000).click();
		Actions colors = new Actions(Browser.Driver());
		switch(selectColor){
		case PURPLE:
			Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/ul/li[1]/a"), 5000).click();
			colors.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[5]/span"), 5000)).click().build().perform();			
			break;
		case BLUE:			
			colors.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[1]/span"), 5000)).click().build().perform();
			break;
		case ORANGE:			
			colors.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/span"), 5000)).click().build().perform();
			break;
		case GREEN:			
			colors.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[3]/span"), 5000)).click().build().perform();
			break;
		case RED:
			colors.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[4]/span"), 5000)).click().build().perform();
			break;
		case PINK:
			colors.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[6]/span"), 5000)).click().build().perform();
			break;
		case LIGHT_GREEN:
			colors.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[7]/span"), 5000)).click().build().perform();
			break;
		case SKY_BLUE:
			colors.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[8]/span"), 5000)).click().build().perform();
			break;
		case GRAY:
			colors.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[9]/span"), 5000)).click().build().perform();
		default:
			break;
		}
	}
	
}
