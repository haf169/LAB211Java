/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.HashMap;


public class Algorithm {

    public void countLetter(String str) {
        HashMap<String, Integer> letter = new HashMap<>();
        String[] sletter = str.split("\\s");
        for (int i = 0; i < sletter.length; i++) {
            String ch = sletter[i];
            int count = 0;
            for (int j = 0; j < sletter.length; j++) {
                if (sletter[j].equals(ch)) {
                    count++;
                }
            }
            letter.put(ch, count);
        }
        System.out.print("Letter {");
        letter.forEach((key, value) -> {
            System.out.print(key + " = " + value);
            System.out.print(" ");
        });
        System.out.println("}");

    }

    public void countCharater(String str) {
        HashMap<String, Integer> charac = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            charac.put(ch + "", count);
        }

        System.out.print("Character {");
        charac.forEach((key, value) -> {
            System.out.print(key + " = " + value);
            System.out.print(" ");

        });
        System.out.println("}");

    }
}
