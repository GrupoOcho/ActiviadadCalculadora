import java.util.Scanner;

/**
 * Miembros del equipo
 * 
 * @author Gonzalo
 * @author Daniel 
 * 
 * @since 26/01/2022
 * @version 1.1
 * 
 * Representa una calculadora y varias de sus operaciones aritméticas elementales, en la que no se podrá utilizar números negativos.
 * 
 * @see Suma
 * @see Resta
 * @see Producto
 * @see Cociente
 * 
 */

public class Calculadora {


	/**
	 * Esta clase corresponde al bloque 1, referente a la Suma del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo.
	 * 
	 * Con la clase Suma lo que se pretende es registrar todas las operaciones relacionadas con las sumas que hay en una calculadora.
	 * El usuario podrá sumar números enteros, reales y acumulados.
	 * 
	 * @author Daniel
	 * @since 26/01/2022
	 * @version 1.0
	 * @see Calculadora
	 * 
	 */
	
	public class Suma{
		
		
	/**
	 * Este método suma dos numeros reales
	 * 
	 *  Aspectos a tener en cuenta: 
	 * 
	 *  <ol type=”A”>
	 *  <li>Permite representar valores en el rango de 1.4e - 045 hasta 3.4e + 038. Si se sitúa fuera de este rango saltará una excepción.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (f), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
	 *  <li>Puede recibir otros parámetros distintos a float, como int o double, aunque retornará un float.</li>
	 *  <li>No permitirá valores string.</li>
	 *  </ol>
	 * 
	 * @param n1 es el primer número real que se va a sumar
	 * @param n2 es el segundo número real que se va a sumar
	 * @return Devuelve la suma de los dos numeros reales
	 * @see suma_reales(float, float)
	 * 
	 */
	public float Suma_reales(float n1, float n2) {
		float suma = 0;
		if (n1 >= 0 & n2 >= 0) {
			suma = n1 + n2;
		} else {
			System.out.println("No admite negativos");
		}
		
		return suma;
		
		
		// suma los números reales n1 + n2
	}

	/**
	 * Este método suma dos numeros enteros
	 * 
	 *  <ol type=”A”>
	 *  <li>Saltará una excepción si el parámetro asignado excede del rango de 32,767 a -32,768. 
	 *  En nuestra claculadora será de 0, el rango inferior al no poderse introducir números negativos</li>
	 *  <li>No puede recibir otros parámetros con distintos tipos como float, double... dado que saltará una excepción.</li>
	 *  <li>Únicamente para operar con valores enteros.</li>
	 *  <li>No permitirá valores string.</li>
	 *  </ol>
	 * 
	 * @param n1 representa el primer número entero a sumar
	 * @param n2 representa el segundo número entero a sumar
	 * @return Devuelve la suma de los dos numeros enteros
	 * @see suma_enteros(int, int)
	 * 
	 */

	public int Suma_enteros(int n1, int n2) {
		int suma = 0;
		if (n1 >= 0 & n2 >= 0) {
			suma = n1 + n2;
		} else {
			System.out.println("No admite negativos");
		}
		
		return suma; // suma los números enteros n1 + n2
	}

	/**
	 * Este metodo suma tres numeros reales
	 * 
	 *  Aspectos a tener en cuenta: 
	 * 
	 *  <ol type=”A”>
	 *  <li>Permite representar valores en el rango de 1.4e - 045 hasta 3.4e + 038. Si se sitúa fuera de este rango saltará una excepción.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (f), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
	 *  <li>Puede recibir otros parámetros distintos a float, como int o double para operar con ellos, aunque retornará un float.</li>
	 *  <li>No permitirá valores string.</li>
	 *  </ol>
	 * 
	 * @param n1 representa el primer número a sumar
	 * @param n2 representa el segundo número a sumar
	 * @param n3 representa el tercer número a sumar
	 * @return Devuelve la suma de los tres números reales
	 * @see suma_reales_triple (float, float, float)
	 * 
	 */

	public float Suma_reales3(float n1, float n2, float n3) {

		float suma = 0;
		if (n1 >= 0 & n2 >= 0 & n3 >=0 ) {
			suma = n1 + n2 + n3;
		} else {
			System.out.println("No admite negativos");
		}
		
		return suma; // suma los números reales n1 + n2 + n3
	}

	/**
	 * Atributo de clase valor acumulado, para calcular el acumulado total de la Suma.
	 */
	
	private double acumulado = 0;
	
	public double getAcumulado() {
		return acumulado;
	}

