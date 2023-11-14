package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/ ";

    public static void main(String[] args) {

        // Launch the chrome browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        //Timeout for hold the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Print the title of the page.
        System.out.println(driver.getTitle());
        //Print the current url.
        System.out.println(driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());
        //Click on ‘Forgot your password?’ link.
        driver.findElement(By.className("orangehrm-login-forgot-header")).click();
        //Print current URL
        System.out.println(driver.getCurrentUrl());
        //Navigate back to the login page.
        driver.navigate().to(baseUrl);
        //Refresh the page
        driver.navigate().refresh();
        //Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter the password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Click on login button
        driver.findElement(By.className("orangehrm-login-button")).click();
        //close the browser
        driver.quit();
    }
}
