package PruebasClasesCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CalculadoraClases.Producto;

class ProductoTest {

	/**
	 * Este m�todo se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este m�todo se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase producto");
	}
	
	/**
	 * Este m�todo se ejecuta despu�s de todos los test.
	 */
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este m�todo se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase producto");
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
	 * Probaremos si el producto(double, double) es correcta.
	 * Comprobar que si los valores son positivos, realiza la operaci�n
	 * Si es negativo, no realizar� la operaci�n y devolver� 0
	 * 
	 */
	
	/*
	 * Prueba 1: Si los dos par�metros son positivos, debe realizar la operaci�n
	 * Realiza la operaci�n correctamente
	 * 
	 */

	@Test
	void testMultiplicarDoubleDouble_OK1() {
		
		System.out.println(" Prueba 1: ");
		System.out.println("Si los dos par�metros son positivos, debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 4;
		double resultado_real = producto.multiplicar(2, 2);
		assertEquals(resultado_esperado, resultado_real);
	}
	

	/*
	 * Prueba 2: Si el primer par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	

	@Test
	void testMultiplicarDoubleDouble_KO2() {
		
		System.out.println(" Prueba 2: ");
		System.out.println("Si el primer par�metro es negativo, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-2, 2);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 3: Si el segundo par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	

	@Test
	void testMultiplicarDoubleDouble_KO3() {
		
		System.out.println(" Prueba 3: ");
		System.out.println("Si el segundo par�metro es negativo, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(2, -2);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 4: Si los dos par�etros son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDouble_KO4() {
		
		System.out.println(" Prueba 4: ");
		System.out.println("Si el segundo par�metro es negativo, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-2, -2);
		assertEquals(resultado_esperado, resultado_real);
	}
	

	/*
	 * Pruebas para el segundo m�todo.
	 * 
	 * Probaremos si el producto(int, int) es correcta.
	 * Comprobar que si los valores son positivos, realiza la operaci�n
	 * Si es negativo, no realizar� la operaci�n y devolver� 0
	 * 
	 */
	
	/*
	 * Prueba 5: Si los dos par�metros son positivos, debe realizar la operaci�n
	 * Realiza la operaci�n correctamente
	 * 
	 */

	@Test
	void testMultiplicarIntInt_OK5() {
		
		System.out.println(" Prueba 5: ");
		System.out.println("Si los dos par�metros son positivos, debe realizar la operaci�n");
		
		Producto producto = new Producto();
		int resultado_esperado = 56;
		int resultado_real = producto.multiplicar(8, 7);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 6: Si el primer par�metro es negativo, no debe realizar la operaci�n
	 *El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarIntInt_KO6() {
		
		System.out.println(" Prueba 6: ");
		System.out.println("Si el primer par�metro es negativo, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.multiplicar(-8, 7);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 7: Si el segundo par�metro es negativo, no debe realizar la operaci�n
	 *El resultado ser� 0.
	 *La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarIntInt_KO7() {
		
		System.out.println(" Prueba 7: ");
		System.out.println("Si el segundo par�metro es negativo, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.multiplicar(8, -7);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 8: Si los dos par�metros son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarIntInt_KO8() {
		
		System.out.println(" Prueba 8: ");
		System.out.println("Si los dos par�metros son negativos, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.multiplicar(-8, -7);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Pruebas para el tercer m�todo.
	 * 
	 * Probaremos si el producto(double, double, double) es correcta.
	 * Comprobar que si los valores son positivos, realiza la operaci�n
	 * Si es negativo, no realizar� la operaci�n y devolver� 0
	 * 
	 */
	
	/*
	 * Prueba 9: Si los dos par�metros son positivos, debe realizar la operaci�n
	 * Realiza correctamente la operaci�n.
	 * 
	 */

	@Test
	void testMultiplicarDoubleDoubleDouble_OK9() {
		
		System.out.println(" Prueba 9: ");
		System.out.println("Si los dos par�metros son positivos, debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 64;
		double resultado_real = producto.multiplicar(4, 4, 4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 10: Si el primer par�metro es negativo, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO10() {
		
		System.out.println(" Prueba 10: ");
		System.out.println("Si los dos par�metros son positivos, debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-4, 4, 4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 11: Si el primer  y segundo par�metro son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO11() {
		
		System.out.println(" Prueba 11: ");
		System.out.println("Si el primer  y segundo par�metro son negativos, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-4, -4, 4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 12: Si los tres par�metros son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO12() {

		System.out.println(" Prueba 12: ");
		System.out.println("Si los tres par�metros son negativos, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-4, -4, -4);
		assertEquals(resultado_esperado, resultado_real,0);
	}
	
	/*
	 * Prueba 13: Si el primer y tercer par�metro son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO13() {
		
		System.out.println(" Prueba 13: ");
		System.out.println("Si el primer y tercer par�metro son negativos, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-4, 4, -4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 14: Si el segundo y tercer par�metro son negativos, no debe realizar la operaci�n
	 * El resultado ser� 0.
	 * La calculadora no puede recibir ni dar como resultado n�meros negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO14() {
		
		System.out.println(" Prueba 14: ");
		System.out.println("Si el primer y tercer par�metro son negativos, no debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(4, -4, -4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Pruebas para el cuarto m�todo.
	 * 
	 * Probaremos si la potencia(int, int) es correcta.
	 * Comprobar que si los valores son positivos, realiza la operaci�n
	 * Si es negativo, no realizar� la operaci�n y devolver� 0
	 * 
	 */
	

	/*
	 * Prueba 15: Si los dos par�metros son positivos, debe realizar la operaci�n
	 * 
	 */
	
	@Test
	void testPotencia_OK15() {
		
		System.out.println(" Prueba 15: ");
		System.out.println("Si los dos par�metros son positivos, debe realizar la operaci�n");
		
		Producto producto = new Producto();
		double resultado_esperado = 25;
		double resultado_real = producto.potencia(5, 2);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 16: Si el segundo par�metro es 1, el resultado ser� igual al primer par�metro
	 * 
	 */
	
	
	@Test
	void testPotencia_OK16() {
		
		System.out.println(" Prueba 16: ");
		System.out.println("Si el segundo par�metro es 1, el resultado ser� igual al primer par�metro");
		
		Producto producto = new Producto();
		double resultado_esperado = 5;
		double resultado_real = producto.potencia(5, 1);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 17: Si el segundo par�metro es 1 y el segundo igual a 0, dar� 0
	 * 
	 */
	
	@Test
	void testPotencia_OK17() {
		
		System.out.println(" Prueba 17: ");
		System.out.println("Si el segundo par�metro es 1 y el segundo igual a 0, dar� 0");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.potencia(0, 1);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 18: Si el segundo par�metro es 0 y el primero positivo, dar� 1
	 * 
	 */
	
	@Test
	void testPotencia_OK18() {
		
		System.out.println(" Prueba 18: ");
		System.out.println("Si el segundo par�metro es  y el segundo positivo, dar� 1");
		
		Producto producto = new Producto();
		double resultado_esperado = 1;
		double resultado_real = producto.potencia(7, 0);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 19: Si el segundo par�metro es negativo y el primero positivo, dar� 1
	 * 
	 */
	
	
	@Test
	void testPotencia_KO19() {
		
		System.out.println(" Prueba 19: ");
		System.out.println("Si el segundo par�metro es negativo, no realizar� la operaci�n");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.potencia(5, -3);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 20: Si el primer par�metro es negativo y el segundo positivo, dar� 1
	 * 
	 */
	
	
	@Test
	void testPotencia_KO20() {
		
		System.out.println(" Prueba 20: ");
		System.out.println("Si el primer par�metro es negativo, no realizar� la operaci�n");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.potencia(-5, 1);
		assertEquals(resultado_esperado, resultado_real);
	}
}
