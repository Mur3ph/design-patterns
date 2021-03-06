package main.java.ie.murph.observer.read;

import main.java.ie.murph.observer.read.observer.StockObserver;
import main.java.ie.murph.observer.read.subject.GetStockPricesUsingThreads;
import main.java.ie.murph.observer.read.subject.StockGrabber;

public class RunLiveStock
{
    public static void main(String[] args)
    {
	System.out.println("++RunLiveStock Class\n");
	
	StockGrabber stockGrabber = new StockGrabber();
	
	System.out.println("Stock Observer 1: \n");
	StockObserver stockObserver1 = getStoctPricesObserver(stockGrabber);
	System.out.println(stockObserver1.toString());
	
	System.out.println("Stock Observer 2: \n");
	StockObserver stockObserver2 = getStoctPricesObserver(stockGrabber);
	System.out.println(stockObserver2.toString());
	
	stockGrabber.unregister(stockObserver1);
	
	
	System.out.println("Stock Observer 3 - Threads: \n");
	getStockPricesUsingThreads(stockGrabber);
	
	System.out.println("--RunLiveStock Class\n");
    }
    
    private static StockObserver getStoctPricesObserver(StockGrabber stockGrabber)
    {
	StockObserver stockObserver = new StockObserver(stockGrabber);
	stockGrabber.setIBMStockPrice(197.00);
	stockGrabber.setAppleStockPrice(677.60);
	stockGrabber.setGoogleStockPrice(676.40);
	return stockObserver;
	
    }
    
    private static void getStockPricesUsingThreads(StockGrabber stockGrabber)
    {
	System.out.println("Threads begin: \n");
	
	startIBMStockPricesThread(stockGrabber);
	startAPPLEStockPricesThread(stockGrabber);
	startGOOGLEStockPricesThread(stockGrabber);
    }
    
    private static void startIBMStockPricesThread(StockGrabber stockGrabber)
    {
	new Thread(getIBMStockPrices(stockGrabber)).start();
    }
    
    private static Runnable getIBMStockPrices(StockGrabber stockGrabber)
    {
	return new GetStockPricesUsingThreads.Builder().StockGrabber(stockGrabber).ThreadStartTime(2).CompanyNameOfStock("IBM").StockPrice(197.00);
    }
    
    private static void startAPPLEStockPricesThread(StockGrabber stockGrabber)
    {
	new Thread(getAPPLEStockPrices(stockGrabber)).start();
    }
    
    private static Runnable getAPPLEStockPrices(StockGrabber stockGrabber)
    {
	return new GetStockPricesUsingThreads.Builder().StockGrabber(stockGrabber).ThreadStartTime(4).CompanyNameOfStock("APPLE").StockPrice(677.60);
    }
    
    private static void startGOOGLEStockPricesThread(StockGrabber stockGrabber)
    {
	new Thread(getGOOGLEStockPrices(stockGrabber)).start();
    }
    
    private static Runnable getGOOGLEStockPrices(StockGrabber stockGrabber)
    {
	return new GetStockPricesUsingThreads.Builder().StockGrabber(stockGrabber).ThreadStartTime(6).CompanyNameOfStock("GOOGLE").StockPrice(676.40);
    }
}
