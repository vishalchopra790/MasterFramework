package com.company.tests;

import com.company.config.ConfigFactory;
import com.company.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testLogin(){

        System.out.println(ConfigFactory.getConfig().browser());
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("Https://google.co.in");
        driver.quit();*/
    }
}
