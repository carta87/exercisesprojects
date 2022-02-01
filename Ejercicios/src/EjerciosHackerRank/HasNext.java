package EjerciosHackerRank;

import java.util.Scanner;

public class HasNext {

	public static void main(String[] args) {

		int num = 1;
		int numeroAcetado= 23;

		Scanner scanner = new Scanner(System.in);
		//String respuesta = scanner.nextLine();

		while (scanner.hasNext()) {

			System.out.println(num + " " + scanner.nextLine());
			num++;

		}

		/*
		 * public static void main(String[] args) { 
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * int dato1 = 1;
		 * 
		 * while(scanner.hasNext()) {
		 * 
		 *    System.out.println(dato1 + " " + scanner.nextLine());
		 *    dato1++;
		 *     }
		 *   } 
		 * }
		 */
	}

}
