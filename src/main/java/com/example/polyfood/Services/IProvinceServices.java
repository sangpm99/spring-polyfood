package com.example.polyfood.Services;

import com.example.polyfood.Models.Province;

import java.util.List;

public interface IProvinceServices {
    List<Province> getAllCity();

    List<Province> getAllDistrict(String cityCode);

    List<Province> getAllWard(String districtCode);

    String getCityByCode(String cityCode);

    String getDistrictByCode(String districtCode);

    String getWardByCode(String wardCode);
}
