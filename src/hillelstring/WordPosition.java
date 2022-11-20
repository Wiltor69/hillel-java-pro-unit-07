package hillelstring;

import java.util.Scanner;

public class WordPosition {
    public int findWordPosition(String source, String target){
        if(source.contains(target)) {
           return source.indexOf(target);
        }
            return -1;

    }
}
