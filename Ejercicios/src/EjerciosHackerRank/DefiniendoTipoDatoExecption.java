package EjerciosHackerRank;

import java.util.Scanner;

public class DefiniendoTipoDatoExecption {
    public static void main(String[] args) {

       int respuesta = 0;
       boolean reperir = false;

        System.out.println("bienvedio .. programa para determinar rango de tipo de dato numerico entero \n");

        do {
            System.out.println("por favor ingrese cuanta vantidad de  numeros enteros desea verificar ");
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            for(int i=0; i<t; i++){
                try {
                    System.out.println("ingrese el valor:");
                    long x = sc.nextLong();
                    System.out.println(x + " can be fitted in:");
                    if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) System.out.println("* byte");
                    if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) System.out.println("* short");
                    if(x>Integer.MIN_VALUE && x<=Integer.MAX_VALUE ) System.out.println("* int");
                    if(x>=Long.MAX_VALUE && x<=Long.MAX_VALUE) System.out.println("* long");//L al utilizar numeros


                }catch (Exception e){
                    System.out.println(sc.nextLine() + "can´t be fitted");
                }
                System.out.println("el siguiente");

            }
            System.out.println("desea volver ingresar al inicio \n1. si  2.no");
            respuesta = sc.nextInt();
            reperir = respuesta==1?true:false;
        }while (reperir);

    }
}
