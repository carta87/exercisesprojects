import model.Doctor;
import model.Parient;
import model.User;
import static ui.UiMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

       showMenu();//Muestrame el menu

        /*Doctor myDoctor = new Doctor("Carlos T", " Peadiatria");
        myDoctor.addAvailableAppoontment(new Date(), "4pm");
        myDoctor.addAvailableAppoontment(new Date(), "10am" );
        myDoctor.addAvailableAppoontment(new Date(), "2pm");


        Doctor myDoctor2 = new Doctor("Carlos T", " Peadiatria");

        for (Doctor.AvailableAppoontment aA: myDoctor.getAvailableAppoontments()) {
            System.out.println(aA.getDate() + "  " + aA.getTime());
        }
        Parient patient = new Parient("Alejandra", "ale@hotmail.com");

        User user = new Doctor("miguel", "Migiel");
        user.showDataUser();


        System.out.println(patient);
        //System.out.println(myDoctor.getAvailableAppoontments());

        /*model.Parient patient = new model.Parient("Alejandra", "ale@hotmail.com");
        patient.setWeigth(54.6);
        System.out.println(patient.getWeigth());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
         */
    }

}
