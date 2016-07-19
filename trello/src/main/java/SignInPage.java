package main.java;

import trello.browser.Browser;

public class SignInPage {

	public static String logInPageTitle = "Logged out of Trello";
	public static SignInCommands LoginAs(String username) {
		SignInCommands commands = new SignInCommands(username);
		return commands;
	}

	public static boolean IsAtSignInPage() {
		return Browser.driver.getTitle().equals(logInPageTitle);
	}

}
