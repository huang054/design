package com.design.mediator;

public class Test {

	public static void main(String[] args) {
		Champions ch = new Champions();
		Wudang wudang = new Wudang(ch);
		Eme emei =new Eme(ch);
		Shaolin shaolin =new Shaolin(ch);
		ch.setEmei(emei);
		ch.setShaolin(shaolin);
		ch.setWudang(wudang);
		emei.sendAlliance("峨眉弟子被少林弟子杀了");
		wudang.sendAlliance("武当弟子被少林弟子杀了");
		shaolin.sendAlliance("少林沒有殺害武當和峨眉弟子");
	}
}
