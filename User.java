package com.company;

public class User {

    private String webAddress;

    private String userName;

    private String emailAddress;

    private String firstName;

    private String lastName;


    public User(String webAddress, String userName, String emailAddress, String firstName, String lastName) {
        this.webAddress = webAddress;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getWebAddress() {
        return this.webAddress;
    }

    public String getuserName() {
        return this.userName;
    }

    public String getemailAddress() {
        return this.emailAddress;
    }
    public String getfirstName() {
        return this.firstName;
    }
    public String getlastName() {
        return this.lastName;
    }






}