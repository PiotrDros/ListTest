package com.example.piotr.listtest;

/**
 * Created by Piotr on 2016-02-21.
 */
public class Country {
    private int flagResId;
    private String name;

    public Country(int flagResId, String name) {
        this.flagResId = flagResId;
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlagResId() {

        return flagResId;
    }

    public void setFlagResId(int flagResId) {
        this.flagResId = flagResId;
    }
}
