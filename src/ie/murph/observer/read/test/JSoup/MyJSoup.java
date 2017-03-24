package ie.murph.observer.read.test.JSoup;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MyJSoup
{
//  jsoup is a Java library for working with real-world HTML. It provides a very convenient API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods
    private final Connection URLConnection;
    private final Document URLDocument;
    private final Elements HTMLElement;
    
    public MyJSoup(Builder builder)
    {
	this.URLConnection = builder.URLConnection;
	this.URLDocument = builder.URLDocument;
	this.HTMLElement = builder.HTMLElement;
    }
    
    public Connection getURLConnection()
    {
        return URLConnection;
    }

    public Document getURLDocument()
    {
        return URLDocument;
    }

    public Elements getHTMLElement()
    {
        return HTMLElement;
    }
    
    public static class Builder
    {
	    private Connection URLConnection;
	    private Document URLDocument;
	    private Elements HTMLElement;
	    
	    public Builder URLConnection(String webPageURL)
	    {
		this.URLConnection = Jsoup.connect(webPageURL);
		return this;
	    }
	    
	    public Builder getHTMLDocument()
	    {
		try
		{
		    this.URLDocument = this.URLConnection.get();
		} 
		catch (IOException e)
		{
		    e.printStackTrace();
		}
		return this;
	    }
	    
	    public Builder selectHTMLElement(String HTMLElement)
	    {
		this.HTMLElement = URLDocument.select(HTMLElement);
		return this;
	    }
	    
	    public MyJSoup build()
	    {
		return new MyJSoup(this);
	    }
	    
	    public String printSelectedHTMLElement()
	    {
		return "\n" + HTMLElement + "\n";
	    }
    }
    
}
