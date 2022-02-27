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
	 * Este método se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este método se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase producto");
	}
	
	/**
	 * Este método se ejecuta después de todos los test.
	 */
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este método se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase producto");
	}

	/**
	 * Este método se ejecuta antes de cada test.
	 */
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Se ejecuta ANTES de cada test");

	}

	/**
	 * Este método se ejecuta después de cada test.
	 */
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Se ejecuta DESPUÉS de cada test");

	}
	
	/*
	 * Pruebas para el primer método.
	 * 
	 * Probaremos si el producto(double, double) es correcta.
	 * Comprobar que si los valores son positivos, realiza la operación
	 * Si es negativo, no realizará la operación y devolverá 0
	 * 
	 */
	
	/*
	 * Prueba 1: Si los dos parámetros son positivos, debe realizar la operación
	 * Realiza la operación correctamente
	 * 
	 */

	@Test
	void testMultiplicarDoubleDouble_OK1() {
		
		System.out.println(" Prueba 1: ");
		System.out.println("Si los dos parámetros son positivos, debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 4;
		double resultado_real = producto.multiplicar(2, 2);
		assertEquals(resultado_esperado, resultado_real);
	}
	

	/*
	 * Prueba 2: Si el primer parámetro es negativo, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	

	@Test
	void testMultiplicarDoubleDouble_KO2() {
		
		System.out.println(" Prueba 2: ");
		System.out.println("Si el primer parámetro es negativo, no debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-2, 2);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 3: Si el segundo parámetro es negativo, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	

	@Test
	void testMultiplicarDoubleDouble_KO3() {
		
		System.out.println(" Prueba 3: ");
		System.out.println("Si el segundo parámetro es negativo, no debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(2, -2);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 4: Si los dos paráetros son negativos, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDouble_KO4() {
		
		System.out.println(" Prueba 4: ");
		System.out.println("Si el segundo parámetro es negativo, no debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-2, -2);
		assertEquals(resultado_esperado, resultado_real);
	}
	

	/*
	 * Pruebas para el segundo método.
	 * 
	 * Probaremos si el producto(int, int) es correcta.
	 * Comprobar que si los valores son positivos, realiza la operación
	 * Si es negativo, no realizará la operación y devolverá 0
	 * 
	 */
	
	/*
	 * Prueba 5: Si los dos parámetros son positivos, debe realizar la operación
	 * Realiza la operación correctamente
	 * 
	 */

	@Test
	void testMultiplicarIntInt_OK5() {
		
		System.out.println(" Prueba 5: ");
		System.out.println("Si los dos parámetros son positivos, debe realizar la operación");
		
		Producto producto = new Producto();
		int resultado_esperado = 56;
		int resultado_real = producto.multiplicar(8, 7);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 6: Si el primer parámetro es negativo, no debe realizar la operación
	 *El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarIntInt_KO6() {
		
		System.out.println(" Prueba 6: ");
		System.out.println("Si el primer parámetro es negativo, no debe realizar la operación");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.multiplicar(-8, 7);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 7: Si el segundo parámetro es negativo, no debe realizar la operación
	 *El resultado será 0.
	 *La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarIntInt_KO7() {
		
		System.out.println(" Prueba 7: ");
		System.out.println("Si el segundo parámetro es negativo, no debe realizar la operación");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.multiplicar(8, -7);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 8: Si los dos parámetros son negativos, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarIntInt_KO8() {
		
		System.out.println(" Prueba 8: ");
		System.out.println("Si los dos parámetros son negativos, no debe realizar la operación");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.multiplicar(-8, -7);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Pruebas para el tercer método.
	 * 
	 * Probaremos si el producto(double, double, double) es correcta.
	 * Comprobar que si los valores son positivos, realiza la operación
	 * Si es negativo, no realizará la operación y devolverá 0
	 * 
	 */
	
	/*
	 * Prueba 9: Si los dos parámetros son positivos, debe realizar la operación
	 * Realiza correctamente la operación.
	 * 
	 */

	@Test
	void testMultiplicarDoubleDoubleDouble_OK9() {
		
		System.out.println(" Prueba 9: ");
		System.out.println("Si los dos parámetros son positivos, debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 64;
		double resultado_real = producto.multiplicar(4, 4, 4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 10: Si el primer parámetro es negativo, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO10() {
		
		System.out.println(" Prueba 10: ");
		System.out.println("Si los dos parámetros son positivos, debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-4, 4, 4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 11: Si el primer  y segundo parámetro son negativos, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO11() {
		
		System.out.println(" Prueba 11: ");
		System.out.println("Si el primer  y segundo parámetro son negativos, no debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-4, -4, 4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 12: Si los tres parámetros son negativos, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO12() {

		System.out.println(" Prueba 12: ");
		System.out.println("Si los tres parámetros son negativos, no debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-4, -4, -4);
		assertEquals(resultado_esperado, resultado_real,0);
	}
	
	/*
	 * Prueba 13: Si el primer y tercer parámetro son negativos, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO13() {
		
		System.out.println(" Prueba 13: ");
		System.out.println("Si el primer y tercer parámetro son negativos, no debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(-4, 4, -4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 14: Si el segundo y tercer parámetro son negativos, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDouble_KO14() {
		
		System.out.println(" Prueba 14: ");
		System.out.println("Si el primer y tercer parámetro son negativos, no debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.multiplicar(4, -4, -4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Pruebas para el cuarto método.
	 * 
	 * Probaremos si la potencia(int, int) es correcta.
	 * Comprobar que si los valores son positivos, realiza la operación
	 * Si es negativo, no realizará la operación y devolverá 0
	 * 
	 */
	

	/*
	 * Prueba 15: Si los dos parámetros son positivos, debe realizar la operación
	 * 
	 */
	
	@Test
	void testPotencia_OK15() {
		
		System.out.println(" Prueba 15: ");
		System.out.println("Si los dos parámetros son positivos, debe realizar la operación");
		
		Producto producto = new Producto();
		double resultado_esperado = 25;
		double resultado_real = producto.potencia(5, 2);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 16: Si el segundo parámetro es 1, el resultado será igual al primer parámetro
	 * 
	 */
	
	
	@Test
	void testPotencia_OK16() {
		
		System.out.println(" Prueba 16: ");
		System.out.println("Si el segundo parámetro es 1, el resultado será igual al primer parámetro");
		
		Producto producto = new Producto();
		double resultado_esperado = 5;
		double resultado_real = producto.potencia(5, 1);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 17: Si el segundo parámetro es 1 y el segundo igual a 0, dará 0
	 * 
	 */
	
	@Test
	void testPotencia_OK17() {
		
		System.out.println(" Prueba 17: ");
		System.out.println("Si el segundo parámetro es 1 y el segundo igual a 0, dará 0");
		
		Producto producto = new Producto();
		double resultado_esperado = 0;
		double resultado_real = producto.potencia(0, 1);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 18: Si el segundo parámetro es 0 y el primero positivo, dará 1
	 * 
	 */
	
	@Test
	void testPotencia_OK18() {
		
		System.out.println(" Prueba 18: ");
		System.out.println("Si el segundo parámetro es  y el segundo positivo, dará 1");
		
		Producto producto = new Producto();
		double resultado_esperado = 1;
		double resultado_real = producto.potencia(7, 0);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 19: Si el segundo parámetro es negativo y el primero positivo, dará 1
	 * 
	 */
	
	
	@Test
	void testPotencia_KO19() {
		
		System.out.println(" Prueba 19: ");
		System.out.println("Si el segundo parámetro es negativo, no realizará la operación");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.potencia(5, -3);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 20: Si el primer parámetro es negativo y el segundo positivo, dará 1
	 * 
	 */
	
	
	@Test
	void testPotencia_KO20() {
		
		System.out.println(" Prueba 20: ");
		System.out.println("Si el primer parámetro es negativo, no realizará la operación");
		
		Producto producto = new Producto();
		int resultado_esperado = 0;
		int resultado_real = producto.potencia(-5, 1);
		assertEquals(resultado_esperado, resultado_real);
	}
}
