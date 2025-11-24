package ru.netology.service;

public class CustomsService {

    static final int FEES_ON_WEIGHT = 100;

    public static double calculateCustoms(int price, int weight) {
        double ttl  = price * 0.01 + weight * FEES_ON_WEIGHT;
        return ttl;
    }

}
