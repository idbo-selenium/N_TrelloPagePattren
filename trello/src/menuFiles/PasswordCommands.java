package menuFiles;

import org.openqa.selenium.By;

import utility.Utility;

public class PasswordCommands {

	public String oldPassword ;
	public String newPassword;
	public String againNewPassword;
	
	public PasswordCommands(String oldPassword) {
		// TODO Auto-generated constructor stub
		//System.out.println("hru " +oldPassword);
		this.oldPassword = oldPassword;
	}

	public PasswordCommands WithNewPassword(String newPassword) {
		// TODO Auto-generated method stub
		//System.out.println("hello " +newPassword);
		this.newPassword = newPassword;
		return this;
	}

	public PasswordCommands WithAgainNewPassword(String againNewPassword) {
		// TODO Auto-generated method stub
		//System.out.println("hiii " +againNewPassword);
		this.againNewPassword = againNewPassword;
		return this;
		
	}

	public void Save() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.id("o_password"), 5000).sendKeys(oldPassword);
		Utility.waitForPageUntilElementIsVisible(By.id("password1"), 5000).sendKeys(newPassword);
		Utility.waitForPageUntilElementIsVisible(By.id("password2"), 5000).sendKeys(againNewPassword);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/form/input[4]"), 5000).click();
	}

}