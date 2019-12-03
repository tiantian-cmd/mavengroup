package pachong;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.swing.text.html.parser.Entity;
import java.io.Closeable;
import java.io.IOException;

public class HttpClientHello {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient= HttpClients.createDefault();
        HttpGet httpGet=new HttpGet("https://www.baidu.com");
        CloseableHttpResponse response=null;
        response=httpClient.execute(httpGet);
        HttpEntity entity =response.getEntity();
        System.out.println("网页内容"+ EntityUtils.toString(entity,"utf-8"));
        response.close();
        httpClient.close();
    }
}
