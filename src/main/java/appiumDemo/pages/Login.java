package appiumDemo.pages;

import io.appium.java_client.ios.IOSDriver;

public class Login {
    public static void sampleTest(IOSDriver iosDriver) throws InterruptedException {
//        Thread.sleep(6000);
        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"CustomCell\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField").click();
        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"CustomCell\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField").sendKeys("joe@gmail.com");

        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"CustomCell\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField").click();
        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"CustomCell\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField").sendKeys("joe123");

        iosDriver.findElementByName("//XCUIElementTypeButton[@name=\"Login\"]").click();
    }
}
