package PruebasClasesCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CalculadoraClases.Cociente;

class CocienteTest {

	/**
	 * Este método se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este método se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase cociente");
	}
	
	/**
	 * Este método se ejecuta después de todos los test.
	 */
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este método se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase cociente");
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
	 * Probaremos si el cociente(double, double) es correcta.
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
	void testCocienteDoubleDouble_ok1() {
		
		System.out.println(" Prueba 1: ");
		System.out.println("Si los dos parámetros son positivos, debe realizar la operación");
		
		Cociente cociente = new Cociente();
		double resultado_esperado = 4;
		double resultado_real = cociente.cociente(8, 2);
		assertEquals(resultado_esperado, resultado_real);
	}

	
	/*
	 * Prueba 2: Si el primer parámetro es negativo, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	
	@Test
	void testCocienteDoubleDouble_ko2() {
		
		System.out.println(" Prueba 2: ");
		System.out.println("Si el primer parámetro es negativo, no debe realizar la operación");
		
		Cociente cociente = new Cociente();
		double resultado_esperado = 0;
		double resultado_real = cociente.cociente(-8, 2);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 3: Si el segundo parámetro es negativo, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testCocienteDoubleDouble_ko3() {
		
		System.out.println(" Prueba 3: ");
		System.out.println("Si el segundo parámetro es negativo, no debe realizar la operación");
		
		Cociente cociente = new Cociente();
		double resultado_esperado = 0;
		double resultado_real = cociente.cociente(8, -2);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 4: Si los dos paráetros son negativos, no debe realizar la operación
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	
	@Test
	void testCocienteDoubleDouble_ko4() {
		
		System.out.println(" Prueba 4: ");
		System.out.println("Si los dos parámetros son negativos, no debe realizar la operación");
		
		Cociente cociente = new Cociente();
		double resultado_esperado = 0;
		double resultado_real = cociente.cociente(-8, -2);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 5: Si el denominador es 0, al no existir devolverá 0.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testCocienteDoubleDouble_ko5() {
		
		System.out.println(" Prueba 5: ");
		System.out.println("Si el denominador es 0, al no existir devolverá 0.");
		
		Cociente cociente = new Cociente();
		double resultado_esperado = 0;
		double resultado_real = cociente.cociente(8, 0);
		assertEquals(resultado_esperado, resultado_real);
	}
	
	/*
	 * Prueba 6: Si el numerador es 0, devolverá 0.
	 * El resultado será 0.
	 * La calculadora no puede recibir ni dar como resultado números negativos.
	 * 
	 */
	
	@Test
	void testCocienteDoubleDouble_ok6() {

		System.out.println(" Prueba 6: ");
		System.out.println("Si el numerador es 0, devolverá 0.");
		
		Cociente cociente = new Cociente();
		double resultado_esperado = 0;
		double resultado_real = cociente.cociente(0, 8);
		assertEquals(resultado_esperado, resultado_real);
	}

	
	/*
	 * Pruebas para el segundo método.
	 * 
	 * Probaremos si el cociente(int, int) es correcta.
	 * Comprobar que si los valores son positivos, realiza la operación
	 * Si es negativo, no realizará la operación y devolverá 0
	 * 
	 */
	
	/*
	 * Prueba 7: Si los dos parámetros son positivos, debe realizar la operación
	 * Realiza la operación correctamente
	 * 
	 */

	
		@Test
		void testCocienteIntInt_ok7() {
			
			System.out.println(" Prueba 7: ");
			System.out.println("Si los dos parámetros son positivos, debe realizar la operación");
			
			Cociente cociente = new Cociente();
			double resultado_esperado = 4;
			double resultado_real = cociente.cociente(8, 2);
			assertEquals(resultado_esperado, resultado_real);
		}
		
		/*
		 * Prueba 8: Si el primer parámetro es negativo, no debe realizar la operación
		 * El resultado será 0.
		 * La calculadora no puede recibir ni dar como resultado números negativos.
		 * 
		 */
		
		@Test
		void testCocienteIntInt_ko8() {
			
			System.out.println(" Prueba 8: ");
			System.out.println("Si el primer parámetro es negativo, no debe realizar la operación");
			
			Cociente cociente = new Cociente();
			double resultado_esperado = 0;
			double resultado_real = cociente.cociente(-8, 2);
			assertEquals(resultado_esperado, resultado_real);
		}
		
		/*
		 * Prueba 9: Si el segundo parámetro es negativo, no debe realizar la operación
		 *El resultado será 0.
		 *La calculadora no puede recibir ni dar como resultado números negativos.
		 * 
		 */
		
		@Test
		void testCocienteIntInt_ko9() {
			
			System.out.println(" Prueba 9: ");
			System.out.println("Si el primer parámetro es negativo, no debe realizar la operación");
			
			Cociente cociente = new Cociente();
			double resultado_esperado = 0;
			double resultado_real = cociente.cociente(8, -2);
			assertEquals(resultado_esperado, resultado_real);
		}
		
