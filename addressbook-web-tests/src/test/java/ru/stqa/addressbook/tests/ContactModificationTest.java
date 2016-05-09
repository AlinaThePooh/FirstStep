package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

/**
 * Created by user on 06.05.2016.
 */
public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification() {

        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("A", "G", "test address", "87654321", "a.g@rr.ru", null));
        app.getContactHelper().submitContactModification();

    }
}
