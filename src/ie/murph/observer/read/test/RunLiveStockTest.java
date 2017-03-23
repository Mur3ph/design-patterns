package ie.murph.observer.read.test;

import ie.murph.observer.read.test.JSoup.MyJSoup;
import ie.murph.observer.read.test.urlconnection.MyURLTest;

public class RunLiveStockTest
{
    private final static String YAHOO_FINANCE_QUOTE_URL = "http://finance.yahoo.com/quote/";
    private final static String WIKIPEDIA_URL = "http://en.wikipedia.org/";
    
    private final static String ANCHOR_LINKS_HTML_ELEMENT = "body a";
    private final static String CSS_LINKS_HTML_ELEMENT = "#mp-itn b a";
    
    private final static String GOOGLE_URL_PARAM = "GOOG?p=GOOG";
    
    public static void main(String[] args) 
    {
       readHTMLUsingCoreJava(YAHOO_FINANCE_QUOTE_URL, GOOGLE_URL_PARAM);
       
       readHTMLUsingJSoup(WIKIPEDIA_URL, CSS_LINKS_HTML_ELEMENT);
       readHTMLUsingJSoup(WIKIPEDIA_URL, ANCHOR_LINKS_HTML_ELEMENT);
    }
    
    private static void readHTMLUsingCoreJava(String url, String companySymbol)
    {
	System.out.println(readHTML(url, companySymbol));
    }
    
    // Given symbol, get HTML
    private static String readHTML(String url, String companySymbol) 
    {
        return MyURLTest.getUrlAsString(url + companySymbol);
    }
    
    private static String readHTMLUsingJSoup(String url, String htmlElement)
    {
	return new MyJSoup.Builder().URLConnection(url).getHTMLDocument().selectHTMLElement(htmlElement).printSelectedHTMLElement();
    }
}
