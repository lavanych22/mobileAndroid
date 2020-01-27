package com.dovhan.mobileapp.auth.forgotpassword;

public interface ForgotPasswordContract {

    interface IForgotPasswordView {
        void recoveryCodeIsSent();

        void showEmailError();
    }

    interface IForgotPasswordPresenter {
        void sendRecoveryCode(String email);
    }
}
