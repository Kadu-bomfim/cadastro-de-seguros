package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.FormsUtils;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class DadosVeiculosPage extends FormsUtils {

    public DadosVeiculosPage() {
        PageFactory.initElements(driver, this);
    }


    public void selecionarMake() {
        WebElement selecionarMake = findElementXpath("//select[@id='make']");
        esperarElemento(selecionarMake);
        assertTrue(verificarSeAtivoEHabilitado(selecionarMake));
        selectAleatorio(selecionarMake);

    }

    public void selecionarModel () {
        WebElement selecionarModel = findElementId("model");
        esperarElemento(selecionarModel);
        assertTrue(verificarSeAtivoEHabilitado(selecionarModel));
        selectAleatorio(selecionarModel);
    }

    public void informarCylinderCapacity(){
        WebElement elementCylinder = findElementId("cylindercapacity");
        esperarElemento(elementCylinder);
        assertTrue(elementCylinder.isDisplayed());

        elementCylinder.sendKeys(gerarNumerosAleatorios(3));
    }

    public void informarEnginePerformance( ){
        WebElement elementEngine = findElementId("engineperformance");
        esperarElemento(elementEngine);
        assertTrue(elementEngine.isDisplayed());
        escrever(elementEngine,String.valueOf(fake.number().randomDigitNotZero()));

    }

    public void informarDateManufacture( ){
        WebElement elementDate = findElementId("dateofmanufacture");
        esperarElemento(elementDate);
        assertTrue(elementDate.isDisplayed());
        escrever(elementDate, datas().hojeMenosAnos(10, "MM/dd/yyyy"));

    }

    public void selecionarNumberSeats( ){
        WebElement elementNumberSeats = findElementId("numberofseats");
        esperarElemento(elementNumberSeats);
        assertTrue(elementNumberSeats.isDisplayed());
        selectAleatorio(elementNumberSeats);

    }

    public void marcarCheckRightHandDrive(){
        WebElement elementCheck = findElementXpath("(//span[contains(@class,'ideal-radio')])[1]");
        esperarElemento(elementCheck);
        assertTrue(elementCheck.isDisplayed());
        elementCheck.click();

    }

    public void selecionarNumberSeatsMotorcycle( ){
        WebElement elementNumberSeatsMotorcycle = findElementId("numberofseatsmotorcycle");
        esperarElemento(elementNumberSeatsMotorcycle);
        assertTrue(elementNumberSeatsMotorcycle.isDisplayed());
        selectAleatorio(elementNumberSeatsMotorcycle);

    }

    public void selecionarFuelType( ){
        WebElement elementFuelType = findElementId("fuel");
        esperarElemento(elementFuelType);
        assertTrue(elementFuelType.isDisplayed());
        selectAleatorio(elementFuelType);

    }

    public void informarPayload( ){
        WebElement elementPayload = findElementId("payload");
        esperarElemento(elementPayload);
        assertTrue(elementPayload.isDisplayed());
        escrever(elementPayload, String.valueOf(fake.number().numberBetween(1, 1000)));

    }

    public void informarTotalWeight( ){
        WebElement elementTotalWeight = findElementId("totalweight");
        esperarElemento(elementTotalWeight);
        assertTrue(elementTotalWeight.isDisplayed());
        escrever(elementTotalWeight, String.valueOf(fake.number().numberBetween(100, 50000)));
    }

    public void informarListPrice( ){
        WebElement elementListPrice = findElementId("listprice");
        esperarElemento(elementListPrice);
        assertTrue(elementListPrice.isDisplayed());
        escrever(elementListPrice, String.valueOf(fake.number().numberBetween(500, 100000)));

    }

    public void informarLicensePlateNumber(){
        WebElement elementLicensePlateNumber = findElementId("licenseplatenumber");
        esperarElemento(elementLicensePlateNumber);
        assertTrue(elementLicensePlateNumber.isDisplayed());
        escrever(elementLicensePlateNumber, String.valueOf(fake.number().numberBetween(1, 1000000000)));

    }

    public void informarAnnualMileage( ){
        WebElement elementAnnualMileage = findElementId("annualmileage");
        esperarElemento(elementAnnualMileage);
        assertTrue(elementAnnualMileage.isDisplayed());
        escrever(elementAnnualMileage, String.valueOf(fake.number().numberBetween(100, 100000)));

    }

    public void acionarBotaoNext() {
        WebElement elementBotaoNext = findElementXpath("(//button[contains(.,'Next »')])[1]");
        esperarElemento(elementBotaoNext);
        Assert.assertTrue(elementBotaoNext.isDisplayed());
        elementBotaoNext.click();

    }

    public void preencherFormulario() {
        selecionarMake();
        selecionarModel();
        informarCylinderCapacity();
        informarEnginePerformance();
        informarDateManufacture();
        selecionarNumberSeats();
        marcarCheckRightHandDrive();
        selecionarNumberSeatsMotorcycle();
        selecionarFuelType();
        informarPayload();
        informarTotalWeight();
        informarListPrice();
        informarLicensePlateNumber();
        informarAnnualMileage();
        acionarBotaoNext();
    }

}
