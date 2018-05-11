package com.tcc.carlos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicialPageObjects {
	
	@FindBy(css=".signup.visible-md.visible-lg")
	private WebElement btnEntrar;
	
	public static PaginaInicialPageObjects deve (){
		return PageFactory.initElements(WD.get(), PaginaInicialPageObjects.class);
	}
	
	public static void acessarPaginaInicial(){
		WD.get().navigate().to("http://www.testaisso.com.br/");
	}
	
	public void clicarBotaoEntrar(){
		btnEntrar.click();
	}

}