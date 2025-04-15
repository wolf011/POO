package org.serratec.aula;

public class Atleta {
	private String name;
	private Double height;
	
	
	public Atleta(String name, Double height) {
		super();
		this.name = name;
		this.height = height;
	}


	@Override
	public String toString() {
		return "Atleta = " + name + ", hight = " + height;
	}


	public String getName() {
		return name;
	}


	public Double getHeight() {
		return height;
	}
	
	
	
}
