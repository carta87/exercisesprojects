package EjerciosPlatzi;

/**
 * Programa para esteblecer numero mayor
 * Primero establecer dos variables y darles mayor.
 * Segundo lograr que el programa resuelva cual de las dos variables es mayor
 * tercero Probar el programa
 */
public class OPeradorTernario {
    public static void main(String[] args) {
        var a = 6;
        var b = 5;
        var mayor = 0;

        if ( a>b ){ // atravez if else
            System.out.println(" el valor de la variable a es mayor");
        } else {
            System.out.println("el valor de la variable b es mayor");
        }
        mayor=(a>b)?a:b; // operarador ternario
        System.out.println("el numero mayor de las dos variables es " + mayor);

        mayor =  Math.max(a,b);// importando la clase math
        System.out.println("este es el resiltado llamando a la clase math " + mayor);

    }
}
