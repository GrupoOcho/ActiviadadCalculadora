package CalculadoraClases;

/**
	 * Esta clase corresponde al bloque 2, referente a la resta del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo
	 * 
	 * Con la clase Resta lo que se pretende es registrar todas las operaciones relacionadas con las restas que hay en una calculadora.
	 * El usuario podr� restar n�meros enteros, reales y calcular el acumulado.
	 * 
	 * @author Gonzalo
	 * @since 26/01/2022
	 * @version 1.0
	 * 
	 */

	public class Resta {

	/**
	* Este m�todo devuelve la resta dos n�meros reales y retorna el resultado como un double.
	* 
	* 
	*  <ol type=�A�>
    *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308, si excede saltar� una excepci�n</li>
	*  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltar� una excepci�n al contabilizarlo como un int y este tiene un l�mite inferior</li>
	*  <li>Puede recibir otros par�metros distintos a double, como int o float, aunque retornar� un double.</li>
	*  <li>No permitir� valores string.</li>
	*  <li>Como la calculadora no puede arrojar un valor negativo el sugundo operando debe ser siempre menor o igual al primer operando</li>
	*  </ol>
	* 
	* @param n1 represente el primero n�mero entero a restar
	* @param n2 representa el segundo n�mero entero a restar
	* @return double Un real que es el resultado de a - b, es decir, resta de los dos n�meros pasados como argumentos.
	* @see resta_reales(double, double)
	* 
	*/
		
		public double Resta(double n1, double n2) {
			 double resta = 0;
			
				if (n1 >= 0 & n2 >= 0 & n1 >= n2) {
				 	
					resta = n1 - n2;
				 }else {
					resta = 0;
				}
				return resta; // resta los n�meros reales n1 - n2
			}
		
	/**
	 * Este m�todo devuelve la resta dos n�meros enteros y retorna el resultado como un int.
	 * 
	 *  <ol type=�A�>
	 *  <li>Saltar� una excepci�n si el par�metro asignado excede del rango de 32,767 a -32,768. 
	 *  En nuestra claculadora ser� de 0, el rango inferior al no poer introducir negativos</li>
	 *  <li>No puede recibir otros par�metros con distintos tipos como float, double... dado que saltar� una excepci�n.</li>
	 *  <li>�nicamente para operar con valores enteros.</li>
	 *  <li>No permitir� valores string.</li>
	 *  <li>Como la calculadora no puede arrojar un valor negativo el sugundo operando debe ser siempre menor o igual al primer operando</li>
	 *  </ol>
	 * 
	 * @param n1 N�mero entero, primer operando de la resta.
	 * @param n2 N�mero entero, segundo operando de la resta.
	 * @return int Un entero que es el resultado de c - d, es decir, resta de los dos n�meros pasados como argumentos.
	 * @see resta_enteros(int, int)
	 * 
	 */

		public int Resta(int n1, int n2) {
			int resta = 0;
			
			if (n1 >= 0 & n2 >= 0 & n1 >= n2) {
			 	
				resta = n1 - n2;
			 }else {
				 resta = 0;
			}
			return resta; 
		 // resta los n�meros enteros n1 - n2
		}

	/**
	 * Este m�todo devuelve la resta de tres n�meros reales y retorna el resultado como un double.
	 * 
	 *  <ol type=�A�>
	 *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.</li>
	 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltar� una excepci�n al contabilizarlo como un int y este tiene un l�mite inferior</li>
	 *  <li>Puede recibir otros par�metros distintos a double, como int o float, aunque retornar� un double.</li>
	 *  <li>No permitir� valores string.</li>
	 *  <li>Como la calculadora no puede arrojar un valor negativo, el primer par�metro siempre debe ser mayor o igual a la suma de f + g </li>
	 *  </ol>
	 * 
	 * @param n1 N�mero real, primer operando de la resta.
	 * @param n2 N�mero real, segundo operando de la resta.
	 * @param n3 N�mero real, tercer operando de la resta.
	 * @return double Un real que es el resultado de la suma de n1 - n2 - n3, es decir, la resta de los tres n�meros pasados como argumentos.
	 * @see resta_reales_triple (double, double, double)
	 * 
	 */

		public  double Resta(double n1, double n2, double n3) {
			double resta = 0;
			
			if (n1 >= 0 & n2 >= 0 & n3 >= 0 & n1 >= n2 + n3) {
			 	
				resta = n1 - n2 - n3;
			 }else {
				 resta = 0;
			}
			return resta; 
		} // resta los n�meros reales n1 - n2 - n3
		

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
		 * M�todo que suma con valor acumulado y lo guarda
		 * 
		 *  <ol>
		 *  <li>Como la calculadora no puede arrojar un valor negativo, al acumular si se quedara en negativo se quedaria en 0, cualquier valor que restes devolver� 0.
		 *  <li>Permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.</li>
		 *  <li>Si damos un valor relativamente alto, no olvidar poner la (d), sino saltar� una excepci�n al contabilizarlo como un int y este tiene un l�mite inferior</li>
		 *  <li>Puede recibir otros par�metros distintos a float, como int o float, aunque retornar� un double.</li>
		 *  <li>No permitir� valores string.</li>
		 *  </ol>
		 *  
		 * @param acumulado N�mero real, que nos d�ra el n�mero acumulado al realizar la resta por los valores que el usuario especifique.
		 * @return double Un real que es el valor acumulado, de todos los datos que ha querido contabilizar el usuario
		 * @see resta_acumulado(double)
		 */
		
		public int restaAcumulado(int acumulado){
			
			if (this.acumulado - acumulado < 0 || acumulado <= 0) {
	            this.acumulado = 0;
	        } else {
	            this.acumulado -= acumulado;
	        }
			
			return acumulado;
		}
		
	}
