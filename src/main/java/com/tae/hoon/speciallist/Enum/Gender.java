package com.tae.hoon.speciallist.Enum;


public enum Gender implements CodeValue {
    MAN("M", "남성"),
    WOMAN("W", "여성");

    private String code;
    private String value;

    Gender(String code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getValue() {
        return value;
    }
}
