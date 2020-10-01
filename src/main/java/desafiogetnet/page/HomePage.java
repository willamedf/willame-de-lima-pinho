package desafiogetnet.page;

import static desafiogetnet.core.Methods.definirExperaExplicita;

import desafiogetnet.core.Methods;

public class HomePage {

	private Methods methods = new Methods();

	public void acessarSite(String arg1) {
		methods.acessarSite(arg1);		
	}

	public void clicarBtnPesquisa() {
		definirExperaExplicita(4000);
		methods.clicarViaCssSelector("#search-trigger > div > span");
	}

	public void digitarCampoPesquisa(String text) {
		methods.escrever("//*[@id='global-search-input']", text);		
	}

	public void clicarBtnProcurar() {
		methods.clicarViaJS("//button[contains(text(), 'Procurar')]");
		
	}

}
