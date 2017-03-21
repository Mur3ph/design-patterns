package ie.murph.observer.read.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MyJSoup
{
//  jsoup is a Java library for working with real-world HTML. It provides a very convenient API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods
    private Document URLConnection;
    private Elements HTMLElement;
    
    public void connectToWebPage(String webPage)
    {
	try
	{
	    URLConnection = Jsoup.connect(webPage).get();
	} 
	catch (IOException e)
	{
	    e.printStackTrace();
	}
    }
    
    public void setHTMLElement(String HTMLPageElement)
    {
	HTMLElement = URLConnection.select(HTMLPageElement);
    }
    
    public String printAllHTMLElement()
    {
	return "\n" + HTMLElement + "\n";
    }
    
}
