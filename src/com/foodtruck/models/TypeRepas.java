package com.foodtruck.models;

public enum TypeRepas {
    PETIT_DEJEUNER(1),
    DEJEUNER(2),
    GOUTER(3),
    DINNER(4),

    private final int value;
    private TypeRepas(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
