import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void test01() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String queryString = "Portnov Computer School";
        driver.get("https://www.google.com/");
        WebElement textInput = driver.findElement(By.cssSelector(".gLFyf"));
         textInput.sendKeys(queryString);
         textInput.submit();
         WebElement resultResultsElement = driver.findElement(By.id("result-stats"));

        String resultsStatsTextValue = resultResultsElement.getText();

        String[] stringArray = resultsStatsTextValue.split("");

    }
}
