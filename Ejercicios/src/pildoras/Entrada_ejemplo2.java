package pildoras;

import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("introduce tu nombre porfavor ");
		
		String  edad = JOptionPane.showInputDialog("intoduce la eda por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("hola " + nombre_usuario + " el a�o siguiwente tendras " + edad_usuario +" a�os" );
	}
	
}