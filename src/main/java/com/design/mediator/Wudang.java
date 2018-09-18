package com.design.mediator;

public class Wudang extends United{

	public Wudang(WulinAlliance wulin) {
		super(wulin);
		// TODO Auto-generated constructor stub
	}

	  public void sendAlliance(String message) {
		  wulin.notice(message, this);
	    }
	    public void getNotice(String message) {
	        System.out.println("武当收到消息：" + message);
	    }
}
