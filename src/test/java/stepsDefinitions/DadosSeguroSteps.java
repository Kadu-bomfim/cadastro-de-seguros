package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.DadosSeguroPage;

import static utils.Utils.datas;

public class DadosSeguroSteps {

    DadosSeguroPage dadosSeguroPage = new DadosSeguroPage();

    @Entao("o sistema apresenta a aba enter insurant data")
    public void oSistemaApresentaAAbaEnterInsurantData() {
        dadosSeguroPage.validarAbaEnterInsurant();
    }

    @Entao("o usuario informa o first name {string}")
    public void oUsuarioInformaOFirstName(String string) {
        dadosSeguroPage.informarFirstName(string);
    }

    @Entao("o usuario informa o last name {string}")
    public void oUsuarioInformaOLastName(String string) {
        dadosSeguroPage.informarLastName(string);
    }

    @Entao("o usuario informar a date of birth com uma data valida")
    public void oUsuarioInformarADateOfBirthComUmaDataValida() {
        dadosSeguroPage.informarDateBirth(datas().hojeMenosAnos(31, "dd/MM/yyyy"));
    }

    @Entao("o usuario marcar gender com male")
    public void oUsuarioMarcarGenderComMale() {
        dadosSeguroPage.marcarCheckGenderMale();
    }

    @Entao("o usuario informar o street address com {string}")
    public void oUsuarioInformarOStreetAddressCom(String string) {
        dadosSeguroPage.informarStreetAddress(string);
    }

    @Entao("o usuario selecionar o country com {string}")
    public void oUsuarioSelecionarOCountryCom(String string) {
        dadosSeguroPage.selecionarCountry(string);
    }

    @Entao("o usuario informar o zip code com {string}")
    public void oUsuarioInformarOZipCodeCom(String string) {
        dadosSeguroPage.informarZipCode(string);
    }

    @Entao("o usuario informar a city com {string}")
    public void oUsuarioInformarACityCom(String string) {
        dadosSeguroPage.informarCity(string);
    }

    @Entao("o usuario selecionar a occupation com {string}")
    public void oUsuarioSelecionarAOccupationCom(String string) {
        dadosSeguroPage.selecionarOccupation(string);
    }

    @Entao("o usuario marcar hobbies com cliff diving")
    public void oUsuarioMarcarHobbiesComCliffDiving() {
        dadosSeguroPage.marcarHobbies();
    }

    @Entao("o usuario informar o website com {string}")
    public void oUsuarioInformarOWebsiteCom(String string) {
        dadosSeguroPage.informarWebSite(string);
    }

    @Entao("o usuario selecionar arquivo para anexo")
    public void oUsuarioSelecionarArquivoParaAnexo() throws Exception {
        dadosSeguroPage.selecionarArquivoAnexo();
    }

    @Quando("o usuario acionar o botao next da aba insurant")
    public void oUsuarioAcionarOBotaoNextDaAbaInsurant() {
        dadosSeguroPage.acionarBotaoNextAbaInsurant();
    }

}
