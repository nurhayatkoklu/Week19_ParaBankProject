package ParaBank;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();


        WebElement registerButton = driver.findElement(By.linkText("Register"));
        registerButton.click();
        MyMethods.myWait(1);

        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("John");
        MyMethods.myWait(1);

        WebElement lastName = driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Doe");
        MyMethods.myWait(1);

        WebElement addressLine = driver.findElement(By.id("customer.address.street"));
        addressLine.sendKeys("ParaBank.Test Street");
        MyMethods.myWait(1);

        WebElement cityLine = driver.findElement(By.id("customer.address.city"));
        cityLine.sendKeys("ParaBank.Test City");
        MyMethods.myWait(1);

        WebElement stateLine = driver.findElement(By.id("customer.address.state"));
        stateLine.sendKeys("ParaBank.Test State");
        MyMethods.myWait(1);

        WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("1234");
        MyMethods.myWait(1);

        WebElement phoneNumber = driver.findElement(By.id("customer.phoneNumber"));
        phoneNumber.sendKeys("123456789");
        MyMethods.myWait(1);

        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("35790");
        MyMethods.myWait(1);

        String username = MyMethods.randomEmail();
        WebElement userName = driver.findElement(By.id("customer.username"));
        userName.sendKeys(username);
        MyMethods.myWait(1);

        WebElement password = driver.findElement(By.id("customer.password"));
        password.sendKeys("john@doe1234");
        MyMethods.myWait(1);

        WebElement repeatedPassword = driver.findElement(By.id("repeatedPassword"));
        repeatedPassword.sendKeys("john@doe1234");
        MyMethods.myWait(1);

        WebElement register = driver.findElement(By.cssSelector("[value='Register']"));
        register.click();
        MyMethods.myWait(1);

        WebElement assertRegistration = driver.findElement(By.cssSelector("[class='title']"));
        Assert.assertTrue(assertRegistration.getText().contains("Welcome"));
        MyMethods.myWait(1);

        WebElement logout = driver.findElement(By.linkText("Log Out"));
        logout.click();
        MyMethods.myWait(1);

        WebElement loginUsername = driver.findElement(By.cssSelector("[name='username']"));
        loginUsername.sendKeys(username);
        MyMethods.myWait(1);

        WebElement loginPassword = driver.findElement(By.cssSelector("[name='password']"));
        loginPassword.sendKeys("john@doe1234");
        MyMethods.myWait(1);

        WebElement loginButton = driver.findElement(By.cssSelector("[value='Log In']"));
        loginButton.click();
        MyMethods.myWait(1);

        //Test Case 1
        WebElement openAccount = driver.findElement(By.linkText("Open New Account"));
        openAccount.click();
        MyMethods.myWait(1);

        WebElement openNewAccount = driver.findElement(By.cssSelector("[value='Open New Account']"));
        openNewAccount.click();
        MyMethods.myWait(1);

        WebElement assertAccount = driver.findElement(By.cssSelector("[class='title']"));
        Assert.assertTrue(assertAccount.getText().contains("Account Opened!"));

        driver.close();;
        waitAndQuit();



    }
}
