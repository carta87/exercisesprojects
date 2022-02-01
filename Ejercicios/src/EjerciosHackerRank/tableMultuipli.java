package EjerciosHackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tableMultuipli {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		boolean repetir = true;

		while (repetir == true) {

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			int N = Integer.parseInt(bufferedReader.readLine().trim());

			if (N< 100) {
				for (int i = 1; i < 10; i++) {
					int result = N * i;
					System.out.println(N + " x " + i + " = " + result);
					//System.out.println("valor i " + i);
					//System.out.println("valor N " + N);
					//System.out.println("valor resul " + result);
               
				}
				 repetir= false;
				 
			}
			else {
				System.out.println("has ingresado un valor numerico equivocado");
			}
			
		}
	}

}
