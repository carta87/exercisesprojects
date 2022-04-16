package MisEjercicios;

import java.util.Scanner;

/*
 * programa que nos permitira ingresar numeros enteros pero lo mostrara en diferente orden
 */

public class Eje13InsertarDiferenteOrden {
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner teclado =  new Scanner(System.in);
		//ingresar los numeros
		for(int i=0; i<arr.length; i++) {
			System.out.println("por favor ingrese el numero en la posicion " + (i+1));
			arr[i] = teclado.nextInt();
		}
		// mostrar o imprimir los numeros
		System.out.println("los numeros que ingreso en orden de primero a ultimo");
		for(int i = 0; i<arr.length/2; i++ ) {
			System.out.println("el numero en la posicion " +  arr[i] );
			System.out.println("el numero en la posicion "  + arr[9-i]);
		}
	}

}
