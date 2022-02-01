package pildoras;

import javax.swing.JOptionPane;

public class Prueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean Arroba = false;
		String mail = JOptionPane.showInputDialog("introduce mail");

		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {

				Arroba = true;
			}

		}
		if (Arroba == true ) {
			System.out.println("es corecto");
		} else {
			System.out.println("es incorecto");
		}
	}
}
