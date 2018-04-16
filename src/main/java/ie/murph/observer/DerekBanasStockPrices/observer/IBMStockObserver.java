package main.java.ie.murph.observer.DerekBanasStockPrices.observer;

import main.java.ie.murph.observer.DerekBanasStockPrices.subject.Subject;

public class IBMStockObserver implements Observer {
	private int observerId;
	private Subject stockGrabber;
	private double ibmStockPrice;

	public IBMStockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.stockGrabber.register(this);
		System.out.println("(--StockObserver class) New Stock Grabber Observer created: " + this.observerId + "\n");
	}

	@Override
	public void update(double appleStockPrice, double googleStockPrice, double ibmStockPrice) {
		System.out.println("++update() (StockObserver)\n");

		this.ibmStockPrice = ibmStockPrice;

		printStockPrices();

		System.out.println("--update() (StockObserver)\n");
	}

	private void printStockPrices() {
		System.out.println(this.observerId + "\nIBM Stock Prices: " + this.ibmStockPrice + "\n");
	}

}
