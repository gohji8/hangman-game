package com.gohji;

public class HangmanRender {
    private static final String[] IMAGE_HANGMAN = {
            """
   +_________+
   |         |
             |
             |
             |
             |
             |
   ===========
""",
            """
   +_________+
   |         |
  ( )        |
             |
             |
             |
             |
   ===========
""",
            """
   +_________+
   |         |
  ( )        |
   |         |
   |         |
             |
             |
   ===========
""",
            """
   +_________+
   |         |
  ( )        |
  /|         |
   |         |
             |
             |
   ===========
""",
            """
   +_________+
   |         |
  ( )        |
  /|\\        |
   |         |
             |
             |
   ===========
""",
            """
   +_________+
   |         |
  ( )        |
  /|\\        |
   |         |
  /          |
             |
   ===========
""",
            """
   +_________+
   |         |
  ( )        |
  /|\\        |
   |         |
  / \\        |
             |
   ===========
"""
    };

    public static void render(int image){
        System.out.println(IMAGE_HANGMAN[image]);
    }
}
