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

public class DadosProdutoPage extends FormsUtils {

    public DadosProdutoPage() {
        PageFactory.initElements(driver, this);
    }

    /*MAPEAMENTO DA ABA PRODUCTS*/

    @FindBy(xpath = "//a[contains(.,'Enter Product Data6')]")
    public WebElement abaProduct;

    @FindBy(id = "startdate")
    private WebElement inputStartDate;

    @FindBy(xpath = "//label[input[@id='EuroProtection']]/span")
    private WebElement euroProtection;

    @FindBy(xpath = "//label[input[@id='LegalDefenseInsurance']]/span")
    private WebElement legalDefense;

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

    public void informarStartDate( ){
        esperarElemento(inputStartDate);
        assertTrue(inputStartDate.isDisplayed());
        escrever(inputStartDate, datas().hojeMaisDias(50, "MM/dd/yyyy"));

    }

    public void selecionarInsuranceSum( ){
        esperarElemento(selectInsurance);
        assertTrue(selectInsurance.isDisplayed());
        selectAleatorio(selectInsurance);
    }

    public void selecionarMeritRating( ){
        esperarElemento(selectMerit);
        assertTrue(selectMerit.isDisplayed());
        selectAleatorio(selectMerit);

    }

    public void selecionarDamageInsurance( ){
        esperarElemento(selectDamage);
        assertTrue(selectDamage.isDisplayed());
        selectAleatorio(selectDamage);

    }

    public void marcarRadioOptionalProducts(){

        esperarElemento(radioOptionalProducts);
        assertTrue(radioOptionalProducts.isDisplayed());

        List<WebElement> optional = Arrays.asList(euroProtection, legalDefense);
        Integer qtdProducts = Utils.fake.number().numberBetween(1, optional.size());

        if(qtdProducts == optional.size()) {
            optional.stream().forEach(product -> product.click());
        } else {
            List<Integer> list = new ArrayList<Integer>();
            while (list.size() != qtdProducts) {
                Integer valueOption = Utils.fake.number().numberBetween(1, optional.size());
                if(!list.contains(valueOption)) {
                    list.add(valueOption);
                }
            }

            list.stream().forEach(option -> optional.get(option-1).click());
        }
    }

    public void selecionarCourtesyCar( ){
        esperarElemento(selectCourtesyCar);
        assertTrue(selectCourtesyCar.isDisplayed());
        selectAleatorio(selectCourtesyCar);
    }

    public void acionarBotaoNextAbaProducts() {
        esperarElemento(botaoNextAbaProduct);
        assertTrue(botaoNextAbaProduct.isDisplayed());
        botaoNextAbaProduct.click();
    }

    public void preecherFormularioEnterProduct( ){
        validarAbaProduct();
        informarStartDate();
        selecionarInsuranceSum();
        selecionarMeritRating();
        selecionarDamageInsurance();
        marcarRadioOptionalProducts();
        selecionarCourtesyCar();
        acionarBotaoNextAbaProducts();
    }
}
