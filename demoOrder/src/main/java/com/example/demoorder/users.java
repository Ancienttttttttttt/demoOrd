package com.example.demoorder;

public class users {
    public users(int user_ID, String user_login, String user_pass) {
        this.user_ID = user_ID;
        this.user_login = user_login;
        this.user_pass = user_pass;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public String getUser_login() {
        return user_login;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    int user_ID;
    String user_login;
    String user_pass;
}
