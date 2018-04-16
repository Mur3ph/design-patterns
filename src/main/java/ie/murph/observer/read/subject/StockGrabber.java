package main.java.ie.murph.observer.read.subject;

import java.util.ArrayList;
import java.util.List;

import main.java.ie.murph.observer.read.observer.Observer;

public class StockGrabber implements Subject
{
	private List<Observer> observers;
	private double ibmStockPrice;
	private double appleStockPrice;
	private double googleStockPrice;
	
	public StockGrabber()
	{
	    this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer observerToBeAdded) 
	{
	    System.out.println("++register()\n");
	    this.observers.add(observerToBeAdded);
	    System.out.println("--register()\n");
	}

	@Override
	public void unregister(Observer observerToBeRemoved) 
	{
	    System.out.println("++unregister()\n");
	    int positionOfObserverToBeDeleted = observers.indexOf(observerToBeRemoved);
	    this.observers.remove(positionOfObserverToBeDeleted);
	    System.out.println("--unregister()\n");
	}

	@Override
	public void notifyObserver() 
	{
	    System.out.println("++notifyObserver()\n");
	    for(Observer observer : this.observers)
	    {
		observer.udate(appleStockPrice, googleStockPrice, ibmStockPrice);
	    }
	    System.out.println("--notifyObserver()\n");
	}
	
	public void setIBMStockPrice(double ibmStockPrice)
	{
	    this.ibmStockPrice = ibmStockPrice;
	    this.notifyObserver();
	}
	
	public void setGoogleStockPrice(double googleStockPrice)
	{
	    this.googleStockPrice = googleStockPrice;
	    this.notifyObserver();
	}
	
	public void setAppleStockPrice(double appleStockPrice)
	{
	    this.appleStockPrice = appleStockPrice;
	    this.notifyObserver();
	}
	
}
