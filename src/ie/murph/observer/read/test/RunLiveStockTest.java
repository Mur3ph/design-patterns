package ie.murph.observer.read.test;

public class RunLiveStockTest
{
    private final static String YAHOO_FINANCE_QUOTE = "http://finance.yahoo.com/quote/";
    private final static String WIKIPEDIA = "http://en.wikipedia.org/";
    
    private final static String ANCHOR_LINKS = "body a";
    private final static String CSS_LINKS = "#mp-itn b a";
    
    private final static String GOOGLE = "GOOG?p=GOOG";
    
    // Given symbol, get HTML
    private static String readHTML(String symbol) 
    {
        return MyURLTest.getUrlAsString(YAHOO_FINANCE_QUOTE + symbol);
    }

    public static void main(String[] args) 
    {
//        String html = readHTML(GOOGLE);
//        System.out.println(html);
        
        MyJSoup myJSoup = new MyJSoup();
        myJSoup.connectToWebPage(WIKIPEDIA);
        myJSoup.setHTMLElement(CSS_LINKS);
	System.out.println(myJSoup.printAllHTMLElement());
	
	myJSoup.connectToWebPage(WIKIPEDIA);
	myJSoup.setHTMLElement(ANCHOR_LINKS);
	System.out.println(myJSoup.printAllHTMLElement());
    }
}
