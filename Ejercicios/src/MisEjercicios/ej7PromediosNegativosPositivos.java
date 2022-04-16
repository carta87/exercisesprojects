package MisEjercicios;
/*
 * programa que me permitira realizar el promedio de  numeros enteros dependiendo si son positivos o negativos 
 * ademas de mostrar cuantas veces ingrese de valores negativos o positivos
 * finalmente si es el valor es cerrro me mostrara que no es posible realizar el promedio pero me mostrara la cantidad..
 * En este caso la cantidad de valores ingresados va ser 10 numeros
 */

import java.util.Scanner;

public class ej7PromediosNegativosPositivos {

	public static void main(String[] args) {
		int num = 0, cantidadPositivos = 0, cantidadNegativos = 0, cantidadCerros = 0, sumaPositivos = 0,
				sumaNegativos = 0;
		double promedioPositivos = 0, promedioNegativos = 0;
		int k = 0;

		Scanner teclado = new Scanner(System.in);
		
		while (k < 10) {
		    
			System.out.println("por favor ingrese el numero");
			num = teclado.nextInt();
			
			
			if (num == 0)cantidadCerros++;
			else if(num > 0) {
				cantidadPositivos++;
				sumaPositivos = sumaPositivos + num;

			} else {
				cantidadNegativos++;
				sumaNegativos = num + sumaNegativos;

			}
			k++;
		}
		if (cantidadPositivos ==0 ) System.out.println(  "no es posible realizar promedio de los positivos");
		
		else {
			promedioPositivos =  sumaPositivos/cantidadPositivos;
			System.out.println("el promedio de la suma de los positivos es " + promedioPositivos);	
		}
		if (cantidadNegativos ==0)System.out.println( "no es posible realizar la suma de los negativos");
		else {
			promedioNegativos = sumaNegativos/cantidadNegativos;
			System.out.println("el promedio de los negativos es " + promedioNegativos);
		}
		System.out.println("la cantidad de numeros con el valor cerro fue" + cantidadCerros);
		

	}

}
