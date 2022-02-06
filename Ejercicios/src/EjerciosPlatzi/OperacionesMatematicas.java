package EjerciosPlatzi;

public class OperacionesMatematicas {

	public static void main(String[] args) {
		
		//Math.PI  3.141592653589793
		//Math.E  2.718281828459045
		
		double x = 2.1;
		double y =3;

		System.out.println(Math.ceil(x));// (redondear hacia arriba)
		System.out.println(Math.floor(x)); //  (redondear hacia abajo)

		System.out.println(Math.pow(x, y)); //0 (n�mero elevado a una potencia)
		
		System.out.println(Math.sqrt(y));// 1.73... (ra�z cuadrada)

		System.out.println(Math.max(x, y)); // 3.0 (el n�mero m�s grande)

		// �rea de un c�rculo (PI * r^2):
		System.out.println(Math.PI * Math.pow(x, y));

		// �rea de una esfera (4 * PI * r^2):
		System.out.println(4 * Math.PI * Math.pow(y, 2));

		// Volumen de una esfera ( (4/3) * PI * r^3):
		System.out.println((4/3) * Math.PI * Math.pow(y, 3));

	}

}
