package main.java;

import org.openqa.selenium.By;

import utility.Utility;

public class SignInCommands {

	public String username;
	public String password;

	public SignInCommands(String username) {
		this.username = username;
	}
	
	public SignInCommands WithPassword(String password ){
		this.password = password;
		return this;
	}
	
	public void Login() {
		Utility.waitForPageUntilElementIsVisible(By.id("user"), 5000).sendKeys(username);
		Utility.waitForPageUntilElementIsVisible(By.id("password"), 5000).sendKeys(password);
		Utility.waitForPageUntilElementIsVisible(By.id("login"), 5000).click();
	}

}
