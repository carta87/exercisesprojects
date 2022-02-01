package EjerciosPlatzi;

import java.util.Scanner;

public class SolicitudParaOperacionMatematicas {
    int dato1= 0;
    int dato2= 0;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

            int respuestaFinal=0;
            System.out.println("bienvenido .. apliccacion para realizar una operacion \n" );


        do {
            Scanner sc = new Scanner(System.in);
            int respuestaOpercaion = 0;

            System.out.println("por favor ingrese la operacion que desea realizar \n 1. Suma O resta 2.Division");
            respuestaOpercaion= getRespuestaUsuario();

            switch (respuestaOpercaion){
                case 1:
                    System.out.println("por favor ingrese  dato 1" );
                    int x = getRespuestaUsuario();
                    System.out.println("por favor ingrese  dato 2" );
                    int y = getRespuestaUsuario();
                    System.out.println(x + y);
                    break;
                case 2:
                    try {
                        System.out.println(getRespuestaUsuario() / getRespuestaUsuario());
                    }catch (ArithmeticException e) {
                        System.out.println("haz metido un 0 " + e);
                    }
                    break;
                default:
                    System.out.println("seleciono una opcion invalida \n ");
            }
            System.out.println("desea regresar al inicio 1.si 2. no");
            //respuestaFinal= sc.nextInt();
            respuestaFinal = getRespuestaUsuario();

        }while(respuestaFinal==1);
        System.out.println("Gracias por usar la app\n" );
    }

    public static int getRespuestaUsuario () {
        var result = 0;
        var repetir = false;
        do {
            try {
                result = cathExeption();
                repetir = false;
            }catch (Exception e) {
                System.out.println("ha ocurrido un error " + e);
                repetir = true;
            }
        }while(repetir);

        return result;
    }
    public static int cathExeption() throws Exception{
        int respuestaOpercaion= 0;
        Scanner sc = new Scanner(System.in);
        respuestaOpercaion = sc.nextInt();
        return respuestaOpercaion;
    }

}