	public void setAcumulado(double acumulado) {
		this.acumulado = acumulado;
	}
	
	
	/**
	 ** Método que guarda el valor acumulado de la suma realizada por el usuario.
	 * 
	 * <ol>
	 * <li>El parámetro acumulado, únicamente puede recibir valores positivos</li>
	 * <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308, si excede dará error.</li>
	 * <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior </li>
	 * <li>Puede recibir otros parámetros distintos a double, como int o float, aunque retornará un double.</li>
	 * <li>No permitirá valores string.</li>
	 * </ol>
	 * 
	 * @param acumulado represente el acumulado de todas las sumas calculadas, pero no retorna nada. Para obtener el valor realizar un get.
	 * @return double Unicamente lo podremos ver con un get, para ver cuanto tenemos de acumulado
	 * @see sum_acumulado(double)
	 * 
	 */
	

	// @param total Acumulado de todas las operaciones de suma

	public double SumaAcumulado(double acumulado) {
		
		if(acumulado > 0)
	        this.acumulado += acumulado;   
		else 
			System.out.println("No admite negativos");
		
		// suma el acumulado de todas las operaciones de suma previamente calculadas

	return acumulado;}

	/**
	 * Esta clase corresponde al bloque 2, referente a la resta del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo
	 * 
	 * Con la clase Resta lo que se pretende es registrar todas las operaciones relacionadas con las restas que hay en una calculadora.
	 * El usuario podrá restar números enteros, reales y calcular el acumulado.
	 * 
	 * @author Gonzalo
	 * @since 26/01/2022
	 * @version 1.0
	 * 
	 */

	public class Resta {

	/**
	* Este método devuelve la resta dos números reales y retorna el resultado como un double.
	* 
	* 
	*  <ol type=”A”>
    *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308, si excede saltará una excepción</li>
	*  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
	*  <li>Puede recibir otros parámetros distintos a double, como int o float, aunque retornará un double.</li>
	*  <li>No permitirá valores string.</li>
	*  <li>Como la calculadora no puede arrojar un valor negativo el sugundo operando debe ser siempre menor o igual al primer operando</li>
	*  </ol>
	* 
	* @param n1 represente el primero número entero a restar
	* @param n2 representa el segundo número entero a restar
	* @return double Un real que es el resultado de a - b, es decir, resta de los dos números pasados como argumentos.
	* @see resta_reales(double, double)
	* 
	*/
		
		public double Resta_reales(double n1, double n2) {
			 double resta = 0;
			
				if (n1 >= 0 & n2 >= 0 & n1 >= n2) {
				 	
					resta = n1 - n2;
				 }else {
					System.out.println("No admite negativos, como parámetros, ni en el resultado");
					if (n2 > n1)
					System.out.println("Como "+n2+ " es mayor que "+n1+ "se invalida");
				}
				return resta; // resta los números reales n1 - n2
			}
		
	/**
	 * Este método devuelve la resta dos números enteros y retorna el resultado como un int.
	 * 
	 *  <ol type=”A”>
	 *  <li>Saltará una excepción si el parámetro asignado excede del rango de 32,767 a -32,768. 
	 *  En nuestra claculadora será de 0, el rango inferior al no poer introducir negativos</li>
	 *  <li>No puede recibir otros parámetros con distintos tipos como float, double... dado que saltará una excepción.</li>
	 *  <li>Únicamente para operar con valores enteros.</li>
	 *  <li>No permitirá valores string.</li>
	 *  <li>Como la calculadora no puede arrojar un valor negativo el sugundo operando debe ser siempre menor o igual al primer operando</li>
	 *  </ol>
	 * 
	 * @param n1 Número entero, primer operando de la resta.
	 * @param n2 Número entero, segundo operando de la resta.
	 * @return int Un entero que es el resultado de c - d, es decir, resta de los dos números pasados como argumentos.
	 * @see resta_enteros(int, int)
	 * 
	 */

		public int Resta_enteros(int n1, int n2) {
			int resta = 0;
			
			if (n1 >= 0 & n2 >= 0 & n1 >= n2) {
			 	
				resta = n1 - n2;
			 }else {
				System.out.println("No admite negativos, como parámetros, ni en el resultado");
				if (n2 > n1)
				System.out.println("Como "+n2+ " es mayor que "+n1+ "se invalida");
			}
			return resta; 
		 // resta los números enteros n1 - n2
		}

