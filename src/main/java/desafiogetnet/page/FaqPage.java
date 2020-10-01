package desafiogetnet.page;

import static desafiogetnet.core.Methods.definirExperaExplicita;

import desafiogetnet.core.Methods;

public class FaqPage {

	private Methods methods = new Methods();

	public void selecionarOpcaoDesejada() {
		definirExperaExplicita(5000);
		methods.clicarViaJS("//h3[contains(text(), 'Como acesso a minha conta SuperGet?')]");	
	}

	public void validarModalComRespostaFaq() {
		methods.elementoExiste("(//div[contains(text(), 'Como acesso a minha conta SuperGet?')])[2]");
		// assertiva não funcinou
	}	
	
}
