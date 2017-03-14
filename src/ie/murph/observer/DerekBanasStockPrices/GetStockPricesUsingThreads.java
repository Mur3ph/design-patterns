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
	    for(int i = 0; i <= 20; i++){
			
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
		    double randNum = (Math.random() * (0.06) - 0.03);
		    DecimalFormat decimalFormat = new DecimalFormat("#.##");
		    price = Double.valueOf(decimalFormat.format((price+randNum)));
				
		    if(stock == "IBM") ((StockGrabber) stockGrabber).setIBMStockPrice(price);
		    if(stock == "APPLE") ((StockGrabber) stockGrabber).setIBMStockPrice(price);
		    if(stock == "GOOGLE") ((StockGrabber) stockGrabber).setIBMStockPrice(price);
				
		    System.out.println(stock + " Stock: " + decimalFormat.format((price+randNum)) + " Change: " + decimalFormat.format(randNum));
		    System.out.println("");
		}
			
		}
	}
}
