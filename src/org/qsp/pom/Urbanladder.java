package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Urbanladder {
	@FindBy(name="keywords")
	private WebElement search;

	public Urbanladder(WebDriver driver) {
	 
		PageFactory.initElements(driver, this);
	}
	public void sendText(String text) {
		search.sendKeys(text,Keys.ENTER);
	}
}
