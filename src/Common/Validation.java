/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;


public class Validation {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String msg) {
        String value = null;

        while (true) {
            if (msg != null) {
                System.out.print(msg);
            }

            value = scanner.nextLine().replaceAll("\\s+", " ").trim();

            if (!value.isEmpty() && !value.isBlank()) {
                break;
            }

            System.err.println("Please enter again...");
        }

        return value;
    }
//
//    public static int checkInt(String msg) {
//        return checkInt(msg, Integer.MIN_VALUE, Integer.MAX_VALUE);
//    }
//
//    public static int checkInt(String msg, int minRange, int maxRange) {
//        if (minRange > maxRange) {
//            int temp = minRange;
//            minRange = maxRange;
//            maxRange = temp;
//        }
//
//        int value = Integer.MIN_VALUE;
//
//        do {
//            try {
//                if (msg != null) {
//                    System.out.print(msg);
//                }
//                value = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.err.println("Invalid input! Please try again");
//            }
//        } while (value < minRange || value > maxRange);
//
//        return value;
//    }
//    
}
