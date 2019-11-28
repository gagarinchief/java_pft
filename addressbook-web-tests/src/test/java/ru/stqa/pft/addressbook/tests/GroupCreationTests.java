package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() throws Exception {

      app.getGroupHelper().īnitGroupCreation();
      app.getGroupHelper().fillGroupForm(new GroupData("Test 1", "Test 2", "Test 3"));
      app.getGroupHelper().submitGroupCreation();
      app.getGroupHelper().returnToGroupPage();
      app.getGroupHelper().wd.findElement(By.linkText("Logout")).click();
    }

}
