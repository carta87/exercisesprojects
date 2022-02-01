package pildoras;

public class Bucle_for extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "carlos";
		int edad = 34;
		int fechaAnual = 2022;
		
for( int i=0; i<1; i++) {
	System.out.println();
	System.out.println(name);
    System.out.println(name.valueOf(edad) +2);// se transforma de un int a String
    System.out.println();
   // edad= +2;
	getDateByAdult(1987, 2022);
	
       }
	}
	
	private static int getDateByAdult(int fechaActual, int nacimiento ) {
		int result = fechaActual - nacimiento;
		return result;
	}

}
