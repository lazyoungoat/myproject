package com.different;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);

        boolean test = false;

        double max = 100;
        double min = 1;

        System.out.println("Please guess a number between " + min + " and " + max);

        for (int i = 0; i < 4; i++) {
            String string = scanner.next();
            double input = Double.parseDouble(string);
            if (i == 0 || i == 1 || i == 2) {

                if (input != number && (input < 1 || input > 100)) {
                    System.out.println("Not in range!");

                } else if (input != number && (1 <= input && input <= 100)) {


                    if (input < number) {
                        double tmp = min;
                        min = input;
                        System.out.println("You're wrong! Please try again. (" + min + " ~ " + max + ")");
                    } else if (input > number) {
                        double tmp = max;
                        max = input;

                        System.out.println("You're wrong! Please try again. (" + min + " ~ " + max + ")");
                    }
                } else {
                    test = true;
                    break;
                }
            }else {
                break;
            }


        }
        if (test) {
            System.out.println("Correct!!");
        } else {
            System.out.println("No more chance!");
        }
    }


}
