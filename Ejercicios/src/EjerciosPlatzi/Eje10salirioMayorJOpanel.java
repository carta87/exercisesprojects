package EjerciosPlatzi;

import javax.swing.JOptionPane;

/*
 * programa que permitrira ingresar la cantidad de sueldos que desee el usuario.
 * Despues va realizar una comparacion para monstrarle cual es sueldo maximo.
 */


public class Eje10salirioMayorJOpanel {

	public static void main(String[] args) {
		
		int cantidadSueldos =0, sueldo = 0, sueldoMaximo = 0;
		boolean primerSueldo = false;
		
		cantidadSueldos =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos que desea ingresar"));
		for(int i= 0; i < cantidadSueldos; i++) {
		sueldo = Integer.parseInt(JOptionPane.showInputDialog("ingrese el sueldo numero" + (i+1)));
		 
		if(primerSueldo == false ) {
			
			sueldoMaximo = sueldo;
			primerSueldo = true;
		}
			
		if (sueldo> sueldoMaximo) sueldoMaximo = sueldo;
			
		}
		JOptionPane.showInputDialog(null, "el sueldo maximo es ", + sueldoMaximo);
	}

}