		/*
		 * Prueba 10: Si los dos parámetros son negativos, no debe realizar la operación
		 * El resultado será 0.
		 * La calculadora no puede recibir ni dar como resultado números negativos.
		 * 
		 */
		
		@Test
		void testCocienteIntInt_ko10() {
			
			System.out.println(" Prueba 10: ");
			System.out.println("Si el primer parámetro es negativo, no debe realizar la operación");
			
			Cociente cociente = new Cociente();
			double resultado_esperado = 0;
			double resultado_real = cociente.cociente(-8, -2);
			assertEquals(resultado_esperado, resultado_real, 0);
		}
		
		/*
		 * Prueba 11: Si el denominador es 0, al no existir devolverá 0.
		 * El resultado será 0.
		 * La calculadora no puede recibir ni dar como resultado números negativos.
		 * 
		 */
		
		
		@Test
		void testCocienteIntInt_ko11() {
			
			System.out.println(" Prueba 11: ");
			System.out.println("Si el denominador es 0, al no existir devolverá 0.");
			
			Cociente cociente = new Cociente();
			double resultado_esperado = 0;
			double resultado_real = cociente.cociente(8, 0);
			assertEquals(resultado_esperado, resultado_real);
		}
		
		/*
		 * Prueba 11: Si el denominador es 0, al no existir devolverá 0.
		 * El resultado será 0.
		 * La calculadora no puede recibir ni dar como resultado números negativos.
		 * 
		 */
		
		@Test
		void testCocienteIntInt_ok12() {
			
			System.out.println(" Prueba 12: ");
			System.out.println("Si el numerador es 0, al no existir devolverá 0.");
			
			Cociente cociente = new Cociente();
			double resultado_esperado = 0;
			double resultado_real = cociente.cociente(0, 8);
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
		 * Prueba 13: Si los dos parámetros son positivos, realizará correctamente la operacion
		 * Realiza correctamente la operación, al no tener negativos ni denominador 0
		 * 
		 */
		
		@Test
		void testInverso_ok13() {
			

		System.out.println(" Prueba 13: ");
		System.out.println("Si los dos parámetros son positivos, realizará correctamente la operacion y denominador <> 0");
			
		Cociente cociente = new Cociente();
		double resultado_esperado = 1;
		double resultado_real = cociente.inverso(1);
		assertEquals(resultado_esperado, resultado_real);
		}
		
		/*
		 * Prueba 14: Si el parámetro es negativos, no deja realizar la operación
		 * El resultado será 0.
		 * La calculadora no puede recibir ni dar como resultado números negativos.
		 * 
		 */
		
		@Test
		void testInverso_ko14() {
			
		System.out.println(" Prueba 14: ");
		System.out.println("Si los dos parámetros son positivos, realizará correctamente la operacion y denominador <> 0");
				
		Cociente cociente = new Cociente();
		double resultado_esperado = 0;
		double resultado_real = cociente.inverso(-5);
		assertEquals(resultado_esperado, resultado_real,0);
		}
		
		/*
		 * Prueba 15: El denominador no puede ser 0, no deja realizar la operación devuelve 0
		 * El resultado será 0.
		 * La calculadora no puede recibir ni dar como resultado números negativos.
		 * 
		 */
		
		
		
		@Test
		void testInverso_ko15() {
			
		System.out.println(" Prueba 15: ");
		System.out.println("El denominador no puede ser 0, no deja realizar la operación devuelve 0");
				
		Cociente cociente = new Cociente();
		double resultado_esperado = 0;
		double resultado_real = cociente.inverso(0);
		assertEquals(resultado_esperado, resultado_real,0);
		}
		
		/*
		 * Pruebas para el cuarto método.
		 * 
		 * Probaremos si la raíz(double) es correcta.
		 * Comprobar que si los valores son positivos, realiza la operación
		 * Si es negativo, no realizará la operación y devolverá 0
		 * 
		 */
		
		/*
		 * Prueba 16: Si la raíz es positiva realizará la operación
		 * El resultado será 0.
		 * La calculadora no puede recibir ni dar como resultado números negativos.
		 * 
		 */
	

		@Test
		void testRaiz_ok() {
			
		System.out.println(" Prueba 16: ");
		System.out.println("Si la raíz es positiva realizará la operación");
			
		Cociente cociente = new Cociente();
		double resultado_esperado = 3;
		double resultado_real = cociente.raiz(9);
		assertEquals(resultado_esperado, resultado_real);
		}
		
		/*
		 * Prueba 16: Si la raíz es negativa no realizará la operación
		 * El resultado será 0.
		 * La calculadora no puede recibir ni dar como resultado números negativos.
		 * 
		 */
		
		@Test
		void testRaiz_ko() {
		Cociente cociente = new Cociente();
		double resultado_esperado = 0;
		double resultado_real = cociente.raiz(-5);
		assertEquals(resultado_esperado, resultado_real);
		}

}
