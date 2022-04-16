package MisEjercicios;

import java.util.Scanner;

/*
 * crear u programa para la gestion de facturas de una empresa que se dedica a la venta de  azucar por kilos.
 * en cada factura se ingresara el codigo del producto vendido.
 * ademas se ingresara la cantidad de kilos vendidos y el total a pagar por kilos.
 * de 5 facturas introducidas, se pide : facturacion total, cantidad de kilos vendidos, cuantas facturas 
 * fueron emetidas por mas de $1000.
 */

public class ej8GestionDeFacturas {

	public static void main(String[] args) {
	
		String codigo = "";
		int kilos = 0, contador = 0, totalKilos = 0;
		float precio = 0;
		float totalFacturaindividual = 0;
		float totalFacturacionGlogal = 0;
		Scanner teclado =  new Scanner(System.in);
				
		for(int i= 1; i<=5; i++) {
			System.out.println("Registro de datos factura numero " + i );
			System.out.println("**********  ingrese Codigo ********** ");
			codigo= teclado.next();
			System.out.println("** ingrese numero de kilos vendidos **");
			kilos = teclado.nextInt();
			System.out.println("** ingrese el valor del producto *****");
			precio =  teclado.nextFloat();
			totalFacturaindividual = kilos * precio;
			totalFacturacionGlogal = totalFacturaindividual + totalFacturacionGlogal;
			
			teclado.close();
			if(totalFacturaindividual >= 1000) {//superen el valor de factura vendida
				contador++;
			}
			totalKilos= totalKilos + kilos;
		}
		System.out.println("Datos Generales de facturacion");
		System.out.println("la cantidad de kilosn vendidos fueron: " + totalKilos + " los cuales suman el Valor total "
				          + totalFacturacionGlogal + "\n y las ventas que superaron el tope establecido de 1000 fueron " +
				          contador);
		
	}

}
