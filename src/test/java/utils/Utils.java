package utils;

import com.github.javafaker.Faker;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Utils {

    public static ChromeDriver driver;
    private DataUtils dataUtils = new DataUtils();
    public static Faker fake = new Faker();



    public static void acessarSistema() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://sampleapp.tricentis.com/101/app.php");

    }

    public static void limparCache() {
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_DELETE);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_SHIFT);
            r.keyRelease(KeyEvent.VK_DELETE);
            //Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {

        }
    }



    public static DataUtils datas() {
        return (new Utils()).dataUtils;
    }

    public static void esperarElemento(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement findElementXpath(String xPath) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return (WebElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xPath))));
    }

    public static WebElement findElementId(String id) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return (WebElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(id))));
    }

    public static File printFinal(Scenario scenario){
        final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot, "image/png");
        File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(imagem, (new File("./target/screenshots", scenario.getName() + "-" + scenario.getStatus()+ ".png")));
        }catch (Exception e){
            e.printStackTrace();
        }

        return imagem;
    }



    public static void verificaPresencaAlert() {
        try {
            Alert alt = driver.switchTo().alert();
            alt.accept();

        } catch (NoAlertPresentException e) {

        }
    }

    public static void anexarUmDocumento() {
        File file = new File(System.getProperty("user.dir") + "/src/test/resources/arquivos/foto.jpg");
        Utils.driver.findElement(By.xpath("//input[@type='file']")).sendKeys(file.getAbsolutePath());

    }

    public static void diminuirZoomChrome() throws Exception{
        Robot robot = new Robot();
        for (int i = 0 ; i < 3 ; i++){
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
    }

    public static String escreverTexto300Caracteres(String texto) {
        Utils.verificaPresencaAlert();
        while (texto.length() < 250) {
            texto = texto + " " + "Obrigado Accenture!";
        }
        return texto;
    }



}
