package com.baeldung.junit5.mockito;

import java.util.Date;

public class UserService {

    public String getData() {
        return "someValue";
    }

    public boolean register(User user) {
        return true;
    }

    public int getNumber() {
        return 10;
    }

    public String getString() {
        return "value";
    }

    public Date getDate() {
        return new Date();
    }

    public User getUser(){
        return new User();
    }

    public void showAllMethodsReturnedValues(){
        UserService userService = this;
        System.out.println("userService.getData() = " + userService.getData());
        System.out.println("userService.getNumber() = " + userService.getNumber());
        System.out.println("userService.getString() = " + userService.getString());
        System.out.println("userService.getDate() = " + userService.getDate());
        System.out.println("userService.getUser() = " + userService.getUser());
    }
}
