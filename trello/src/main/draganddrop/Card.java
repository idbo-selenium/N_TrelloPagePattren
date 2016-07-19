package main.draganddrop;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import trello.browser.Browser;

public class Card {

	public void DragAndDrop() {
		// TODO Auto-generated method stub
		Actions dragNDrop = new Actions(Browser.driver);
		//card drag and drop
		WebElement sourceCard = Browser.driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[3]"));
		WebElement destinationCard = Browser.driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/div/div[2]"));
		Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		dragNDrop.dragAndDrop(sourceCard, destinationCard).perform();
		
		//List Drag and Drop
		WebElement sourceList = Browser.driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]"));
		WebElement destinationList = Browser.driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div/div[2]/div/div[1]"));
		Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		dragNDrop.dragAndDrop(sourceList, destinationList).perform();
	}
}