package CalculadoraClases;
public class Producto {

		/**
		 * Este metodo multiplica dos numeros reales.Casos especiales:
		 * 
		 * Aspectos a tener en cuenta:
		 * 
		 * <ol type=”A”>
		 * <li>Si el primer parametro es Nan y el segundo parametro es numero real resultado es null.</li>
		 * <li>Si el primer parametro es numero real y el segundo parametro es Nan resultado es null.</li>
		 * <li>Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.</li>
		 * <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308, si excede dará un error</li>
		 * <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
		 * <li>Puede recibir otros parámetros distintos a double, como int o float, aunque retornará un double.</li>
		 * <li>No permitirá valores string.</li>
		 *  
		 * @param operando1 representa el primer numero real a multiplicar.
		 * @param operando2 representa el segundo numero real a multiplicar.
		 * 
		 * @return el resultado de la multiplicacion de ambos números reales.
		 * 
		 * @see multiplicar_reales(double, double)
		 */

		public double multiplicar(double operando1, double operando2) {
			double producto = 0;
			if (operando1 >= 0 & operando2 >= 0) {
				producto = operando1 * operando2;
			} else {
				producto = 0;
			}
			
			return producto; // suma los números enteros n1 + n2
	
			
		}

		/**
		 * Este metodo multiplica dos numeros enteros.
		 * 
		 * Aspectos a tener en cuenta:
		 * 
		 * <ol type=”A”>
		 *  <li>Saltará una excepción si el parámetro asignado excede del rango de 32,767 a -32,768. 
		 *  En nuestra claculadora será de 0, el rango inferior al no poer introducir negativos</li>
		 *  <li>No puede recibir otros parámetros con distintos tipos como float, double... dado que saltará una excepción.</li>
		 *  <li>Únicamente para operar con valores enteros.</li>
		 *  <li>No permitirá valores string.</li>
		 *  <li>Aunque la operación de (-) * (-) = (+), al no poderse introducir valores negativos, no operará dichos valores aunque devuelva positivo su producto</li>
		 *  </ol>
		 * 
		 * @param operando1 representa el primer numero entero a multiplicar.
		 * @param operando2 representa el segundo numero entero a multiplicar.
		 * 
		 * @return la multiplicacion de ambos números enteros.
		 * @see multiplicar_enteros(int, int)
		 */

		public int multiplicar(int operando1, int operando2) {
			int producto = 0;
			if (operando1 >= 0 & operando2 >= 0) {
				producto = operando1 * operando2;
			} else {
				producto = 0;
			}
			
			return producto; // suma los números enteros n1 + n2
	
			
		}

	/**
	 * Este metodo multiplica tres numeros reales.
	 * <ol type=”A”>
	 *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308, si excede saltará un error.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
	 *  <li>Puede recibir otros parámetros distintos a double, como int o float, aunque retornará un double.</li>
	 *  <li>No permitirá valores string.</li>
	 *  </ol>
	 * 
	 * @param operando1 representa el primer numero real a multiplicar.
	 * @param operando2 representa el segundo numero real a multiplicar.
	 * @param operando3 representa el tercer numero real a multiplicar.
	 * 
	 * @return el resultado de la multiplicacion de los tres números reales.
	 * @see multiplicar_reales_3(double, double, double)
	 */

		public double multiplicar(double operando1, double operando2, double operando3) {
			double producto = 0;
			if (operando1 >= 0 & operando2 >= 0 & operando3 >= 0) {
				producto = operando1 * operando2 * operando3;
			} else {
				producto = 0;
			}
			
			return producto; // suma los números enteros n1 + n2
	
			
		}

