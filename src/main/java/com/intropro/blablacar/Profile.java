package com.intropro.blablacar;

/**
 * Created by Viktoriia on 02.06.15.
 */
public class Profile {

    private String firstName;
    private String lastName;
    private String phone;

    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Profile to "+getFirstName()+" "+getLastName()+" created");
    }

    private String email;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void update(){

    }
}
