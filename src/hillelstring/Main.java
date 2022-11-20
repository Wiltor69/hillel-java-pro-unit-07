package hillelstring;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println("----------------Point two--------------------------" );

        SymbolOccurance so = new SymbolOccurance();
        Scanner scr = new Scanner(System.in);
        System.out.println("Please write any word :");
        String s = scr.nextLine();
        System.out.println("Write any character from the above text: ");
        Character c = (char) System.in.read();
        System.out.println("Simbol: " + so.findSymbolOccurance(s, c));

        System.out.println("----------------Point three--------------------------" );

        WordPosition wp = new WordPosition();
        Scanner scr1 = new Scanner(System.in);
        System.out.println("Please write any string :");
        String source = scr1.next();
        System.out.println("Please write any word :");
        String target = scr1.next();
        System.out.println("Source: " + source);
        System.out.println("Target: " + target);
        System.out.println("Result: " + wp.findWordPosition(source, target));

        System.out.println("----------------Point four--------------------------" );

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write any word: ");
        String str = scan.next();
        Reverse rev = new Reverse();
        System.out.println(str + " --> " + rev.stringReverse(str));

        System.out.println("----------------Point five--------------------------" );

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please write any word: ");
        String string = scan.next();
        Palindrome palindrome = new Palindrome();
        System.out.println(string + " --> " + palindrome.isPalindrome(string));

        System.out.println("----------------Point six--------------------------" );

        WordGame wg = new WordGame();
        Scanner radScan = new Scanner(System.in);
        System.out.println("Try to guess a vegetable or fruit. Write it: ");
        String str2 = radScan.next();
        wg.randomWordGame(str2);
    }
}
