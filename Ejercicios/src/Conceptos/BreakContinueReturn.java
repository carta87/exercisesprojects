package Conceptos;
public class BreakContinueReturn {
/* Break: En Java esta sentencia la verás en dos situaciones especificamente:

    En un Switch: en esta situación break hace que el flujo del switch no continúe ejecutándose
    a la siguiente comparación, esto con el objetivo de que solo se cumpla una sola condición:

      switch (colorModeSelected){
        case "Light":
            System.out.println("Seleccionaste Light Mode");
            break;
        case "Night": //Ambar
            System.out.println("Seleccionaste Night Mode");
            break;
        case "Blue Dark":
            System.out.println("Seleccionaste Blue Dark Mode");
            break;
 Para salir de un bucle: Como acabamos de ver un break es capaz de detener el flujo en el código,
 en este caso detendremos el ciclo como tal terminándolo y haciendo que saltemos a la siguiente
 instrucción después del ciclo.

 */


 /*
Continue
Continue en cierto modo también nos va a servir para detener un ciclo pero en lugar de terminarlo como
en el caso de break, este volverá directo a la condición.

  */

/*
Return
Aunque en algunos lenguajes esta sentencia sirve como un tipo goto, dónde se rompe el flujo del programa
la mejor forma de usarlo en Java es en Funciones, cuando lo usamos aquí siempre viene acompañado de un valor,
el cuál indica el dato que se estará devolviendo en la función.

 */

}
