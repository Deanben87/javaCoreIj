package com.syntax.class26;

public interface Task1 {
    /*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
}
interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("opening the browser in Google Chrome ");
    }
    @Override
    public void closeBrowser() {
        System.out.println("closing the browser in Google Chrome ");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("maximizing  Google Chrome ");
    }
    @Override
    public void findElement() {
        System.out.println("finding the element in Google Chrome");
    }
}
class FireFox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("opening the browser in Firefox");
    }
    @Override
    public void closeBrowser() {
        System.out.println("closing the browser in Firefox");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("maximizing  Firefox");
    }
    @Override
    public void findElement() {
        System.out.println("finding the element in Firefox");
    }
}
