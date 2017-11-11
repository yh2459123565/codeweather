package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yang on 2017/11/11.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int prvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getPrvinceCode() {
        return prvinceCode;
    }

    public void setPrvinceCode(int prvinceCode) {
        this.prvinceCode = prvinceCode;
    }
}
