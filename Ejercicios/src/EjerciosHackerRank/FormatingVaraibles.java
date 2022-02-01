package EjerciosHackerRank;

import java.util.Iterator;
import java.util.Scanner;

public class FormatingVaraibles {

	public static void main(String[] args) {

		//Scanner in = new Scanner(System.in);
		
	      int t = 5;//in.nextInt();
		
		//for (int i = 0; i <t ; i++) {
			
			int a = 0; //in.nextInt();
			int b = 2;//in.nextInt();
			int n= 10;//in.nextInt();
			int result= 0;
			int potencia;
			
			result = a;
            for (int j = 0; j <n; j++) {
            	potencia = (int)Math.pow(2,j)* b;
            	result = result +potencia;
            	System.out.println("valor de potencia"+j+" = " + result );		
			} 
			
			/*
			 * class Solution{
    public static void main(String []argh){
        int result= 0;
        int potencia;
        
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result = a;
            for (int j = 0; j<n; j++) {
                potencia = (int)Math.pow(2,j)* b;
                result = result +potencia;
                System.out.print(result+" ");        
            } 
            System.out.println("");
        }
        in.close();
    }
}
			 * 
			 * 
			 */
			//System.out.println("valor t " );
			//System.out.println("valor n " + n);
			//System.out.println("valor b " + b);
			//System.out.println("valor a " + a);
		
			
			/*for (int j = 0; j <n; j++) {
				 n= j*b;
				System.out.println("valor j " + j);
				System.out.println("valor n " + n);
				System.out.println("valor b " + b);
				
				
			}System.out.println(n + a);
		     // n = a+  b; 
		     //5 + i *3 = 8
			//System.out.println(n + " " + (n*2) ); 
			
		}*/
		//}
		//in.close();
	}

}
