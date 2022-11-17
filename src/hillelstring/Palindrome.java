package hillelstring;

public class Palindrome {
    public boolean isPalindrome(String str) {
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String str1 = buffer.toString();
        if (str.equals(str1)) {
            return true;
        } else
            return false;
    }

}
