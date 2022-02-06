package pojo;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	public static void main(String[] args) {
		
		List<PojoPersona> lista = new ArrayList<PojoPersona>();
		
		PojoPersona persona1 = new PojoPersona();
		persona1.setName("Alberto");
	    persona1.setApellidos("Tafur");
	    
	    
	    PojoPersona persona2  = new PojoPersona();
	    persona2.setName("Miguel");
	    persona2.setApellidos("Tafur");
	    
	    //System.out.println(persona1.getName());
	    lista.add(persona1);
	    lista.add(persona2);
	    
	    for (PojoPersona dto: lista) {
	        //syso
	    	System.out.println(dto.getName() + " " + dto.getApellidos());
	    	
	    }
	    
	    
	}

}
