package EjerciosPlatzi;

import java.util.Scanner;

public class EjercicioIf {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean repetir = false;
        int respuesta =0;

        System.out.println("bienvenido este preograma le permitita comprobar si un numero es" +
                "par o impar dentro deun rango de numeros 1 a 100 ");

        do {
            System.out.println("por favor ingrese el numero");
            int n = sc.nextInt();

            if (n>1 && n < 100) {
                System.out.println("Nuerpo valido");
                repetir = false;
                 if(n % 2 != 0){
                     System.out.println("este numero es impar");
                }else {
                     System.out.println("este numero es par");
                 }
            } else {
                System.out.println("Nuevo invalido");
                repetir = true;
            }
            System.out.println("desea volver a ingresar 1.Si 2.No");
             respuesta = sc.nextInt();
             if( respuesta  == 1){
                 repetir =true;
             }else {
                 repetir= false;
             }


        }while(repetir );
        System.out.println("el programa ha terminado ");

        /*
        if( n % 2 != 0 &&  n < 100){

        }else if (n % 2 = 1 ) {
            System.out.println("este numero es par");
        }
        else{
            System.out.println("este numero no esta en rango solicitado");
        }

         */
    }
}
