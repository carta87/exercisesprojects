package MisEjercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Arrayas_variasMejora {
	
public static void main(String[] args) {
	
	List<Integer> arrayA = new ArrayList<>();
    List<Integer> arrayB = new ArrayList<>();
	List<Integer> resultado = new ArrayList<>();
	
	System.out.println(" Bienvenido este programa agregar elmentos en un Array en java\n");
	
	int repetir= 0;
	Scanner scanner =  new Scanner(System.in);
    do {
    	
    	System.out.println("ingrese la cantidad de datos de los arreglos");
    	int respuestaCantidad = scanner.nextInt();
    	
    	
    	for (int i = 0; i < respuestaCantidad; i++) {
    		
    		System.out.println("ingrese el dato numero "+ i +" que desea guardar\n");
        	int datos = scanner.nextInt();
        	arrayA.add(datos);
		}
    	
    	System.out.println("estos son los elementos que guardo en el arrayA =" + arrayA);
	    System.out.println("este es la cantidad de elementos " + arrayA.size()+ "\n");
	    
	    System.out.println("por favor ingrese los datos del array b");
	    
    	for (int i = 0; i < respuestaCantidad; i++) {
    		
    		System.out.println("ingrese el dato numero "+ i +" que desea guardar\n");
        	int datos = scanner.nextInt();
        	arrayB.add(datos);
		}
    	
    	System.out.println("estos son los elementos que guardo en el arrayB =" + arrayB);
	    System.out.println("este es la cantidad de elementos " + arrayB.size() + "\n");
	    
	    System.out.println("selecione la operacion que desea realizar \n 1. Suma  2. Rest 3. Multiplicacion" );
	    int seleccion = scanner.nextInt();
	    
	    Operacion operacion = new Operacion(arrayA, arrayB );
	    
	    resultado = operacion.operarMathe(operacion, seleccion);
	    
	    System.out.println("El resultado final = " + resultado);
	
      System.out.println("desea regresar al inicio 1. si 2. no");
      repetir = scanner.nextInt();
    
	 
       } while (repetir!=2);
    
     System.out.println("Gracias por utilizar la aplicacion");
    }
   
}
 class Operacion  {
	 
	public List<Integer> arrayA = new ArrayList<>();
	public List<Integer> arrayB = new ArrayList<>();
	int seleccion =0;

	public Operacion(List<Integer> arrayA, List<Integer> arrayB) {
		this.arrayA = arrayA;
		this.arrayB = arrayB;
	}

	public List<Integer> operarMathe(Operacion operacion, int seleccion) {
		this.seleccion = seleccion;
		List<Integer> arrayC = new ArrayList<>();
		
		for(int i=0; i<operacion.arrayA.size(); i++) {
			if(seleccion==1) {
				arrayC.add(operacion.arrayA.get(i) + operacion.arrayB.get(i));
			}else if(seleccion==2) {
				arrayC.add(operacion.arrayA.get(i) - operacion.arrayB.get(i));
			}else if(seleccion==3) {
				arrayC.add(operacion.arrayA.get(i) * operacion.arrayB.get(i));
			}else if(seleccion!=1 || seleccion!=2 || seleccion!=3) {
				System.out.println("No sea burrooo!!");
			}
		}
		return arrayC;
	}	 
 }
 
 
 