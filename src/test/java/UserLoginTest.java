import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserLoginTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void testUserLogin() throws InterruptedException {
        driver.get("https://dev.sovio.id/");

        Thread.sleep(2000);

        // Verify that the login form is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Sign in to your account to continue')]")));

        // Enter Email
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.clear();
        emailField.sendKeys("testuser@example.com");
        Thread.sleep(2000);

        // Enter Password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.clear();
        passwordField.sendKeys("Password123!");
        Thread.sleep(2000);

        // Click Sign In button
        WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]"));
        signInButton.click();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}