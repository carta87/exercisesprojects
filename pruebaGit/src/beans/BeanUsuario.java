package beans;

import java.io.Serializable;

public class BeanUsuario implements Serializable {//debe implemetar
	
	private String name;//sus modificadores deben ser privados
	private String apellido;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAppellido() {
		return apellido;
	}

	public void setAppellido(String appellido) {
		apellido = appellido;
	}
	
	
}
