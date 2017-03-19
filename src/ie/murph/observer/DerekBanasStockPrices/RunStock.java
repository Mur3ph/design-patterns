package ie.murph.observer.DerekBanasStockPrices;

import ie.murph.observer.DerekBanasStockPrices.observer.StockObserver;
import ie.murph.observer.DerekBanasStockPrices.subject.GetStockPricesUsingThreads;
import ie.murph.observer.DerekBanasStockPrices.subject.StockGrabber;

public class RunStock
{
    public static void main(String[] args)
    {
	System.out.println("++RunStock Class\n");
	
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
	
	System.out.println("--RunStock Class\n");
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
//	return new GetStockPricesUsingThreads(stockGrabber, 2, "IBM", 197.00);
    }
    
    private static void startAPPLEStockPricesThread(StockGrabber stockGrabber)
    {
	new Thread(getAPPLEStockPrices(stockGrabber)).start();
    }
    
    private static Runnable getAPPLEStockPrices(StockGrabber stockGrabber)
    {
	return new GetStockPricesUsingThreads.Builder().StockGrabber(stockGrabber).ThreadStartTime(4).CompanyNameOfStock("APPLE").StockPrice(677.60);
//	return new GetStockPricesUsingThreads(stockGrabber, 4, "APPLE", 677.60);
    }
    
    private static void startGOOGLEStockPricesThread(StockGrabber stockGrabber)
    {
	new Thread(getGOOGLEStockPrices(stockGrabber)).start();
    }
    
    private static Runnable getGOOGLEStockPrices(StockGrabber stockGrabber)
    {
	return new GetStockPricesUsingThreads.Builder().StockGrabber(stockGrabber).ThreadStartTime(6).CompanyNameOfStock("GOOGLE").StockPrice(676.40);
//	return new GetStockPricesUsingThreads(stockGrabber, 6, "GOOGLE", 676.40);
    }
}
