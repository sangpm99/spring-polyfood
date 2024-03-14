//package com.example.polyfood.DataInitializer;
//
//import com.example.polyfood.Models.Payment;
//import com.example.polyfood.Repositories.PaymentRepository;
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
//public class PaymentInitializer implements ApplicationRunner {
//    private final PaymentRepository paymentRepository;
//
//    @Autowired
//    public PaymentInitializer(PaymentRepository paymentRepository) {
//        this.paymentRepository = paymentRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) {
//        if (paymentRepository.count() == 0) {
//            List<Payment> list = Arrays.asList(
//                    new Payment(1, "cod", 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Payment(2, "vnpay", 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
//            );
//            paymentRepository.saveAll(list);
//        }
//    }
//}
