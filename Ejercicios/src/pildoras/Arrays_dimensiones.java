package pildoras;

public class Arrays_dimensiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]  matrix =new int[2][3];
		
		matrix[0][0]=15;
		matrix[0][1]=23;
		matrix[0][2]=55;
		
		matrix[1][0]=85;		
		matrix[1][1]=33;
		matrix[1][2]=9;
		
		for(int i=0;i<2;i++){
			System.out.println();
			for(int j=0 ;j<3 ;j++){
				
				System.out.print(matrix[i][j]+ " ");
			}
		}
		
	}

}
