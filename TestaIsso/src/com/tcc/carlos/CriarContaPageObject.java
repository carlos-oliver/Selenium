package com.tcc.carlos;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CriarContaPageObject {
	
	@FindBy(id="name")
	private WebElement inputNomeCompleto;
	
	@FindBy(id="email")
	private WebElement inputEmail;
	
	@FindBy(name="pwd")
	private WebElement inputSenha;
	
	@FindBy(name="pwd2")
	private WebElement inputSenhaNovamente;
	
	@FindBy(id="phonenumber")
	private WebElement inputTelefone;
	
	@FindBy (css="input.button.button-small")
	private WebElement botaoCriarConta;
	
	public void esperarLinkSeTorneCliente() {
		WD.getWait().until(ExpectedConditions.visibilityOf(botaoCriarConta));
	}	
	
	
	public static CriarContaPageObject deve(){
		return PageFactory.initElements(WD.get(), CriarContaPageObject.class);
	}
	
	public void preencherNomeCompleto(String nomeCompleto){
		inputNomeCompleto.sendKeys(nomeCompleto);
	}
	
	public void preencherEmail(String email){
		String data = new SimpleDateFormat("ddMMYYYYHHmmss").format(new Date());
		inputEmail.sendKeys(email + data + "@gmail.com");
	}
	
	public void preencherSenha(String senha){
		inputSenha.sendKeys(senha);
	}
	
	public void preencherSenhaNovamente(String senhaNovamente){
		inputSenhaNovamente.sendKeys(senhaNovamente);
	}
	
	public void preencherTelefone(String telefone){
		inputTelefone.sendKeys(telefone);
	}
	
	public void clicarBotaoCriarConta(){
		botaoCriarConta.click();
	}
}