package TestPrincipalMain;

import java.util.Scanner;

import CalculadoraClases.Cociente;
import CalculadoraClases.Producto;
import CalculadoraClases.Resta;
import CalculadoraClases.Suma;

public class MainPrincipal {


	/**
	 * Miembros del equipo
	 * 
	 * 
	 *
	 * @author Gonzalo
	 * @author Daniel 
	 * 
	 */

		public static void main(String[] args) {
			String paso = "si";
			do {

			System.out.println(
					"--Bienvenido a la aplicación calculadora--\n *Elige una opción:\n\t-Sumar (pulsa tecla S)\n\t-Restar (pulsa tecla R)\n\t-Multiplicar (pulsa tecla M)\n\t-Dividir (pulsa tecla D)");
			System.out.println();

			Scanner op = new Scanner(System.in);
			String opcion = op.next();

			switch (opcion) {

			case "s": {
				System.out.println(
						"Elige la operación que vas a realizar:\n-Sumar dos números decimales(pulsa 1)\n-Sumar tres números decimales(pulsa 2)\n-Sumar dos números enteros(pulsa 3)\n-Mostrar la suma acumulada(pulsa 4)");

				Scanner sc = new Scanner(System.in);
				int opm = sc.nextInt();
				switch (opm) {

				case 1: {
					try {
						Suma suma = new Suma();
						System.out.println("Introduce primer numero a sumar (n1)");
						float n1 = sc.nextFloat();
						System.out.println("Introduce segundo numero a sumar (n2)");
						float n2 = sc.nextFloat();
						float resultado_2d = suma.Suma(n1, n2);
						System.out.println("El resultado de la operación es " + resultado_2d);
						

					} catch (Exception e) {
						System.out.println("Error en el número");
					}
				}
					break;

				case 2: {

					try {
						Suma suma = new Suma();
						System.out.println("Introduce primer número a sumar (n1)");
						float n1 = sc.nextFloat();
						System.out.println("Introduce segundo número a sumar (n2)");
						float n2 = sc.nextFloat();
						System.out.println("Introduce tercer número a sumar (n3)");
						float n3 = sc.nextFloat();
						float resultado_3d = suma.Suma(n1, n2, n3);
						System.out.println("El resultado de la operación es " + resultado_3d);

						

					} catch (Exception e) {
						System.out.println("Error en el número");

					}

				}

					break;

				case 3: {

					try {
						Suma suma = new Suma();
						System.out.println("Introduce primer número a sumar (n1)");
						int n1 = sc.nextInt();
						System.out.println("Introduce segundo número a sumar (n2)");
						int n2 = sc.nextInt();
						int resultado_2e = suma.Suma(n1, n2);
						System.out.println("El resultado de la operación es " + resultado_2e);

						

					} catch (Exception e) {
						System.out.println("Error en el número");
					}

					break;

				}

				case 4: {
					try {
						Suma suma = new Suma();
						System.out.println("Introduce un número a guardar");
						int numAcum = sc.nextInt();
						int sumaAcumulada = suma.SumaAcumulado(numAcum);
						System.out.println("El número guardado es: " + sumaAcumulada);

					} catch (Exception e) {
						System.out.println("Error en el número");
					}

					break;

				}
				}
			}
			break;

			case "r": {

				System.out.println(
						"Elige operación a realizar:\n-Restar dos números decimales(pulsa 1)\n-Resta dos números enteros(pulsa 2)\n-Resta tres números decimales(pulsa 3)\n-Mostrar el acumulado de las restas(pulsa 4)");
				Scanner sc_r = new Scanner(System.in);

				int opm = sc_r.nextInt();

				switch (opm) {

				case 1: {
					try {
						Resta resta = new Resta();
						System.out.println("Introduce el primer número a restar (n1)");
						double n1 = sc_r.nextDouble();
						System.out.println("Introduce el segundo número a restar (n2)");
						double n2 = sc_r.nextDouble();
						double resta1 = resta.Resta(n1, n2);
						System.out.println("El resultado de la operación es " + resta1);
						
					} catch (Exception e) {
						System.out.println("Error en el número");
					}

				}
					break;

				case 2: {

					try {
						Resta resta = new Resta();
						System.out.println("Introduce primer número entero a restar (n1)");
						int n1 = sc_r.nextInt();
						System.out.println("Introduce segundo número entero a restar (n2)");
						int n2 = sc_r.nextInt();
						double resta2 = resta.Resta(n1, n2);
						System.out.println("El resultado de la operación es " + resta2);
					} catch (Exception e) {
						System.out.println("Error en el número");
					}

					break;

				}

				case 3: {

					try {
						Resta resta = new Resta();
						System.out.println("Introduce primer número a restar (n1)");
						double n1 = sc_r.nextDouble();
						System.out.println("Introduce segundo número a restar (n2)");
						double n2 = sc_r.nextDouble();
						System.out.println("Introduce tercer número a restar (n3)");
						double n3 = sc_r.nextDouble();
						double resta3 = resta.Resta(n1, n2, n3);
						System.out.println("El resultado de la operación es " + resta3);

					} catch (Exception e) {
						System.out.println("Error en el número");

					}

				}

					break;

				case 4: {
					try {
						Resta resta = new Resta();
						System.out.println("Introduce un número a guardar");
						int acumulado = sc_r.nextInt();
						int restaAcumulada = resta.restaAcumulado(acumulado);
						System.out.println("El número guardado es: " + restaAcumulada);

					} catch (Exception e) {
						System.out.println("Error en el número");
					}

					break;

				}
				}
			}
			break;

			case "m": {
				System.out.println(
						"Elige la operación que vas a realizar:\n-Multiplicar dos números decimales(pulsa 1)\n-Multiplicar tres números decimales(pulsa 2)\n-Multiplicar dos numeros enteros(pulsa 3)\n-Mostrar la potencia de un número(pulsa 4)");

				Scanner sc_m = new Scanner(System.in);
				int opm = sc_m.nextInt();
				switch (opm) {

				case 1: {
					try {
						Producto producto = new Producto();
						System.out.println("Introduce primer número real a multiplicar (n1)");
						double n1 = sc_m.nextDouble();
						System.out.println("Introduce segundo número real multiplicar (n2)");
						double n2 = sc_m.nextDouble();
						double resultado = producto.multiplicar(n1, n2);
						System.out.println("El resultado de la operación es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el número");
					}

				}
					break;

				case 2: {
					try {
						Producto producto = new Producto();
						System.out.println("Introduce primer número entero a multiplicar (n1)");
						int n1 = sc_m.nextInt();
						System.out.println("Introduce segundo número entero multiplicar (n2)");
						int n2 = sc_m.nextInt();
						int resultado = producto.multiplicar(n1, n2);
						System.out.println("El resultado de la operación es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el número");
					}

				}
					break;

				case 3: {

					try {
						Producto producto = new Producto();
						System.out.println("Introduce primer número real a multiplicar (n1)");
						double n1 = sc_m.nextDouble();
						System.out.println("Introduce segundo número real a multiplicar (n2)");
						double n2 = sc_m.nextDouble();
						System.out.println("Introduce tercer número real a multiplicar (n3)");
						double n3 = sc_m.nextDouble();
						double resultado = producto.multiplicar(n1, n2, n3);
						System.out.println("El resultado de la operación es " + resultado);

					} catch (Exception e) {
						System.out.println("Error en el número");

					}

				}

					break;

				case 4: {

					try {
						Producto producto = new Producto();
						System.out.println("Introduce la base de la potencia (n1)");
						int n1 = sc_m.nextInt();
						System.out.println("Introduce el exponente de la potencia (n2)");
						int n2 = sc_m.nextInt();
						int resultado = producto.potencia(n1, n2);
						System.out.println("El resultado de la operacion es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el número");
					}

					break;

				}
				}
			}
			break;

			case "d": {
				System.out.println(
						"Elige la operación que vas a realizar:\n-Dividir dos numeros reales(pulsa 1)\n-Dividir dos números enteros(pulsa 2)\n-Calcula el inverso de un número real(pulsa 3)\n-Calcula la raíz cuadrada de un número(pulsa 4)");

				Scanner sc_d = new Scanner(System.in);
				int opm = sc_d.nextInt();
				switch (opm) {

				case 1: {
					try {
						Cociente cociente = new Cociente();
						System.out.println("Introduce el dividendo - número real - (n1)");
						double n1 = sc_d.nextDouble();
						System.out.println("Introduce el divisor - número real-  (n2)");
						double n2 = sc_d.nextDouble();
						double resultado = cociente.cociente(n1, n2);
						System.out.println("El resultado de la operación es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el número");
					}

				}
					break;

				case 2: {
					try {
						Cociente cociente = new Cociente();
						System.out.println("Introduce el dividendo - número entero - (n1)");
						int n1 = sc_d.nextInt();
						System.out.println("Introduce el divisor- número entero - (n2)");
						int n2 = sc_d.nextInt();
						int resultado = cociente.cociente(n1, n2);
						System.out.println("El resultado de la operación es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el número");
					}

				}
					break;

				case 3: {

					try {
						Cociente cociente = new Cociente();
						System.out.println("Introduce el número real (n1)");
						double n1 = sc_d.nextDouble();
						double resultado = cociente.inverso(n1);
						System.out.println("El resultado de la operación es " + resultado);

					} catch (Exception e) {
						System.out.println("Error en el número");

					}

				}

					break;

				case 4: {

					try {
						Cociente cociente = new Cociente();
						System.out.println("Introduce el número real (n1)");
						int n1 = sc_d.nextInt();
						int resultado = (int) cociente.raiz(n1);
						System.out.println("El resultado de la operación es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el número");
					}

					break;
				}
				}
			}
			}
			
			System.out.println("");
			System.out.println("¿Quieres seguir realizando operaciones?(si/no)");
			paso = op.next();
			
			}while(paso.equalsIgnoreCase("si"));
			
			
			System.out.println("Gracias por usar esta aplicación");
			

		}

	}


