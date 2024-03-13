package com.example.polyfood.Services;

import com.example.polyfood.Models.Account;
import jakarta.mail.MessagingException;

public interface IRegisterServices {
    boolean isEmailExist(String email);
    void sendMail(String email) throws MessagingException;
    void sendMailCode(String email) throws MessagingException;
    String isRightCode(String code);
    Account addAccount(Account account);
}
