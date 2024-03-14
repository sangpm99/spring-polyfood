package com.example.polyfood.Config;

import com.example.polyfood.DataInitializer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

// Config này sẽ quy định bảng nào insert trước bảng nào insert sau (vì có liên kết khóa chính khóa ngoại)
@Configuration
public class InitializerConfig implements ApplicationRunner {
    private final ProvincesInitializer provincesInitializer;
//    private final DecentralizationInitializer decentralizationInitializer;
//    private final AccountInitializer accountInitializer;
//    private final UserInitializer userInitializer;
//    private final ProductTypeInitializer productTypeInitializer;
//    private final ProductInitializer productInitializer;
//    private final ProductDetailInitializer productDetailInitializer;
//    private final ProductImageInitializer productImageInitializer;
//    private final ProductReviewInitializer productReviewInitializer;
//    private final CartInitializer cartInitializer;
//    private final CartItemInitializer cartItemInitializer;
//    private final PaymentInitializer paymentInitializer;
//    private final OrderStatusInitializer orderStatusInitializer;
//    private final OrdersInitializer ordersInitializer;
//    private final OrderDetailInitializer orderDetailInitializer;

    @Autowired
    public InitializerConfig(
            ProvincesInitializer provincesInitializer
//            DecentralizationInitializer decentralizationInitializer,
//            AccountInitializer accountInitializer,
//            UserInitializer userInitializer,
//            ProductTypeInitializer productTypeInitializer,
//            ProductInitializer productInitializer,
//            ProductDetailInitializer productDetailInitializer,
//            ProductImageInitializer productImageInitializer,
//            ProductReviewInitializer productReviewInitializer,
//            CartInitializer cartInitializer,
//            CartItemInitializer cartItemInitializer,
//            PaymentInitializer paymentInitializer,
//            OrderStatusInitializer orderStatusInitializer,
//            OrdersInitializer ordersInitializer,
//            OrderDetailInitializer orderDetailInitializer

    ) {
        this.provincesInitializer = provincesInitializer;
//        this.decentralizationInitializer = decentralizationInitializer;
//        this.accountInitializer = accountInitializer;
//        this.userInitializer = userInitializer;
//        this.productTypeInitializer = productTypeInitializer;
//        this.productInitializer = productInitializer;
//        this.productDetailInitializer = productDetailInitializer;
//        this.productImageInitializer = productImageInitializer;
//        this.productReviewInitializer = productReviewInitializer;
//        this.cartInitializer = cartInitializer;
//        this.cartItemInitializer = cartItemInitializer;
//        this.paymentInitializer = paymentInitializer;
//        this.orderStatusInitializer = orderStatusInitializer;
//        this.ordersInitializer = ordersInitializer;
//        this.orderDetailInitializer = orderDetailInitializer;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Chạy các logic khởi tạo dữ liệu theo thứ tự mong muốn
        provincesInitializer.run(args);
//        decentralizationInitializer.run(args);
//        accountInitializer.run(args);
//        userInitializer.run(args);
//        productTypeInitializer.run(args);
//        productInitializer.run(args);
//        productDetailInitializer.run(args);
//        productImageInitializer.run(args);
//        productReviewInitializer.run(args);
//        cartInitializer.run(args);
//        cartItemInitializer.run(args);
//        paymentInitializer.run(args);
//        orderStatusInitializer.run(args);
//        ordersInitializer.run(args);
//        orderDetailInitializer.run(args);
    }
}
