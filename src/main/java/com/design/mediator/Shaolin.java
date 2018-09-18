package com.design.mediator;

public class Shaolin extends United{

	public Shaolin(WulinAlliance wulin) {
		super(wulin);
		// TODO Auto-generated constructor stub
	}

	  public void sendAlliance(String message) {
		  wulin.notice(message, this);
	    }
	    public void getNotice(String message) {
	        System.out.println("少林收到消息：" + message);
	    }
}
