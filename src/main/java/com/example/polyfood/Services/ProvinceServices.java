package com.example.polyfood.Services;

import com.example.polyfood.Models.Province;
import com.example.polyfood.Repositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class ProvinceServices implements IProvinceServices{
    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public List<Province> getAllCity() {
        List<Province> list = provinceRepository.findAll();
        Set<String> uniqueCityCodes = new HashSet<>();
        List<Province> filteredList = new ArrayList<>();
        for(Province province: list) {
            String cityCode = province.getCityCode();
            if(!uniqueCityCodes.contains(cityCode)) {
                uniqueCityCodes.add(cityCode);
                filteredList.add(province);
            }
        }

        if(filteredList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Không tồn tại tỉnh/thành nào");
        }
        return filteredList;
    }

    @Override
    public List<Province> getAllDistrict(String cityCode) {
        List<Province> list = provinceRepository.findAll();
        Set<String> uniqueCityCodes = new HashSet<>();
        List<Province> filteredList = new ArrayList<>();
        for(Province province: list) {
            String cityCode2 = province.getCityCode();
            String districtCode = province.getDistrictCode();
            if((!uniqueCityCodes.contains(districtCode)) && (cityCode2.equals(cityCode))) {
                uniqueCityCodes.add(districtCode);
                filteredList.add(province);
            }
        }
        if(filteredList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Không tồn tại tỉnh thành nào phù hợp với mã tỉnh/thành");
        }
        return filteredList;
    }

    @Override
    public List<Province> getAllWard(String districtCode) {
        List<Province> list = provinceRepository.findAll();
        Set<String> uniqueCityCodes = new HashSet<>();
        List<Province> filteredList = new ArrayList<>();
        for(Province province: list) {
            String districtCode2 = province.getDistrictCode();
            String wardCode = province.getWardCode();
            if((!uniqueCityCodes.contains(districtCode)) && (districtCode2.equals(districtCode))) {
                uniqueCityCodes.add(wardCode);
                filteredList.add(province);
            }
        }
        if(filteredList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Không tồn tại phường xã nào phù hợp với mã quận/huyện");
        }
        return filteredList;
    }

    @Override
    public String getCityByCode(String cityCode) {
        List<Province> list = provinceRepository.findAll();
        for(Province province: list) {
            if(province.getCityCode().equals(cityCode)) {
                return province.getCityName();
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Không tồn tại mã tỉnh/thành");
    }

    @Override
    public String getDistrictByCode(String districtCode) {
        List<Province> list = provinceRepository.findAll();
        for(Province province: list) {
            if(province.getDistrictCode().equals(districtCode)) {
                return province.getDistrictName();
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Không tồn tại mã quận/huyện");
    }

    @Override
    public String getWardByCode(String wardCode) {
        List<Province> list = provinceRepository.findAll();
        for(Province province: list) {
            if(province.getWardCode().equals(wardCode)) {
                return province.getWardName();
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Không tồn tại mã xã/thị trấn");
    }
}
