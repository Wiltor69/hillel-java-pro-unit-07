package hillelstring;

import java.util.Random;
import java.util.Scanner;

public class WordGame {
    public void randomWordGame(String str) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rad = new Random();
        int r = rad.nextInt(words.length);

        for (int i = 0; i < words.length; i++) {
            if (words[r].equals(str.charAt(0))) {
                System.out.println("Congratulation you are right. Word is: " + words[r].toString());
            break;

            }

        }System.out.println("You made mistake!!");
        System.out.println(words[r].charAt(0) + "###############");
        //System.out.println(words[r].toString());
    }
}





























