package POM;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AppElementItems {

        public static AndroidDriver driver;

        public AppElementItems(AndroidDriver driver){
            this.driver = driver;
        }

    public void inputField(String username,String password) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Username']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Username']")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@text='Login']")).click();

    }

    ////////////////////////////MakePayment Start////////////////////////////////////////

    public void makePayment() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
    }

    public void makePayment2(String phone, String name, String amount) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Phone']")).sendKeys(phone);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Name']")).sendKeys(name);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Amount']")).sendKeys(amount);
    }

    public void selectCountry() throws InterruptedException {
        WebElement testDropDown = driver.findElement(By.xpath("//*[@text='Select']"));
        testDropDown.click();
        //WebElement testDropDown = driver.findElement(By.id("countryButton"));

        Thread.sleep(1000);
        WebElement testDropDown2 = driver.findElement(By.xpath("//*[@text='USA']"));
        testDropDown2.click();
        Thread.sleep(1000);
    }

    public void sendPayment() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Send Payment']")).click();


    }

    public void acceptAlert() throws InterruptedException {

       /* Thread.sleep(7000);

        Alert alert = driver.switchTo().alert();
        alert.accept();*/
        //*[@text='Yes']

        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@text='Yes']")).click();
    }

    ////////////////////////////MakePayment End////////////////////////////////////////

////////////////////////////Mortgage Start////////////////////////////////////////
    public void mortgagePayment() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Mortgage Request']")).click();

    }

    public void mortgagePayment2(String fname, String lname, String age, String add1, String add2) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='First Name']")).sendKeys(fname);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Last Name']")).sendKeys(lname);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Age']")).sendKeys(age);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Address 1']")).sendKeys(add1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Address 2']")).sendKeys(add2);
    }

    public void mortgageselectCountry() throws InterruptedException {
        WebElement testDropDown = driver.findElement(By.xpath("//*[@text='Select']"));
        testDropDown.click();
        //WebElement testDropDown = driver.findElement(By.id("countryButton"));

        Thread.sleep(1000);
        WebElement testDropDown2 = driver.findElement(By.xpath("//*[@text='USA']"));
        testDropDown2.click();
        Thread.sleep(1000);
    }

    public void mortgagesendPayment() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Next']")).click();


    }

    public void mortgageacceptAlert() throws InterruptedException {

       /* Thread.sleep(7000);

        Alert alert = driver.switchTo().alert();
        alert.accept();*/
        //*[@text='Yes']

       /* Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@text='Yes']")).click();*/



        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Home']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='2']")).click();

        Thread.sleep(1000);


        ///////////////////////////////TEST BED///////////////////////////////////////////////////////////////

      // JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,250)", "");


    /*    WebElement element = driver.findElement(By.xpath("//*[@text='None']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
       // Thread.sleep(500);
        element.click();*/

       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");*/

        //driver.findElement(MobileBy"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();

       /* String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"None\").instance(0))";

        driver.findElement(By.xpath(scrollElement)).click();*/

      /*  AppElementItems PermissionElement = (AppElementItems) driver.
                findElement(By.xpath("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Private Job\"))"));
*/
       // driver.findElement(MobileBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(“Private Job”))")).click();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(UiSelector()).scrollIntoView(text(\"Private Job\"))")).click();
        Thread.sleep(2000);
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(UiSelector()).scrollIntoView(text(\"500000\"))")).click();



        ///////////////////////////TEST BED////////////////////////////////////////////////////////////////////////



    }

    public void mortgageacceptAlertSave() throws InterruptedException {

            Thread.sleep(1000);
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(UiSelector()).scrollIntoView(text(\"Save\"))")).click();
    }



    ////////////////////////////Mortgage End////////////////////////////////////////

    ////////////////////////////Expense Start////////////////////////////////////////
    public void expenseReport() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Expense Report']")).click();
    }

    public void remReport() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'remove it')]")).click();
    }

    public void addReport() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Add']")).click();
    }

    public void backHome() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Back']")).click();
    }


    ////////////////////////////Expense Start////////////////////////////////////////
    public void logOut() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Logout']")).click();
    }

}