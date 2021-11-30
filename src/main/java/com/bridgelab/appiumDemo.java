package com.bridgelab;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import appiumDemo.pages.Login;

import java.net.MalformedURLException;
import java.net.URL;

public class appiumDemo {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
        capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.anirudha.iostraining.CustomCell");
        capabilities.setCapability(MobileCapabilityType.UDID,"4C23B97D-DBFA-4AEB-94BC-EF0B8DC98943");

        IOSDriver<MobileElement> iosDriver = new IOSDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),
                capabilities);

        System.out.println("Device Time" + iosDriver.getDeviceTime());

        Login.sampleTest(iosDriver);
        System.out.println("Test Passed!");
    }


    }