	/**
	 * Este método devuelve la resta de tres números reales y retorna el resultado como un double.
	 * 
	 *  <ol type=”A”>
	 *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
	 *  <li>Puede recibir otros parámetros distintos a double, como int o float, aunque retornará un double.</li>
	 *  <li>No permitirá valores string.</li>
	 *  <li>Como la calculadora no puede arrojar un valor negativo, el primer parámetro siempre debe ser mayor o igual a la suma de f + g </li>
	 *  </ol>
	 * 
	 * @param n1 Número real, primer operando de la resta.
	 * @param n2 Número real, segundo operando de la resta.
	 * @param n3 Número real, tercer operando de la resta.
	 * @return double Un real que es el resultado de la suma de n1 - n2 - n3, es decir, la resta de los tres números pasados como argumentos.
	 * @see resta_reales_triple (double, double, double)
	 * 
	 */

		public  double Resta_reales3(double n1, double n2, double n3) {
			double resta = 0;
			
			if (n1 >= 0 & n2 >= 0 & n3 >= 0 & n1 >= n2 + n3) {
			 	
				resta = n1 - n2 - n3;
			 }else {
				System.out.println("No admite negativos, como parámetros, ni en el resultado");
				if (n2 > n1 + n3)
				System.out.println("Como "+n2+ " y " +n3+  " es mayor que "+n1+ "se invalida");
			}
			return resta; 
		} // resta los números reales n1 - n2 - n3
		

		/**
		 * Atributo de clase valor acumulado, para calcular el acumulado total de la Resta
		 */
		
	private int acumulado = 0;
	
		public int getAcumulado() {
			return acumulado;
		}

		public void setAcumulado(int acumulado) {
			this.acumulado = acumulado;
		}

		/**
		 * Método que suma con valor acumulado y lo guarda
		 * 
		 *  <ol>
		 *  <li>Como la calculadora no puede arrojar un valor negativo, al acumular si se quedara en negativo se quedaria en 0, cualquier valor que restes devolverá 0.
		 *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.</li>
		 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
		 *  <li>Puede recibir otros parámetros distintos a float, como int o float, aunque retornará un double.</li>
		 *  <li>No permitirá valores string.</li>
		 *  </ol>
		 *  
		 * @param acumulado Número real, que nos díra el número acumulado al realizar la resta por los valores que el usuario especifique.
		 * @return double Un real que es el valor acumulado, de todos los datos que ha querido contabilizar el usuario
		 * @see resta_acumulado(double)
		 */
		
		public double restaAcumulado(double acumulado){
			
			if (this.acumulado - acumulado < 0) {
	            this.acumulado = 0;
	        } else {
	            this.acumulado -= acumulado;
	        }
			
			return acumulado;
		}
		
	}

	/**
	 * Esta clase corresponde al bloque 3, referente al producto del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo
	 * 
	 * Podrás realizar el producto de números reales, enteros y calcular la potencia de un némero.
	 * 
	 * @author Daniel 
	 * @since 26/01/2022
	 * @version 1.0
	 */

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
				System.out.println("No admite negativos, como parámetros, ni en el resultado");
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

