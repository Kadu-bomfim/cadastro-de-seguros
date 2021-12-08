package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import pageObject.DadosCotacaoPage;

public class DadosCotacaoSteps {

    DadosCotacaoPage dadosCotacaoPage = new DadosCotacaoPage();

    @Entao("o sistema apresenta a aba send quote")
    public void oSistemaApresentaAAbaSendQuote() {
        dadosCotacaoPage.validarAbaSendQuote();
    }

    @Entao("o usuario informar o email {string}")
    public void oUsuarioInformarOEmail(String string) {
        dadosCotacaoPage.informarEmail(string);
    }

    @Entao("o usuario informar o phone {string}")
    public void oUsuarioInformarOPhone(String string) {
        dadosCotacaoPage.informarPhone(string);
    }

    @Entao("o usuario informar o username {string}")
    public void oUsuarioInformarOUsername(String string) {
        dadosCotacaoPage.informarName(string);
    }

    @Entao("o usuario informar o password {string}")
    public void oUsuarioInformarOPassword(String string) {
        dadosCotacaoPage.informarPassword(string);
    }

    @Entao("o usuario confirmar o passaword {string}")
    public void oUsuarioConfirmarOPassaword(String string) {
        dadosCotacaoPage.informarConfirmPassword(string);
    }

    @Entao("o usuario informar um comments {string}")
    public void oUsuarioInformarUmComments(String string) {
        dadosCotacaoPage.informarComments(string);
    }

    @Entao("o usuario acionar o botao next da aba send quote")
    public void oUsuarioAcionarOBotaoNextDaAbaSendQuote() {
        dadosCotacaoPage.acionarBotaoNextAbaQuote();
    }

    @Entao("o sistema me apresenta a mensagem {string}")
    public void oSistemaMeApresentaAMensagem(String string) {
        dadosCotacaoPage.validarMensagemDeCadastroComSucesso(string);
    }


}
