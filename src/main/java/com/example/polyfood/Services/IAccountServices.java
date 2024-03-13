package com.example.polyfood.Services;

import com.example.polyfood.Models.Account;

public interface IAccountServices {
    Account updateAccount(Account account);
    Account deleteAccount(int id);
    Account findAccountByUserName(String userName);
}