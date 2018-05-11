package com.tcc.carlos;

import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashBoardPageObject {
	
	@FindBy(css="div.row > h3")
	private WebElement msgSucesso;
	
	
	public void esperarLinkSeTorneCliente() throws InterruptedException {
		WD.getWait().until(ExpectedConditions.textToBePresentInElement(msgSucesso, "Mas que prazer ter você como cliente, nome"));
	}
	
	public static DashBoardPageObject deve() {
		return PageFactory.initElements(WD.get(), DashBoardPageObject.class);
	}
	
	public void validaMsgSucesso() {
		assertEquals("Mas que prazer ter você como cliente, nome", msgSucesso.getText());
	}
}
