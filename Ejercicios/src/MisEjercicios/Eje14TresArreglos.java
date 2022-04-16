package MisEjercicios;

import java.util.Iterator;
import java.util.Scanner;

/*
 * programa que va llenar dos arreglos de numeros enteros
 * habra un tercer arreglo en el cual lo monstraremos en orden intercalado 
 * es decir la posicion 0 de cada arreglo a y b y despues seguira asi sucesivamente
 */
public class Eje14TresArreglos {
	public static void main(String[] args) {
		int a[]= new int [10];
		int b[]= new int [10];
		int c[]= new int [20];
		int j = 0;
		
		Scanner teclado =  new Scanner(System.in);
		
		System.out.println("Iniciaremos llennado el arreglo a");
		for(int i = 0; i< a.length; i++) {
			System.out.println("introduce el numero en la posicion " + (i+1) );
			a[i]= teclado.nextInt();
		}
		
		System.out.println("Continuaremos llenando el arreglo b");
		for(int i=0; i<b.length; i++) {
			System.out.println("introduce el numero en la posicion " + (i+1));
			b[i]= teclado.nextInt();
		}
		
		System.out.println("monstraremos el arreglo c con los datos ingresados en los dos arreglos a y b ");
		for (int i = 0; i < 10; i++) {
			
			c[j]= a[i];
			System.out.print( c[j] );
			j++;
			c[j]= b[i];
			System.out.println(" " + c[j] );
			j++;
		}
	}

}
