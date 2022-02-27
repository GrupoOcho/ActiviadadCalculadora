package PruebasClasesCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CalculadoraClases.Suma;

class SumaTest {

	/**
	 * Este m�todo se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este m�todo se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase suma");
	}
	
	/**
	 * Este m�todo se ejecuta despu�s de todos los test.
	 */
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este m�todo se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase suma");
	}

	/**
	 * Este m�todo se ejecuta antes de cada test.
	 */
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Se ejecuta ANTES de cada test");

	}

	/**
	 * Este m�todo se ejecuta despu�s de cada test.
	 */
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Se ejecuta DESPU�S de cada test");

	}
	
	/*
	 * Pruebas para el primer m�todo.
	 * 
	 * Probaremos si la suma (float, float) es correcta.
	 * Adem�s, probaremos si salta 0, cuando incumplimos alguno de los criterios.
	 * 
	 */
	
	/*
	 * Prueba 1: Si el primer par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */

	@Test
	void testSumaFloatFloat_KO1() {
		
		System.out.println(" Prueba 1: ");
		System.out.println(" Si el 1 par�metro es negativo, no debe realizar la operaci�n ");
		
		
		Suma suma = new Suma();
		float resultado_esperado = 0;
		float resultadoReal = suma.Suma(-8, 10);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 2: Si el segundo par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	
	@Test
	void testSumaFloatFloat_KO2() {
		
		System.out.println(" Prueba 2: ");
		System.out.println(" Si el 2 par�metro es negativo, no debe realizar la operaci�n ");
		
		Suma suma = new Suma();
		float resultado_esperado = 0;
		float resultadoReal = suma.Suma(8,-12);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 3: Si los dos par�metros son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaFloatFloat_KO3() {
		
		System.out.println(" Prueba 3: ");
		System.out.println(" Si los dos par�metros son negativos, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		float resultado_esperado = 0;
		float resultadoReal = suma.Suma(-8,-12);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 4: Si los dos par�metros son positivos, debe realizar la operaci�n
	 * Realizar� la suma correctamente
	 * 
	 */
	
	@Test
	void testSumaFloatFloat_OK4() {
		
		System.out.println(" Prueba 4: ");
		System.out.println(" Si los dos par�metros son positivos, debe realizar la operaci�n");
		
		Suma suma = new Suma();
		float resultado_esperado = 20;
		float resultadoReal = suma.Suma(8,12);
		assertEquals(resultado_esperado, resultadoReal,0);
	}


	/*
	 * Pruebas para el segundo m�todo.
	 * 
	 * Probaremos si la suma (int, int) es correcta.
	 * Adem�s, probaremos si salta 0, cuando incumplimos alguno de los criterios.
	 * 
	 */
	
	/*
	 * Prueba 5: Si el segundo par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaIntInt_KO5() {
		
		System.out.println(" Prueba 5: ");
		System.out.println(" Si el segundo par�metro es negativo, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		int resultado_esperado = 0;
		int resultadoReal = suma.Suma(7, -6);
		assertEquals( resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 6: Si el primer par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaIntInt_KO6() {
		
		System.out.println(" Prueba 6: ");
		System.out.println(" Si el primer par�metro es negativo, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		int resultado_esperado = 0;
		int resultadoReal = suma.Suma(-9, 4);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 7: Si los dos par�metros son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaIntInt_KO7() {
		
		System.out.println(" Prueba 7: ");
		System.out.println("Si los dos par�metros son negativos, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		int resultado_esperado = 0;
		int resultadoReal = suma.Suma(-9, -4);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 8: Si los dos par�metros son positivos,  debe realizar la operaci�n
	 * Realiza la suma correctamente
	 * 
	 */
	
	@Test
	void testSumaIntInt_OK8() {
		
		System.out.println(" Prueba 8: ");
		System.out.println("Si los dos par�metros son positivos, debe realizar la operaci�n");
		
		Suma suma = new Suma();
		int resultado_esperado = 13;
		int resultadoReal = suma.Suma(9, 4);
		assertEquals(resultado_esperado, resultadoReal,0);
	}
	
	/*
	 * Pruebas para el tercer m�todo.
	 * 
	 * Probaremos si la suma (float, float, float) es correcta.
	 * Adem�s, probaremos si salta 0, cuando incumplimos alguno de los criterios.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	/*
	 * Prueba 9: Si el primer par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaFloatFloatFloat_KO9() {
		
		System.out.println(" Prueba 9: ");
		System.out.println("Si el primer par�metro es negativo, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		float resultado_esperado = 0;
		float resultadoReal = suma.Suma(-8, 10, 20);
		assertEquals( resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 10: Si el segundo par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaFloatFloatFloat_KO10() {
		
		System.out.println(" Prueba 10: ");
		System.out.println("Si el segundo par�metro es negativo, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		float resultado_esperado = 0;
		float resultadoReal = suma.Suma(8, -10, 20);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 11: Si el tercer par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaFloatFloatFloat_KO11() {
		
		System.out.println(" Prueba 11: ");
		System.out.println("Si el tercer par�metro es negativo, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		float resultado_esperado = 0;
		float resultadoReal = suma.Suma(8, 10, -20);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 12: Si el primer y segundo par�metro son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaFloatFloatFloat_KO12() {
		
		System.out.println(" Prueba 12: ");
		System.out.println("Si el primer y segundo par�metro son negativos, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		float resultado_esperado = 0;
		float resultadoReal = suma.Suma(-8, -10, 20);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 13: Si el tercer y segundo par�metro son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaFloatFloatFloat_KO13() {
		
		System.out.println(" Prueba 13: ");
		System.out.println("Si el tercer y segundo par�metro son negativos, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		float resultado_esperado = 0;
		float resultadoReal = suma.Suma(8, -10, -20);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 14: Si todos los par�metros son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testSumaFloatFloatFloat_KO14() {
		
		System.out.println(" Prueba 14: ");
		System.out.println("Si todos los par�metros son negativos, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		float resultado_esperado = 0;
		float resultadoReal = suma.Suma(-8, -10, -20);
		assertEquals( resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Prueba 15: Si todos los par�metros son positivos, debe realizar la operaci�n
	 * Realiza correctamente la operaci�n.
	 * 
	 */
	
	@Test
	void testSumaFloatFloatFloat_OK15() {
		
		System.out.println(" Prueba 15: ");
		System.out.println("Si todos los par�metros son positivos, debe realizar la operaci�n");
		
		Suma suma = new Suma();
		float resultado_esperado = 38;
		float resultadoReal = suma.Suma(8, 10, 20);
		assertEquals(resultado_esperado, resultadoReal, 0);
	}
	
	/*
	 * Pruebas para el cuarto m�todo.
	 * 
	 * Probaremos si la acumulado (double) es correcta.
	 * Comprobar que si acumulamos valores positivos, realiza la operaci�n
	 * Si es negativo, no realizar� la operaci�n y devolver� 0
	 * 
	 */
	
	/*
	 * Prueba 16: Comprobar que acumula n�meros positivos, debe realizar la operaci�n.
	 * Realiza la operaci�n
	 * 
	 */

	@Test
	void testSumaAcumulado_OK16() {
		
		System.out.println(" Prueba 16: ");
		System.out.println("Si todos los par�metros son positivos, debe realizar la operaci�n");
		
		Suma suma = new Suma();
		int resultado_esperado = 10;
		int resultado_real = suma.SumaAcumulado(10);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	

	/*
	 * Prueba 17: Comprobar que si acumula n�meros negativos, no debe realizar la operaci�n.
	 * Si es negativo, no realizar� la operaci�n y devolver� 0
	 * 
	 */
	
	@Test
	void testSumaAcumulado_KO17() {
		
		System.out.println(" Prueba 17: ");
		System.out.println("Si el par�metro es negativo, no debe realizar la operaci�n");
		
		Suma suma = new Suma();
		int resultado_esperado = 0;
		int resultado_real = suma.SumaAcumulado(-10);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	

}
