package pildoras;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*int [2] mi_matirz=new int[3];
		mi_matirz[0]=12;
		mi_matirz[1]=3;
		mi_matirz[2]=45;*/
		
		int[] mi_matriz={12,5,23,25,25,12};
		String[] mi_otra_matriz= {"lunes", "martes ", "miercoles ", "jueves ", "viernes "};
		
 for(int i=0; i<mi_matriz.length; i++) {
	 
	 System.out.println(" valor del indice " + i + "=" +mi_matriz[i]);
	 System.out.println(" valor del indice " + i + "=" +mi_otra_matriz[i]);
 }
}
}
