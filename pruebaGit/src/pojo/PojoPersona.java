package pojo;

/**
 * POJO  en Java significa Plain Old Java Object.  en espa�ol un objecto JAVA plano y viejo
 Es un objeto ordinario, que no est� sujeto a ninguna restricci�n especial. El archivo POJO no requiere ninguna ruta de clase especial. 
 Aumenta la legibilidad y reutilizaci�n de un programa Java. Los POJO son ahora ampliamente aceptados debido a su f�cil mantenimiento.
 Son f�ciles de leer y escribir. Una clase POJO no tiene ninguna convenci�n de nomenclatura para propiedades y m�todos.
 No est� vinculado a ning�n java framework; cualquier programa Java puede usarlo. NO TIENE NINGUNA HERRENCIA NI IMPLEMENTACION 

Generalmente, una clase POJO contiene variables y sus Getters y Setters.
 */

public class PojoPersona {
 private String name;
 private String apellidos;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
 



}
