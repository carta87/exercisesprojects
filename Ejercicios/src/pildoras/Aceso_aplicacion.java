package pildoras;

import javax.swing.*;

public class Aceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "carlos";
		String contrasena = "";
		
		while (clave.equals(contrasena) == false) {

			contrasena = JOptionPane.showInputDialog("introduce la contrasena, por favor");

			if (clave.equals(contrasena) == false) {
				System.out.println(" Contrasena incorecta");
			}
		}
		System.out.println("contrasena correcta acceso permitido");
	}

}
