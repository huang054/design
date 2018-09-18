package com.design.mediator;

public class Eme extends United{

	public Eme(WulinAlliance wulin) {
		super(wulin);
		// TODO Auto-generated constructor stub
	}
	
	  public void sendAlliance(String message) {
		  wulin.notice(message, this);
	    }
	    public void getNotice(String message) {
	        System.out.println("峨眉收到消息：" + message);
	    }

}
