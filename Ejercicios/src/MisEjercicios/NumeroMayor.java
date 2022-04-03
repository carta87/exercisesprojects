package MisEjercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		
		int array[]= new int[5];
		int mayor =  array[0];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("por favor ingrese los 5 numeros para saber cual es el mayor");
		for(int i = 0; i< array.length; i++) {
			
		array[i]= sc.nextInt();
		
		if (array[i]> mayor) {
			mayor= array[i];
		}
		}
		System.out.println("el numero mayor que ingreso es " + mayor);
		
	}
	
//	List<Integer> lista = new ArrayList<>();


}
