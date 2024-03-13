package com.example.polyfood.DataInitializer;

import com.example.polyfood.Models.Orders;
import com.example.polyfood.Repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Component
public class OrdersInitializer implements ApplicationRunner {
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersInitializer(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (ordersRepository.count() == 0) {
            List<Orders> list = Arrays.asList(
                    new Orders(1, 1, 1, 545000, 135000, "Trần Văn Hùng", "hungtran@gmail.com", "0989786421", "Lĩnh Nam", 1, "Ít ngọt",
                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
                    new Orders(2, 1, 2, 545000, 135000, "Đào Thị Trang", "trangdao@gmail.com", "0988787662", "Hai Bà Trưng", 4, "30% đá",
                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
                    new Orders(3, 1, 3, 545000, 135000, "Bùi Quang Huy", "huybui@gmail.com", "0328987656", "Hồ Tùng Mậu", 5, "",
                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
            );
            ordersRepository.saveAll(list);
        }
    }
}