package Conceptos;
/*Vamos a crear el algoritmo con la lógica necesaria para encender una lampara,
 emitir un mensaje y detener las luces en algún momento.
 El Bucle While nos ayuda a ejecutar una parte del código mientras una condición se cumpla.
 Recuerda tener mucho cuidado y asegurarte de que la condición del ciclo while cambie en algún momento,
 de otra forma, el ciclo no se detendrá nunca y sobrecargarás tu programa:
 */

public class While {

    static boolean estaEncendidaLinterna = false;

    public static void main(String[] args) {
      encenderLaLuz();

      int i = 1;
      while (estaEncendidaLinterna && 1<=5){
          imprimirSOS();
          i++;
      }

    }
    public static void imprimirSOS(){
        System.out.println("...___...");
    }

    public static boolean encenderLaLuz(){
       estaEncendidaLinterna = (estaEncendidaLinterna)?false:true;
       return estaEncendidaLinterna;

       /*if ( estaEncendidaLinterna){
            estaEncendidaLinterna =true;
        }else {
            estaEncendidaLinterna = true;
        }return estaEncendidaLinterna;*/
    }
}
