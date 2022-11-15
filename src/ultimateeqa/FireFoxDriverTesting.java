package ultimateeqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverTesting {
    //declare main method//
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //launch url//
        driver.get(baseUrl);
        //title of the page //
        System.out.println("title of the page : " + driver.getTitle());
        //current url //
        System.out.println("Current url : " + driver.getCurrentUrl());
        //get page source//
        System.out.println("Page source : " + driver.getPageSource());
        //email into emailfield//
        WebElement emailfield =  driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("test123@gmail.com");
        //password to password feild//
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("test123");
        //close browser//
       driver.quit();
    }
}
