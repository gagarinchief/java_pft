package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test
//    public void testGroupCreation() throws Exception {

//        app.getGroupHelper().īnitGroupCreation();
//        app.getGroupHelper().fillGroupForm(new GroupData("Test 1", "Test 2", "Test 3"));
//        app.getGroupHelper().submitGroupCreation();
//        app.getGroupHelper().returnToGroupPage();
//        app.getGroupHelper().wd.findElement(By.linkText("Logout")).click();
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().createGroup(new GroupData("test 1", null, null));
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }
}
