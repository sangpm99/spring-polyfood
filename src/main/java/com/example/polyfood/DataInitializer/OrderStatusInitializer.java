package com.example.polyfood.DataInitializer;

import com.example.polyfood.Models.OrderStatus;
import com.example.polyfood.Repositories.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Component
public class OrderStatusInitializer implements ApplicationRunner {
    private final OrderStatusRepository orderStatusRepository;

    @Autowired
    public OrderStatusInitializer(OrderStatusRepository orderStatusRepository) {
        this.orderStatusRepository = orderStatusRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (orderStatusRepository.count() == 0) {
            List<OrderStatus> list = Arrays.asList(
                    new OrderStatus(1, "Chờ xác nhận"),
                    new OrderStatus(2, "Chờ lấy hàng"),
                    new OrderStatus(3, "Đang giao"),
                    new OrderStatus(4, "Đã giao"),
                    new OrderStatus(5, "Đã hủy")
            );
            orderStatusRepository.saveAll(list);
        }
    }
}
