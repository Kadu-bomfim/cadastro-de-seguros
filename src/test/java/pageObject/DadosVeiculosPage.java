package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class DadosVeiculosPage {

    public DadosVeiculosPage() {
        PageFactory.initElements(driver, this);
    }

    public void selecionarMake(String make) {
        WebElement selecionarMake = findElementXpath("//select[@id='make']");
        esperarElemento(selecionarMake);
        assertTrue(selecionarMake.isDisplayed());
        Select select = new Select(selecionarMake);
        select.selectByVisibleText(make);
    }

    public void selecionarModel (String model) {
        WebElement selecionarModel = findElementId("model");
        esperarElemento(selecionarModel);
        assertTrue(selecionarModel.isDisplayed());
        Select select = new Select(selecionarModel);
        select.selectByVisibleText(model);
    }

    public void informarCylinderCapacity(String cylinder){
        WebElement elementCylinder = findElementId("cylindercapacity");
        esperarElemento(elementCylinder);
        assertTrue(elementCylinder.isDisplayed());
        elementCylinder.sendKeys(cylinder);
    }

    public void informarEnginePerformance(String engine){
        WebElement elementEngine = findElementId("engineperformance");
        esperarElemento(elementEngine);
        assertTrue(elementEngine.isDisplayed());
        elementEngine.sendKeys(engine);
    }

    public void informarDateManufacture(String date){
        WebElement elementDate = findElementId("dateofmanufacture");
        esperarElemento(elementDate);
        assertTrue(elementDate.isDisplayed());
        elementDate.sendKeys(date);
    }

    public void selecionarNumberSeats(String number){
        WebElement elementNumberSeats = findElementId("numberofseats");
        esperarElemento(elementNumberSeats);
        assertTrue(elementNumberSeats.isDisplayed());
        elementNumberSeats.sendKeys(number);
    }

    public void marcarCheckRightHandDrive(){
        WebElement elementCheck = findElementXpath("(//span[contains(@class,'ideal-radio')])[1]");
        esperarElemento(elementCheck);
        assertTrue(elementCheck.isDisplayed());
        elementCheck.click();

    }

    public void selecionarNumberSeatsMotorcycle(String number){
        WebElement elementNumberSeatsMotorcycle = findElementId("numberofseatsmotorcycle");
        esperarElemento(elementNumberSeatsMotorcycle);
        assertTrue(elementNumberSeatsMotorcycle.isDisplayed());
        elementNumberSeatsMotorcycle.sendKeys(number);
    }

    public void selecionarFuelType(String fuel){
        WebElement elementFuelType = findElementId("fuel");
        esperarElemento(elementFuelType);
        assertTrue(elementFuelType.isDisplayed());
        elementFuelType.sendKeys(fuel);
    }

    public void informarPayload(String payload){
        WebElement elementPayload = findElementId("payload");
        esperarElemento(elementPayload);
        assertTrue(elementPayload.isDisplayed());
        elementPayload.sendKeys(payload);
    }

    public void informarTotalWeight(String total){
        WebElement elementTotalWeight = findElementId("totalweight");
        esperarElemento(elementTotalWeight);
        assertTrue(elementTotalWeight.isDisplayed());
        elementTotalWeight.sendKeys(total);
    }

    public void informarListPrice(String listPrice){
        WebElement elementListPrice = findElementId("listprice");
        esperarElemento(elementListPrice);
        assertTrue(elementListPrice.isDisplayed());
        elementListPrice.sendKeys(listPrice);
    }

    public void informarLicensePlateNumber(String plateNumber){
        WebElement elementLicensePlateNumber = findElementId("licenseplatenumber");
        esperarElemento(elementLicensePlateNumber);
        assertTrue(elementLicensePlateNumber.isDisplayed());
        elementLicensePlateNumber.sendKeys(plateNumber);
    }

    public void informarAnnualMileage(String mileage){
        WebElement elementAnnualMileage = findElementId("annualmileage");
        esperarElemento(elementAnnualMileage);
        assertTrue(elementAnnualMileage.isDisplayed());
        elementAnnualMileage.sendKeys(mileage);
    }

    public void acionarBotaoNext() {
        WebElement elementBotaoNext = findElementXpath("(//button[contains(.,'Next »')])[1]");
        esperarElemento(elementBotaoNext);
        Assert.assertTrue(elementBotaoNext.isDisplayed());
        elementBotaoNext.click();

    }

}
