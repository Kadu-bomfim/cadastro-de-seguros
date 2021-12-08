package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;
import static utils.Utils.esperarElemento;

public class DadosPrecoPage {

    public DadosPrecoPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(.,'Select Price Option1')]")
    private WebElement abaSelectPrice;

    @FindBy(xpath = "(//span[contains(@class,'ideal-radio')])[8]")
    private WebElement radioUltimate;

    @FindBy(id = "nextsendquote")
    private WebElement botaNextabaSelectPrice;

    public void validarAbaSelectPrice() {
        esperarElemento(abaSelectPrice);
        assertTrue(abaSelectPrice.isDisplayed());
    }

    public void marcarRadioUltimate() {
        esperarElemento(radioUltimate);
        assertTrue(radioUltimate.isDisplayed());
        radioUltimate.click();
    }

    public void acionarBotaoNextAbaSelectPrice() {
        esperarElemento(botaNextabaSelectPrice);
        assertTrue(botaNextabaSelectPrice.isDisplayed());
        botaNextabaSelectPrice.click();
    }
}
