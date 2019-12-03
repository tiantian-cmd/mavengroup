package pachong;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * 使用JSoup 解析网页，语法使用 JS，css，Jquery 选择器语法，方便易懂
 * Jsoup教程网：http://www.open-open.com/jsoup/
 *
 */
public class JsoupDemo {

    public static void main(String[] args) throws IOException {
        String url = "https://www.oschina.net/news";
        Document document = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:30.0) Gecko/20100101 Firefox/30.0").get();
        Elements elements = document.select("#all-news div ");

        Elements es = document.select("#all-news div div ");
        for (Element e : es) {
            System.out.println(e.select("a.title>span").text());
            System.out.println(e.select("div").text());
            System.out.println("-----------");
        }
        System.out.println(elements.size());
    }
}
