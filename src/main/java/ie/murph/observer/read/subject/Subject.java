package main.java.ie.murph.observer.read.subject;

import main.java.ie.murph.observer.read.observer.Observer;

public interface Subject 
{
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
