package com.syntax.class23;

public class BrowserTester {
    public static void main(String[] args) {
      /*  WebDriver chrome=new Chrome();
        chrome.startBrowser();
        chrome.openUrl("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();

       */

        WebDriver [] browsers={new Chrome(),new Safari(),new FireFox(),new Edge()};

       /* for(WebDriver driver:browsers){
            driver.startBrowser();
            driver.openUrl("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
        }
        */

        for(int i=0; i< browsers.length;i++){

        }

    }
}
