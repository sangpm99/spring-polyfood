package com.example.polyfood.DataInitializer;

import com.example.polyfood.Models.Province;
import com.example.polyfood.Repositories.ProvinceRepository;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProvincesInitializer implements ApplicationRunner {
    private final ProvinceRepository provinceRepository;
    @Autowired
    public ProvincesInitializer(ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (provinceRepository.count() == 0) {
            List<Province> list = new ArrayList<>();

            String currentDirectory = System.getProperty("user.dir");
            String filePath = currentDirectory + File.separator + "provinces.xlsx";
            try {
                XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(filePath));
                XSSFSheet sheet = workbook.getSheet("Sheet1");
                XSSFRow row = null;
                int i = 1;
                while((row = sheet.getRow(i)) != null) {
                    String wardCode = row.getCell(0) != null ? row.getCell(0).toString() : "";
                    String wardName = row.getCell(1) != null ? row.getCell(1).toString() : "";
                    String districtCode = row.getCell(2) != null ? row.getCell(2).toString() : "";
                    String districtName = row.getCell(3) != null ? row.getCell(3).toString() : "";
                    String cityCode = row.getCell(4) != null ? row.getCell(4).toString() : "";
                    String cityName = row.getCell(5) != null ? row.getCell(5).toString() : "";

                    Province province = new Province(
                            cityCode,
                            cityName,
                            districtCode,
                            districtName,
                            wardCode,
                            wardName
                    );
                    list.add(province);
                    i++;
                }
                provinceRepository.saveAll(list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
