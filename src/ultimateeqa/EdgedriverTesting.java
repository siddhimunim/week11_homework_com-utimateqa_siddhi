package ultimateeqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgedriverTesting {
    //declare main method//
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.msedge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //launch url//
        driver.get(baseUrl);
        //title of the page //
        System.out.println("title of the page : " + driver.getTitle());
        //current url //
        System.out.println("Current url : " + driver.getCurrentUrl());
        //get page source//
        System.out.println("Page source : " + driver.getPageSource());
        //email into emailfield//
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("testing123@gmail.com");
        //password to password- feild//
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("test123");
        //close browser//
      //  driver.quit();
    }
}
