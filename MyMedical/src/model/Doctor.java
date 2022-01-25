package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Doctor extends User {
    //static int id = 0;// Autoincrementado

    private String speciality;
    private ArrayList<AvailableAppoontment> availableAppoontments = new ArrayList<>();

    public Doctor(String name, String email){
        super(name, email);
       // System.out.println("el nombre del doctor " + name);
       // this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    //comportamniento
    //public void showName(){
    //    System.out.println(name);    }

    //public void showId(){
    //    System.out.println("id model.Doctor: " + id);}

    //coleccion de arreglos
    public void addAvailableAppoontment(String date, String time){
       availableAppoontments.add(new Doctor.AvailableAppoontment(date, time));
    }

    public ArrayList<AvailableAppoontment> getAvailableAppoontments(){
        return availableAppoontments;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "speciality = \n" + speciality + "cotas dosponibles "
                + availableAppoontments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("empleado del hospital Criz roja");
        System.out.println("deparatmento; medicina genaral");
    }

    public static class AvailableAppoontment{//Citas Diponobles
        private int idAvailableAppoontment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppoontment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getIdAvailableAppoontment() {
            return idAvailableAppoontment;
        }

        public void setIdAvailableAppoontment(int idAvailableAppoontment) {
            this.idAvailableAppoontment = idAvailableAppoontment;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate(  ) {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Citas dosponibles date \n" + date +
                    ", time= \n" + time
                    ;
        }

    }
}
