package com.example.polyfood.Services;

import jakarta.mail.MessagingException;

public interface IForgotPasswordServices {
    void sendMail(String email) throws MessagingException;
    void forgotPassword(String email) throws MessagingException;
    String isRightCode(String code);
    void setPassword (String email, String password, String rePassword);
}
