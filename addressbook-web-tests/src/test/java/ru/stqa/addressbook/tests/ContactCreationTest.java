package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() {
        app.getContactHelper().goToAddContactPage();
        app.getContactHelper().fillContactForm(new ContactData("A", "G", "test address", "87654321", "a.g@rr.ru"));
        app.getContactHelper().submitContact();
    }

}
