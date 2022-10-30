import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SimplyJSoupExample {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.krylatskoye.ru/content/ratings/2021/09/0928.html")
                .get();
        List<String> elements = doc.select("h3+div td.left:nth-of-type(2)").eachText();
        Collections.sort(elements);
        for(String element: elements) {
            System.out.println(element);
        }
    }
}
