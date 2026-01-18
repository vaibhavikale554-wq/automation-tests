
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserRegistrationTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test

    public void testUserRegistration() throws InterruptedException{
        driver.get("https://dev.sovio.id/");
     
        // Click on "Create one" link
        WebElement createAccountLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create one")));
        createAccountLink.click();

        // Fill in the registration form
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Create an account')]")));

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("johndoe" + System.currentTimeMillis() + "@example.com");
        Thread.sleep(2000);
        // Submit the form
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Continue with email')]"));
        continueButton.click();

        // Add a wait to observe the result, in a real test you'd wait for a specific element
        Thread.sleep(5000);

        // Example assertion (replace with a proper verification)
        // For instance, wait for a welcome message or the URL to change.
        wait.until(ExpectedConditions.urlContains("verification")); // Assuming the URL contains 'verification' after registration
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
