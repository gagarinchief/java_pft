package ru.stqa.pft.addressbook.model;

public class ContactData {

    private int id;
    private String firstname;
    private String secondname;
    private String group;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;
    private String allPhones;


    public String getAllPhones() {
        return allPhones;
    }

    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }


    public String getWorkPhone() {return workPhone; }

    public ContactData withWorkPhone (String workPhone) {
        this.workPhone = workPhone;
        return this;
    }

    public String getMobilePhone() {return mobilePhone; }

    public ContactData withMobilePhone() {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public ContactData withHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public ContactData(String firstname, String secondname, String group) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return secondname;
    }


    public String getGroup() {
        return group;
    }
}
