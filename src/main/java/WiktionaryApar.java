import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WiktionaryApar {
    private static final String URL_FORMAT = "https://ru.wiktionary.org/wiki/%s";

    public static Entity getEntity(String s){
        Entity entity = new Entity();
        String url = String.format(URL_FORMAT,s);
        try {
            Document doc = Jsoup.connect(url).get();
            Elements elements = doc.select("div.mw-parser-output");

            Elements h1 = elements.select("h1 span.mw-headline");
            if(h1.get(0).getElementById("Русский") != null){
                Elements p = elements.select("p b");
                ArrayList<String> list = new ArrayList<>();
                List<Node> nodes = p.get(0).childNodes();
                for(int i=0; i<nodes.size();i++){
                    String nodeStr = nodes.get(i).toString();
                    if(!nodeStr.contains("<")) {
                        list.add(nodeStr);
                        String s1 = String.valueOf((char) 769);
                        if(nodeStr.contains(s1)){
                            entity.setAccent(i+1);
                        }
                    }
                }
                entity.setSyllables(list);
                System.out.println(doc.html());
            }
            else{
                return null;
            }


            System.out.println(doc.html());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
