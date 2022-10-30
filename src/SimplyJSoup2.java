import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SimplyJSoup2 {
    public static void main(String[] args) throws IOException {
        File htmlFile = new File("C:/index.html");
        Document doc = Jsoup.parse(htmlFile, "UTF-8");
        String title = doc.title();
        System.out.println("Title : " + title);
    }
}