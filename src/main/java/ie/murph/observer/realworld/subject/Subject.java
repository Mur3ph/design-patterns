package main.java.ie.murph.observer.realworld.subject;

import main.java.ie.murph.observer.realworld.observer.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject
{
	private List<Observer> observers = new ArrayList<>();
	
	abstract void setState(String state);
	abstract String getState();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
}
}
