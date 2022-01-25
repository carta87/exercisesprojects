package ui;
import model.Doctor;
import model.Parient;
import java.util.ArrayList;
import java.util.Scanner;

public class UiMenu {
    public  static final String[ ] MONTHS = {"Enero", "Febrero", "marzo",
    "Abril", "Mayo", "Junio"};
    public static Doctor doctorLogged;
    public  static Parient parientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser( int userType){
        //userType = 1 doctor
        //userTYpe = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("isodro Mendoza", "isodro@hmail.com"));
        doctors.add(new Doctor("Carmen Sarmoento", "carmen@hotmail,com"));
        doctors.add(new Doctor("andrea Ayala", "andrea♠4hotmail.com"));

        ArrayList<Parient> parients = new ArrayList<>();
        parients.add(new Parient("moguel Tafur ", "moguel@hotmail.com"));
        parients.add(new Parient("cyndi Ramirez", "cundi@hotmail.com"));
        parients.add(new Parient("melani Arenas", "melany@homail.com"));

        boolean emailCorect = false;
        do {
            System.out.println("inserte el email ejem a@a.com");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d: doctors) {
                    if (d.getEmail().equals(email)){
                        emailCorect = true;
                        //obtener el isuario logeado
                        doctorLogged = d;
                        UiDoctorMenu.showDoctorMenu();
                        //showDoctorMenu
                    }

                }
            }
            if (userType == 2){
                for (Parient p: parients) {
                    if (p.getEmail().equals(email)){
                        emailCorect = true;
                        parientLogged = p;
                        UipatientMenu.showPatientMenu();
                    }
                }
            }
        }while (!emailCorect);
    }
    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4 ; i++) {
                        System.out.println(i+ "." + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
