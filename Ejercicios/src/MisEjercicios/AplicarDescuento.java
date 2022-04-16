package MisEjercicios;

import java.util.Scanner;

/**
 *  ejercicio para aplicar descuento segun la cantidad de compra del cliente
 * utilizaremos dos variables una para almacenar la cantidad de la compra 
 * y la segunda para conocer el valor total a pagar aplicando con descuento o no el cliente  
 */
public class AplicarDescuento {
	
	public static void main(String[] args) {  
		int cantidadCompra = 0;
		double valorPagar= 0;
		int respuesta = 0;
		
		
		do {

			Scanner sc =  new Scanner(System.in);
			System.out.println("por favor ingrese la cantidad de pan que compro");
			cantidadCompra = sc.nextInt();
			
			if(cantidadCompra>=50 && cantidadCompra<100)
			{valorPagar= cantidadCompra * 4.5;}
			else if (cantidadCompra>=100){valorPagar = cantidadCompra* 4;}
			else {valorPagar = cantidadCompra*5;}
			
			System.out.println("el cantidad de pan que compro fue" + cantidadCompra);
			System.out.println("segun la cantidad de su compra se aplicara  el descuento y su valor a pagar es:  " + valorPagar);
			
		    System.out.println("Desea salir de la aplicacion digite 0 si no digite cualquier numero " );	
		    respuesta = sc.nextInt();
			
		}while(respuesta!= 0);	
	    System.out.println("Gracias por utilizar la aplicacion");	
	}

}
