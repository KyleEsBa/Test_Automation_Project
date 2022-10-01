package com.project.test.testing_classes;

import com.project.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    @Test
    public void example(){

        Driver.getDriver().get("https://www.google.com/");
        Assert.assertEquals("Google",Driver.getDriver().getTitle());
        WebElement tbxSearch = Driver.getDriver().findElement(By.name("q"));
        tbxSearch.sendKeys("Kyle Escobedo Baca"+ Keys.ESCAPE);
        WebElement btnSearch = Driver.getDriver().findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
        btnSearch.click();
        Driver.getDriver().quit();
    }
}
