package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UiDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UiMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled apponintments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailbleAppointmetsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UiMenu.showMenu();
                    break;

            }

        }while (response != 0);
    }

    private static void showAddAvailbleAppointmetsMenu(){
          int response = 0;
          do {
              System.out.println();
              System.out.println(":: Add Avaolable Appontment");
              System.out.println(":: select a Mount");

              for (int i = 0; i < 3; i++) {
                  int j = 1 + 1;
                  System.out.println(j + " . " + UiMenu.MONTHS[i]);

                  System.out.println("0. return");

                  Scanner sc = new Scanner(System.in);
                  response = Integer.valueOf(sc.nextLine());

                  if (response > 0 && response <4){
                      //1 2 3
                      int monthSelected = response;
                      System.out.println(monthSelected+ " . " + UiMenu.MONTHS[monthSelected-1]);

                      System.out.println("Insert the date available: [dd/mm/yyyy");
                      String date = sc.nextLine();

                      System.out.println("your date is:" + date + "\n1. Correct \n2. Change date");
                      int responseDate = Integer.valueOf(sc.nextLine());
                      if (responseDate == 2) continue;

                      int responseTime = 0;
                      String time = "";
                      do {
                          System.out.println("Insert the time available for date" + date + " [16 00]");
                          time = sc.nextLine();
                          System.out.println("your time os: " + time + "\n1. correct \n2. change time" );
                          responseTime = Integer.valueOf(sc.nextLine());

                      }while (responseTime == 2);

                      UiMenu.doctorLogged.addAvailableAppoontment(date,time);
                      chekDoctorAvailableAppointments(UiMenu.doctorLogged);
                  } else if ( response == 0){
                      showDoctorMenu();
                  }
                  
              }
          }while (response !=0);
    }

    private static  void chekDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppoontments().size() > 0
        && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        };
    }

}
