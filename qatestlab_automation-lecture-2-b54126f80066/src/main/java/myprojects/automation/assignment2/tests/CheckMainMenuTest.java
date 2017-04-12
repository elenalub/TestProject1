package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {
       // TODO Script to check Main Menu items

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("webinar.test@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement submitButton = driver.findElement(By.name("submitLogin"));
        submitButton.click();

        WebElement tabAdminDashboard = driver.findElement(By.name("tab-AdminDashboard"));
        tabAdminDashboard.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminParentOrders = driver.findElement(By.name("subtab-AdminParentOrders"));
        subtabAdminParentOrders.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminCatalog = driver.findElement(By.name("subtab-AdminCatalog"));
        subtabAdminCatalog.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminParentCustomer = driver.findElement(By.name("subtab-AdminParentCustomer"));
        subtabAdminParentCustomer.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminParentCustomerThreads = driver.findElement(By.name("subtab-AdminParentCustomerThreads"));
        subtabAdminParentCustomerThreads.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminStats = driver.findElement(By.name("subtab-AdminStats"));
        subtabAdminStats.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminParentModulesSf = driver.findElement(By.name("subtab-AdminParentModulesSf"));
        subtabAdminParentModulesSf.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminParentThemes = driver.findElement(By.name("subtab-AdminParentThemes"));
        subtabAdminParentThemes.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminParentShipping = driver.findElement(By.name("subtab-AdminParentShipping"));
        subtabAdminParentShipping.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminParentPayment = driver.findElement(By.name("subtab-AdminParentPayment"));
        subtabAdminParentPayment.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdminInternational = driver.findElement(By.name("subtab-AdminInternational"));
        subtabAdminInternational.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabShopParameters = driver.findElement(By.name("subtab-ShopParameters"));
        subtabShopParameters.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        WebElement subtabAdvancedParameters = driver.findElement(By.name("subtab-AdvancedParameters"));
        subtabAdvancedParameters.click();
        System.out.println("Title of page: " + driver.getTitle());
        driver.navigate().refresh();

        driver.quit();
    }
}
