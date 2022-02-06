package pojo;

/**
 * POJO  en Java significa Plain Old Java Object.  en español un objecto JAVA plano y viejo
 Es un objeto ordinario, que no está sujeto a ninguna restricción especial. El archivo POJO no requiere ninguna ruta de clase especial. 
 Aumenta la legibilidad y reutilización de un programa Java. Los POJO son ahora ampliamente aceptados debido a su fácil mantenimiento.
 Son fáciles de leer y escribir. Una clase POJO no tiene ninguna convención de nomenclatura para propiedades y métodos.
 No está vinculado a ningún java framework; cualquier programa Java puede usarlo. NO TIENE NINGUNA HERRENCIA NI IMPLEMENTACION 

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
