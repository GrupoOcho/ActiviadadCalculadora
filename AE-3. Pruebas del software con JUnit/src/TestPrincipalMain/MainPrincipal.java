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
					"--Bienvenido a la aplicaci�n calculadora--\n *Elige una opci�n:\n\t-Sumar (pulsa tecla S)\n\t-Restar (pulsa tecla R)\n\t-Multiplicar (pulsa tecla M)\n\t-Dividir (pulsa tecla D)");
			System.out.println();

			Scanner op = new Scanner(System.in);
			String opcion = op.next();

			switch (opcion) {

			case "s": {
				System.out.println(
						"Elige la operaci�n que vas a realizar:\n-Sumar dos n�meros decimales(pulsa 1)\n-Sumar tres n�meros decimales(pulsa 2)\n-Sumar dos n�meros enteros(pulsa 3)\n-Mostrar la suma acumulada(pulsa 4)");

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
						System.out.println("El resultado de la operaci�n es " + resultado_2d);
						

					} catch (Exception e) {
						System.out.println("Error en el n�mero");
					}
				}
					break;

				case 2: {

					try {
						Suma suma = new Suma();
						System.out.println("Introduce primer n�mero a sumar (n1)");
						float n1 = sc.nextFloat();
						System.out.println("Introduce segundo n�mero a sumar (n2)");
						float n2 = sc.nextFloat();
						System.out.println("Introduce tercer n�mero a sumar (n3)");
						float n3 = sc.nextFloat();
						float resultado_3d = suma.Suma(n1, n2, n3);
						System.out.println("El resultado de la operaci�n es " + resultado_3d);

						

					} catch (Exception e) {
						System.out.println("Error en el n�mero");

					}

				}

					break;

				case 3: {

					try {
						Suma suma = new Suma();
						System.out.println("Introduce primer n�mero a sumar (n1)");
						int n1 = sc.nextInt();
						System.out.println("Introduce segundo n�mero a sumar (n2)");
						int n2 = sc.nextInt();
						int resultado_2e = suma.Suma(n1, n2);
						System.out.println("El resultado de la operaci�n es " + resultado_2e);

						

					} catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

					break;

				}

				case 4: {
					try {
						Suma suma = new Suma();
						System.out.println("Introduce un n�mero a guardar");
						int numAcum = sc.nextInt();
						int sumaAcumulada = suma.SumaAcumulado(numAcum);
						System.out.println("El n�mero guardado es: " + sumaAcumulada);

					} catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

					break;

				}
				}
			}
			break;

			case "r": {

				System.out.println(
						"Elige operaci�n a realizar:\n-Restar dos n�meros decimales(pulsa 1)\n-Resta dos n�meros enteros(pulsa 2)\n-Resta tres n�meros decimales(pulsa 3)\n-Mostrar el acumulado de las restas(pulsa 4)");
				Scanner sc_r = new Scanner(System.in);

				int opm = sc_r.nextInt();

				switch (opm) {

				case 1: {
					try {
						Resta resta = new Resta();
						System.out.println("Introduce el primer n�mero a restar (n1)");
						double n1 = sc_r.nextDouble();
						System.out.println("Introduce el segundo n�mero a restar (n2)");
						double n2 = sc_r.nextDouble();
						double resta1 = resta.Resta(n1, n2);
						System.out.println("El resultado de la operaci�n es " + resta1);
						
					} catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

				}
					break;

				case 2: {

					try {
						Resta resta = new Resta();
						System.out.println("Introduce primer n�mero entero a restar (n1)");
						int n1 = sc_r.nextInt();
						System.out.println("Introduce segundo n�mero entero a restar (n2)");
						int n2 = sc_r.nextInt();
						double resta2 = resta.Resta(n1, n2);
						System.out.println("El resultado de la operaci�n es " + resta2);
					} catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

					break;

				}

				case 3: {

					try {
						Resta resta = new Resta();
						System.out.println("Introduce primer n�mero a restar (n1)");
						double n1 = sc_r.nextDouble();
						System.out.println("Introduce segundo n�mero a restar (n2)");
						double n2 = sc_r.nextDouble();
						System.out.println("Introduce tercer n�mero a restar (n3)");
						double n3 = sc_r.nextDouble();
						double resta3 = resta.Resta(n1, n2, n3);
						System.out.println("El resultado de la operaci�n es " + resta3);

					} catch (Exception e) {
						System.out.println("Error en el n�mero");

					}

				}

					break;

				case 4: {
					try {
						Resta resta = new Resta();
						System.out.println("Introduce un n�mero a guardar");
						int acumulado = sc_r.nextInt();
						int restaAcumulada = resta.restaAcumulado(acumulado);
						System.out.println("El n�mero guardado es: " + restaAcumulada);

					} catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

					break;

				}
				}
			}
			break;

			case "m": {
				System.out.println(
						"Elige la operaci�n que vas a realizar:\n-Multiplicar dos n�meros decimales(pulsa 1)\n-Multiplicar tres n�meros decimales(pulsa 2)\n-Multiplicar dos numeros enteros(pulsa 3)\n-Mostrar la potencia de un n�mero(pulsa 4)");

				Scanner sc_m = new Scanner(System.in);
				int opm = sc_m.nextInt();
				switch (opm) {

				case 1: {
					try {
						Producto producto = new Producto();
						System.out.println("Introduce primer n�mero real a multiplicar (n1)");
						double n1 = sc_m.nextDouble();
						System.out.println("Introduce segundo n�mero real multiplicar (n2)");
						double n2 = sc_m.nextDouble();
						double resultado = producto.multiplicar(n1, n2);
						System.out.println("El resultado de la operaci�n es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

				}
					break;

				case 2: {
					try {
						Producto producto = new Producto();
						System.out.println("Introduce primer n�mero entero a multiplicar (n1)");
						int n1 = sc_m.nextInt();
						System.out.println("Introduce segundo n�mero entero multiplicar (n2)");
						int n2 = sc_m.nextInt();
						int resultado = producto.multiplicar(n1, n2);
						System.out.println("El resultado de la operaci�n es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

				}
					break;

				case 3: {

					try {
						Producto producto = new Producto();
						System.out.println("Introduce primer n�mero real a multiplicar (n1)");
						double n1 = sc_m.nextDouble();
						System.out.println("Introduce segundo n�mero real a multiplicar (n2)");
						double n2 = sc_m.nextDouble();
						System.out.println("Introduce tercer n�mero real a multiplicar (n3)");
						double n3 = sc_m.nextDouble();
						double resultado = producto.multiplicar(n1, n2, n3);
						System.out.println("El resultado de la operaci�n es " + resultado);

					} catch (Exception e) {
						System.out.println("Error en el n�mero");

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
						System.out.println("Error en el n�mero");
					}

					break;

				}
				}
			}
			break;

			case "d": {
				System.out.println(
						"Elige la operaci�n que vas a realizar:\n-Dividir dos numeros reales(pulsa 1)\n-Dividir dos n�meros enteros(pulsa 2)\n-Calcula el inverso de un n�mero real(pulsa 3)\n-Calcula la ra�z cuadrada de un n�mero(pulsa 4)");

				Scanner sc_d = new Scanner(System.in);
				int opm = sc_d.nextInt();
				switch (opm) {

				case 1: {
					try {
						Cociente cociente = new Cociente();
						System.out.println("Introduce el dividendo - n�mero real - (n1)");
						double n1 = sc_d.nextDouble();
						System.out.println("Introduce el divisor - n�mero real-  (n2)");
						double n2 = sc_d.nextDouble();
						double resultado = cociente.cociente(n1, n2);
						System.out.println("El resultado de la operaci�n es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

				}
					break;

				case 2: {
					try {
						Cociente cociente = new Cociente();
						System.out.println("Introduce el dividendo - n�mero entero - (n1)");
						int n1 = sc_d.nextInt();
						System.out.println("Introduce el divisor- n�mero entero - (n2)");
						int n2 = sc_d.nextInt();
						int resultado = cociente.cociente(n1, n2);
						System.out.println("El resultado de la operaci�n es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

				}
					break;

				case 3: {

					try {
						Cociente cociente = new Cociente();
						System.out.println("Introduce el n�mero real (n1)");
						double n1 = sc_d.nextDouble();
						double resultado = cociente.inverso(n1);
						System.out.println("El resultado de la operaci�n es " + resultado);

					} catch (Exception e) {
						System.out.println("Error en el n�mero");

					}

				}

					break;

				case 4: {

					try {
						Cociente cociente = new Cociente();
						System.out.println("Introduce el n�mero real (n1)");
						int n1 = sc_d.nextInt();
						int resultado = (int) cociente.raiz(n1);
						System.out.println("El resultado de la operaci�n es " + resultado);
					}

					catch (Exception e) {
						System.out.println("Error en el n�mero");
					}

					break;
				}
				}
			}
			}
			
			System.out.println("");
			System.out.println("�Quieres seguir realizando operaciones?(si/no)");
			paso = op.next();
			
			}while(paso.equalsIgnoreCase("si"));
			
			
			System.out.println("Gracias por usar esta aplicaci�n");
			

		}

	}


