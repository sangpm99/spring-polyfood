//package com.example.polyfood.DataInitializer;
//
//import com.example.polyfood.Models.ProductImage;
//import com.example.polyfood.Repositories.ProductImageRepository;
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
//public class ProductImageInitializer implements ApplicationRunner {
//    private final ProductImageRepository productImageRepository;
//
//    @Autowired
//    public ProductImageInitializer(ProductImageRepository productImageRepository) {
//        this.productImageRepository = productImageRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) {
//        if (productImageRepository.count() == 0) {
//            List<ProductImage> list = Arrays.asList(
//                    new ProductImage(1, "Cá thu kho tộ chay", "./images/ca-thu-kho-to-chay.jpg", 1, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductImage(2, "Cá kèo chay", "./images/ca-keo-chay.jpg", 2, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductImage(3, "Giò nấm chay", "./images/gio-nam-chay.jpg", 3, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductImage(4, "Khoai môn", "./images/khoai-mon.jpg", 4, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductImage(5, "Cơm Sushi chay", "./images/com-sushi-chay.jpg", 5, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductImage(6, "Đậu bắp đồng nai", "./images/dau-bap-dong-nai.jpg", 6, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductImage(7, "Tỏi cô đơn", "./images/toi-co-don.jpg", 7, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductImage(8, "Trà Olong TeaPlus", "./images/tra-olong-teaplus.jpg", 8, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductImage(9, "Nước Ion Pocari Sweat", "./images/nuoc-ion-pocari.jpg", 9, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
//                    new ProductImage(10, "Salat rau", "./images/salat-rau.jpg", 10, 1,
//                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
//            );
//            productImageRepository.saveAll(list);
//        }
//    }
//}
