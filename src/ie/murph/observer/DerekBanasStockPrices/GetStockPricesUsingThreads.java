package ie.murph.observer.DerekBanasStockPrices;

import java.text.DecimalFormat;

public class GetStockPricesUsingThreads implements Runnable
{
    	private final int numberOfLoops = 20;
    	private int threadStartTime;
	private String companyNameOfStock;
	private double stockPrice;
	
	private Subject stockGrabber;
	
	public GetStockPricesUsingThreads(Subject stockGrabber, int threadStartTime, String companyNameOfStock, double stockPrice)
	{
	    System.out.println("\n++GetStockPricesUsingThreads Thread Class\n");
	    this.stockGrabber = stockGrabber;
	    this.threadStartTime = threadStartTime;
	    this.companyNameOfStock = companyNameOfStock;
	    this.stockPrice = stockPrice;
	}
	
	@Override
	public void run() 
	{
	    for(int iteration = 0; iteration <= numberOfLoops; iteration++)
	    {
		try
		{
		    Thread.sleep(threadStartTime * 1000);
//		    Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
		    e.printStackTrace();
		}
		finally
		{
		    double randomStockPriceMarketChange = getRandomStockPriceMarketChange();
		    stockPrice = getStockPrice(randomStockPriceMarketChange);
				
		    isIBMStock();
		    isAppleStock();
		    isGoogleStock();
				
		    printStockPrices(randomStockPriceMarketChange);
		    System.out.println("");
		}
			
	    }
	}
	
	private double getRandomStockPriceMarketChange()
	{
	    return (Math.random() * (0.06) - 0.03);
	}
	
	private double getStockPrice(double randomStockPrice)
	{
	    return Double.valueOf(formatPriceToTwoDecimalPlaces().format((stockPrice+randomStockPrice)));
	}
	
	private DecimalFormat formatPriceToTwoDecimalPlaces()
	{
	    return new DecimalFormat("#.##");
	}
	
	private void isIBMStock()
	{
	    if(companyNameOfStock == "IBM") ((StockGrabber) stockGrabber).setIBMStockPrice(stockPrice);
	}
	
	private void isAppleStock()
	{
	    if(companyNameOfStock == "APPLE") ((StockGrabber) stockGrabber).setAppleStockPrice(stockPrice);;
	}
	
	private void isGoogleStock()
	{
	    if(companyNameOfStock == "GOOGLE") ((StockGrabber) stockGrabber).setGoogleStockPrice(stockPrice);;
	}
	
	private void printStockPrices(double randomStockPriceMarketChange)
	{
	    System.out.println(companyNameOfStock + " Stock: " + formatPriceToTwoDecimalPlaces().format((stockPrice + randomStockPriceMarketChange)) + 
		    	               "\nChange: " + formatPriceToTwoDecimalPlaces().format(randomStockPriceMarketChange));
	}
}
