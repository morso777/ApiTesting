package com.PageObjects;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Optional;

import com.PageObjects.TestData;
import io.restassured.internal.http.Status;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class BaseTest {

    //protected ExtentTest test;
    private String testName;


    public String browserFlag;

    protected Log log = LogFactory.getLog(this.getClass());
    public String actualResult;
    public HashMap<String, String> expected;
    //public CustomAssertion customAssertion;
    private final String description = " This is a simple test from complex factory";

    static Properties PROPERTIES_RESOURCES = SystemUtil.loadPropertiesResources("/properties_dev.properties");
    //TestListener testListener = new TestListener();

    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();

    public String projectPath = System.getProperty("user.dir");
    String os = System.getProperty("os.name");


    public static Properties properties;
    public static String endpoint;
    public String url;


    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        log.info("running TEST Case:" + this.getClass().getName());//print test case name
    }

 /*   @BeforeMethod(alwaysRun = true)
    @Parameters({"endpoint"})
    public void beforeMethod(Method caller, String endpoint) throws Exception {
        selectURL(endpoint);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(Method caller)  {
        driver.close();
        driver.quit();
    }*/

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        //ComplexReportFactory.closeReport();
    }

    @BeforeSuite(alwaysRun = true)
    public void suiteSetup() throws Exception {
        //outputExcelFileName = ExcelUtil.setupExcelOutput();

    }


    public void selectURL(String endpoint) {
        if (endpoint.equals("DEV")) {
            properties = SystemUtil.loadPropertiesResources("properties_dev.properties");
        } else if (endpoint.equals("UAT")) {
            properties = SystemUtil.loadPropertiesResources("properties_uat.properties");
        }

    }



    public String getBrowser() {
        return this.browserFlag;
    }





    private void initParams(String browserFlagO) {
        browserFlag = browserFlagO;
        actualResult = null;
        expected = new HashMap<String, String>();
        log.info("browserFlag=" + browserFlag);
    }







}
