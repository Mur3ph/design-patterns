package main.java.ie.murph.observer.read;

import main.java.ie.murph.observer.read.JSoup.MyJSoup;
import main.java.ie.murph.observer.read.urlconnection.MyURL;

public class RunLiveStockJSoup
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
        return MyURL.getUrlAsString(url + companySymbol);
    }
    
    private static String readHTMLUsingJSoup(String url, String htmlElement)
    {
	return new MyJSoup.Builder().URLConnection(url).getHTMLDocument().selectHTMLElement(htmlElement).printSelectedHTMLElement();
    }
}
