package com.example.polyfood.Services;

import java.io.UnsupportedEncodingException;

public interface IPaymentService {
    String getUrlPayment(long amount) throws UnsupportedEncodingException;
}
