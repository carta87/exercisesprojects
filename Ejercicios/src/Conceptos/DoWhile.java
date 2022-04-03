package Conceptos;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int respuesta =0;
        do {
            System.out.println("Seleciona el numero de una opcion");
            System.out.println("1. peliculas");
            System.out.println("2. Series");
            System.out.println("0. salir");

            Scanner sc = new  Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 0:
                    System.out.println("gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("1. peliculas");
                    break;
                case 2:
                    System.out.println("2. peliculas");
                    break;
                default:
                    System.out.println("seleciona la opcion valida");

            }
        } while (respuesta != 0);
        System.out.println("se termino el programa");
    }
}
