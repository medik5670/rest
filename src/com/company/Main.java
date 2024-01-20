package com.company;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height;
        height = 1.87;
        double weight;
        weight = 98;
        int index = BmiService.calculate((double) weight, (double) height);
        System.out.println(index);
    }
}



