package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product {

    @Test
    public void product(){
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("magnethus@gmail.com");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("TheTop86!");
        driver.findElement(By.cssSelector("#SubmitLogin")).click();

        driver.findElement(By.cssSelector("#search_query_top")).sendKeys("dresses");
        driver.findElement(By.cssSelector("button[name=\"submit_search\"]")).click();
        driver.findElement(By.cssSelector("a[title=\"Printed Summer Dress\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Add to cart\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".icon-ok")));

        driver.findElement(By.cssSelector("a[title=\"Proceed to checkout\"]")).click();

        driver.findElement(By.cssSelector("p[class=\"cart_navigation clearfix\"] a[title=\"Proceed to checkout\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Proceed to checkout\"]/parent::button")).click();

        driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();

        driver.findElement(By.xpath("//button[@type=\"submit\" and @name=\"processCarrier\"]")).click();

        driver.findElement(By.cssSelector(".bankwire")).click();

        driver.findElement(By.xpath("//span[text()=\"I confirm my order\"]/parent::button")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()=\"Your order on My Store is complete.\"]")));


    }

}
