package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UipatientMenu {

    public static void showPatientMenu(){
        int resoponse = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UiMenu.parientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0.Logout");

            Scanner sc = new Scanner(System.in);
            resoponse = Integer.valueOf(sc.nextLine());

            switch (resoponse){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UiMenu.showMenu();
                    break;
            }
        }while (resoponse!=0);
    }
    private static void  showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println(":: Bok an appointment");
            System.out.println(":: Select date");

            //numeracion de la lista de fechas(integer)
            //indice de la fecha selecionada(map<Integer
            // [doctores]
            //1.-docor1
               //-1 fecha1
               //-2 fecha2
            //2.-doctor2 cada uno tiene las citas disponibles
            Map<Integer, Map<Integer, Doctor>> doctots = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UiDoctorMenu.doctorsAvailableAppointments.size();  i++) {
                ArrayList<Doctor.AvailableAppoontment> availableAppoontments
                        = UiDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppoontments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppoontments.size() ; j++) {
                    k++;
                    System.out.println(k + " ." + availableAppoontments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UiDoctorMenu.doctorsAvailableAppointments.get(i));

                    doctots.put(Integer.valueOf(k), doctorAppointments);
                }
                Scanner sc = new Scanner(System.in);
                int responseDateSElected = Integer.valueOf(sc.nextLine());
                Map<Integer,Doctor> doctorAvailableSelcted = doctots.get(responseDateSElected);
                Integer indexDate = 0;
                Doctor doctorSelected = new Doctor("","");

                for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelcted.entrySet()) {
                   indexDate = doc.getKey();
                   doctorSelected = doc.getValue();
                }

                System.out.println(doctorSelected.getName() + " .time " +
                        ". Date: " +
                        doctorSelected.getAvailableAppoontments().get(indexDate).getDate() +
                        ". Time " +
                        doctorSelected.getAvailableAppoontments().get(indexDate).getTime());
                System.out.println(" confirm your appointment: \n1. yes \n2. Change Data");
                response = Integer.valueOf(sc.nextLine());

                if ( response == 1){
                    UiMenu.parientLogged.addAppointmentDoctors(
                            doctorSelected,
                            doctorSelected.getAvailableAppoontments().get(indexDate).getDate(null),
                            doctorSelected.getAvailableAppoontments().get(indexDate).getTime());

                    showPatientMenu();
                }

            }
        }while (response!=0);

    }

    private  static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println(": :My Appointments");
            if (UiMenu.parientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Dont have appointments");
                break;
            }
            for (int i = 0; i < UiMenu.parientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + " . " +
                        "Date: " + UiMenu.parientLogged.getAppointmentDoctors().get(i).getDate() +
                        " Time: " + UiMenu.parientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor" + UiMenu.parientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
               );
            }

            System.out.println("0. return");

        }while (response!=0);
    }
}
