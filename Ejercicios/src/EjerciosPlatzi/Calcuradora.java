package EjerciosPlatzi;

import java.util.Scanner;

public class Calcuradora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int respuestaPrimerDato=0, respuestaSegundoDato, respuestaOperacion, respuestaUsiario = 0;

        do {
            System.out.println("Bienvenido este programa mostrara el resultado de las operaciones " +
                    "basicas de matematicas dependiendo de los valores numericos que ingrese ");

            System.out.println("ingrese por favor el primer numero");
            respuestaPrimerDato = Integer.valueOf(sc.nextInt());

            System.out.println("ingrese el segundo numero");
            respuestaSegundoDato = Integer.valueOf(sc.nextInt());

            System.out.println("los numeros que realizara la opertaciones matematicas basicas son "
                    + respuestaPrimerDato + " y " + respuestaSegundoDato);

            System.out.println("por favor selecione la operacion que desea realizar ");
            System.out.println("1.suma  2.resta  3.multiplicacion 4.division");
            respuestaOperacion = Integer.valueOf(sc.nextInt());

            Operaciones operaciones = new Operaciones(respuestaPrimerDato, respuestaSegundoDato);

            switch (respuestaOperacion) {
                case 1://suma
                    System.out.println("el resultado de la suma es igua:" + operaciones.suma());
                    break;
                case 2://resta
                    System.out.println("el resultado de la resta es igua:" + operaciones.resta());
                    break;
                case 3: //Multuplicacion
                    System.out.println("el resultado de la Multiplicacion es igua:" +
                            operaciones.multiplicacion());
                    break;
                case 4: //Division
                    System.out.println("el resultado de la division es igual a: " +
                            operaciones.divosion());
                    break;
                default:
                System.out.println("seleciona una  operacion valida");
            }
            System.out.println("desea volver a ingresar 1.para regresar 2. para salir");
            respuestaUsiario = Integer.valueOf(sc.nextInt());

        } while (respuestaUsiario != 2);
        System.out.println("gracias por utilizar la aplicacion ");
    }

}

class Operaciones {
    private int numeroUno = 0;
    private int numeroDos = 0;

    public Operaciones(int numeroUno, int numeroDos){
        this.numeroUno = numeroUno;
        this.numeroDos =numeroDos;
    }

    public int suma(){
        return numeroUno+numeroDos;
    }
    public int resta(){
        return numeroUno-numeroDos;
    }
    public int multiplicacion(){
        return numeroUno*numeroDos;
    }
    public float divosion(){
        return numeroUno/numeroDos;
    }

}


