package CalculadoraClases;

/**
	 * Esta clase corresponde al bloque 4, referente al cociente del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo
	 * 
	 * Con la clase cociente lo que se pretende es registrar todas las operaciones relacionadas con los cocientes que hay en una calculadora.
     * El usuario podr� calcular el cociente de n�meros enteros, reales, as� como determinar la ra�z o inversa de un n�mero.
     * 
	 * @author Gonzalo
	 * @since 26/01/2022
	 * @version 1.0
	 * 
	 * @see Calculadora
	 */

	public class Cociente {

	/**
	 * Este metodo divide dos n�meros reales
	 * 
	 * @param n1 representa el dividendo
	 * @param n2 representa el divisor
	 * @return la divisi�n de ambos n�meros, puede ser decimal
	 * 
	 * Aspectos a tener en cuenta:
	 * 
	 * <ol type=�A�>
     *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltar� una excepci�n al contabilizarlo como un int y este tiene un l�mite inferior</li>
	 *  <li>Puede recibir otros par�metros distintos a float, como int o float, aunque retornar� un double.</li>
	 *  <li>No permitir� valores string.</li>
	 *  <li> Si n1 es 0, el resultado ser�a igual a 0. </li>
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
			
			return cociente; // suma los n�meros enteros n1 + n2
	
			
		 // divide el primer n�mero real entre el segundo real
		}

	/**
	 * Este metodo divide dos n�meros enteros
	 * 
	 * @param n1 representa el dividendo
	 * @param n2 representa el divisor
	 * 
	 * @return la division de ambos n�meros
	 * 
	 * Casos a tener en cuenta:
	 *  <li>Saltar� una excepci�n si el par�metro asignado excede del rango de 32,767 a -32,768. 
	 *  En nuestra claculadora ser� de 0, el rango inferior al no poer introducir negativos</li>
	 *  <li>No puede recibir otros par�metros con distintos tipos como float, double... dado que saltar� una excepci�n.</li>
	 *  <li>�nicamente para operar con valores enteros.</li>
	 *  <li>No permitir� valores string.</li>
	 *  <li>Si n2 es 0, el resultado no se puede mostrar porque tiende a infinito.</li>
	 *  <li>Si n1 es 0, el resultado ser�a igual a 0.</li>
	 *  <li>Aunque el cociente de (-) / (-) = (+), como la calculadora no deja meter n�meros negativos, aunque arroje positivo no se podr� calcular.
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
			
			return cociente; // suma los n�meros enteros n1 + n2
	
		}

	/**
	 * Este metodo calcula el inverso de un n�mero real
	 * 
	 * @param n1 representa el n�mero real
	 * @return el inverso del n�mero real
	 * 
	 *  <ol>
	 *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308, si excede dar� error.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltar� una excepci�n al contabilizarlo como un int y este tiene un l�mite inferior</li>
	 *  <li>Puede recibir otros par�metros distintos a double, como int o float, aunque retornar� un double.</li>
	 *  <li>No permitir� valores string.</li>
	 *  <li>El par�metro n1 no podr� ser igual a 0, dar�a error, ya que tiende al infinito.</li>
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
			
			return cociente; // suma los n�meros enteros n1 + n2
	
		}

	/**
	 * Este metodo calcula la ra�z cuadrada de un n�mero
	 * 
	 * Devuelve el positivo redondeado correctamente, ra�z cuadrada de un valor doble.
	 * 
	 * Aspectos a tener en cuenta:
	 *  <ol>
	 *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltar� una excepci�n al contabilizarlo como un int y este tiene un l�mite inferior</li>
	 *  <li>Puede recibir otros par�metros distintos a double, como int o float, aunque retornar� un double.</li>
	 *  <li>No permitir� valores string.</li>
	 *  <li>Si el argumento es NaN (Not a Number) o menor de cero, el resultado que se muestra es NaN.</li>
	 *  <li>Si el argumento es infinito positivo, entonces el resultado es infinito positivo.</li>
	 *  <li>Si el argumento es cero positivo, entonces el resultado es el mismo que el argumento.</li>
	 *  <li>Si el argumento es infinito positivo, entonces el resultado es infinito positivo.</li>
	 *  </ol>
	 *  
	 * @param n1 representa el n�mero por el que queremos calcular su ra�z
	 * @return Devuelve la ra�z cuadrada del n�mero
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


