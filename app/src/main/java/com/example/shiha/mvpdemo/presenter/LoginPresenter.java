package com.example.shiha.mvpdemo.presenter;

import com.example.shiha.mvpdemo.model.User;
import com.example.shiha.mvpdemo.view.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView iLoginView) {
        this.loginView = iLoginView;
    }


    @Override
    public void onLogIn(String email, String password) {

        User user = new User(email, password);
        double isLoginSucessful = user.isValidData();

        if (isLoginSucessful == 0)
            loginView.onLoginError("Login error");
        else if (isLoginSucessful == 1)
            loginView.onLoginError("Login error");
        else if (isLoginSucessful == 2)
            loginView.onLoginError("Login error");
        else
            loginView.onLoginSuccess("Login Success");
    }
}
