package com.ModellingClasses;

import java.util.Scanner;

import static com.ModellingClasses.Main.ScannerDEmo.getValidatedInt;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello Word");
        int i = 0;
        System.out.println(i);

        Scanner scanner = new Scanner(System.in);
        int a = getValidatedInt(scanner, "Enter an int: ", "Error not valid",0,10);
        scanner.close();

       // ScannerDEmo.getValidatedInt("oioi","kkj");
    }



    public static class ScannerDEmo {
        public static int getValidatedInt(Scanner scanner, String prompt, String errorMessage, int min, int max) {
            int value;
            while (true) {
                System.out.print(prompt);
                if (scanner.hasNextInt()) {
                    value = scanner.nextInt();
                    if (value >= min && value <= max) {
                        return value;
                    } else {
                        System.out.println("Error: " + errorMessage);
                    }
                } else {
                    System.out.println("Error: " + errorMessage);
                    scanner.next(); // Consume invalid input
                }

            }
        }
    }

}








