package MisEjercicios;

import java.util.Iterator;
import java.util.Scanner;

public class ComprasTienda {
	
 public static void main(String[] args) {
	 
	 int ventas[] =  new int [10];
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("ingrese las ventas del mes: ");
	 for(int i=0; i< ventas.length; i++) {
		 System.out.println("ventas " + (i+1));
		 ventas[i]= sc.nextInt();
		 
	 }
	 int k=0;
	 int totalContador= 0;
	 int totalVentasSuperior = 0;
	 while (k<10) {
		 
		 if(ventas[k]>50000) {
			 System.out.println("$ "+ ventas[k]  );
			 totalVentasSuperior = +ventas[k];
			 
			 totalContador++;
		 }
		 k++;
		 
	 }
	 System.out.println("este es el suma de solo las ventas superiores" + totalVentasSuperior);
	 System.out.println("el total de ventas mayores a 50,000 es" + totalContador);
	
}
}
