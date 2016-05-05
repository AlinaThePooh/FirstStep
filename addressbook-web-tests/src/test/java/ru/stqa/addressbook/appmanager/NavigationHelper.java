package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user on 05.05.2016.
 */
public class NavigationHelper extends HelperBase{

    public NavigationHelper(FirefoxDriver wd) {
        super (wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }

    public void goToAddContactPage() {
        click(By.linkText("add new"));
    }
}
