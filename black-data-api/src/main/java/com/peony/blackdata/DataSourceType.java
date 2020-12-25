package com.peony.blackdata;

public enum DataSourceType {

    MASTER("master"),
    SLAVER("slaver")
    ;


    private String type;

    DataSourceType(String type) {
        this.type = type;
    }
}
