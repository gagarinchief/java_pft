package ru.stqa.pft.addressbook.tests;

//public class ContactPhoneTests extends TestBase {
//    @Test
//    public void testContactPhones() {
//        app.goTo().gotoHomePage();
//        ContactData contact = app.contact().all().iterator().next();
//        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
//
//
////        assertThat(contact.getHomePhone(), equalTo(cleaned(contactInfoFromEditForm.getHomePhone())));
////        assertThat(contact.getAllPhones(), equalTo(cleaned(contactInfoFromEditForm.getHomePhone())));
//        assertThat(contact.getAllPhones(), equalTo(mergePhones(contactInfoFromEditForm)));
////        assertThat(contact.getMobilePhone(), equalTo(cleaned(contactInfoFromEditForm.getMobilePhone())));
////        assertThat(contact.getWorkPhone(), equalTo(cleaned(contactInfoFromEditForm.getWorkPhone())));
//    }

//    private String  mergePhones(ContactData contact) {
//       return Arrays.asList(contact.getHomePhone(), contact.getMobilePhone(), contact.getWorkPhone())
//                .stream().filter((s -> ! s.equals("")))
//               .map(ContactPhoneTests::cleaned)
//               .collect(Collectors.joining("\n"));
//    }
//
//    public static String cleaned(String phone) {
//        return phone.replaceAll("\\s","").replaceAll("[-()]","");
//    }
//}
