package com.gohji;

import java.util.Scanner;

public class Game {
    private static final int START = 1;
    private static final int EXIT = 2;
    private static final String MENU = """
                 HANGMAN
            =================
            for start press 1
            for exit press 2
            """;
    private static final String MENU_ERROR = """
                        for start press 1
                        for exit press 2
                        """;

    public static void start() {
        while (true) {
            System.out.println(MENU);

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();  //TODO exeption .InputMismatchException
            if (choice == START) {
                System.out.println("игра запускается");
            } if (choice == EXIT){
                break;
            }else
                System.out.println(MENU_ERROR);
        }
    }
}
