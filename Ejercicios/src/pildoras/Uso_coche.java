package pildoras;

public class Uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//coche kia=new coche(); //ejemplar de clase.  isnstanciar de clase	

		coche micoche=new coche();
		
		micoche.establebe_color("rojo");
		
		micoche.modificar_ruedas();

		System.out.println("la cantida de ruedas es igual a = "+ micoche.obtener_ruedas());
		
		System.out.println(micoche.dime_datos_generales());
		micoche.modificar_largo();
		
		System.out.println("el largo es igual a = " + micoche.obtener_largo());
		
		
		micoche.configura_asiestos("si");
		
		System.out.println(micoche.dime_asientos());
		
		
		//System.out.println("este coche tiene " + kia.ruedas + " ruedas");
	}

}


