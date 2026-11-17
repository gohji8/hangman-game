package com.gohji;

public class Mask {
    public static char[] createMask(char[] arrayLetters) {
        char[] arrayMask = new char[arrayLetters.length];
        for (int i = 0; i < arrayLetters.length; i++) {
            arrayMask[i] = '*';
        }
        return arrayMask;
    }

    public static boolean checkingInputtedCharacter(String inputCharacter, char[] arrayLetters, char[] arrayMask ) {
        boolean check = false;
        for (int i = 0; i < arrayLetters.length; i++) {
            if (Character.toLowerCase(arrayLetters[i]) == Character.toLowerCase(inputCharacter.charAt(0))) {
                arrayMask[i] = arrayLetters[i];
                check = true;
            }
        }
        return check;
    }

    public static void printMask(char[] arrayMask) {
        System.out.print("Загаданное слово: ");
        System.out.println(arrayMask);
    }
}
