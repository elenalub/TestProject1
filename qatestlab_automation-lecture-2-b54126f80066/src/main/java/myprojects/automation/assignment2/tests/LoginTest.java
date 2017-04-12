package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("webinar.test@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement submitButton = driver.findElement(By.name("submitLogin"));
        submitButton.click();

        WebElement userMenu = driver.findElement(By.id("employee_infos"));
        userMenu.click();

        WebElement logoutButton = driver.findElement(By.id("header_logout"));
        logoutButton.click();
        driver.quit();
    }
}
