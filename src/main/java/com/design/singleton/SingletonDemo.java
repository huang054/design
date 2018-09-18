package com.design.singleton;

public class SingletonDemo {
	private SingletonDemo() {
		// TODO Auto-generated constructor stub
	}

	private static volatile SingletonDemo singketon;

	public static SingletonDemo singleton() {
		if (singketon == null) {
			synchronized (SingletonDemo.class) {
				if (singketon == null)
					singketon = new SingletonDemo();

			}
		}
		return singketon;
	}

}
