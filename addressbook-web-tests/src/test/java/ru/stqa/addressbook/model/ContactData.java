package ru.stqa.addressbook.model;

public class ContactData {
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String mail;

    public ContactData(String name, String surname, String address, String phone, String mail) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }
}
