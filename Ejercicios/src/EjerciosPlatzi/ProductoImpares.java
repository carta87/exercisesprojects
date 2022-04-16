package EjerciosPlatzi;
/*
 * programa que me permita ver el producto de la muliplicacion de los primeros 10 numeros impares
 * los cuales son 1,3,5,7,9,11,13,15,17,19
 */
public class ProductoImpares {

	public static void main(String[] args) {
		long producto = 1;
		
		for (int i = 1; i < 20; i+=2) {
			
			producto = producto *  i;
			
		}
	System.out.println("el resulatado de la multiplicacion de lso primeros 10 numeros impares es " + producto);

	}

}
