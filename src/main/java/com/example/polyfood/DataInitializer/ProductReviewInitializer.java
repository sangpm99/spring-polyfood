//package com.example.polyfood.DataInitializer;
//
//import com.example.polyfood.Models.ProductReview;
//import com.example.polyfood.Repositories.ProductReviewRepository;
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
//public class ProductReviewInitializer implements ApplicationRunner {
//    private final ProductReviewRepository productReviewRepository;
//
//    @Autowired
//    public ProductReviewInitializer(ProductReviewRepository productReviewRepository) {
//        this.productReviewRepository = productReviewRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) {
//        if (productReviewRepository.count() == 0) {
//            List<ProductReview> list = Arrays.asList(
//                    new ProductReview(1, 1, 1, "Cá biển vị hơi nhạt", 4, 2342, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductReview(2, 2, 1, "Cá biển vị hơi mặn", 4, 72662, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductReview(3, 3, 1, "Giò nấm ngon", 5, 62534, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductReview(4, 4, 1, "Khoai ngọt", 5, 122312, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductReview(5, 5, 2, "Cơm như gạo", 5, 26324, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductReview(6, 6, 2, "Đậu ngọt", 5, 827362, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductReview(7, 7, 2, "Tỏi to tròn", 5, 231222, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductReview(8, 8, 3, "Trà ngọt", 5, 283122, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductReview(9, 9, 3, "Nước ngọt", 5, 123122, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductReview(10, 10, 3, "Rau hơi đắng", 3, 98787, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
//            );
//            productReviewRepository.saveAll(list);
//        }
//    }
//}
