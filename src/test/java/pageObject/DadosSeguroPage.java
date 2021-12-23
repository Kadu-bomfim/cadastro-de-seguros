package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.FormsUtils;
import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class DadosSeguroPage extends FormsUtils {

    public DadosSeguroPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nextenterproductdata")
    private WebElement botaoNextAbaInsurant;

    @FindBy(id="enterinsurantdata")
    private WebElement abaEnterInsurantData;

    @FindBy(xpath = "//label[input[@id='gendermale']]/span")
    private WebElement radioMale;

    @FindBy(xpath = "//label[input[@id='genderfemale']]/span")
    private WebElement radioFemale;

    @FindBy(xpath = "//label[input[@id='speeding']]/span")
    private WebElement speedingHobbies;

    @FindBy(xpath = "//*[@name='Hobbies']")
    private List<WebElement> hobbbies;

    @FindBy(xpath="//label[input[@id='bungeejumping']]/span")
    private WebElement bungeeJumpingHobbies;

    @FindBy(xpath="//label[input[@id='cliffdiving']]/span")
    private WebElement cliffDivingHobbies;

    @FindBy(xpath="//label[input[@id='skydiving']]/span")
    private WebElement skydivingHobbies;

    @FindBy(xpath="//label[input[@id='other']]/span")
    private WebElement otherHobbies;

    public void validarAba() {
        esperarElemento(abaEnterInsurantData);
        assertTrue(abaEnterInsurantData.isDisplayed());
    }

    public void acionarBotaoNextAbaInsurant() {
        esperarElemento(botaoNextAbaInsurant);
        assertTrue(botaoNextAbaInsurant.isDisplayed());
        botaoNextAbaInsurant.click();
    }


    public void informarFirstName(){
        WebElement elementFirstName = findElementId("firstname");
        esperarElemento(elementFirstName);
        assertTrue(elementFirstName.isDisplayed());
        escrever(elementFirstName, fake.name().firstName());

    }

    public void informarLastName( ){
        WebElement elementLastName = findElementId("lastname");
        esperarElemento(elementLastName);
        assertTrue(elementLastName.isDisplayed());
        escrever(elementLastName, fake.name().lastName().replaceAll("'", ""));

    }

    public void informarDateBirth( ){
        WebElement elementDate = findElementId("birthdate");
        esperarElemento(elementDate);
        assertTrue(elementDate.isDisplayed());
        escrever(elementDate, datas().hojeMenosAnos(18, "MM/dd/yyyy"));

    }

    public void marcarCheckGender(){
        assertTrue(radioMale.isDisplayed());
        assertTrue(radioFemale.isDisplayed());

        Integer optionalGender = fake.number().numberBetween(1,2);

        if (optionalGender == 1){
            radioMale.click();
        }else {
            radioFemale.click();
        }
    }

    public void informarStreetAddress( ){
        WebElement elementStreetAddress = findElementId("streetaddress");
        esperarElemento(elementStreetAddress);
        assertTrue(elementStreetAddress.isDisplayed());
        escrever(elementStreetAddress, fake.address().streetAddress());

    }

    public void selecionarCountry( ){
        WebElement elementCountry = findElementId("country");
        esperarElemento(elementCountry);
        assertTrue(elementCountry.isDisplayed());
        selectAleatorio(elementCountry);
    }

    public void informarZipCode( ){
        WebElement elementZipCode = findElementId("zipcode");
        esperarElemento(elementZipCode);
        assertTrue(elementZipCode.isDisplayed());

        String code = Utils.fake.address().zipCode().replaceAll("-", "");
        if(code.length() > 8) {
            code = code.substring(0, 7);
        } else if(code.length() < 4) {
            while(code.length() < 4) {
                code.concat(String.valueOf(Utils.fake.number().numberBetween(0, 9)));
            }
        }
        escrever(elementZipCode, code);
    }


    public void informarCity( ){
        WebElement elementCity = findElementId("city");
        esperarElemento(elementCity);
        assertTrue(elementCity.isDisplayed());
        escrever(elementCity, fake.address().city());
    }

    public void selecionarOccupation( ){
        WebElement elementOccupation = findElementId("occupation");
        esperarElemento(elementOccupation);
        assertTrue(elementOccupation.isDisplayed());
        selectAleatorio(elementOccupation);

    }

    public void marcarHobbies(){
        List<WebElement> hobbies = Arrays.asList(speedingHobbies, bungeeJumpingHobbies, cliffDivingHobbies, skydivingHobbies, otherHobbies);
       // esperarElemento((WebElement) hobbies);
        Integer qtdHobbies = fake.number().numberBetween(1, hobbies.size());
        if(qtdHobbies == hobbies.size()) {
            hobbies.stream().forEach(product -> product.click());
        } else {
            List<Integer> list = new ArrayList<Integer>();
            while (list.size() != qtdHobbies) {
                Integer valueOption = fake.number().numberBetween(1, hobbies.size());
                if(!list.contains(valueOption)) {
                    list.add(valueOption);
                }
            }
            list.stream().forEach(option -> hobbies.get(option-1).click());
        }

    }

    public void informarWebSite( ){
        WebElement elementWebSite = findElementId("website");
        esperarElemento(elementWebSite);
        assertTrue(elementWebSite.isDisplayed());
        escrever(elementWebSite, fake.internet().url());
    }

    public void selecionarArquivoAnexo(){
        verificaPresencaAlert();
        anexarUmDocumento();
        verificaPresencaAlert();
    }

    public void preencherFormularioEnterInsurantData( ){
        validarAba();
        informarFirstName();
        informarLastName();
        informarDateBirth();
        marcarCheckGender();
        informarStreetAddress();
        selecionarCountry();
        informarZipCode();
        informarCity();
        selecionarOccupation();
        marcarHobbies();
        informarWebSite();
        selecionarArquivoAnexo();
        acionarBotaoNextAbaInsurant();

    }

}
