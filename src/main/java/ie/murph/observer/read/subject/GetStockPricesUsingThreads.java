package main.java.ie.murph.observer.read.subject;

import java.text.DecimalFormat;

public class GetStockPricesUsingThreads
{
    	private final int threadStartTime;
	private final String companyNameOfStock;
	private final double stockPrice;
	private final Subject stockGrabber;
	
	public GetStockPricesUsingThreads(Builder builder)
	{
	    System.out.println("\n++GetStockPricesUsingThreads Thread Class\n");
	    this.stockGrabber = builder.stockGrabber;
	    this.threadStartTime = builder.threadStartTime;
	    this.companyNameOfStock = builder.companyNameOfStock;
	    this.stockPrice = builder.stockPrice;
	}
	
	public int getThreadStartTime()
	{
	    return threadStartTime;
	}

	public String getCompanyNameOfStock()
	{
	    return companyNameOfStock;
	}

	public double getStockPrice()
	{
	    return stockPrice;
	}

	public Subject getStockGrabber()
	{
	    return stockGrabber;
	}


	public static class Builder implements Runnable
	{
	    private final int numberOfLoops = 20;
	    private int threadStartTime = 0;
	    private String companyNameOfStock = "";
	    private double stockPrice = 0;
	    private Subject stockGrabber = null;
	    
	    public Builder ThreadStartTime(int threadStartTimeValue)
	    {
		this.threadStartTime = threadStartTimeValue;
		return this;
	    }
	    
	    public Builder CompanyNameOfStock(String companyNameOfStockValue)
	    {
		this.companyNameOfStock = companyNameOfStockValue;
		return this;
	    }
	    
	    public Builder StockPrice(double stockPriceValue)
	    {
		this.stockPrice = stockPriceValue;
		return this;
	    }
	    
	    public Builder StockGrabber(Subject stockGrabberValue)
	    {
		this.stockGrabber = stockGrabberValue;
		return this;
	    }
	    
	    public GetStockPricesUsingThreads build()
	    {
		return new GetStockPricesUsingThreads(this);
	    }

	    @Override
	    public void run()
	    {
		for(int iteration = 0; iteration <= numberOfLoops; iteration++)
		    {
			try
			{
			    Thread.sleep(threadStartTime * 1000);
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
	}//Builder class ends here.
}
