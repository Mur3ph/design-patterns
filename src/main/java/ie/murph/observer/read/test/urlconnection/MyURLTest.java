package main.java.ie.murph.observer.read.test.urlconnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MyURLTest
{
    private static URL urlObj;
    public static String getUrlAsString(String url)
    {
        try
        {
            urlObj = new URL(url);
            URLConnection con = urlObj.openConnection();

            con.setDoOutput(true); // we want the response 
            con.setRequestProperty("Cookie", "myCookie=test123");
            con.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            StringBuilder response = new StringBuilder();
            String inputLine;

            String newLine = System.getProperty("line.separator");
            while ((inputLine = in.readLine()) != null)
            {
                response.append(inputLine + newLine);
            }

            in.close();

            return response.toString();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        
    }
    
//    private static String readHTMLJava8(String url)
//    {
//	String pageText;
//	try (BufferedReader reader = new BufferedReader(new InputStreamReader(getURLConnection(url).getInputStream(), StandardCharsets.UTF_8))) 
//	{
//	    pageText = reader.lines().collect(Collectors.joining("\n"));
//	}
//	return pageText;
//    }
//    
//    private static URLConnection getURLConnection(String url)
//    {
//	try
//	{
//	    urlObj = new URL(url);
//	    return urlObj.openConnection();
//	}
//	 catch (IOException e)
//        {
//            throw new RuntimeException(e);
//        }
//    }
    
}
