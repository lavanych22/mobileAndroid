package com.dovhan.mobileapp.auth.forgotpassword;

import android.app.Activity;

import com.dovhan.mobileapp.auth.IAuthenticationView;

import static com.dovhan.mobileapp.utils.Utils.isValidEmail;

public class ForgotPasswordPresenter implements ForgotPasswordContract.IForgotPasswordPresenter {

    private ForgotPasswordContract.IForgotPasswordView view;
    private IAuthenticationView authenticationView;

    public ForgotPasswordPresenter(ForgotPasswordContract.IForgotPasswordView view,
                                   Activity activity) {
        this.view = view;
        authenticationView = (IAuthenticationView) activity;
    }

    public void showSignIn() {
        authenticationView.showSignIn();
    }

    public void sendRecoveryCode(String email) {
        if (isValidEmail(email)) {
            authenticationView.sendRecoveryCode(email);
            view.recoveryCodeIsSent();
        } else {
            view.showEmailError();
        }
    }
}
