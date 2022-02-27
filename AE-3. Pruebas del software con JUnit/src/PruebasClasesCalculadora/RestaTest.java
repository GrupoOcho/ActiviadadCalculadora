package PruebasClasesCalculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CalculadoraClases.Resta;

class RestaTest {

	/**
	 * Este método se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este método se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase resta");
	}
	
	/**
	 * Este método se ejecuta después de todos los test.
	 */
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este método se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase resta");
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
	 * Probaremos si la resta (double, double) es correcta.
	 * Además, probaremos si salta 0, cuando incumplimos alguno de los criterios.
	 * 
	 */

	/*
	 * Prueba 1: Al restar un número mayor que el primer parámetro no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble_incorrecto1() {
		
		System.out.println(" Prueba 1: ");
		System.out.println(" Si el 1 parámetro, es mayor que el 1, nos debe devolver 0 ");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(8, 12);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 2: Si pasamos como negativo el primer parámetro, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble_incorrecto2() {
		
		System.out.println(" Prueba 2: ");
		System.out.println(" Si el 1 parámetro es negativo, nos debe devolver 0 ");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(-8, 12);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 3: Si pasamos como negativo el segundo parámetro, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble_incorrecto3() {
		
		System.out.println(" Prueba 3: ");
		System.out.println(" Si el 2 parámetro es negativo, nos debe devolver 0 ");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(8, -12);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 4: Si pasamos como negativo los dos parámetros, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble_incorrecto4() {
		
		System.out.println(" Prueba 4: ");
		System.out.println(" Si los dos parámetros son negativos, nos debe devolver 0 ");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(-8, -12);
		assertEquals(resultado_esperado, resultado_real, 0);
	}

	/*
	 * Prueba 5: Si el primer parámetro es mayor que el segundo parámetro, debe realizar la operación.
	 * Realiza las operaciones correctas.
	 * 
	 */
	
