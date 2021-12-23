package stepsDefinitions;

import io.cucumber.java.pt.Quando;
import pageObject.DadosProdutoPage;

public class DadosProdutoSteps {

    DadosProdutoPage dadosProdutoPage = new DadosProdutoPage();

    @Quando("o usuario preencher o formulario enter Product Data")
    public void oUsuarioPreencherOFormularioEnterProductData() {
        dadosProdutoPage.preecherFormularioEnterProduct();
    }

}
