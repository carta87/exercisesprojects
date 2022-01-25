package model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String addess;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() { return id;}
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email; }

    public String getAddess() { return addess;}
    public void setAddess(String addess) { this.addess = addess; }

    public String getPhoneNumber() { return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() >8){
            System.out.println("El numero telefonico dese ser 8 dogotos maximos");
        } else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
        phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "model.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", addess='" + addess + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public abstract void showDataUser();
}
