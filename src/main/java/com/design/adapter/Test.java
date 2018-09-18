package com.design.adapter;

public class Test {
  public static void main(String[] args) {
	AdapterImpl adapter1 = new Power4();
	adapter1.power4();
	adapter1.power6();
	
	AdapterImpl adapter2 = new Power6();
	adapter2.power4();
	adapter2.power6();
}
}
