//package com.example.polyfood.DataInitializer;
//
//import com.example.polyfood.Models.User;
//import com.example.polyfood.Repositories.UserRepository;
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
//public class UserInitializer implements ApplicationRunner {
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserInitializer(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) {
//        if (userRepository.count() == 0) {
//            List<User> list = Arrays.asList(
//                    new User(1, "Lê Văn Thuận", "thuanle@gmail.com", "0989786421", "Lĩnh Nam", 2,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new User(2, "Đào Thị Trang", "trangdao@gmail.com", "0988787662", "Hai Bà Trưng", 3,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new User(3, "Bùi Quang Huy", "huybui@ggmail.com", "0328987656", "Hồ Tùng Mậu", 4,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new User(4, "Phạm Minh Sáng", "phamsang050599@ggmail.com", "0988767623", "Hà Nội", 5,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
//            );
//            userRepository.saveAll(list);
//        }
//    }
//}
