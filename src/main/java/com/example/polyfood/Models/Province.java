package com.example.polyfood.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "province")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provinceid")
    private int provinceId;

    @Column(name = "citycode")
    private String cityCode;

    @Column(name = "cityname")
    private String cityName;

    @Column(name = "districtcode")
    private String districtCode;

    @Column(name = "districtname")
    private String districtName;

    @Column(name = "wardcode")
    private String wardCode;

    @Column(name = "wardname")
    private String wardName;

    public Province() {}

    public Province(String cityCode, String cityName, String districtCode, String districtName, String wardCode, String wardName) {
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.districtCode = districtCode;
        this.districtName = districtName;
        this.wardCode = wardCode;
        this.wardName = wardName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
}
