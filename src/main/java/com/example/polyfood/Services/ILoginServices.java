package com.example.polyfood.Services;

import jakarta.mail.MessagingException;

public interface ILoginServices {
    String login(String userName, String passWord);
    String sendMail(String userName, String passWord) throws MessagingException;
    void sendMailCode(String userName, String passWord) throws MessagingException;
    String isRightCode(String code);
}
