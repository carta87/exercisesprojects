package beans;

/**
Un JavaBean es una clase Java que debe seguir las siguientes convenciones:

Debe tener un constructor no-arg.
Debe ser serializable.
Debe proporcionar métodos para establecer y obtener los valores de las propiedades, conocidos como métodos getter y setter.

Ventajas de JavaBean
Las propiedades y métodos de JavaBean se pueden exponer a otra aplicación.
Proporciona una facilidad para reutilizar los componentes del software.

Desventajas de JavaBean

JavaBeans son mutables. Por lo tanto, no puede aprovechar las ventajas de los objetos inmutables.
La creación del método setter y getter para cada propiedad por separado puede conducir al código repetitivo.
 */

public class Usuario {
	
	/*pasando en su zona de parametros los atributos o cmapos afeacta  
    si esta impmentado el metodo en otras partes del codigo el metodo 
	
	public  void insetUsuario(String name, String apellido ) {
		String sql = "Insert  usuario (nombre, apellidos) VALUES (  " + name  + " " + apellido + ")" ;
	}*/
	
	public void insetUsuario(BeanUsuario usu) {
		String sql = "Insert  usuario (nombre, apellidos) VALUES (  " + usu.getName() + " " + usu.getAppellido() + ")" ;
	}

	public static void main(String[] args) {	
     
	}

}
