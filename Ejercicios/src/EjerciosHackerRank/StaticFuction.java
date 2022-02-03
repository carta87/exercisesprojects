package EjerciosHackerRank;

import java.io.*;

import java.text.*;
import java.math.*;
import java.util.Scanner;
import java.util.regex.*;

public class StaticFuction {
    
	static int B;
	static int H;
	static boolean flag;
	
	static {
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();
		if(B>0 && H>0) { // flag = (B>0)?true:false;
			flag =true;
		   }else {
			     System.out.println("java.lang.Exception: Breadth and height must be positive");
			     flag= false;
		      }
		
		  
         }

	public static void main(String[] args) {

		if (flag) {
			int area = B*H;
			System.out.println("valor de la operacion = " + area);

		}

	}

}
