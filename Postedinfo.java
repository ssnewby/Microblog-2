package com.company;

public class Postedinfo {
    private User postedUser;

    private int orderPosted;

    private String contentPosted;

    private String siteAddress;

    public Postedinfo (User postedUser, int orderPosted, String contentPosted, String siteAddress) {
        this.postedUser = postedUser;
        this.orderPosted = orderPosted;
        this.contentPosted = contentPosted;
        this.siteAddress = siteAddress;

    }

    public User getpostedUser() {
        return this.postedUser;
    }

    public int getorderPosted() {
        return this.orderPosted;
    }

    public String getcontentPosted() {
        return this.contentPosted;
    }

    public String getsiteAddress(){
        return this.siteAddress;
    }












}
