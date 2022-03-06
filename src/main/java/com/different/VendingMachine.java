package com.different;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        int [] price = {10, 20, 30};
        System.out.println(price.length);
        System.out.println((0));
        int aprice = 10;
        int bprice = 20;
        int cprice = 25;

        boolean get = false;

        int total = 0;

        Scanner scanner = new Scanner(System.in);
        while (!get){
            System.out.println("Please insert coin(s)");
            String ScannertoString = scanner.next();
            switch (ScannertoString){
                case "1":
                case "5":
                case "10":
                    int number = Integer.parseInt(ScannertoString);
                    total += number;
                    System.out.println(total);
                    break;
                case "a":
                    if (total >= aprice){
                        total -= aprice;
                        System.out.println("ENJOY!!");
                    }else {
                        System.out.println("NOWAY!");
                    }break;
                case "b":
                    if (total >= bprice){
                        total -= bprice;
                        System.out.println("ENJOY!!");
                    }else {
                        System.out.println("NOWAY!");
                    }break;
                case "c":
                    if (total >= cprice){
                        total -= cprice;
                        System.out.println("ENJOY!!");
                    }else {
                        System.out.println("NOWAY!");
                    }break;
                default:
                    System.out.println("???");
                    break;
            }

        }




    }
}
