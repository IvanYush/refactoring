package com.javaacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
public enum GarbageType {
    PAPER("Бумага"), GLASS("Стекло"), MIXED("Смешанный мусор");
    @Getter
    @NonNull
    private final String value;

//    GarbageType(String value) {
//        if (value == null) {
//            throw new NullPointerException("value is marked non-null, but is null");
//        }
//        this.value = value;
//    }

//    public String getValue() {
//        return value;
//    }
}
