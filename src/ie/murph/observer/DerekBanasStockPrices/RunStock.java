package ie.murph.observer.DerekBanasStockPrices;

public class RunStock
{
    public static void main(String[] args)
    {
	System.out.println("++RunStock Class");
	
	StockGrabber stockGrabber = new StockGrabber();
	
	System.out.println("");
	StockObserver stockObserver1 = new StockObserver(stockGrabber);
	stockGrabber.setIBMStockPrice(197.00);
	stockGrabber.setAppleStockPrice(677.60);
	stockGrabber.setGoogleStockPrice(676.40);
	System.out.println(stockObserver1.toString());
	
	System.out.println("");
	StockObserver stockObserver2 = new StockObserver(stockGrabber);
	stockGrabber.setIBMStockPrice(197.00);
	stockGrabber.setAppleStockPrice(677.60);
	stockGrabber.setGoogleStockPrice(676.40);
	System.out.println(stockObserver2.toString());
	
	stockGrabber.unregister(stockObserver1);
	
	Runnable getIBM = new GetStockPricesUsingThreads(stockGrabber, 2, "IBM", 197.00);
	Runnable getAPPLE = new GetStockPricesUsingThreads(stockGrabber, 4, "APPLE", 677.60);
	Runnable getGOOGLE = new GetStockPricesUsingThreads(stockGrabber, 6, "GOOGLE", 676.40);
	
	new Thread(getIBM).start();
	new Thread(getAPPLE).start();
	new Thread(getGOOGLE).start();
	
	System.out.println("--RunStock Class");
    }
}
