package pildoras;
import javax.swing.*;
public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("introduce tu genero (H/M)");
			
		} while(genero.equalsIgnoreCase("H")==false  && genero.equalsIgnoreCase("M")==false);
int estatura=Integer.parseInt(JOptionPane.showInputDialog( "introduce tu estatura cm") );
int pesoideal=0;

if(genero.equalsIgnoreCase("H")){
	pesoideal=estatura-110;} 

else if(genero.equalsIgnoreCase("M")){
	pesoideal=estatura-120;
	}
System.out.println("tu peso ideal es "+ pesoideal + "kl");
	}
}
