package EjerciosHackerRank;

import java.util.Scanner;

public class Printf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================");
		for(int i=0; i<3; i++) {
			String s1= sc.next();
			int x = sc.nextInt();
			//System.out.printf("%10s", s1);
			//System.out.printf( "%10s\t %02d%n", s1,x );

			System.out.printf( "%s\t %d %n", s1,x);
			
		}
		System.out.println("=================");
	}
	

}
