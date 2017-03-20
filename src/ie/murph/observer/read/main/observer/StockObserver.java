package ie.murph.observer.read.main.observer;

import ie.murph.observer.read.main.subject.Subject;;

public class StockObserver implements Observer
{
    private static int observerIdTracker = 0;
    private int observerId;
    private Subject stockGrabber;
    private double ibmStockPrice;
    private double appleStockPrice;
    private double googleStockPrice;
    
    public StockObserver(Subject stockGrabber)
    {
	this.stockGrabber = stockGrabber;
	this.observerId = this.observerIdTracker++;
	this.stockGrabber.register(this);
	System.out.println("(--StockObserver class) New Stock Grabber Observer created: " + this.observerId + "\n");
    }
    
    @Override
    public void udate(double appleStockPrice, double googleStockPrice, double ibmStockPrice)
    {
	System.out.println("++update() (StockObserver)\n");
	
	this.ibmStockPrice = ibmStockPrice;
	this.appleStockPrice = appleStockPrice;
	this.googleStockPrice = googleStockPrice;
	
	printStockPrices();
	
	System.out.println("--update() (StockObserver)\n");
    }

    private void printStockPrices()
    {
	System.out.println(this.observerId + "\nIBM Stock Prices: " + this.ibmStockPrice +
					     "\n Apple Inc. Stock Prices: " + this.appleStockPrice +
					     "\nGoogle Stock Prices: " + this.googleStockPrice +
					     "\n");
    }
    
}
