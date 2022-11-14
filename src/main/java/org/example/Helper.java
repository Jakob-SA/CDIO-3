package org.example;

import java.util.Scanner;

public class Helper {
    static Scanner input = new Scanner(System.in);
    public static void pressEnter(String message){
        String temp = "temp";
        while (temp != "") {
            System.out.println(message);
            temp = input.nextLine();
        }
    }
}
