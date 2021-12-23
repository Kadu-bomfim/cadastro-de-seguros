package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.DadosCotacaoPage;

public class DadosCotacaoSteps {

    DadosCotacaoPage dadosCotacaoPage = new DadosCotacaoPage();

    @Quando("o usuario preencher o formulario Send Quote")
    public void oUsuarioPreencherOFormularioSendQuote() {
        dadosCotacaoPage.preencherFormularioSendQuotePage();
    }

    @Quando("o usuario nao preencher o name no formulario Send Quote")
    public void oUsuarioNaoPreencherTONameNoFormularioSendQuote() {
        dadosCotacaoPage.naoPreencherNameFormularioSendQuotePage();
    }

    @Quando("o usuario nao preencher o email no formulario Send Quote")
    public void oUsuarioNaoPreencherTOEmailNoFormularioSendQuote() {
        dadosCotacaoPage.naoPreencherEmailFormularioSendQuotePage();
    }

    @Entao("o sistema me apresenta a mensagem")
    public void oSistemaMeApresentaAMensagem( ) {
        dadosCotacaoPage.validarMensagemDeCadastroComSucesso();
    }

    @Entao("o sistema me apresenta a mensagem erro")
    public void oSistemaMeApresentaAMensagemErro( ) {
        dadosCotacaoPage.validarMensagemDErro();
    }


}
