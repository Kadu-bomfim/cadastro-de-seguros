package stepsDefinitions;

import io.cucumber.java.pt.Quando;
import pageObject.DadosPrecoPage;

public class DadosPrecoSteps {

    DadosPrecoPage dadosPrecoPage = new DadosPrecoPage();

    @Quando("o usuario preencher o formulario Select Price Option")
    public void oUsuarioPreencherOFormularioSelectPriceOption() {
        dadosPrecoPage.preencherFormularioSelectPrice();
    }


}
