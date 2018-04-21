package com.example.shiha.mvpdemo.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {
    private String email, password;

    public User(String email, String password) {

        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public double isValidData() {

        if (TextUtils.isEmpty(getEmail())) {
            return 0;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) {
            return 1;
        } else if (getPassword().length() < 6) {
            return 2;
        } else
            return 100;

    }
}
