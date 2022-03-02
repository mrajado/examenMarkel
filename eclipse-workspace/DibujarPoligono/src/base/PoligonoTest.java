package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PoligonoTest {

	@Test
	void calcularPerimetro() {
		int lados=10;
		double perimetro=lados;
		assertEquals(perimetro, 60);
	}
	
	/*
	 * 
	 * 	
	@ParameterizedTest
	@ValueSource(ints = { 10 })
	void test1(int argument) {
	    assertEquals(Poligono.calcularPerimetro(argument)=60);;
	    
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 20 })
	void test2(int argument) {
	    assertEquals(Poligono.calcularPerimetro(argument)=120);;
	    
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 30 })
	void test3(int argument) {
	    assertEquals(Poligono.calcularPerimetro(argument)=180);;
	    
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 40 })
	void test4(int argument) {
	    assertEquals(Poligono.calcularPerimetro(argument)=240);;
	    
	}*/



}
