package com.android.hao.hiweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhenghao on 2018-01-30.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省名
    private int provinceCode;//省代号

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
