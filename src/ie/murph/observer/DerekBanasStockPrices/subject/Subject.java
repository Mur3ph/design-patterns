package ie.murph.observer.DerekBanasStockPrices.subject;

import ie.murph.observer.DerekBanasStockPrices.observer.Observer;

public interface Subject 
{
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
