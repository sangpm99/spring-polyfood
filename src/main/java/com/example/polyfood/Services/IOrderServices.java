package com.example.polyfood.Services;

import com.example.polyfood.Models.OrderDetail;
import com.example.polyfood.Models.Orders;
import jakarta.mail.MessagingException;

public interface IOrderServices {
    int addNewOrder(Orders orders);
    void addNewOrderDetail(OrderDetail orderDetail, int orderId);
    void sendInvoice(String email, String body) throws MessagingException;
}
