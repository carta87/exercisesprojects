package MisEjercicios;

import java.util.Scanner;

/*
 * programa que me permitira almacenar en un arreglo cierta cantidad de numeros internos
 * para mostrarlos de forma inversa.
 */
public class Eje12ArrayInverso {

	public static void main(String[] args) {
		 int arr[]= new int[5];
		 Scanner sc = new Scanner(System.in);
				 
		 
		 
		 for(int i=0; i< arr.length; i++ ) {
			 
			 System.out.println("por favor ingresar el dato en la posicion " + (i+1));
			 arr[i] = sc.nextInt();
			 
		 }
		 int j = 4;
		 while(j>= 0) {
			 System.out.print(" | " + arr[j]);
			 j--;
		 }
		 /*
		for (int i : arr) {
			System.out.println(i);
		}*/

	}

}
