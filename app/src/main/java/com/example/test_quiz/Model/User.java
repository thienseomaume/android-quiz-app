package com.example.test_quiz.Model;

public class User {


    public String nickName, fullName, address, number;


    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String nickName, String fullName, String address, String number) {
        this.nickName = nickName;
        this.fullName = fullName;
        this.address = address;
        this.number = number;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String secti) {
        this.number = secti;
    }
}