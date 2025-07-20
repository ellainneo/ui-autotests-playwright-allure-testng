package org.ellainneo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.Assert;

import static com.microsoft.playwright.Playwright.create;

public class Main {

    public static String BASE_URL = "https://www.saucedemo.com/";
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Playwright playwright = create();
        System.out.println("Playwright created");

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        System.out.println("Browser launched");

        Page page = browser.newPage();
        page.waitForTimeout(100000);
        page.navigate(BASE_URL);
        System.out.println("Page opened");
        browser.close();

        Assert.assertEquals("5", "5");

    }
}