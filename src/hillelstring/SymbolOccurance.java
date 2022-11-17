package hillelstring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SymbolOccurance {
    public void findSymbolOccurance (String s, char c)  {
        char[] chars = s.toCharArray();

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i< chars.length; i++) {

             if (chars[i] == c) {
                 list.add(chars[i]);
             }
            }System.out.println("The number of characters " + c + " in this string: " + list.size());
        }

    }

