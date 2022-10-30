import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SimplyJSoup {
    public static void main( String[] args ) throws IOException{
        Document doc = Jsoup.connect("http://eu.httpbin.org").get();
        String title = doc.title();
        System.out.println("Title : " + title);
    }
}

/* Document из File
import java.io.File;
        import java.io.IOException;
        import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;

public class GetDocumentFromFile {
    public static void main(String[] args) throws IOException {
        File htmlFile = new File("C:/index.html");
        Document doc = Jsoup.parse(htmlFile, "UTF-8");
        String title = doc.title();
        System.out.println("Title : " + title);
    }
}*/

/* Document из String
import java.io.IOException;
        import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;

public class GetDocumentFromString {
    public static void main(String[] args) throws IOException {
        String htmlString = "<html><head><title>Simple Page</title></head>"
                + "<body>Hello</body></html>";
        Document doc = Jsoup.parse(htmlString);
        String title = doc.title();
        System.out.println("Title : " + title);
        System.out.println("Content:\n");
        System.out.println(doc.toString());
    }
}*/

/* Парсинг фрагмента HTML
import java.io.IOException;
        import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;

public class ParsingBodyFragment {
    public static void main(String[] args) throws IOException {
        String htmlFragment = "<h1>Hi you!</h1><p>What is this?</p>";
        Document doc = Jsoup.parseBodyFragment(htmlFragment);
        String fullHtml = doc.html();
        System.out.println(fullHtml);
    }
}*/
