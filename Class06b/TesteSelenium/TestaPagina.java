import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestaPagina {
    private static WebDriver driver;
    @BeforeAll
    public static void inicializaDriver(){
        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + "\\lib\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://localhost/TC1/exercice06.html");
    }
    @DisplayName("Testa Selenium")
    @Test
    public void testeSelenium(){

        WebElement btnEnviar = driver.findElement(By.xpath("/html/body/form/input[2]"));
        btnEnviar.click();
        WebElement iptLogin = driver.findElement(By.id("idLogin"));
        WebElement par1 = driver.findElement(By.id("p1"));
        String textoParagrafo = par1.getText();
        String textoEsperado = "Este campo é requerido";
        String login = iptLogin.getAttribute("value");
        String corAtual = par1.getCssValue("color");
        String corEsperada = "rgba(255, 0, 0, 1)";
        assertAll(
                () -> assertEquals(textoEsperado,textoParagrafo),
                ()-> assertEquals(corEsperada,corAtual)
        );
    }

    @DisplayName("Testa Select")
    @Test
    public void testaSelect(){
        WebElement selectCar = driver.findElement(By.id("carro"));
        Select opcao = new Select(selectCar);
        opcao.selectByIndex(1);
        String opcaoEscolhida = selectCar.getAttribute("value");
        String opcaoEsperada = "sb";
        assertEquals(opcaoEsperada, opcaoEscolhida);
    }
}
