package MisEjercicios;

import java.util.Scanner;

/*
 * programa que me permitira establecer cuantos alumnos superaron cierta nota 
 * a diferencia de si es reprobado, aprobado o exelente.
 * se ingresara los datos por teclado 
 */
public class Eje8AlumnosCalificaciones {

	public static void main(String[] args) {
		
		int aprobados = 0, exelentes = 0, reprobados = 0;
		float calificacion = 0;
		int i = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		while(i <= 6) {
			System.out.println("por favor ingrese las calificaciones de seis alunmos ");
			calificacion =  teclado.nextFloat();
			if(calificacion >= 9 && calificacion <= 10) {
				exelentes++;
			}
			else if (calificacion >= 6 && calificacion < 9   ) {
				aprobados++;
			}
			else {
				reprobados++;
			}
			i++;
		}
		System.out.println("la cantidad de alumnos con calificacion exelene  es " + exelentes + " los que fueron aprobados fueron "
				         + aprobados + " finalmente los reaprobados fueron " + reprobados); 

	}

}