		public int multiplicar_enteros(int operando1, int operando2) {
			int producto = 0;
			if (operando1 >= 0 & operando2 >= 0) {
				producto = operando1 * operando2;
			} else {
				System.out.println("No admite negativos, como parámetros, ni en el resultado");
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

		public double multiplicar_reales3(double operando1, double operando2, double operando3) {
			double producto = 0;
			if (operando1 >= 0 & operando2 >= 0 & operando3 >= 0) {
				producto = operando1 * operando2 * operando3;
			} else {
				System.out.println("No admite negativos, como parámetros, ni en el resultado");
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
			int resultado = (int) Math.pow(operando1, operando2);// se hace un casting para convertir en entero el
																	// resultado
			return resultado;

		}

	}

	/**
	 * Esta clase corresponde al bloque 4, referente al cociente del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo
	 * 
	 * Con la clase cociente lo que se pretende es registrar todas las operaciones relacionadas con los cocientes que hay en una calculadora.
     * El usuario podrá calcular el cociente de números enteros, reales, así como determinar la raíz o inversa de un número.
     * 
	 * @author Gonzalo
	 * @since 26/01/2022
	 * @version 1.0
	 * 
	 * @see Calculadora
	 */

	public class Cociente {

	/**
	 * Este metodo divide dos números reales
	 * 
	 * @param n1 representa el dividendo
	 * @param n2 representa el divisor
	 * @return la división de ambos números, puede ser decimal
	 * 
	 * Aspectos a tener en cuenta:
	 * 
	 * <ol type=”A”>
     *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
	 *  <li>Puede recibir otros parámetros distintos a float, como int o float, aunque retornará un double.</li>
	 *  <li>No permitirá valores string.</li>
	 *  <li> Si n1 es 0, el resultado sería igual a 0. </li>
	 *  <li> Si n2 es 0, el resultado no se puede mostrar porque tiende a infinito </li>
	 *  </ol>
	 * 
	 * @see cociente(double, double)
	 */
		
		public double cociente_reales(double n1, double n2) {
			double cociente = 0;
			if (n1 >= 0 & n2 > 0) {
				cociente = n1 / n2;
			} else  {
				System.out.println("No admite negativos, como parámetros, ni en el resultado");
				if (n2 == 0) {
					System.out.println(" El denominador no puede ser 0");
				}
			}
			
			return cociente; // suma los números enteros n1 + n2
	
			
		 // divide el primer número real entre el segundo real
		}

	/**
	 * Este metodo divide dos números enteros
	 * 
	 * @param n1 representa el dividendo
	 * @param n2 representa el divisor
	 * 
	 * @return la division de ambos números
	 * 
	 * Casos a tener en cuenta:
	 *  <li>Saltará una excepción si el parámetro asignado excede del rango de 32,767 a -32,768. 
	 *  En nuestra claculadora será de 0, el rango inferior al no poer introducir negativos</li>
	 *  <li>No puede recibir otros parámetros con distintos tipos como float, double... dado que saltará una excepción.</li>
	 *  <li>Únicamente para operar con valores enteros.</li>
	 *  <li>No permitirá valores string.</li>
	 *  <li>Si n2 es 0, el resultado no se puede mostrar porque tiende a infinito.</li>
	 *  <li>Si n1 es 0, el resultado sería igual a 0.</li>
	 *  <li>Aunque el cociente de (-) / (-) = (+), como la calculadora no deja meter números negativos, aunque arroje positivo no se podrá calcular.
	 *  </ol>
	 * 
	 * @see cociente_enteros(int, int)
	 *      
	 */
		public int cociente_enteros(int n1, int n2) {
			int cociente = 0;
			if (n1 >= 0 & n2 > 0) {
				cociente = n1 / n2;
			} else  {
				System.out.println("No admite negativos, como parámetros, ni en el resultado");
				if (n2 == 0) {
					System.out.println(" El denominador no puede ser 0");
				}
			}
			
			return cociente; // suma los números enteros n1 + n2
	
		}

	/**
	 * Este metodo calcula el inverso de un número real
	 * 
	 * @param n1 representa el número real
	 * @return el inverso del número real
	 * 
	 *  <ol>
	 *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308, si excede dará error.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
	 *  <li>Puede recibir otros parámetros distintos a double, como int o float, aunque retornará un double.</li>
	 *  <li>No permitirá valores string.</li>
	 *  <li>El parámetro n1 no podrá ser igual a 0, daría error, ya que tiende al infinito.</li>
	 *  </ol>
	 *  
	 *  @see inverso(double)
	 * 
	 */
		public double inverso(double n1) {
			
			double cociente = 0;
			if (n1 > 0 ) {
				cociente = 1 / n1;
			} else  {
				System.out.println("No admite negativos, como parámetros, ni en el resultado");
				if (n1 == 0) {
					System.out.println(" El denominador no puede ser 0");
				}
			}
			
			return cociente; // suma los números enteros n1 + n2
	
		}

	/**
	 * Este metodo calcula la raíz cuadrada de un número
	 * 
	 * Devuelve el positivo redondeado correctamente, raíz cuadrada de un valor doble.
	 * 
	 * Aspectos a tener en cuenta:
	 *  <ol>
	 *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltará una excepción al contabilizarlo como un int y este tiene un límite inferior</li>
	 *  <li>Puede recibir otros parámetros distintos a double, como int o float, aunque retornará un double.</li>
	 *  <li>No permitirá valores string.</li>
	 *  <li>Si el argumento es NaN (Not a Number) o menor de cero, el resultado que se muestra es NaN.</li>
	 *  <li>Si el argumento es infinito positivo, entonces el resultado es infinito positivo.</li>
	 *  <li>Si el argumento es cero positivo, entonces el resultado es el mismo que el argumento.</li>
	 *  <li>Si el argumento es infinito positivo, entonces el resultado es infinito positivo.</li>
	 *  </ol>
	 *  
	 * @param n1 representa el número por el que queremos calcular su raíz
	 * @return Devuelve la raíz cuadrada del número
	 * 
	 * @see raiz(double)
	 * 
	 */

		public double raiz(int n1) {
			return Math.sqrt(n1);
		}

	}


	}}

