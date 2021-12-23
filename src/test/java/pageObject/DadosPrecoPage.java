package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.FormsUtils;
import utils.Utils;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;
import static utils.Utils.esperarElemento;

public class DadosPrecoPage extends FormsUtils {

    public DadosPrecoPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(.,'Select Price Option1')]")
    private WebElement abaSelectPrice;

    @FindBy(id = "nextsendquote")
    private WebElement botaNextabaSelectPrice;

    @FindBy(xpath = "//label[input[@id='selectsilver']]/span")
    private WebElement radioSilver;

    @FindBy(xpath = "//label[input[@id='selectgold']]/span")
    private WebElement radioGold;

    @FindBy(xpath = "//label[input[@id='selectplatinum']]/span")
    private WebElement radioPlatinum;

    @FindBy(xpath = "//label[input[@id='selectultimate']]/span")
    private WebElement radioUltimate;

    public void validarAbaSelectPrice() {
        esperarElemento(abaSelectPrice);
        assertTrue(abaSelectPrice.isDisplayed());
    }

    public void marcarRadio() {

        Integer opcao = Utils.fake.number().randomDigitNotZero();

        switch (opcao) {
            case 1:
                esperarElemento(radioSilver);
                assertTrue(radioSilver.isDisplayed());
                radioSilver.click();
                break;
            case 2:
                esperarElemento(radioGold);
                assertTrue(radioGold.isDisplayed());
                radioGold.click();
                break;
            case 3:
                esperarElemento(radioPlatinum);
                assertTrue(radioPlatinum.isDisplayed());
                radioPlatinum.click();
                break;
            case 4:
                esperarElemento(radioUltimate);
                assertTrue(radioUltimate.isDisplayed());
                radioUltimate.click();
                break;
            default:
                radioSilver.click();
                break;

        }
    }

    public void acionarBotaoNextAbaSelectPrice() {
        esperarElemento(botaNextabaSelectPrice);
        assertTrue(botaNextabaSelectPrice.isDisplayed());
        botaNextabaSelectPrice.click();
    }

    public void preencherFormularioSelectPrice(){
        validarAbaSelectPrice();
        marcarRadio();
        acionarBotaoNextAbaSelectPrice();
    }
}
