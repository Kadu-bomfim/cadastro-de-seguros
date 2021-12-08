package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import pageObject.DadosProdutoPage;

import static utils.Utils.datas;

public class DadosProdutoSteps {

    DadosProdutoPage dadosProdutoPage = new DadosProdutoPage();



    @Entao("o sistema apresenta a aba enter product data")
    public void oSistemaApresentaAAbaEnterProductData() {
        dadosProdutoPage.validarAbaProduct();
    }

    @Entao("o usuario informar a start date com uma data valida")
    public void oUsuarioInformarAStartDateComUmaDataValida() {
        dadosProdutoPage.informarStartDate(datas().hojeMaisDias(31, "dd/MM/yyyy"));
    }

    @Entao("o usuario selecionar insurance sum com {string}")
    public void oUsuarioSelecionarInsuranceSumCom(String string) {
        dadosProdutoPage.selecionarInsuranceSum(string);
    }

    @Entao("o usuario selecionar marit rating com {string}")
    public void oUsuarioSelecionarMaritRatingCom(String string) {
        dadosProdutoPage.selecionarMeritRating(string);
    }

    @Entao("o usuario selecionar damage insurance com {string}")
    public void oUsuarioSelecionarDamageInsuranceCom(String string) {
        dadosProdutoPage.selecionarDamageInsurance(string);
    }

    @Entao("o usuario marcar Optional Products com euro protection")
    public void oUsuarioMarcarOptionalProductsComEuroProtection() {
        dadosProdutoPage.marcarRadioOptionalProducts();
    }

    @Entao("o usuario selecionar Courtesy car com {string}")
    public void oUsuarioSelecionarCourtesyCarCom(String string) {
        dadosProdutoPage.selecionarCourtesyCar(string);
    }

    @Entao("o usuario acionar o botao next da aba product")
    public void oUsuarioAcionarOBotaoNextDaAbaProduct() {
        dadosProdutoPage.acionarBotaoNextAbaProducts();
    }


}
