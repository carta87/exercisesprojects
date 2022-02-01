package EjerciosHackerRank;

public class ForAnidados {
	public static void main(String[] args) {
		
		/**
		 * mostrarpor pantalla
         #  #  #  #  #   |   * 
         #  #  #  #  #   |   *  * 
         #  #  #  #  #   |   *  *  * 
         #  #  #  #  #   |   *  *  *  * 
         #  #  #  #  #   |   *  *  *  *  * 
		 */
		
		//ejercio1
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print( " # ");				
			}
			System.out.println("");
			
		}
		
		System.out.println("=============ejercio2");
		//ejercio2
		
		for (int i = 5; i >=0; i--) {
			for (int j = 0; j <5; j++) {
				if (i<=j)
				System.out.print( " * ");				
			}
			System.out.println("");
			
		}
		
		
		System.out.println("=============ejercio3");
		//ejercio2
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print( " # ");				
			}
			System.out.print("  |  ");
			for (int j = 0; j <5; j++) {
				if (i>=j)
				System.out.print( " * ");				
			}
			;
			System.out.println("");
			
		}
	
	}

}
