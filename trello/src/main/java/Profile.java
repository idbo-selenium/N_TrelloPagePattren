package main.java;

import org.openqa.selenium.By;

import utility.Utility;

public class Profile {

	public void Click() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]/span[2]"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/ul[1]/li[1]/a"), 5000).click();
		
	}

}
