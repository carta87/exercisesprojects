package model;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Set {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Carlos", "Carlos@hotmail.com");
        Doctor doctor2 = new Doctor("Juan", "Juan@hotmail.com2");
        Nurse nurse = new Nurse("cyndi", "cyndy");

        List<String> prueba2 = new ArrayList<>();
        prueba2.add("Lunes");
        prueba2.add("Martes");

        int cantidad = prueba2.size();
        String segundoArray[] = new String[cantidad];
        int incrementar =0 ;

        for(String e : prueba2){
            segundoArray[incrementar]= e;
            incrementar++;
        }

        for (int i = 0; i <cantidad; i++) {
            System.out.println("En la posicion "+i+" tiene un valor = " + segundoArray[i]);
        }

        //Ahora vamos con HasSet
        HashSet<Doctor> prueba = new HashSet();
        prueba.add(doctor1);
        prueba.add(doctor2);
        //prueba.add(nurse);

        //if prueba instanceof HashSet<Doctor> ? ((HashSet<Doctor>) prueba) : null;
        Doctor tercerArray[] = new Doctor[cantidad];
        incrementar=0;
        for(Doctor e: prueba){
            tercerArray[incrementar]= e;
            incrementar++;
        }

        for (int i = 0; i <cantidad; i++) {
            System.out.println("El objeto "+i+" tiene un valor = " + tercerArray[i].getName());
        }
    }
}
