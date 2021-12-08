package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pageObject.DadosVeiculosPage;

import static utils.Utils.acessarSistema;
import static utils.Utils.datas;

public class DadosVeiculosSteps {

    DadosVeiculosPage dadosVeiculosPage = new DadosVeiculosPage();

    @Dado("que o usuario acesse o sistema")
    public void queOUsuarioAcesseOSistema() throws Exception {
        acessarSistema();
    }

    @Quando("o usuario selecionar a make {string}")
    public void oUsuarioSelecionarAMake(String string){
        dadosVeiculosPage.selecionarMake(string);
    }

    @Quando("o usuario selecionar o model {string}")
    public void oUsuarioSelecionarOModel(String string) {
        dadosVeiculosPage.selecionarModel(string);
    }

    @Quando("o usuario informar o cylinder capacity {string}")
    public void oUsuarioInformarOCylinderCapacity(String string) {
        dadosVeiculosPage.informarCylinderCapacity(string);
    }

    @Quando("o usuario informar engine performace {string}")
    public void oUsuarioInformarEnginePerformace(String string) {
        dadosVeiculosPage.informarEnginePerformance(string);
    }

    @Quando("o usuario informar a date of manufacture com uma data valida")
    public void oUsuarioInformarADateOfManufactureComUmaDataValida() {
        dadosVeiculosPage.informarDateManufacture(datas().hojeMenosAnos(10, "dd/MM/yyyy"));
    }

    @Quando("o usuario selecionar number of seats {string}")
    public void oUsuarioSelecionarNumberOfSeats(String string) {
        dadosVeiculosPage.selecionarNumberSeats(string);
    }

    @Quando("o usuario marcar right hand drive com yes")
    public void oUsuarioMarcarRightHandDriveComYes() {
        dadosVeiculosPage.marcarCheckRightHandDrive();
    }

    @Quando("o usuario selecionar number of seats motorcycle {string}")
    public void oUsuarioSelecionarNumberOfSeatsMotorcycle(String string) {
        dadosVeiculosPage.selecionarNumberSeatsMotorcycle(string);
    }

    @Quando("o usuario selecionar fuel type {string}")
    public void oUsuarioSelecionarFuelType(String string) {
        dadosVeiculosPage.selecionarFuelType(string);
    }

    @Quando("o usuario informar o playload com {string}")
    public void oUsuarioInformarOPlayloadCom(String string) {
        dadosVeiculosPage.informarPayload(string);
    }

    @Quando("o usuario informar o total weight com {string}")
    public void oUsuarioInformarOTotalWeightCom(String string) {
        dadosVeiculosPage.informarTotalWeight(string);
    }

    @Quando("o usuario informar a list price com {string}")
    public void oUsuarioInformarAListPriceCom(String string) {
        dadosVeiculosPage.informarListPrice(string);
    }

    @Quando("o usuario informar a license plate number com {string}")
    public void oUsuarioInformarALicensePlateNumberCom(String string) {
        dadosVeiculosPage.informarLicensePlateNumber(string);
    }

    @Quando("o usuario infomar annual mileage com {string}")
    public void oUsuarioInfomarAnnualMileageCom(String string) {
        dadosVeiculosPage.informarAnnualMileage(string);
    }

    @Quando("o usuario acionar o botao next da aba vehicle")
    public void oUsuarioAcionarOBotaoNextDaAbaVehicle() throws InterruptedException {
        dadosVeiculosPage.acionarBotaoNext();
    }


}
