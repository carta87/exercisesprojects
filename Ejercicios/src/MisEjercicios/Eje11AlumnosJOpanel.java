package MisEjercicios;

import javax.swing.JOptionPane;

/* 
 * program que nos permitira ingresar el numero de registro de alumno y despues la calificacion respectiva,
 * el programa mostrara si aprobo segun la calificacion.
 */
public class Eje11AlumnosJOpanel {

	public static void main(String[] args) {
		int calificacion = 0;
		 String identificacionAlumno = "";
		boolean reprobado = false;
		
		for (int i= 0; i<3; i++) {
			identificacionAlumno = JOptionPane.showInputDialog("introduzca identificacion " + "\n" +  "alumno numero " + (i+1));
			calificacion = Integer.parseInt(JOptionPane.showInputDialog("introduzca la calificacion correspondiente"));
			if(calificacion > 6 )reprobado= true;
			if (reprobado){
				JOptionPane.showMessageDialog(null, "El alumno " + identificacionAlumno +  " reprobrado");
			}
			else
			{
				JOptionPane.showInternalMessageDialog(null, "el alumno " +  identificacionAlumno +  " aprobado");
			}
		}
		

	}

}
