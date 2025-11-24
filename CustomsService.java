package ru.netology.service;

public class CustomsService {

    static final int Fees_On_Weight = 100;

    public static double calculateCustoms(int price, int weight) {
        double ttl  = price * 0.01 + weight * Fees_On_Weight;
        return ttl;
    }

}
