package EjerciosPlatzi;

import java.util.Scanner;

public class IngresandoTiposDato {
    public static void main(String[] args) {

        boolean repetir =true;
        int respuesta = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("bienvenido... podra ingregar tres tipos de datos en java");
        do {
            System.out.println("por favor ingrese \n1. numero Entero \n2. numero Decimal \n3. cadena texto");

            int i = scan.nextInt();
            scan.nextLine();
            //String saltoDeLinea = scan.nextLine();
            double d = Double.parseDouble(scan.nextLine());
            String s = scan.nextLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);

            System.out.println("Desea volver ingresar \n 1.si  2.no");
            respuesta = scan.nextInt();
            repetir = respuesta==1?true:false;

        }while (repetir);
        System.out.println("el programa a finalizado");
    }

}
