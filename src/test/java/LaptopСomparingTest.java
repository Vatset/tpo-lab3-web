// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LaptopСomparingTest extends TestTemplate{
    @Override
    void doTest(WebDriver driver, JavascriptExecutor js) {
    driver.get("https://dfiles.ru/");
    driver.manage().window().setSize(new Dimension(1296, 736));
    try {
      Thread.sleep(10000); // 10000 milliseconds = 10 seconds
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.cssSelector("#top-menu > #menu-item-233457 > a")).click();
    assertThat(driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div/main/header/h1")).getText(), is("Сравнение ноутбуков"));
    driver.close();
  }
}
