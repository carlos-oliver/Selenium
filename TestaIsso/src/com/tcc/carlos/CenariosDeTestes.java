package com.tcc.carlos;

import org.junit.Test;

public class CenariosDeTestes {
	
	@Test
	public void testCadastrarCliente(){
		PaginaInicialPageObjects.acessarPaginaInicial();
		PaginaInicialPageObjects.deve() .clicarBotaoEntrar();
		LoginPageObject.deve().clicarLinkSeTorneCliente();
		CriarContaPageObject.deve().preencherNomeCompleto("Nome");
		CriarContaPageObject.deve().preencherSenha("123456");
		CriarContaPageObject.deve().preencherSenhaNovamente("123456");
		CriarContaPageObject.deve().preencherEmail("tcccarlos");
		CriarContaPageObject.deve().clicarBotaoCriarConta();
		DashBoardPageObject.deve().validaMsgSucesso();
		WD.quit();
	}
	

	
}