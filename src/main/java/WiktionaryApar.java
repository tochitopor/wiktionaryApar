import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WiktionaryApar {
    private static final String URL_FORMAT = "https://ru.wiktionary.org/wiki/%s";

    public static Entity getEntity(String s){
        String url = String.format(URL_FORMAT,s);
        try {
            Document doc = Jsoup.connect(url).get();
            System.out.println(doc.html());
            /*Elements div = doc.getElementsByAttribute("morfotable ru");
            doc.toString();*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
