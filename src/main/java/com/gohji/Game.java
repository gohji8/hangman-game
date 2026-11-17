package com.gohji;

import java.util.Scanner;

public class Game {
    private static final String START = "1";
    private static final String EXIT = "2";
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
    private static Scanner scanner = new Scanner(System.in);

    public static void startGame() {
        System.out.print(MENU);
        while (true) {
            String choicePlayer = scanner.nextLine();
            if (choicePlayer.equals(START)) {
                gameLoop();
                System.out.print(MENU_ERROR);
            } else if (choicePlayer.equals(EXIT)) {
                System.out.println("bye!");
                break;
            } else {
                System.out.print(MENU_ERROR);
            }
        }
    }

    private static void gameLoop() {
        int errorCount = 0;
        char[] word = ChoiceOfWords.returnRandomWord().toCharArray();
        char[] mask = Mask.createMask(word);

        do {
            HangmanRender.render(errorCount);
            Mask.printMask(mask);
            System.out.printf("количество ошибок: %d", errorCount);
            System.out.println();
            if (Mask.checkingInputtedCharacter(inputtingCharacter(), word, mask)) {
                System.out.println("верно!");
            } else {
                errorCount++;
                System.out.println("увы, такой буквы нет");
            }
        } while (errorCount < 6);
        {
            HangmanRender.render(errorCount);
            System.out.print("Проиграл! Было загадано слово: ");
            System.out.println(word);
        }
    }


    private static String inputtingCharacter() {
        System.out.print("Введите букву: ");
        return scanner.nextLine();
    }
}
