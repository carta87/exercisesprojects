package pildoras;
import java.util.*;
public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		int Numero=0;
		int Intentos=0;
		
		System.out.println("este es mi numero "+ aleatorio);
		while (Numero!=aleatorio) {
			Intentos ++;
			System.out.println("introduce un numero por favor");
					Numero=entrada.nextInt();
					if(aleatorio<Numero){
						System.out.println("mas Bajo");
					}
					else if(aleatorio>Numero){
						
					System.out.println("mas alto");
					}				
		}
		System.out.println("correcto");
		System.out.println( Intentos + " = cuantas veces lo intenteaste");

	}
}
