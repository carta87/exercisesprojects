package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable {
    private int id;
    private Nurse nurse;
    private Parient parient;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Parient getParient() {
        return parient;
    }

    public void setParient(Parient parient) {
        this.parient = parient;
    }

    public Date getDate() {
        return date;
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
    public void schedule(Date date, String time) {

    }
}
