import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium {
    public static void main(String[] args) throws InterruptedException {
        String userPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",
                userPath+"/lib/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://scl.ifsp.edu.br");
        Thread.sleep(10000);
        WebElement objPlaca = driver.findElement(By.id("iptPlaca"));
        objPlaca.sendKeys("ABC-9U34");
        driver.quit();
    }
}
