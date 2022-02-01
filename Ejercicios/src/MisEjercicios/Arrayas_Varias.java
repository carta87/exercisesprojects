package MisEjercicios;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Arrayas_Varias {
	
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
	    int respuestaoperacion = scanner.nextInt();
	    
	    Operacion1 operacion = new Operacion1(arrayA, arrayB );
	    
	    switch (respuestaoperacion) {
		case 1:  resultado = operacion.suma(operacion);
			   System.out.println("El array suma = " + resultado);
			break;
        case 2: resultado = Operacion1.resta(arrayA, arrayB);
        		System.out.println("El array suma = " + resultado);
			
			break;
        case 3://multiplicacion
	
	      break;

		default:
			break;
		}
    	
    
      System.out.println("desea regresar al inicio   1.si 2. no");
     repetir = scanner.nextInt();
	 
	
       } while (repetir==1);
    }
   
}
 class Operacion1 {
	 
	public List<Integer> arrayA = new ArrayList<>();
	public List<Integer> arrayB = new ArrayList<>();
	//Operacion operacion;

	
	public Operacion1(List<Integer> arrayA, List<Integer> arrayB) {
		this.arrayA = arrayA;
		this.arrayB = arrayB;
	}

	public List<Integer> suma(Operacion1 operacion) {
		List<Integer> arrayC = new ArrayList<>();
		
		
		
		/*
		for (Iterator iterator = arrayA.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
		}
		*/
		// List<Integer> arrayc = arrayA.stream().mapToInt(Integer ->)
		//arrayA + arrayB;
	
		
		for(int i=0; i<operacion.arrayA.size(); i++) {
			//System.out.println("Entro a for");
			//System.out.println("Array A = " + arrayA.get(i));
			//System.out.println("Array B = " + arrayB.get(i));
			arrayC.add(operacion.arrayA.get(i) + operacion.arrayB.get(i));
			//System.out.println("Array C = " + arrayC.get(i));
		}
		
		return arrayC;
	}	 
	
	public static List<Integer> resta(List<Integer> arrayA, List<Integer> arrayB) {
		List<Integer> arrayC = new ArrayList<>();
		/*
		for (Iterator iterator = arrayA.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
		}
		*/
		// List<Integer> arrayc = arrayA.stream().mapToInt(Integer ->)
		//arrayA + arrayB;
	
		
		for(int i=0; i<arrayA.size(); i++) {
			//System.out.println("Array A = " + arrayA.get(i));
			//System.out.println("Array B = " + arrayB.get(i));
			arrayC.add(arrayA.get(i) - arrayB.get(i));
			//System.out.println("Array C = " + arrayC.get(i));
		}
		
		return arrayC;
	}	
 }
 
 
 