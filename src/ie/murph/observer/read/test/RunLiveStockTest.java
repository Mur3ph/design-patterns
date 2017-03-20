package ie.murph.observer.read.test;

import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;

public class RunLiveStockTest
{
    
    // Given symbol, get HTML
    private static String readHTML(String symbol) 
    {
	//http://finance.yahoo.com/quote/GOOG?p=GOOG
        return MyURLTest.getUrlAsString("http://finance.yahoo.com/quote/" + symbol);
    }

    public static void main(String[] args) {
        String html = readHTML("GOOG?p=GOOG");
        System.out.println(html);
    }
}
