package EjerciosPlatzi;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {

        System.out.println("Este programa lle permitira calcular el area de un circulo" +
                "por favor el radio del circulo");
        Scanner sc = new Scanner(System.in);
        double radioIngresado = Double.parseDouble(sc.nextLine());

        double resultado = Operacion.areaCirculo(radioIngresado);


    }

}

class Operacion {
    public static final double areaCirculo(double radio) {
        return  Math.PI * Math.pow(radio,2);
    }
}