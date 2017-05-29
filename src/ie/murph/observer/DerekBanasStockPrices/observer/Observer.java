package ie.murph.observer.DerekBanasStockPrices.observer;

public interface Observer {
	public void update(double appleStockPrice, double googleStockPrice, double ibmStockPrice);
}
