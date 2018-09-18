package com.design.bridge;

public abstract class Birdge {
  private Source source;
  
 public void source() {
	 source.source();
 }

public Source getSource() {
	return source;
}

public void setSource(Source source) {
	this.source = source;
}
  
  
}
