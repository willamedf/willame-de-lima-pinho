package desafiogetnet.steps;

import static desafiogetnet.core.DriverFactory.killDriver;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import desafiogetnet.page.FaqPage;
import desafiogetnet.page.HomePage;

public class DesafioGerNetSteps {
	
	
	private HomePage homePage = new HomePage();
	private FaqPage faqPage = new FaqPage();
	
	@After
	public void teardown() {
		killDriver();
	}

	@Dado("^que esteja no site \"([^\"]*)\"$")
	public void queEstejaNoSite(String arg1) throws Throwable {
		homePage.acessarSite(arg1);
	}

	@Quando("^eu clicar no campo pesquisa$")
	public void euClicarNoCampoPesquisa() throws Throwable {
		homePage.clicarBtnPesquisa();
	}

	@Quando("^digitar \"([^\"]*)\"$")
	public void digitar(String arg1) throws Throwable {
		homePage.digitarCampoPesquisa(arg1);
	}

	@Quando("^clicar em procurar$")
	public void clicarEmProcurar() throws Throwable {
		homePage.clicarBtnProcurar();
	}

	@E("^seleciono a opcao desejada$")
	public void selecionoAOpcaoDesejada() throws Throwable {
		faqPage.selecionarOpcaoDesejada();
	}
	
	@Entao("^verifico de o modal foi aberto com a opcao escolhida$")
	public void verificoDeOModalFoiAbertoComAOpcaoEscolhida() throws Throwable {
	    faqPage.validarModalComRespostaFaq();
	}


}
