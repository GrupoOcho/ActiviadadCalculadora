package CalculadoraClases;

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
		
		public double cociente(double n1, double n2) {
			double cociente = 0;
			if (n1 >= 0 & n2 > 0) {
				cociente = n1 / n2;
			} else  {
				cociente = 0;
				if (n2 == 0) {
				cociente = 0;
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
		public int cociente(int n1, int n2) {
			int cociente = 0;
			if (n1 >= 0 & n2 > 0) {
				cociente = n1 / n2;
			} else  {
				cociente = 0;
				if (n2 == 0) {
				cociente = 0;
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
				cociente = 0;
				if (n1 == 0) {
				cociente = 0;
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
			
			if(n1 >= 0) {
			return Math.sqrt(n1);}
			else {
				return 0;
			}
		}

	

	}


