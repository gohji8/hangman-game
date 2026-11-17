package com.gohji;

import java.util.Scanner;

public class Mask {
    private static final char[] arrayLetters = ChoiceOfWords.returnRandomWord().toCharArray();
    private static final char[] arrayMask = new char[arrayLetters.length];

    public static char[] createMask() { //todo возможно стоит удалить метод и оставить только цикл
        for (int i = 0; i < arrayLetters.length; i++) {
            arrayMask[i] = '*';
        }
        return arrayMask;
    }

    public static boolean checkingTheEnteredLetter(String inputLetter) {
        boolean check = false;
        for (int i = 0; i < arrayLetters.length; i++) {
            if (Character.toLowerCase(arrayLetters[i]) == Character.toLowerCase(inputLetter.charAt(0))) {
                arrayMask[i] = arrayLetters[i];
                check = true;
            }
        }
        return check;
    }
}
