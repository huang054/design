package com.design.memento;

public class Bigen {
	private String name;
	
	public Bigen(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		
	}
   // private Save save;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    public Save init() {
    	return new Save(name);
    }
    
    public void reseat(Save save) {
    	name=save.getName();
    }
}
