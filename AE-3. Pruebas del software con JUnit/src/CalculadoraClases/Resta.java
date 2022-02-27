package CalculadoraClases;

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
		
		public double Resta(double n1, double n2) {
			 double resta = 0;
			
				if (n1 >= 0 & n2 >= 0 & n1 >= n2) {
				 	
					resta = n1 - n2;
				 }else {
					resta = 0;
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

		public int Resta(int n1, int n2) {
			int resta = 0;
			
			if (n1 >= 0 & n2 >= 0 & n1 >= n2) {
			 	
				resta = n1 - n2;
			 }else {
				 resta = 0;
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

		public  double Resta(double n1, double n2, double n3) {
			double resta = 0;
			
			if (n1 >= 0 & n2 >= 0 & n3 >= 0 & n1 >= n2 + n3) {
			 	
				resta = n1 - n2 - n3;
			 }else {
				 resta = 0;
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
		
		public int restaAcumulado(int acumulado){
			
			if (this.acumulado - acumulado < 0 || acumulado <= 0) {
	            this.acumulado = 0;
	        } else {
	            this.acumulado -= acumulado;
	        }
			
			return acumulado;
		}
		
	}