		/**
		 * 
		 * Este metodo devuelve la potencia del operando1 elevado al operando2.
		 
		 * 
		 * @param operando1 representa la base entera.
		 * @param operando2 representa la potencia.
		 * 
		 * 
		 * 
		 * @return el resultado de elevar el operando1 al operando2.
		 * 
		 *  
		 * 
		 *  <li>Devuelve el valor del primer argumento elevado al segundo agumento,Casos especiales: </li>
		 * 
		 *         Si el segundo argumento es cero o negativo, entonces el resultado es
		 *         1.0.
		 * 
		 *         Si el segundo argumento es 1.0, entonces el resultado es el mismo que
		 *         el del primer argumento.
		 * 
		 *         Si el segundo argumento es NaN, entonces el resultado es NaN.
		 * 
		 *         Si el primer argumento es NaN y el segundo argumento es distinto de
		 *         cero, entonces el resultado es NaN.
		 * 
		 *         Si el valor absoluto del primer argumento es mayor que 1 y el segundo
		 *         argumento es infinito positivo, o el valor absoluto del primer
		 *         argumento es menor que 1 y el segundo argumento es infinito negativo,
		 *         entonces el resultado es infinito positivo.
		 * 
		 *         Si el valor absoluto del primer argumento es mayor que 1 y el segundo
		 *         argumento es infinito negativo, o el valor absoluto del primer
		 *         argumento es menor que 1 y el segundo argumento es infinito positivo,
		 *         entonces el resultado es cero positivo.
		 * 
		 *         Si el valor absoluto del primer argumento es igual a 1 y el segundo
		 *         argumento es infinito, entonces el resultado es NaN.
		 * 
		 *         Si el primer argumento es cero y el segundo argumento es mayor que
		 *         cero, o el primer argumento es infinito positivo y el segundo
		 *         argumento es menor que cero,entonces el resultado es cero positivo.
		 * 
		 *         Si el primer argumento es cero positivo y el segundo argumento es
		 *         menor que cero, o el primer argumento es infinito positivo y el
		 *         segundo argumento es mayor que cero,entonces el resultado es infinito
		 *         positivo.
		 * 
		 *         Si el primer argumento es cero negativo y el segundo argumento es
		 *         mayor que cero pero no un entero impar finito, o el primer argumento
		 *         es infinito negativo y el segundo argumento es menor que cero pero no
		 *         un entero impar finito, entonces el resultado es cero positivo.
		 * 
		 *         Si el primer argumento es cero y el segundo argumento es un entero
		 *         impar finito positivo, o el primer argumento es infinito negativo y
		 *         el segundo argumento es un entero impar finito negativo, entonces el
		 *         resultado es cero negativo.
		 * 
		 *         Si el primer argumento es cero y el segundo argumento es menor que
		 *         cero pero no un entero impar finito, o el primer argumento es
		 *         infinito negativo y el segundo argumento es mayor que cero pero no un
		 *         entero impar finito, entonces el resultado es infinito positivo.
		 * 
		 *         Si el primer argumento es cero y el segundo argumento es un entero
		 *         impar finito negativo, o el primer argumento es infinito negativo y
		 *         el segundo argumento es un entero impar finito positivo, entonces el
		 *         resultado es infinito negativo.
		 * 
		 *         Si el primer argumento es finito y menor que cero y si el segundo
		 *         argumento es un número entero finito par, el resultado es igual al
		 *         resultado de elevar el valor absoluto del primer argumento a la
		 *         potencia del segundo argumento si el segundo argumento es un número
		 *         entero finito impar, el resultado es igual al negativo del resultado
		 *         de elevar el valor absoluto del primer argumento a la potencia del
		 *         segundo argumento si el segundo argumento es finito y no un número
		 *         entero, entonces el resultado es NaN.
		 * 
		 *         Si ambos argumentos son números enteros, entonces el resultado es
		 *         exactamente igual al resultado matemático de elevar el primer
		 *         argumento a la potencia del segundo argumento si ese resultado puede
		 *         de hecho ser representado exactamente como un valor doble.
		 * 
		 *         (En las descripciones anteriores, un valor de punto flotante se
		 *         considera un número entero si y solo si es finito y un punto fijo del
		 *         método ceil o, de manera equivalente, un punto fijo del método floor.
		 *         Un valor es un punto fijo de un método de un argumento si y solo si
		 *         el resultado de aplicar el método al valor es igual al valor.)
		 * 
		 *         El resultado calculado debe estar dentro de 1 ulp del resultado
		 *         exacto. Los resultados deben ser semi-monótonos.
		 *         
		 *         @see potencia(int, int)
		 */

		public int potencia(int operando1, int operando2) {
			
			int resultado = 0;
			
			if(operando1 >= 0 & operando2 >= 0) {
			 resultado = (int) Math.pow(operando1, operando2);}
			// se hace un casting para convertir en entero el resultado
			else {
				resultado = 0;
			}
																	
			return resultado;

		}

	}