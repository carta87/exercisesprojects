package MisEjercicios;
//Programa que me permite solo sacar el promedio de numeros positivos

import java.util.Scanner;

public class DowhilePromedioSoloPositivos {

	public static void main(String[] args) {
		
		int num= 0, suma= 0, contador= 0;  
	    double promedrio;
	    
	    Scanner sc = new Scanner(System.in);
		
        System.out.println("Progrma de Suma de numeros Positivos\n" + "ingrese el primer Numero" );
        num= sc.nextInt();
        
        while(num > 0) {
        	suma = suma + num;
        	contador++;
        	
        	System.out.println("Ingrese el siguiente numero por favor");
        	num = sc.nextInt();
        }
        
        if(contador== 0) {
        	System.out.println("no esposible realizar el promedio");
        }
        else {
        	promedrio = suma/contador;
        	System.out.println("el promedio de los numeros ingresados es  " + promedrio);
        }
	}

}
