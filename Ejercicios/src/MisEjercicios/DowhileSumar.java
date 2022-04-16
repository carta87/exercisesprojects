package MisEjercicios;

import java.util.Scanner;

/**
 * crear programa que realize la suma de numeros enteros cuando introduzca un
 * cerro el programa finalizara el ingreso de datos sumara los numeros
 * ingresados y lo mostrara
 * 
 * @author USUARIO
 *
 */

public class DowhileSumar {

	public static void main(String[] args) {
		int suma = 0, num = 0;
		Scanner sc = new Scanner(System.in);

		System.out
				.println("Programa que le permitira realizar la suma de numeros enteros" + " para finalizar ingrese 0");

		do {
			System.out.println("ingrese el numero entero");
			num = sc.nextInt();
  
			suma = suma + num;

		} while (num != 0);
        
		System.out.println("el valor de la suma es = " + suma);
	}

}