	@Test
	void testRestaDouble_correcto() {
		
		System.out.println(" Prueba 5: ");
		System.out.println(" Si el primer parámetro es mayor que el segundo parámetro, debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 8;
		double resultado_real = resta.Resta(16, 8);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	
	/*
	 * Pruebas para el segundo método.
	 * 
	 * Probaremos si la resta (int, int) es correcta.
	 * Además, probaremos si salta 0, cuando incumplimos alguno de los criterios.
	 * 
	 */
	
	/*
	 * Prueba 6: Si el primer parámetro es mayor que el segundo parámetro, debe realizar la operación.
	 * Realiza las operaciones correctas.
	 * 
	 */
	
	@Test
	void testRestaInt_correcto() {
		
		System.out.println(" Prueba 6: ");
		System.out.println(" Si el primer parámetro es mayor que el segundo parámetro, debe realizar la operación");
		
		Resta resta = new Resta();
		int resultado_esperado = 8;
		assertEquals(resultado_esperado, resta.Resta(16, 8));
	}
	
	/*
	 * Prueba 7: Al restar un número mayor que el primer parámetro no debe realizar la operación
	 * El resultado será 0.
	 * 
	 */
	
	@Test
	void testRestaInt_incorrecto7() {
		
		System.out.println(" Prueba 7: ");
		System.out.println(" Si el segundo parámetro es mayor que el primer parámetro, no debe realizar la operación");
		
		Resta resta = new Resta();
		int resultado_esperado = 0;
		int resultado_real = resta.Resta(8, 20);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 8: Si pasamos como negativo el primer parámetro, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaInt_incorrecto8() {
		
		System.out.println(" Prueba 8: ");
		System.out.println(" Si el primer parámetro es negativo, no debe realizar la operación");
		
		Resta resta = new Resta();
		int resultado_esperado = 0;
		int resultado_real = resta.Resta(-8, 4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 9: Si pasamos como negativo el segundo parámetro, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaInt_incorrecto9() {
		
		System.out.println(" Prueba 9: ");
		System.out.println(" Si el segundo parámetro es negativo, no debe realizar la operación");
		
		Resta resta = new Resta();
		int resultado_esperado = 0;
		int resultado_real = resta.Resta(8, -4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 10: Si pasamos como negativo los dos parámetros, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaInt_incorrecto10() {
		
		System.out.println(" Prueba 10: ");
		System.out.println(" Si los dos parámetros son negativos, no debe realizar la operación");
		
		Resta resta = new Resta();
		int resultado_esperado = 0;
		int resultado_real = resta.Resta(-8, -4);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Pruebas para el tercer método.
	 * 
	 * Probaremos si la resta (double, double, double) es correcta.
	 * Además, probaremos si salta 0, cuando incumplimos alguno de los criterios.
	 * 
	 */
	
	/*
	 * Prueba 11: Si el primer parámetro es mayor que los otros dos, debe realizar la operación.
	 * Realizará la operación de manera correcta.
	 * 
	 */
	
	@Test
	void testRestaDouble3_correcto11() {
		
		System.out.println(" Prueba 11: ");
		System.out.println(" Si el primer parámetro es mayor que los otros dos, debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 8.0;
		double resultado_real = resta.Resta(20, 8, 4);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	

	/*
	 * Prueba 12: Si pasamos como negativo el primer parámetro, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble3_incorrecto12() {
		
		System.out.println(" Prueba 12: ");
		System.out.println(" Si el primer parámetro es negativo, no debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(-20, 10, 2);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 13: Si pasamos como negativo el segundo parámetro, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble3_incorrecto13() {
		
		System.out.println(" Prueba 13: ");
		System.out.println(" Si el segundo parámetro es negativo, no debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(20, -10, 2);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 14: Si pasamos como negativo el tercer parámetro, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble3_incorrecto14() {
		
		System.out.println(" Prueba 14: ");
		System.out.println(" Si el tercer parámetro es negativo, no debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(20, 10, -2);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 15: Si pasamos los 3 parámetros como negativos, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble3_incorrecto15() {
		
		System.out.println(" Prueba 15: ");
		System.out.println(" Si pasamos los 3 parámetros como negativos, no debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(-20, -10, -2);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 16: Si la suma el 2 y tercer parámetro mayor que el primero, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble3_incorrecto16() {
		
		System.out.println(" Prueba 16: ");
		System.out.println(" Si el primer parámetro es menor que la suma del 2 y 3, no debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(20, 10, 11);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 17: Si el primer y tercer parámetro son negativos, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble3_incorrecto17() {
		
		System.out.println(" Prueba 17: ");
		System.out.println(" Si el primer y tercer parámetro son negativos, no debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(-20, 20,- 2);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 18: Si el segundo y tercer parámetro son negativos, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble3_incorrecto18() {
		
		System.out.println(" Prueba 18: ");
		System.out.println(" Si el segundo y tercer parámetro son negativos, no debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(20, -20,- 2);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Prueba 19: Si el primer y segundo parámetro son negativos, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaDouble3_incorrecto19() {
		
		System.out.println(" Prueba 19: ");
		System.out.println(" Si el primer y segundo parámetro son negativos, no debe realizar la operación");
		
		Resta resta = new Resta();
		double resultado_esperado = 0;
		double resultado_real = resta.Resta(-20, -20, 2);
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	/*
	 * Pruebas para el cuarto método.
	 * 
	 * Probaremos si la resta (double, double) es correcta.
	 * Además, probaremos si salta 0, cuando incumplimos alguno de los criterios.
	 * 
	 */
	
	
	/*
	 * Prueba 20: Comprobar que acumula números positivos, debe realizar la operación.
	 * Realiza la operación
	 * 
	 */
	
	@Test
	void testRestaAcumulado_ok20() {
		
		System.out.println(" Prueba 20: ");
		System.out.println(" Si acumula positivos, debe realizar la operación");
		
		Resta resta = new Resta();
		int resultado_esperado = 8;
		int resultado_acum = resta.restaAcumulado(8);
		
		assertEquals(resultado_esperado, resultado_acum);
	}
	
	/*
	 * Prueba 21: Comprobar que si acumula un negativo, no debe realizar la operación.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testRestaAcumulado_ko21() {
		
		System.out.println(" Prueba 21: ");
		System.out.println(" Si acumula negativos, no debe realizar la operación");
		
		
		Resta resta = new Resta();
		int resultado_esperado = 0;
		int resultado_acum = resta.restaAcumulado(-20);
		
		assertEquals(resultado_esperado, resta.getAcumulado());
	}

}
