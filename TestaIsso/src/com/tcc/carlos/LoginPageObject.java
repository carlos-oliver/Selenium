package com.tcc.carlos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageObject {
	
	@FindBy(linkText="Se torne um cliente")
	private WebElement linkSeTorneUmCliente;

	
	public static LoginPageObject deve() {
		return PageFactory.initElements(WD.get(), LoginPageObject.class);
	}
	
	public void clicarLinkSeTorneCliente() {
		linkSeTorneUmCliente.click();
	}
	
	public void esperarLinkSeTorneCliente() {
		WD.getWait().until(ExpectedConditions.visibilityOf(linkSeTorneUmCliente));
	}

}