package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import pageObject.DadosPrecoPage;

public class DadosPrecoSteps {

    DadosPrecoPage dadosPrecoPage = new DadosPrecoPage();

    @Entao("o sistema apresenta a aba select price option")
    public void oSistemaApresentaAAbaSelectPriceOption() {
        dadosPrecoPage.validarAbaSelectPrice();
    }

    @Entao("o usuario marcar a opcao ultimate")
    public void oUsuarioMarcarAOpcaoUltimate() {
        dadosPrecoPage.marcarRadioUltimate();
    }

    @Entao("o usuario acionar o botao nextda aba select price option")
    public void oUsuarioAcionarOBotaoNextdaAbaSelectPriceOption() {
        dadosPrecoPage.acionarBotaoNextAbaSelectPrice();
    }

}
