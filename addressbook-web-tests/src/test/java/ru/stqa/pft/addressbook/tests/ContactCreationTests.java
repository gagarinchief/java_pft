package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test(enabled = true)
    public void testContactCreation() {
        Groups groups = app.db().groups();
        File photo = new File("src/test/resources/sec.png");
        ContactData newContact = new ContactData().withFirstname("test_name").withLastname("test_surname").withPhoto(photo))
        .inGroup(groups.iterator().next());
        app.contact().initContactCreation();
        app.contact().fillContactForm(newContact, true);
        app.contact().submitContactCreation();
        app.contact().returnToHomePage();

//        app.getNavigationHelper().gotoHomePage();
//        app.getContactHelper().initContactCreation();
//        app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", "test1"), true);
//        app.getContactHelper().submitContactCreation();
//        app.getContactHelper().returnToHomePage();
    }

    private void inGroup(GroupData group) {
        groups.add(group);
        return this;
    }
    }

//    @Test
//    public void testCurrentDir() {
//        File currentDir = new File(".");
//        System.out.println(currentDir.getAbsolutePath());
//        File photo = new File("src/test/resources/sec.png");
//        System.out.println(photo.getAbsolutePath());
//        System.out.println(photo.exists());
//    }
//}
