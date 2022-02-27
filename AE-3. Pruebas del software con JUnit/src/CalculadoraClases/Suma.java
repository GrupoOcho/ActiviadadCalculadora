package CalculadoraClases;

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
	public float Suma(float n1, float n2) {
		float suma = 0;
		if (n1 >= 0 & n2 >= 0) {
			suma = n1 + n2;
		} else {
			suma = 0;
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

	public int Suma(int n1, int n2) {
		int suma = 0;
		if (n1 >= 0 & n2 >= 0) {
			suma = n1 + n2;
		} else {
			suma = 0;
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

	public float Suma(float n1, float n2, float n3) {

		float suma = 0;
		if (n1 >= 0 & n2 >= 0 & n3 >=0 ) {
			suma = n1 + n2 + n3;
		} else {
			suma = 0;
		}
		
		return suma; // suma los números reales n1 + n2 + n3
	}

	/**
	 * Atributo de clase valor acumulado, para calcular el acumulado total de la Suma.
	 */
	
	private int acumulado = 0;
	
	public int getAcumulado() {
		return acumulado;
	}

	public void setAcumulado(int acumulado) {
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

	public int SumaAcumulado(int acumulado) {
		
		if(acumulado > 0)
	        this.acumulado += acumulado;   
		else 
			acumulado = 0;
		
		// suma el acumulado de todas las operaciones de suma previamente calculadas

	return acumulado;}}
