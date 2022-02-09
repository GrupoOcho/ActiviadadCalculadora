package calculadora;

/**
 * Esta clase corresponde al bloque 1, referente a la Suma del ejercicio 1 de
 * Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Daniel
 * @since 09/02/2022
 * @version 2.0
 * @see resta
 * @see Producto
 * @see Cociente
 */
public class Suma {
	
	
	static double numAcum, sumaR;
	static int sumaE;
	
	/**
	 * Este método suma dos numeros reales.<br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 es el primer número real que se va a sumar
	 * @param n2 es el segundo número real que se va a sumar
	 * @return la suma de los números reales n1 y n2
	 */
	public static double sumar(double n1,double n2){
		if (n1 < 0 || n2 < 0) 
			System.out.println("No se permiten números negativos");
		else {
			return sumaR= n1 + n2;
		}
		return sumaR;
		
	}
	/**
	 * Este método suma dos numeros enteros.<br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero número entero a sumar
	 * @param n2 representa el segundo número entero a sumar
	 * @return la suma de ambos numeros, puede ser <u>negativo</u> si n1 mayor n2
	 */
	public static double sumar(int n1,int n2){
		if (n1 < 0 || n2 < 0) 
			System.out.println("No se permiten números negativos");
		else {
			return sumaE= n1 + n2;
		}
		return sumaE;
		
	}
	/**
	 * Este método suma tres numeros Reales.<br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero número a sumar
	 * @param n2 representa el segundo número a sumar
	 * @param n3 representa el tercer número a sumar
	 * @return la suma de los tres números reales
	 */
	public static double sumar(double n1,double n2,double n3){
		if (n1 < 0 || n2 < 0) 
			System.out.println("No se permiten números negativos");
		else 
			return sumaR = n1 + n2 + n3;
		return sumaR;
		
	}
	/**
	 * Este método acumula un resultado.<br>Casos especiales:
	 * <br>Si n1 es un número negativo devuelve que no se permiten negativos.
	 * @return la suma acumulada.
	 */
	public static double sumarAcumulado(double numAcum){

		if (numAcum < 0) 
			System.out.println("No se permiten números negativos");
		else 
			return numAcum;
		return numAcum;
		
	}


}
