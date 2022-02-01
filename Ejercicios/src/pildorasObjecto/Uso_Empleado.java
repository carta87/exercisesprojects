package pildorasObjecto;


import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("ana martinez", 85000, 2002, 12,3);
		Empleado empleado2=new Empleado("diego ramirez", 95000, 2006, 12,3);
		Empleado empleado3=new Empleado("fernando ibañez", 105000, 2008, 12,3);
		
		empleado1.subesueldo(5);
		empleado2.subesueldo(5);
		empleado3.subesueldo(5);
		
		System.out.println("nombre: " + empleado1.damenombre() + "sueldo: " + empleado1.damesueldo() +
		" fecha de alta: " + empleado1.damefechacontrato());
		
		System.out.println("nombre: " + empleado2.damenombre() + "sueldo: " + empleado2.damesueldo() +
				" fecha de alta: " + empleado2.damefechacontrato());
		
		System.out.println("nombre: " + empleado3.damenombre() + "sueldo: " + empleado3.damesueldo() +
				" fecha de alta: " + empleado3.damefechacontrato());*/
		
		Empleado[] misempleados=new Empleado[3];
		
		
		misempleados [0]=new Empleado("ana martinez", 85000, 2002, 12, 3);
		misempleados [1]=new Empleado("diego ramirez", 95000, 2006, 12,3);
		misempleados [2]=new Empleado("fernando ibañez", 105000, 2008, 12,3);
		
		/*for(int i=0;i<3;i++){
			misempleados[i].subesueldo(5);
			
		}*/
		
		for( Empleado e:misempleados) {
			
			e.subesueldo(5);
			
			
		}
		
		/*for(int i=0; i<3;i++) {
			
			System.out.println( "nombre: " + misempleados[i].damenombre() + 
					" sueldo: " +misempleados[i].damenombre() + " fecha de alta" + misempleados[i].damefechacontrato());
		}*/
		
		for(Empleado e: misempleados) {System.out.println( "nombre: " + e.damenombre() + 
				" sueldo: " +e.damenombre() + " fecha de alta" + e.damefechacontrato());
			
			
		}
		
	}

}

class Empleado{
	
	public Empleado( String nom, double sue, int agno,int mes, int dia){
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar Calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altacontrato =Calendario.getTime();
		
		
	}
	
	public String damenombre() {//getter
		return nombre;
	}
	public double damesueldo() {//getter
		
		return sueldo;
		
	}
	
	public Date damefechacontrato() {//getter
		
		return altacontrato;
			
	}
	
	public void subesueldo(double porcentaje) {//setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altacontrato;
	
	
}