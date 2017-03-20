package ie.murph.observer.read.main.subject;

import ie.murph.observer.read.main.observer.Observer;

public interface Subject 
{
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
