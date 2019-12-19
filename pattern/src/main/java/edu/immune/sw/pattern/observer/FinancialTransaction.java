package edu.immune.sw.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FinancialTransaction implements Observable {
	
	List<Observer> observers;
	
	public FinancialTransaction() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		Iterator<Observer> iterator = observers.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals(observer)) {
				iterator.remove();
			}
		}
		
	}

	@Override
	public void notifyObservers() {
		observers.forEach((o) -> o.update());
	}

}
