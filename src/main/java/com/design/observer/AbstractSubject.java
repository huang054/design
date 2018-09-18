package com.design.observer;

import java.util.Enumeration;
import java.util.Vector;

public class AbstractSubject implements Subject{
	
	Vector<Observer> obs = new Vector<>();

	@Override
	public void add(Observer ob) {
		// TODO Auto-generated method stub
		 obs.add(ob);
	}

	@Override
	public void notifys() {
		// TODO Auto-generated method stub
		Enumeration<Observer> os=obs.elements();
		while(os.hasMoreElements()) {
			os.nextElement().update();
		}
	}

	public  void operation() {
		
	}
}
