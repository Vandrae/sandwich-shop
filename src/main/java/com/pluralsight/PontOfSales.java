package com.pluralsight;

import java.util.Scanner;

public class PontOfSales {
    public static void main(String[] args) {
        //allows user inputs
        Scanner input = new Scanner(System.in);
        System.out.print("What size sandwich do you want Regular(1) or Large(2): ");
        int sandwichSize = input.nextInt();
        //Var
        double price = 0;

        if (sandwichSize == 1) {
            price = 5.45;
        } else if (sandwichSize == 2) {
            price = 8.95;
        }
        System.out.print("your price is "  + price);


    }
}
