package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class DadosSeguroPage {

    public DadosSeguroPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nextenterproductdata")
    private WebElement botaoNextAbaInsurant;

    public void acionarBotaoNextAbaInsurant() {
        esperarElemento(botaoNextAbaInsurant);
        assertTrue(botaoNextAbaInsurant.isDisplayed());
        botaoNextAbaInsurant.click();
    }

    public void validarAbaEnterInsurant() {
        WebElement elementText = findElementXpath("//span[contains(.,'7')]");
        esperarElemento(elementText);
        assertTrue(elementText.isDisplayed());

    }

    public void informarFirstName(String firstName){
        WebElement elementFirstName = findElementId("firstname");
        esperarElemento(elementFirstName);
        assertTrue(elementFirstName.isDisplayed());
        elementFirstName.sendKeys(firstName);
    }

    public void informarLastName(String lastName){
        WebElement elementLastName = findElementId("lastname");
        esperarElemento(elementLastName);
        assertTrue(elementLastName.isDisplayed());
        elementLastName.sendKeys(lastName);
    }

    public void informarDateBirth(String dateBirth){
        WebElement elementDate = findElementId("birthdate");
        esperarElemento(elementDate);
        assertTrue(elementDate.isDisplayed());
        elementDate.sendKeys(dateBirth);
    }

    public void marcarCheckGenderMale(){
        WebElement elementCheck = findElementXpath("(//span[contains(@class,'ideal-radio')])[3]");
        esperarElemento(elementCheck);
        assertTrue(elementCheck.isDisplayed());
        elementCheck.click();

    }

    public void informarStreetAddress(String address){
        WebElement elementStreetAddress = findElementId("streetaddress");
        esperarElemento(elementStreetAddress);
        assertTrue(elementStreetAddress.isDisplayed());
        elementStreetAddress.sendKeys(address);
    }

    public void selecionarCountry(String country){
        WebElement elementCountry = findElementId("country");
        esperarElemento(elementCountry);
        assertTrue(elementCountry.isDisplayed());
        elementCountry.sendKeys(country);
    }

    public void informarZipCode(String code){
        WebElement elementZipCode = findElementId("zipcode");
        esperarElemento(elementZipCode);
        assertTrue(elementZipCode.isDisplayed());
        elementZipCode.sendKeys(code);
    }

    public void informarCity(String city){
        WebElement elementCity = findElementId("city");
        esperarElemento(elementCity);
        assertTrue(elementCity.isDisplayed());
        elementCity.sendKeys(city);
    }

    public void selecionarOccupation(String occupation){
        WebElement elementOccupation = findElementId("occupation");
        esperarElemento(elementOccupation);
        assertTrue(elementOccupation.isDisplayed());
        elementOccupation.sendKeys(occupation);
    }

    public void marcarHobbies(){
        WebElement elementHobbies = findElementXpath("//label[contains(.,'Cliff Diving')]");
        esperarElemento(elementHobbies);
        assertTrue(elementHobbies.isDisplayed());
        elementHobbies.click();
    }

    public void informarWebSite(String site){
        WebElement elementWebSite = findElementId("website");
        esperarElemento(elementWebSite);
        assertTrue(elementWebSite.isDisplayed());
        elementWebSite.sendKeys(site);
    }

    public void selecionarArquivoAnexo() throws Exception {
        verificaPresencaAlert();
        anexarUmDocumento();
        verificaPresencaAlert();
    }


}
