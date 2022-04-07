package com.company.driver.factory.entity;

import com.company.enums.*;
import lombok.*;
import org.openqa.selenium.WebDriver;

@Data
@Builder
public class DriverData {

   WebDriverData webDriverData;
   MobileDriverData mobileDriverData;

}
