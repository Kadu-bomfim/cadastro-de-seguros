package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.FormsUtils;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class DadosCotacaoPage extends FormsUtils {

    public DadosCotacaoPage() {
        PageFactory.initElements(driver, this);
    }

    private String senha;

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

    @FindBy(xpath = "//p[contains(.,'There is still some data missing!')]")
    private WebElement mensagemErro;



    public void validarAbaSendQuote(){
        esperarElemento(abaSendQuote);
        assertTrue(abaSendQuote.isDisplayed());
    }

    public void informarEmail() {
        esperarElemento(inputEmail);
        assertTrue(inputEmail.isDisplayed());
        escrever(inputEmail, fake.internet().emailAddress());
    }

    public void informarPhone(){
        esperarElemento(inputPhone);
        assertTrue(inputPhone.isDisplayed());
        escrever(inputPhone, String.valueOf(fake.number().numberBetween(10000000, 1500000000)));

    }

    public void informarName(){
        esperarElemento(inputName);
        assertTrue(inputName.isDisplayed());
        escrever(inputName,String.valueOf(fake.name().username()));
    }

    public void informarNameEmBranco(){
        esperarElemento(inputName);
        assertTrue(inputName.isDisplayed());
    }

    public void informarPassword(){
        esperarElemento(inputPassword);
        assertTrue(inputPassword.isDisplayed());
        this.senha = String.valueOf(fake.internet().password(7, 15, true));
        escrever(inputPassword,this.senha+1);

    }

    public void informarConfirmPassword( ){
        esperarElemento(inputConfirmPassword);
        assertTrue(inputConfirmPassword.isDisplayed());
        escrever(inputConfirmPassword, this.senha+1);

    }

    public void informarComments( ) {
        esperarElemento(inputComments);
        assertTrue(inputComments.isDisplayed());
        escrever(inputComments, escreverTexto300Caracteres(""));
    }

    public void acionarBotaoNextAbaQuote(){
        esperarElemento(botaoNextAbaQuote);
        assertTrue(botaoNextAbaQuote.isDisplayed());
        botaoNextAbaQuote.click();
    }


    public void naoPreencherNameFormularioSendQuotePage() {
        validarAbaSendQuote();
        informarEmail();
        informarPhone();
        informarNameEmBranco();
        informarPassword();
        informarConfirmPassword();
        informarComments();
        acionarBotaoNextAbaQuote();
    }

    public void naoPreencherEmailFormularioSendQuotePage() {
        validarAbaSendQuote();
        informarPhone();
        informarName();
        informarPassword();
        informarConfirmPassword();
        informarComments();
        acionarBotaoNextAbaQuote();
    }

    public void preencherFormularioSendQuotePage() {
        validarAbaSendQuote();
        informarEmail();
        informarPhone();
        informarName();
        informarPassword();
        informarConfirmPassword();
        informarComments();
        acionarBotaoNextAbaQuote();
    }

    public void validarMensagemDeCadastroComSucesso( ){
        esperarElemento(mensagemSucesso);
        assertTrue(mensagemSucesso.isDisplayed());

    }

    public void validarMensagemDErro( ){
        esperarElemento(mensagemErro);
        assertTrue(mensagemErro.isDisplayed());

    }

}
