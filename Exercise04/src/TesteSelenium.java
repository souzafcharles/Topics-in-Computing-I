import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteSelenium {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + "\\lib\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/TC1/exercice02.html");
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"caes\"]"));
        if (dropDown.isDisplayed()) {
            System.out.println("A lista está sendo mostrada!");
        } else {
            System.out.println("A lista não está sendo mostrada!");
        }
        if (dropDown.isEnabled()) {
            System.out.println("Está habilitado!");
        }else{
            System.out.println("Não está habilitado!");
        }
        Select ddList = new Select((dropDown));

        //ddList.selectByVisibleText("Afegão Hound");
        //ddList.selectByValue("H");
        ddList.selectByIndex(2);
    }
}


