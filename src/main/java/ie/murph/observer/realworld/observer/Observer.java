package main.java.ie.murph.observer.realworld.observer;

import main.java.ie.murph.observer.realworld.subject.Subject;

public abstract class Observer
{
	protected Subject subject;
	public abstract void update();
}
