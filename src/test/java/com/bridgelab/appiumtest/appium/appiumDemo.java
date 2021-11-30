package com.bridgelab.appiumtest.appium;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class appiumDemo {
    public static void main(String[] args) throws MalformedURLException {

    DesiredCapabilities capabilities = new DesiredCapabilities();

    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"15.0");
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 11");
    capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"com.anirudha.iostraining.CustomCell");
    capabilities.setCapability("UDID", "4C23B97D-DBFA-4AEB-94BC-EF0B8DC98943");
//    capabilities.setCapability("automationName","XCUITest");
//        capabilities.setCapability("app","");


        IOSDriver iosDriver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"),
                capabilities);

        System.out.println("Device Time"+ iosDriver.getDeviceTime());

    }
}
