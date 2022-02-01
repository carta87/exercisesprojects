package pildorasObjecto;

public class coche {
	
	private int largo;	
	private int ruedas;	
	private int motor;
	private int ancho;
	private int peso_plataforma;
	private String  color;
	private int peso_total;
	private boolean asientos_cuero;
	private boolean climatizador;
	
	public coche() {		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	
public String dime_datos_generales (){//GETTER 

	return "la plataforma del vehiculo tiene " + ruedas +"ruedas, ademas de la siguuiente altura " + ancho +
"metros y un peso de plataforma de " + peso_plataforma + "kg";
}


public void establebe_color(String color_coche){//setter
	
	color=color_coche;
}

public String dime_color(){
	
	return "el color del coche es" + color;
}

public void modificar_ruedas(){
	
	 ruedas=ruedas+1;
	
}

public int obtener_ruedas() {
	
	return ruedas;
}

public void modificar_largo() {
	
	largo=4000;
}

public int obtener_largo(){
	
	return largo;
}

public void configura_asiestos(String asientos_cuero){//setter

	if(asientos_cuero=="si"){
		
		this.asientos_cuero=true;
				}
	else {
		this.asientos_cuero=false;
	}
	
}

public String dime_asientos() {//Getter
	if(asientos_cuero==true) {
		return "el coche tiene asientos de cuero";
			} else {
				return "el coche tiene asientos de serie";
			}
}

public void configura_climatizador(String climatizador){//setter
	
if(climatizador.equalsIgnoreCase("si")){
	this.climatizador=true;	
} else {
	this.climatizador=false;
}
}

public String dime_climatizador (){//getter
	
	if(climatizador==true){
		
		return "el coche incorpora climatizador";
		
	}else {
		
		return "el coche lleva aire acondicionado";
	}
}

public int precio_coche(){//getter
	
	int precio_final=10000;
	
	if(asientos_cuero==true){
		precio_final+=2000;
	}
	if(climatizador==true){
      precio_final+=1500;		
	}
	
	return precio_final;
}


}
