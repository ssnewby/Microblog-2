package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Microblog2 {

    // initialize variables
    static Scanner intkeyboard = new Scanner(System.in);
    static Scanner stringkeyboard = new Scanner(System.in);
    int item;


    static ArrayList<User> existingUsers = new ArrayList<>();
    private User postedUser;
    private static ArrayList<Postedinfo> Postedinfo = new ArrayList<>();
    static int orderPosted;


    public static void main(String[] args) {
        new Microblog2().displaymenu();
    }

    private int displaymenu() {
        int menuChoice = 0;
        for (int i = 0; i == i; i++) {
            System.out.println("Main Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Become an existing user");
            System.out.println("3) Create a post as the current user");
            System.out.println("4) Print all posts");
            System.out.println("5) Print all users");
            menuChoice = intkeyboard.nextInt();

            if (menuChoice == 1) {
                newUser();
            } else if (menuChoice == 2) {
                existingUsers();
            } else if (menuChoice == 3) {
                createPost();
            } else if (menuChoice == 4) {
                allPosts();
            } else if (menuChoice == 5) {
                allUsers();
            }
        }
        return menuChoice;
    }


    public void newUser() {
        System.out.println("What is your webAddress");
        String webAddress = stringkeyboard.nextLine();
        System.out.println("What is your userName");
        String userName = stringkeyboard.nextLine();
        System.out.println("What is your emailAddress");
        String emailAddress = stringkeyboard.nextLine();
        System.out.println("What is your firstName");
        String firstName = stringkeyboard.nextLine();
        System.out.println("What is your lastName");
        String lastName = stringkeyboard.nextLine();

        User newUser = new User(webAddress, userName, emailAddress, firstName, lastName);
        existingUsers.add(newUser);
    }

    public void existingUsers() {
        System.out.println("Become an existing user");
        for (int j = 0; j < existingUsers.size(); j++)

        {
            System.out.println(j + " " + existingUsers.get(j).getuserName());

        }


        int selectedIndex = intkeyboard.nextInt();

        postedUser = existingUsers.get(selectedIndex);
    }

    public void createPost() {
        System.out.println("What do you want to post?");
        String contentPosted = stringkeyboard.nextLine();
        System.out.println("What is the site address?");
        String siteAddress = stringkeyboard.nextLine();

        Postedinfo newPost = new Postedinfo(postedUser, orderPosted, contentPosted, siteAddress);
        Postedinfo.add(newPost);
    }

    public void allPosts() {
        System.out.println("Print all posts");
        for (int j = 0; j < Postedinfo.size(); j++) {
            System.out.println(j + " " + Postedinfo.get(j).getcontentPosted());
        }
    }

    public void allUsers() {
        System.out.println("Print all users");
        for (int j = 0; j < existingUsers.size(); j++) {
            System.out.println(j + " " + existingUsers.get(j).getuserName());
        }
    }


    private String getlatestPost(User postedUser) {
        String getlatestPost = "";
        for (int j = 0; j < Postedinfo.size(); j++) {
            if (postedUser == Postedinfo.get(j).getpostedUser()) {
                getlatestPost = Postedinfo.get(j).getcontentPosted();
            }
        }
        return getlatestPost;
    }


}







