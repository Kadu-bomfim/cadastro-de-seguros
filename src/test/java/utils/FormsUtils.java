package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;

public class FormsUtils {

    protected void escrever(WebElement element, String texto) {
        element.clear();
        element.sendKeys(texto);
    }

    protected boolean verificarSeAtivoEHabilitado(WebElement element){
        boolean existe = false;
        try {
            existe = element.isEnabled() && element.isDisplayed();
        }catch (NoSuchElementException e) {
            existe = false;
        }
        return existe;
    }

    protected void selectAleatorio(WebElement element){
        Select select = new Select(element);
        select.selectByIndex(select.getOptions().size() -1);
    }

    protected static String gerarNumerosAleatorios(int qtdDigitos) {
        String numero = Double.toString(Math.random() );
        return numero.substring(3, qtdDigitos + 3);

    }

}
