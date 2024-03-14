//package com.example.polyfood.DataInitializer;
//
//import com.example.polyfood.Models.Account;
//import com.example.polyfood.Repositories.AccountRepository;
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
//public class AccountInitializer implements ApplicationRunner {
//    private final AccountRepository accountRepository;
//
//    @Autowired
//    public AccountInitializer(AccountRepository accountRepository) {
//        this.accountRepository = accountRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) {
//        if (accountRepository.count() == 0) {
//            List<Account> list = Arrays.asList(
//                    new Account(1, "guest", "$2a$10$SKDqb/XqsMGzK9AHiFkgievp2Nj5lRfAoV31sE6PEAQQB2FUKDqOm", "", 1, 3, "", "", LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Account(2, "levanthuan", "$2a$10$wDIkENNyJqm3Svw7rRcTdemtapph7veU6V85xD41zAppIyLnpv7Y6", "thuanle@gmail.com", 1, 1, "", "", LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Account(3, "daothitrang", "$2a$10$nP/b0d/M1DlNioWRxR4tneW9iyZ0qNyfQsIERutP7T76jdb8ZeqN2", "trangdao@gmail.com", 1, 3, "", "", LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Account(4, "buiquanghuy", "$2a$10$41xVFqeBk2P/b3yv0glfzeaX.9Y0bbxHxMOH9mnFE8Rs0qUCDWk4.", "huybui@gmail.com", 1, 3, "", "", LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Account(5, "phamminhsang", "$2a$10$SKDqb/XqsMGzK9AHiFkgievp2Nj5lRfAoV31sE6PEAQQB2FUKDqOm", "phamsang050599@gmail.com", 1, 1, "", "", LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
//            );
//            accountRepository.saveAll(list);
//        }
//    }
//}
