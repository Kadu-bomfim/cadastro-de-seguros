package stepsDefinitions;

import io.cucumber.java.pt.Quando;
import pageObject.DadosSeguroPage;

public class DadosSeguroSteps {

    DadosSeguroPage dadosSeguroPage = new DadosSeguroPage();

    @Quando("o usuario preencher o formulario enter Insurant Data")
    public void oUsuarioPreencherOFormularioEnterInsurantData() {
        dadosSeguroPage.preencherFormularioEnterInsurantData();
    }


}
