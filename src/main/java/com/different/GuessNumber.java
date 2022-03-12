package com.different;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);

        boolean test = false;

        System.out.println("Please guess a number between 1 and 100.");

        for (int i = 0; i < 4; i++) {
            String string = scanner.next();
            double input = Double.parseDouble(string);



            if (input != number && (input < 1 || input > 100)){
                System.out.println("Not in range!");

            } else if (input != number && (1 <= input && input <= 100)){
                System.out.println("You're wrong! Please try again.");
            }else {
                test = true;
                break;
            }


        }
        if (test){
            System.out.println("Correct!!");
        }else{
            System.out.println("No more chance!");
        }

    }
}
