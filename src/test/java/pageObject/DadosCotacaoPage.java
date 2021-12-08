package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;
import static utils.Utils.esperarElemento;

public class DadosCotacaoPage {

    public DadosCotacaoPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement inputEmail;

    @FindBy(id = "phone")
    private WebElement inputPhone;

    @FindBy(id = "username")
    private WebElement inputName;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(id = "confirmpassword")
    private WebElement inputConfirmPassword;

    @FindBy(id = "Comments")
    private WebElement inputComments;

    @FindBy(id = "sendemail")
    private WebElement botaoNextAbaQuote;

    @FindBy(xpath = "//a[contains(.,'Send Quote4')]")
    private WebElement abaSendQuote;

    @FindBy(xpath = "//h2[contains(.,'Sending e-mail success!')]")
    private WebElement mensagemSucesso;



    public void validarAbaSendQuote(){
        esperarElemento(abaSendQuote);
        assertTrue(abaSendQuote.isDisplayed());
    }

    public void informarEmail(String email) {
        esperarElemento(inputEmail);
        assertTrue(inputEmail.isDisplayed());
        inputEmail.sendKeys(email);
    }

    public void informarPhone(String phone){
        esperarElemento(inputPhone);
        assertTrue(inputPhone.isDisplayed());
        inputPhone.sendKeys(phone);
    }

    public void informarName(String name){
        esperarElemento(inputName);
        assertTrue(inputName.isDisplayed());
        inputName.sendKeys(name);
    }

    public void informarPassword(String password){
        esperarElemento(inputPassword);
        assertTrue(inputPassword.isDisplayed());
        inputPassword.sendKeys(password);
    }

    public void informarConfirmPassword(String confirmPassword){
        esperarElemento(inputConfirmPassword);
        assertTrue(inputConfirmPassword.isDisplayed());
        inputConfirmPassword.sendKeys(confirmPassword);
    }

    public void informarComments(String comments){
        esperarElemento(inputComments);
        assertTrue(inputComments.isDisplayed());
        inputComments.sendKeys(comments);
    }

    public void acionarBotaoNextAbaQuote(){
        esperarElemento(botaoNextAbaQuote);
        assertTrue(botaoNextAbaQuote.isDisplayed());
        botaoNextAbaQuote.click();
    }

    public void validarMensagemDeCadastroComSucesso(String mensagem){
        esperarElemento(mensagemSucesso);
        assertEquals(mensagemSucesso.getText(), mensagem);

    }
}
