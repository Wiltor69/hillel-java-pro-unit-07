package hillelstring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SymbolOccurance {
    public int findSymbolOccurance (String s, char c)  {
        char[] chars = s.toCharArray();

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i< chars.length; i++) {

             if (chars[i] == c) {
                 list.add(chars[i]);
             }
            }return list.size();
        }

    }

