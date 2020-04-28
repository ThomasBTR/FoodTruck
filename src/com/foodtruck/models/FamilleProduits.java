package com.foodtruck.models;

public enum FamilleProduits {
    VIENNOISERIE(1),
    PATISSERIE(2),
    PLAT_CHAUD(3),
    PLAT_FROID(4),
    ENTREE(5),
    DESSERT(6);

    private final int value;
    private FamilleProduits(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
