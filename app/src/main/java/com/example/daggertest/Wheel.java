package com.example.daggertest;

import javax.inject.Inject;

public class Wheel {
    int quantily;
@Inject
    public Wheel(int quantily) {
        this.quantily = quantily;
    }
}
