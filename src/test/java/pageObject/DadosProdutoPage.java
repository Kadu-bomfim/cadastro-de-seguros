package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;
import static utils.Utils.esperarElemento;

public class DadosProdutoPage {

    public DadosProdutoPage() {
        PageFactory.initElements(driver, this);
    }

    /*MAPEAMENTO DA ABA PRODUCTS*/

    @FindBy(xpath = "//a[contains(.,'Enter Product Data6')]")
    public WebElement abaProduct;

    @FindBy(id = "startdate")
    private WebElement inputStartDate;

    @FindBy(id = "insurancesum")
    private WebElement selectInsurance;

    @FindBy(id = "meritrating")
    private WebElement selectMerit;

    @FindBy(id = "damageinsurance")
    private WebElement selectDamage;

    @FindBy(xpath = "//label[contains(.,'Euro Protection')]")
    private WebElement radioOptionalProducts;

    @FindBy(id = "courtesycar")
    private WebElement selectCourtesyCar;

    @FindBy(id = "nextselectpriceoption")
    private WebElement botaoNextAbaProduct;



    /*METODOS*/

    public void validarAbaProduct() {
        esperarElemento(abaProduct);
        assertTrue(abaProduct.isDisplayed());
    }

    public void informarStartDate(String date){
        esperarElemento(inputStartDate);
        assertTrue(inputStartDate.isDisplayed());
        inputStartDate.sendKeys(date);
    }

    public void selecionarInsuranceSum(String insuranceSum){
        esperarElemento(selectInsurance);
        assertTrue(selectInsurance.isDisplayed());
        selectInsurance.sendKeys(insuranceSum);
    }

    public void selecionarMeritRating(String meritRating){
        esperarElemento(selectMerit);
        assertTrue(selectMerit.isDisplayed());
        selectMerit.sendKeys(meritRating);
    }

    public void selecionarDamageInsurance(String damageInsurance){
        esperarElemento(selectDamage);
        assertTrue(selectDamage.isDisplayed());
        selectDamage.sendKeys(damageInsurance);
    }

    public void marcarRadioOptionalProducts(){
        esperarElemento(radioOptionalProducts);
        assertTrue(radioOptionalProducts.isDisplayed());
        radioOptionalProducts.click();
    }

    public void selecionarCourtesyCar(String courtesy){
        esperarElemento(selectCourtesyCar);
        assertTrue(selectCourtesyCar.isDisplayed());
        selectCourtesyCar.sendKeys(courtesy);
    }

    public void acionarBotaoNextAbaProducts() {
        esperarElemento(botaoNextAbaProduct);
        assertTrue(botaoNextAbaProduct.isDisplayed());
        botaoNextAbaProduct.click();
    }
}
