package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.appmanager.ContactHelper;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test (enabled = true)
    public void testContactCreation() {
        app.goTo().gotoHomePage();
        app.contact().initContactCreation();
        File photo = new File("src/test/resources/sec.png");
        app.contact().fillContactForm(
                new ContactData().withFirstname("test_name").withLastname("test_surname").withPhoto(photo), true);
        app.contact().submitContactCreation();
        app.contact().returnToHomePage();

//        app.getNavigationHelper().gotoHomePage();
//        app.getContactHelper().initContactCreation();
//        app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", "test1"), true);
//        app.getContactHelper().submitContactCreation();
//        app.getContactHelper().returnToHomePage();
    }

//    @Test
//    public void testCurrentDir() {
//        File currentDir = new File(".");
//        System.out.println(currentDir.getAbsolutePath());
//        File photo = new File("src/test/resources/sec.png");
//        System.out.println(photo.getAbsolutePath());
//        System.out.println(photo.exists());
//    }
}
