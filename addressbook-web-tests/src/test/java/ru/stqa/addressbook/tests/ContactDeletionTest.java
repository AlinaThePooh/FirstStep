package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by user on 06.05.2016.
 */
public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {

        app.getContactHelper().initContactModification();
        app.getContactHelper().deleteContact();

    }
}
