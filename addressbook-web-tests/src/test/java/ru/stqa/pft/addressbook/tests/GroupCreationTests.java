package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goTo().groupPage();
        Groups before = app.group().all();
        GroupData group = new GroupData().withName("test2");
        app.group().create(group);
        Groups after = app.group().all();

        assertThat(after, equalTo(
                before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
        assertThat(after.size(), equalTo(before.size() + 1));
    }

    public void testBadGroupCreation() {
        app.goTo().groupPage();
        Groups before = app.group().all();
        GroupData group = new GroupData().withName("test2'");
        app.group().create(group);
        assertThat(app.group().count(), equalTo(before.size()));
        Groups after = app.group().all();
        assertThat(after, equalTo(before));
    }
//    public void testGroupCreation() throws Exception {

//        app.getGroupHelper().īnitGroupCreation();
//        app.getGroupHelper().fillGroupForm(new GroupData("Test 1", "Test 2", "Test 3"));
//        app.getGroupHelper().submitGroupCreation();
//        app.getGroupHelper().returnToGroupPage();
//        app.getGroupHelper().wd.findElement(By.linkText("Logout")).click();



//        assertEquals(after.size(), before.size() + 1);

//        before.add(group);
//        int max = 0;
//        for (GroupData g : after) {
//            if (g.getId() > max) {
//                max = g.getId();
//            }
//        }
//        int max1 = after.stream().max((groupData, t1) -> Integer.compare(groupData.getId(), t1.getId())).get().getId();


//        group.withId(after.stream().max((groupData, t1) -> Integer.compare(groupData.getId(), t1.getId())).get().getId());
//        group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
//        before.add(group);
//        Comparator<? super GroupData> byId = ((groupData, t1) -> Integer.compare(groupData.getId(), t1.getId()));
//        before.sort(byId);
//        after.sort(byId);
//        assertEquals(before, after);


    }

