import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //System.out.println((char)769);

        /*String s= "\u0769\u0065";
        System.out.println(s);*/

        WiktionaryApar.getEntity("короста".toLowerCase(Locale.ROOT));
    }
}
