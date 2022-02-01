/**
 * 
 */
package EjerciosHackerRank;

import java.util.Iterator;

/**
 * dado un numero entero N obtener el siguiente resultado: Ejemplo: si N = 4
 * N(1) -> 1 = 1 
 * N(2) -> 1 + 2 = 3 
 * N(3) -> 1 + 2 + 3 = 6 
 * N(4) -> 1 + 2 + 3 + 4 = 10
 */
public class ForAnidadosSum {

	public static void main(String[] args) {
		
		int N =5;
		
		for (int i = 1; i < N; i++) {
			System.out.print("N(" + i + ") -> ");
			int sum =0;
			for (int j = 1; j <= i; j++) {
				sum = sum + j;
				System.out.print(j);
				if(j==i) {
					System.out.print(" = ");
				}else {
					System.out.print(" + ");
				}
			}
			System.out.println(sum);
			System.out.println("\n");

		}
		
		int dato1 = 2;
		int dato2 = 4;
		int sum = 0;
		for (int i = 0; i <= 5; i++) {
			 sum = dato1 +dato2; 
			
		}System.out.println(sum);
	}
	


}
