package com.calculadoras.ejercicio.UD21_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class operacionesTest {

	Operaciones test = new Operaciones();
	
	@Test
	public void suma() {
		int result = test.suma(10,2);
		int expected = 12;
		assertEquals(expected, result);	
	}
	
	@Test
	public void resta() {
		int result = test.resta(9,3);
		int expected = 6;
		assertEquals(expected, result);	
	}
	
	@Test
	public void multiplicacion() {
		int result = test.multiplicacion(4,20);
		int expected = 80;
		assertEquals(expected, result);	
	}
	
	@Test
	public void division() {
		int result = test.division(25,5);
		int expected = 5;
		assertEquals(expected, result);	
	}
	
	@Test
	public void GettterSetterId() {

		for (int i = 1; i < 5; i++) {
			
			test.setId(i);
				int expected = test.calculo(10,2);
				int result = i;
				System.out.println("ID: " + expected);

		}

	}
	


}
