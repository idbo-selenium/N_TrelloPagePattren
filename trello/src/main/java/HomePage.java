package main.java;

import trello.browser.Browser;

public class HomePage {
	
	public static String baseURL = "https://trello.com/login";
	public static String title = "Log in to Trello";

	public static void GoTo() {
		Browser.driver.navigate().to(baseURL);
	}

	public static boolean IsAtHomePage() {
		return Browser.driver.getTitle().equals(title);
	}

	public static Header Header() {
		return new Header();
	}
	
	
}
