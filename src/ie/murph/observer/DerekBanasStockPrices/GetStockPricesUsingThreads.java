package ie.murph.observer.DerekBanasStockPrices;

import java.text.DecimalFormat;

public class GetStockPricesUsingThreads implements Runnable
{
    private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	public GetStockPricesUsingThreads(Subject stockGrabber, int newStartTime, String newStock, double newPrice)
	{
	    System.out.println("\n++GetStockPricesUsingThreads Thread Class\n");
	    this.stockGrabber = stockGrabber;
	    startTime = newStartTime;
	    stock = newStock;
	    price = newPrice;
	}
	
	@Override
	public void run() 
	{
	    for(int i = 0; i <= 20; i++)
	    {
			
		try
		{
		    Thread.sleep(startTime * 1000);
//		    Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
		    e.printStackTrace();
		}
		finally
		{
		    double randNum = getRandomStockPrice();
		    price = Double.valueOf(formatPriceToTwoDecimalPlaces().format((price+randNum)));
				
		    isIBMStock();
		    isAppleStock();
		    isGoogleStock();
				
		    printStockPrices(randNum);
		    System.out.println("");
		}
			
	    }
	}
	
	private double getRandomStockPrice()
	{
	    return (Math.random() * (0.06) - 0.03);
	}
	
	private DecimalFormat formatPriceToTwoDecimalPlaces()
	{
	    return new DecimalFormat("#.##");
	}
	
	private void isIBMStock()
	{
	    if(stock == "IBM") ((StockGrabber) stockGrabber).setIBMStockPrice(price);
	}
	
	private void isAppleStock()
	{
	    if(stock == "APPLE") ((StockGrabber) stockGrabber).setAppleStockPrice(price);;
	}
	
	private void isGoogleStock()
	{
	    if(stock == "GOOGLE") ((StockGrabber) stockGrabber).setGoogleStockPrice(price);;
	}
	
	private void printStockPrices(double randNum)
	{
	    System.out.println(stock + " Stock: " + formatPriceToTwoDecimalPlaces().format((price+randNum)) + "\nChange: " + formatPriceToTwoDecimalPlaces().format(randNum));
	}
}
