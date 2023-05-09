import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGWork07 {

    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        System.out.println("Open Browser");


    }

    @Test(priority = 2)
    void selectDesktop() throws InterruptedException {
        System.out.println("Select Desktop");
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        Thread.sleep(2000);
    }


    @Test(priority = 3)
    void ShoppingCart() throws InterruptedException {
        System.out.println("Shopping Cart");
        driver.findElement(By.className("qty-input")).clear();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]/label")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
        Thread.sleep(2000);
    }


    @Test(priority = 4)
    void BillingPage() throws InterruptedException {
        System.out.println("Billing Address");
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Divya");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Vandra");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("divyavandra1@gmail.com");
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Hello");
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("0011");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("How Are You");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("0011HELLO1100");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("012345678910");
        driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("01234567891011");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        Thread.sleep(2000);
    }


    @Test(priority = 5)
    void ShippingMethod() throws InterruptedException {
        System.out.println("Shipping Method");
        driver.findElement(By.xpath("//*[@id=\"shippingoption_0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    void PaymentMethod() throws InterruptedException {
        System.out.println("Payment Method Page");
        driver.findElement(By.id("paymentmethod_1")).click();

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")).click();
        Thread.sleep(2000);


    }


    @Test(priority = 7)
    void PaymentInformation() throws InterruptedException {
        System.out.println("Payment Information");
        driver.findElement(By.id("CreditCardType")).sendKeys("Amex");
        driver.findElement(By.id("CardholderName")).sendKeys("Divya V");
        driver.findElement(By.id("CardNumber")).sendKeys("1098765432107878787878");
        driver.findElement(By.id("ExpireMonth")).sendKeys("10");
        driver.findElement(By.id("ExpireYear")).sendKeys("2025");
        driver.findElement(By.xpath("//*[@id=\"CardCode\"]")).sendKeys("007");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")).click();

    }///



  @Test(priority = 8)
    void CloseBrowser() {
        System.out.println("Close Browser");
        driver.close();
    }
}

















