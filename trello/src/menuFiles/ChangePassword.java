package menuFiles;

import org.openqa.selenium.By;
import utility.Utility;

public class ChangePassword {

	public void Click() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]/span[1]/span[1]"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/ul[1]/li[3]/a"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[3]/div/div[3]/div[2]/div[2]/a[3]/span"), 5000).click();
	}

	public static PasswordCommands OldPassword(String oldPassword) {
		// TODO Auto-generated method stub
		PasswordCommands commands = new PasswordCommands(oldPassword);
		return commands;
	}	
}
