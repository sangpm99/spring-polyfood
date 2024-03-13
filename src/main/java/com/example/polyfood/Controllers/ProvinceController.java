package com.example.polyfood.Controllers;

import com.example.polyfood.Models.Province;
import com.example.polyfood.Services.ProvinceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("province/")
@CrossOrigin
public class ProvinceController {
    @Autowired
    private ProvinceServices provinceServices;

    @RequestMapping(value = "getallcity", method = RequestMethod.GET)
    public List<Province> getAllCity() {return provinceServices.getAllCity();}

    @RequestMapping(value = "getalldistrict", method = RequestMethod.GET)
    public List<Province> getAllDistrict(@RequestParam String cityCode) {return provinceServices.getAllDistrict(cityCode);}

    @RequestMapping(value = "getallward", method = RequestMethod.GET)
    public List<Province> getAllWard(@RequestParam String districtCode) {return provinceServices.getAllWard(districtCode);}

    @RequestMapping(value = "getcitybycode", method = RequestMethod.GET)
    public String getCityByCode(@RequestParam String cityCode) {
        return provinceServices.getCityByCode(cityCode);
    }

    @RequestMapping(value = "getdistrictbycode", method = RequestMethod.GET)
    public String getDistrictByCode(@RequestParam String districtCode) {
        return provinceServices.getDistrictByCode(districtCode);
    }

    @RequestMapping(value = "getwardbycode", method = RequestMethod.GET)
    public String getWardByCode(@RequestParam String wardCode) {
        return provinceServices.getWardByCode(wardCode);
    }
}
