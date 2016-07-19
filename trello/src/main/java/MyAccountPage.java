package main.java;

import org.openqa.selenium.By;

import utility.Utility;

public class MyAccountPage {

	public static Object IsAbleToLoginAs() {
		return Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]/span[2]"), 5000).getText();
	}

	public static void Signout() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]/span[2]"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.className("js-logout"),5000).click();
	}

	public static Object IsItMyNewBoard() {
		// TODO Auto-generated method stub
		return Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[1]/a/span"), 5000).getText();
	}

}
