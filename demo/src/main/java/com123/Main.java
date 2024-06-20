package com123;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first positive integer: ");
        String arg1 = scanner.nextLine();
        System.out.print("Please enter the second positive integer: ");
        String arg2 = scanner.nextLine();

        String result = processNumbers(arg1, arg2);
        System.out.println(result);
    }

    public static String processNumbers(String arg1, String arg2) {
        try {
            int a = Integer.parseInt(arg1);
            int b = Integer.parseInt(arg2);
            if (a <= 0 || b <= 0) {
                return "Error: Both numbers must be positive integers.";
            }

            if (a + b > 100) {
                return "Sum: " + (a + b);
            } else if (a + b == 100) {
                return "Product: " + (a * b);
            } else {
                return "Difference: " + (Math.max(a, b) - Math.min(a, b));
            }
        } catch (NumberFormatException e) {
            return "Error: Please provide valid integers.";
        }
    }
}
