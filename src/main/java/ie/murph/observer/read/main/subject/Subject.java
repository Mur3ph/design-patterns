package main.java.ie.murph.observer.read.main.subject;

import main.java.ie.murph.observer.read.main.observer.Observer;

public interface Subject 
{
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
