//package com.example.polyfood.DataInitializer;
//
//import com.example.polyfood.Models.Product;
//import com.example.polyfood.Repositories.ProductRepository;
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
//public class ProductInitializer implements ApplicationRunner {
//    private final ProductRepository productRepository;
//
//    @Autowired
//    public ProductInitializer(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) {
//        if (productRepository.count() == 0) {
//            List<Product> list = Arrays.asList(
//                    new Product(1, 1, "Cá thu kho tộ chay", 200000, "ca-thu-kho-to-chay.png", "Cá thu kho tộ chay", 12, 1, 2142, 214,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Product(2, 1, "Cá kèo chay", 50000, "ca-keo-chay.png", "Cá kèo chay", 10, 1, 3742, 123,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Product(3, 2, "Giò nấm chay", 95000, "gio-nam-chay.png", "Giò nấm chay", 5, 1, 2431, 354,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Product(4, 2, "Khoai môn", 50000, "khoai-mon.png", "Khoai môn", 5, 1, 1263, 783,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Product(5, 3, "Cơm Sushi chay", 50000, "com-sushi-chay.png", "Cơm sushi chay", 12, 1, 2812, 25,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Product(6, 4, "Đậu bắp đồng nai", 20000, "dau-bap-dong-nai.png", "Đậu bắp đồng nai", 50, 1, 2331, 432,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Product(7, 4, "Tỏi cô đơn", 25000, "toi-co-don.png", "Tỏi cô đơn", 0, 1, 4312, 12,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Product(8, 5, "Trà Olong TeaPlus", 10000, "tra-olong-teaplus.png", "Trà Olong TeaPlus", 0, 1, 3212, 432,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Product(9, 5, "Nước Ion Pocari Sweat", 15000, "nuoc-ion-pocari.png", "Nước Ion Pocari Sweat", 0, 1, 3121, 789,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new Product(10, 6, "Salat rau", 50000, "salat-rau.png", "Salat rau", 10, 1, 2312, 234,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
//            );
//            productRepository.saveAll(list);
//        }
//    }
//}
