package ProgramacionBasica;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        int z = 2;

        //devuleve un entero hacia ariba = 3.0 redondeo
        System.out.println(Math.ceil(x));

        //devuelve un numero entero hacia abajo= 2.0 redondeo
        System.out.println(Math.floor(x));

        //devielve un numero elevado a otro
        System.out.println(Math.pow(y,z));

        //devuelve el valor mayor
        System.out.println(Math.max(y,x));

        //Devielve la raiz cuadrada
        System.out.println((int) Math.sqrt(y)); //Casting

        //area de un circulo = pi*r2
        System.out.println(Math.PI*Math.pow(y,2));

        //area de una esfera = 4*PI*r2
        System.out.println(4*Math.PI*Math.pow(y,2));

        //volumen de una esfera = (4/3)*pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));

    }


}
