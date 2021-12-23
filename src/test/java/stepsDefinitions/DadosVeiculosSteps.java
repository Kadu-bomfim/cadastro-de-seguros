package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pageObject.DadosVeiculosPage;

import static utils.Utils.acessarSistema;

public class DadosVeiculosSteps {

    DadosVeiculosPage dadosVeiculosPage = new DadosVeiculosPage();

    @Quando("o usuario preencher o formulario enter Vehicle Data")
    public void oUsuarioPreencherOFormularioEnterVehicleData() {
        dadosVeiculosPage.preencherFormulario();
    }

    @Dado("que o usuario acesse o sistema")
    public void queOUsuarioAcesseOSistema() throws Exception {
        acessarSistema();
    }




}
