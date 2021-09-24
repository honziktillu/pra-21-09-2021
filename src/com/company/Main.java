package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] validSymbols = {"s", "o", "n", "d"};
        boolean isValid = false;
        for (String validSymbol : validSymbols) {
            if (validSymbol.equals(args[0])) {
                isValid = true;
            }
        }
        if (!isValid) {
            System.out.println("Bad arg");
            System.exit(-1);
        }
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        switch (args[0]) {
            case "s":
                System.out.println(a + b);
                break;
            case "o":
                System.out.println(a - b);
                break;
            case "n":
                System.out.println(a * b);
                break;
            case "d":
                System.out.println(a / b);
                break;
        }
        System.out.println("zmena");
        System.out.println("druhy");
    }
}
