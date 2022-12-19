package com.example.wsserver.User;

public class User {
    private String User;
    private String PassWord;
    private String IsAdmin;
    public String getUser() {
        return User;
    }
    public void setUser(String user){
        this.User = user;
    }
    public String getPassWord() {
        return PassWord;
    }
    public void setPassWord(String passWord){
        this.PassWord = passWord;
    }

    public String getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.IsAdmin = isAdmin;
    }
}
