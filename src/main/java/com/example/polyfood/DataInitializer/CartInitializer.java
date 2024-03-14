//package com.example.polyfood.DataInitializer;
//
//import com.example.polyfood.Models.Cart;
//import com.example.polyfood.Repositories.CartRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class CartInitializer implements ApplicationRunner {
//    private final CartRepository cartRepository;
//
//    @Autowired
//    public CartInitializer(CartRepository cartRepository) {
//        this.cartRepository = cartRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) {
//        if (cartRepository.count() == 0) {
//            List<Cart> list = Arrays.asList(
//                    new Cart(1, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Cart(2, 2,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Cart(3, 3,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
//            );
//            cartRepository.saveAll(list);
//        }
//    }
//}
