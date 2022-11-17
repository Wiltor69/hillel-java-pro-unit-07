package hillelstring;

public class Reverse {
    public String stringReverse (String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
