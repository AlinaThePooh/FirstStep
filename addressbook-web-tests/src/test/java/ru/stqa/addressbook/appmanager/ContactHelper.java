package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.addressbook.model.ContactData;

/**
 * Created by user on 05.05.2016.
 */
public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super (wd);
    }

    public void submitContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getName());
        type(By.name("lastname"),contactData.getSurname());
        type(By.name("address"),contactData.getAddress());
        type(By.name("mobile"),contactData.getPhone());
        type(By.name("email"),contactData.getMail());

    }

    public void goToAddContactPage() {
        click(By.linkText("add new"));
    }
}
