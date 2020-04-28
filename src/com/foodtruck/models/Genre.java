package com.foodtruck.models;

public enum Genre {
    HOMME(1),
    FEMME(2),
    NON_GENRE(3);

    private final int value;
    private Genre(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
