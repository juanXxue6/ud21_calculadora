package com.calculadoras.ejercicio.UD21_JUNIT;

public class Operaciones {

	private int id;

	
	public Operaciones() {
		
	}
	
	
	
	public int calculo(int a, int b) {
		
		switch (id) {
		case 1:
			return suma(a,b);
		case 2:
			return resta(a, b);
		case 3:
			return multiplicacion(a, b);
		case 4:
			return division(a, b);
		default:
			return 0;
		}
		
	}
	
	
	
	public int suma(int a, int b) {
		return a+b;
	}
	
	public int resta(int a, int b) {
		return a-b;
	}
	
	public int multiplicacion(int a, int b) {
		return a*b;
	}
	
	public int division(int a, int b) {
		return a/b;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	

}
