package com.example.polyfood.DataInitializer;

import com.example.polyfood.Models.Decentralization;
import com.example.polyfood.Repositories.DecentralizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Component
public class DecentralizationInitializer implements ApplicationRunner {
    private final DecentralizationRepository decentralizationRepository;

    @Autowired
    public DecentralizationInitializer(DecentralizationRepository decentralizationRepository) {
        this.decentralizationRepository = decentralizationRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (decentralizationRepository.count() == 0) {
            List<Decentralization> list = Arrays.asList(
                    new Decentralization(1, "Admin",
                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
                    new Decentralization(2, "Nhân viên",
                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
                    new Decentralization(3, "Khách hàng",
                            LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LocalDateTime.parse("2023-10-10 15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
            );
            decentralizationRepository.saveAll(list);
        }
    }
}
