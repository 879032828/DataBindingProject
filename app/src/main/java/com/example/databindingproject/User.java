package com.example.databindingproject;

/**
 * 进行数据绑定的数据Model的属性是不可变的。
 */
public class User {
    public final String firstName;
    public final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
