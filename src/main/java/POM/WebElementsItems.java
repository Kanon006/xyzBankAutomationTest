package POM;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebElementsItems {

    public static WebDriver driver;

    public WebElementsItems(WebDriver driver){
        this.driver = driver;
    }

    public void addCus(String fname, String lname, String postcode) throws InterruptedException {

///html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[1]/input
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys(postcode);

    }

    public void clickButt() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
    }

    public void alertt() {

        WebDriverWait wait=new WebDriverWait(driver, 20);

        String al = driver.switchTo().alert().getText().toString();
        System.out.println("This is Alert Message >>>>> " + al);

        String msg = "Customer added successfully with customer id :6";

        // assertEquals(al,msg);

        try {
            Assert.assertEquals(al, msg);
        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    //////////////////////// 2nd Scenario //////////////////////

    public void openAcc() throws InterruptedException {

        // WebDriverWait wait=new WebDriverWait(driver, 2000);

        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[2]")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[2]")).click();
    }

    public void nameCus() throws InterruptedException {

        String option="rashed barat";
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select")).click();
        Thread.sleep(1000);
        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));
        dropdown.click();
    }

    public void currencyCus() throws InterruptedException {

        // driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[2]")).click();


        String option="Dollar";

        driver.findElement(By.xpath("//select")).click();
        Thread.sleep(1000);
        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));
        Thread.sleep(1000);
        dropdown.click();

/*
        Select drpCountry = new Select(driver.findElement(By.name("currency")));
        drpCountry.selectByValue("Dollar");*/

    }

    public void clickButtDola() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    //////////////////////// 3rd Scenario //////////////////////

    public void goCus() throws InterruptedException {
        ///html/body/div/div/div[2]/div/div[1]/button[3]
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();

    }

    public void searchCus() throws InterruptedException {
        ///html/body/div/div/div[2]/div/div[1]/button[3]
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("rashed");
        // Thread.sleep(3000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys(Keys.ENTER);

    }

    public void deleteCus() throws InterruptedException {
        Thread.sleep(1000);
        ///html/body/div/div/div[2]/div/div[1]/button[3]
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button")).click();

    }

    public void homeCus() throws InterruptedException {
        Thread.sleep(1000);
        ///html/body/div/div/div[2]/div/div[1]/button[3]
        driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();


    }

}


