package com.design.chainOfResponsibility;

public class MyHandler extends AbstractHandler implements Handler{

	private String name;
	
    public MyHandler(String name) {
		// TODO Auto-generated constructor stub
		this.name =name;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println(name);
		if(this.getHandler()!=null) {
			this.getHandler().operation();
		}
		
	}

}
