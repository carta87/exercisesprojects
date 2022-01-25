package pildoras;

import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario=JOptionPane.showInputDialog("introduce tu nombre porfavor ");
		
		String  edad=JOptionPane.showInputDialog("intoduce la eda por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("hola " + nombre_usuario + " el año siguiwente tendras " + edad_usuario +" años" );
	}
	
}