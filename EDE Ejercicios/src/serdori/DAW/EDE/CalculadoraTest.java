package serdori.DAW.EDE;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class CalculadoraTest {
	
	Calculadora calc;
	/*Siempre se ejecuta antes de cada test se tiene q importar*/
	@Before
	public void antesDelTest(){
		calc = new Calculadora();
		System.out.println("Reiniciado de calculadora...");
	}
	
	@Test
	public void sumarTest(){
		float resultado = calc.sumar(2, 4);
		System.out.println("2 + 4 = " + resultado);
		assertEquals("Método sumarTest", 6, resultado, 0);
	}
	@Test
	public void restarTest(){
		float resultado = calc.restar(4, 1);
		System.out.println("4 - 1 = " + resultado);
		assertEquals("Metodo restartTest", 3.0, resultado, 0);
	}
	@Test
	public void multiplicarTest(){
		float resultado = calc.multiplicar(5, 2);
		System.out.println("5 * 2 = " + resultado);
		assertEquals("Metodo restartTest", 10, resultado, 0);
	}
	@Test
	public void dividirTest(){
		float resultado = calc.dividir(20, 4);
		System.out.println("4 / 1 = " + resultado);
		assertEquals("Metodo dividirTest", 5, resultado, 0);
	}
	
	}

