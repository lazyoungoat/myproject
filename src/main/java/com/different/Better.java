package com.different;

public class Better {
    public static void main(String[] args) {
        double min = 1;
        double input = 12;

        System.out.println("old min: " + min +"\t"+ "old input: " + input);

        double tmp = min;
        min = input;
        input = tmp;
        System.out.println("new min: " + min +"\t"+ "new input: " + input);
    }
}
