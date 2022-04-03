package Conceptos;
public class For {
    static boolean estaEncendidaLinterna = false;

    public static void main(String[] args) {

        for (int i = 0; i <=5; i++) {
         imprimirSOS();
        }
    }
    public static void imprimirSOS(){
        System.out.println("...___...");
    }

    public static boolean encenderLaLuz(){
        estaEncendidaLinterna = (estaEncendidaLinterna)?false:true;
        return estaEncendidaLinterna;
    }
    }
