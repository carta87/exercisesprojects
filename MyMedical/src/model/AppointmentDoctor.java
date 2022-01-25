package model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable{
    private int id;
    private Parient parient;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Parient parient, Doctor doctor) {
        this.parient = parient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Parient getParient() {
        return parient;
    }

    public void setParient(Parient parient) {
        this.parient = parient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time + " hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {
        this.date = date;
        this.time = time;
    }
}
