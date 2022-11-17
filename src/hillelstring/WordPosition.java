package hillelstring;

import java.util.Scanner;

public class WordPosition {
    public int findWordPosition(String source, String target){
        if(source.contains(target) == true) {
           return source.indexOf(target);
        }else
            return -1;

    }
}
