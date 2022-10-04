import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + "\\lib\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/TC1/s08e01_Selenium_Seletores.html");
        WebElement iptNome = driver.findElement(By.cssSelector("input[name='nome']"));
        iptNome.sendKeys("Balthazar");

        WebElement iptSobrenome = driver.findElement(By.className("inputTextFormulario"));
        iptSobrenome.sendKeys("de Bigode");

        WebElement iptDiv = driver.findElement(By.tagName("div"));
        WebElement inputData = iptDiv.findElement(By.className("inputTextFormulario"));
        inputData.sendKeys("10/03/2020");

        WebElement iptColor = driver.findElement(By.id("selecionaCabelos"));
        //iptColor.sendKeys("#256D85");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='#256D85'",iptColor);

        WebElement link1 = driver.findElement(By.linkText("Link para IFSP"));
        link1.click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        WebElement link2 = driver.findElement(By.name("LinkParaIFSPSC"));
        link2.click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        WebElement link3 = driver.findElement(By.name("linkParaPgTeste"));
        link3.click();
        System.out.println("Código fonte!!!");
        System.out.println(driver.getPageSource());
    }
}

